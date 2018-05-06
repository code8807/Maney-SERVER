package com.longwu.maney.dao;

import com.longwu.maney.model.MerMapper;
import com.longwu.maney.model.MerMapperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerMapperMapper {
    long countByExample(MerMapperExample example);

    int deleteByExample(MerMapperExample example);

    int deleteByPrimaryKey(String mapperId);

    int insert(MerMapper record);

    int insertSelective(MerMapper record);

    List<MerMapper> selectByExample(MerMapperExample example);

    MerMapper selectByPrimaryKey(String mapperId);

    int updateByExampleSelective(@Param("record") MerMapper record, @Param("example") MerMapperExample example);

    int updateByExample(@Param("record") MerMapper record, @Param("example") MerMapperExample example);

    int updateByPrimaryKeySelective(MerMapper record);

    int updateByPrimaryKey(MerMapper record);
}