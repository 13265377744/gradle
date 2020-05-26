package gradle.master.mapper.third;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import gradle.master.entity.third.Events;
import gradle.master.entity.third.EventsExample;


public interface EventsMapper {

    long countByExample(EventsExample example);

    int deleteByExample(EventsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Events record);

    int insertSelective(Events record);

    List<Events> selectByExample(EventsExample example);

    Events selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Events record, @Param("example") EventsExample example);

    int updateByExample(@Param("record") Events record, @Param("example") EventsExample example);

    int updateByPrimaryKeySelective(Events record);

    int updateByPrimaryKey(Events record);

}