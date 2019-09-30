package api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.thread.Test;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 下午2:09:49
 */

@RestController
public class TestController {

	@Autowired
	Test test;

	@GetMapping("/")
	public String success() {
		return "Hello World";
	}

	@GetMapping("/test")
	public void test() {
		for (int i = 0; i < 100; i++) {
			test.test(i);

		}
	}

}
