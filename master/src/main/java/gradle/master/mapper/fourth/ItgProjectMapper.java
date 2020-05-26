package gradle.master.mapper.fourth;

import gradle.master.entity.fourth.ItgProject;
import gradle.master.entity.fourth.ItgProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItgProjectMapper {

    long countByExample(ItgProjectExample example);

    int deleteByExample(ItgProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItgProject record);

    int insertSelective(ItgProject record);

    List<ItgProject> selectByExample(ItgProjectExample example);

    ItgProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItgProject record, @Param("example") ItgProjectExample example);

    int updateByExample(@Param("record") ItgProject record, @Param("example") ItgProjectExample example);

    int updateByPrimaryKeySelective(ItgProject record);

    int updateByPrimaryKey(ItgProject record);

}