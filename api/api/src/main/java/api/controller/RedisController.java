package api.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.entity.User;
import api.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 下午5:55:10
 */

@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

	// redis中存储的过期时间60s
	private static int ExpireTime = 60;

	@Resource
	private RedisUtil redisUtil;

	@GetMapping("set")
	public boolean redisset(String key, String value) {
		User userEntity = new User();
		userEntity.setId(Long.valueOf(1));
		userEntity.setGuid(String.valueOf(1));
		userEntity.setName("zhangsan");
		userEntity.setAge(String.valueOf(20));
		userEntity.setCreateTime(new Date());
		// return redisUtil.set(key,userEntity,ExpireTime);
		log.info("key:{}--value:{}", key, value);
		return redisUtil.set(key, value);
	}

	@GetMapping("get")
	public Object redisget(String key) {
		return redisUtil.get(key);
	}

	@GetMapping("expire")
	public boolean expire(String key) {
		return redisUtil.expire(key, ExpireTime);
	}

}
