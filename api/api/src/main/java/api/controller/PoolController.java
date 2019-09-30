package api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import api.service.BootService;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 下午3:32:56
 */

@RestController
public class PoolController {

	@Autowired
	private BootService bootService;

	@GetMapping("/pool")
	public String pool() {
		for (int i = 0; i < 100; i++) {
			bootService.testPool();
		}
		return "pool test";
	}

	@GetMapping("/noPool")
	public String noPool() {
		for (int i = 0; i < 100; i++) {
			bootService.testNoPool();
		}
		return "no pool test";
	}

	@GetMapping("/poolTask/{n}")
	public String poolTask(@PathVariable int n) {
		long startTime = System.currentTimeMillis();
		try {
			bootService.testPoolTaskExecutor(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		return "poolTask test " + (endTime - startTime) / 1000 + " 秒";
	}
}
