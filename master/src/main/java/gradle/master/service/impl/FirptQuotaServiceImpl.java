package gradle.master.service.impl;

import java.util.List;

import gradle.master.service.IFirptQuotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import gradle.master.entity.second.FirptQuota;
import gradle.master.entity.second.FirptQuotaExample;
import gradle.master.mapper.second.FirptQuotaMapper;
import gradle.master.param.PageParam;

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
