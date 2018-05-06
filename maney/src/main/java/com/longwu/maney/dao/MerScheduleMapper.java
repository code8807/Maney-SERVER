package com.longwu.maney.dao;

import com.longwu.maney.model.MerSchedule;
import com.longwu.maney.model.MerScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerScheduleMapper {
    long countByExample(MerScheduleExample example);

    int deleteByExample(MerScheduleExample example);

    int deleteByPrimaryKey(String merId);

    int insert(MerSchedule record);

    int insertSelective(MerSchedule record);

    List<MerSchedule> selectByExample(MerScheduleExample example);

    MerSchedule selectByPrimaryKey(String merId);

    int updateByExampleSelective(@Param("record") MerSchedule record, @Param("example") MerScheduleExample example);

    int updateByExample(@Param("record") MerSchedule record, @Param("example") MerScheduleExample example);

    int updateByPrimaryKeySelective(MerSchedule record);

    int updateByPrimaryKey(MerSchedule record);
}