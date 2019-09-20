package haday.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import haday.demo.entity.second.FirptQuotaExample;
import haday.demo.entity.third.Events;
import haday.demo.entity.third.EventsExample;
import haday.demo.mapper.third.EventsMapper;
import haday.demo.param.PageParam;
import haday.demo.service.IEventsService;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 上午9:22:19
 */
@Service
public class EventsServiceImpl implements IEventsService {

	@Autowired
	EventsMapper eventsMapper;

	@Override
	public List<Events> getAllEvents() {
		// TODO Auto-generated method stub

		EventsExample example = new EventsExample();
		example.setDistinct(true);

		return eventsMapper.selectByExample(example);
	}

	@Override
	public PageInfo<Events> getEventsPage(PageParam param) {

		// TODO Auto-generated method stub
		EventsExample example = new EventsExample();
		example.setDistinct(true);
		example.setOrderByClause(param.getOrder() + " " + param.getSort());

		// 开启分页查询，写在查询语句上方
		PageHelper.startPage(param.getPageNum(), param.getPageSize());
		List<Events> list = eventsMapper.selectByExample(example);

		return new PageInfo<>(list);
	}

}
