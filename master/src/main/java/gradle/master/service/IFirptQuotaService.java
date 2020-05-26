package gradle.master.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import gradle.master.entity.second.FirptQuota;
import gradle.master.param.PageParam;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 上午9:20:58
 */

public interface IFirptQuotaService {

	public List<FirptQuota> getAllFirpt();

	public PageInfo<FirptQuota> getFirptPage(PageParam param);

}
