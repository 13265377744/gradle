package haday.demo.service.impl;

import haday.demo.entity.fourth.ItgProject;
import haday.demo.entity.fourth.ItgProjectExample;
import haday.demo.mapper.fourth.ItgProjectMapper;
import haday.demo.service.ItgProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 项目计息实现
 * @Author: dingj
 * @TIME: 2019/11/8 - 9:20
 */
@Service
public class ItgProjectServiceImpl implements ItgProjectService {

    @Autowired
    ItgProjectMapper projectMapper;

    @Override
    public ItgProject get(long id) {
        return projectMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ItgProject> getAll() {
        return projectMapper.selectByExample(new ItgProjectExample());
    }

    @Override
    public int add(ItgProject project) {
        return projectMapper.insertSelective(project);
    }

    @Override
    public int update(ItgProject project) {
        return projectMapper.updateByPrimaryKeySelective(project);
    }

    @Override
    public int delete(long id) {
        return projectMapper.deleteByPrimaryKey(id);
    }
}
