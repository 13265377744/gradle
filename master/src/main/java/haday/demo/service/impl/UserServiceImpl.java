package haday.demo.service.impl;

import java.util.Date;
import java.util.List;

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

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
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
