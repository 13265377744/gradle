package gradle.master.service.impl;

import gradle.master.service.ItgProjectService;
import gradle.master.entity.fourth.ItgProject;
import gradle.master.entity.fourth.ItgProjectExample;
import gradle.master.mapper.fourth.ItgProjectMapper;
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
