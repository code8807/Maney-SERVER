package com.longwu.maney.dao;

import com.longwu.maney.model.MerLogin;
import com.longwu.maney.model.MerLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerLoginMapper {
    long countByExample(MerLoginExample example);

    int deleteByExample(MerLoginExample example);

    int deleteByPrimaryKey(String merId);

    int insert(MerLogin record);

    int insertSelective(MerLogin record);

    List<MerLogin> selectByExample(MerLoginExample example);

    MerLogin selectByPrimaryKey(String merId);

    int updateByExampleSelective(@Param("record") MerLogin record, @Param("example") MerLoginExample example);

    int updateByExample(@Param("record") MerLogin record, @Param("example") MerLoginExample example);

    int updateByPrimaryKeySelective(MerLogin record);

    int updateByPrimaryKey(MerLogin record);
}