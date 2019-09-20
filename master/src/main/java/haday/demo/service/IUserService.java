package haday.demo.service;

import java.util.List;

import haday.demo.entity.first.User;

/**
 * @Description: TODO
 * @Author: dingj
 * @TIME: 2019年9月12日 - 下午5:40:49
 */

public interface IUserService {

	public List<User> getAllUsers();

	public int addUser(User user);

	public int deleteUser(User user);

}
