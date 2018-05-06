package com.longwu.maney.dao;

import com.longwu.maney.model.MerCash;
import com.longwu.maney.model.MerCashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerCashMapper {
    long countByExample(MerCashExample example);

    int deleteByExample(MerCashExample example);

    int deleteByPrimaryKey(String merId);

    int insert(MerCash record);

    int insertSelective(MerCash record);

    List<MerCash> selectByExample(MerCashExample example);

    MerCash selectByPrimaryKey(String merId);

    int updateByExampleSelective(@Param("record") MerCash record, @Param("example") MerCashExample example);

    int updateByExample(@Param("record") MerCash record, @Param("example") MerCashExample example);

    int updateByPrimaryKeySelective(MerCash record);

    int updateByPrimaryKey(MerCash record);
}