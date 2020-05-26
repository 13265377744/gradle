package gradle.master.service;

import java.util.List;

import gradle.master.entity.first.User;

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
