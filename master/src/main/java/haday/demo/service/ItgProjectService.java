package haday.demo.service;

import haday.demo.entity.fourth.ItgProject;

import java.util.List;

/**
 * @Description: 项目计息
 * @Author: dingj
 * @TIME: 2019/11/8 - 9:19
 */

public interface ItgProjectService {

    ItgProject get(long id);

    List<ItgProject> getAll();

    int add(ItgProject project);

    int update(ItgProject project);

    int delete(long id);

}
