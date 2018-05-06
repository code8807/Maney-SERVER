package com.longwu.maney.dao;

import com.longwu.maney.model.RegInfo;
import com.longwu.maney.model.RegInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegInfoMapper {
    long countByExample(RegInfoExample example);

    int deleteByExample(RegInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(RegInfo record);

    int insertSelective(RegInfo record);

    List<RegInfo> selectByExample(RegInfoExample example);

    RegInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") RegInfo record, @Param("example") RegInfoExample example);

    int updateByExample(@Param("record") RegInfo record, @Param("example") RegInfoExample example);

    int updateByPrimaryKeySelective(RegInfo record);

    int updateByPrimaryKey(RegInfo record);
}