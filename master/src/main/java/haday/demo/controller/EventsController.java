package haday.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import haday.demo.entity.third.Events;
import haday.demo.param.PageParam;
import haday.demo.service.IEventsService;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 上午9:26:13
 */

@RestController
public class EventsController {

	@Autowired
	private IEventsService eventsService;

	@GetMapping(value = "/getAllEvents")
	public List<Events> getAllEvents() {
		return eventsService.getAllEvents();
	}

	@PostMapping(value = "/getEventsPage")
	public PageInfo<Events> getEventsPage(@RequestBody PageParam param) {
		return eventsService.getEventsPage(param);
	}

}
