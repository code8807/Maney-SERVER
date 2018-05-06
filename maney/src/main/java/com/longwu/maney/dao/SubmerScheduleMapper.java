package com.longwu.maney.dao;

import com.longwu.maney.model.SubmerSchedule;
import com.longwu.maney.model.SubmerScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubmerScheduleMapper {
    long countByExample(SubmerScheduleExample example);

    int deleteByExample(SubmerScheduleExample example);

    int deleteByPrimaryKey(String mapperId);

    int insert(SubmerSchedule record);

    int insertSelective(SubmerSchedule record);

    List<SubmerSchedule> selectByExample(SubmerScheduleExample example);

    SubmerSchedule selectByPrimaryKey(String mapperId);

    int updateByExampleSelective(@Param("record") SubmerSchedule record, @Param("example") SubmerScheduleExample example);

    int updateByExample(@Param("record") SubmerSchedule record, @Param("example") SubmerScheduleExample example);

    int updateByPrimaryKeySelective(SubmerSchedule record);

    int updateByPrimaryKey(SubmerSchedule record);
}