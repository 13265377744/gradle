package haday.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import haday.demo.entity.second.FirptQuota;
import haday.demo.param.PageParam;
import haday.demo.service.IFirptQuotaService;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 上午9:26:13
 */

@RestController
public class FirptQuotaController {

	@Autowired
	private IFirptQuotaService firptService;

	@GetMapping(value = "/getAllFirpt")
	public List<FirptQuota> getAllFirpt() {
		return firptService.getAllFirpt();
	}

	@PostMapping(value = "/getFirptPage")
	public PageInfo<FirptQuota> getFirptPage(@RequestBody PageParam param) {
		return firptService.getFirptPage(param);
	}

}
