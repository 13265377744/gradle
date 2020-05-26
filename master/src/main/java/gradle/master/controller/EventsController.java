package gradle.master.controller;

import java.util.List;

import gradle.master.entity.third.Events;
import gradle.master.param.PageParam;
import gradle.master.service.IEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

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
