package haday.demo.mapper.second;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import haday.demo.entity.second.FirptQuota;
import haday.demo.entity.second.FirptQuotaExample;

public interface FirptQuotaMapper {
    long countByExample(FirptQuotaExample example);

    int deleteByExample(FirptQuotaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FirptQuota record);

    int insertSelective(FirptQuota record);

    List<FirptQuota> selectByExample(FirptQuotaExample example);

    FirptQuota selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FirptQuota record, @Param("example") FirptQuotaExample example);

    int updateByExample(@Param("record") FirptQuota record, @Param("example") FirptQuotaExample example);

    int updateByPrimaryKeySelective(FirptQuota record);

    int updateByPrimaryKey(FirptQuota record);
}