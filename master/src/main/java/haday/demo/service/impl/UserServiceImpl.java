package haday.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import haday.demo.entity.first.User;
import haday.demo.mapper.first.UserMapper;
import haday.demo.service.IUserService;

/**
 * @Description: TODO
 * @Author: dingj
 * @TIME: 2019年9月12日 - 下午5:40:00
 */

@Service
public class UserServiceImpl implements IUserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getAllUsers() {
		List<User> userList = userMapper.getAllUsers();
		log.info("查询到的用户：{}", userList);
		return userList;
	}

	@Override
	public int addUser(User user) {
		user.setDat(new Date());
		return userMapper.addUser(user);
	}

	@Override
	public int deleteUser(User user) {
		return userMapper.deleteUser(user);
	}
}
