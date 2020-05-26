package gradle.master.mapper.first;

import java.util.List;

import gradle.master.entity.first.User;

/**
 * @Description: TODO
 * @Author: dingj
 * @TIME: 2019年9月12日 - 下午5:38:11
 */


public interface UserMapper {

	List<User> getAllUsers();

	int addUser(User user);

	int deleteUser(User user);

}
