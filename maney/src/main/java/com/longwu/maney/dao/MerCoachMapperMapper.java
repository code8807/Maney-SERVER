package com.longwu.maney.dao;

import com.longwu.maney.model.MerCoachMapper;
import com.longwu.maney.model.MerCoachMapperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerCoachMapperMapper {
    long countByExample(MerCoachMapperExample example);

    int deleteByExample(MerCoachMapperExample example);

    int deleteByPrimaryKey(String mapperId);

    int insert(MerCoachMapper record);

    int insertSelective(MerCoachMapper record);

    List<MerCoachMapper> selectByExample(MerCoachMapperExample example);

    MerCoachMapper selectByPrimaryKey(String mapperId);

    int updateByExampleSelective(@Param("record") MerCoachMapper record, @Param("example") MerCoachMapperExample example);

    int updateByExample(@Param("record") MerCoachMapper record, @Param("example") MerCoachMapperExample example);

    int updateByPrimaryKeySelective(MerCoachMapper record);

    int updateByPrimaryKey(MerCoachMapper record);
}