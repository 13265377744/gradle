package haday.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import haday.demo.entity.second.FirptQuota;
import haday.demo.entity.second.FirptQuotaExample;
import haday.demo.mapper.second.FirptQuotaMapper;
import haday.demo.param.PageParam;
import haday.demo.service.IFirptQuotaService;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 上午9:22:19
 */
@Service
public class FirptQuotaServiceImpl implements IFirptQuotaService {

	@Autowired
	FirptQuotaMapper firptQuotaMapper;

	@Override
	public List<FirptQuota> getAllFirpt() {
		// TODO Auto-generated method stub

		FirptQuotaExample example = new FirptQuotaExample();
		example.setDistinct(true);

		return firptQuotaMapper.selectByExample(example);
	}

	@Override
	public PageInfo<FirptQuota> getFirptPage(PageParam param) {

		// TODO Auto-generated method stub
		FirptQuotaExample example = new FirptQuotaExample();
		example.setDistinct(true);
		example.setOrderByClause(param.getOrder() + " " + param.getSort());

		// 开启分页查询，写在查询语句上方
		PageHelper.startPage(param.getPageNum(), param.getPageSize());
		List<FirptQuota> list = firptQuotaMapper.selectByExample(example);

		return new PageInfo<>(list);
	}

}
