package com.longwu.maney.dao;

import com.longwu.maney.model.MerInfo;
import com.longwu.maney.model.MerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerInfoMapper {
    long countByExample(MerInfoExample example);

    int deleteByExample(MerInfoExample example);

    int deleteByPrimaryKey(Long merId);

    int insert(MerInfo record);

    int insertSelective(MerInfo record);

    List<MerInfo> selectByExampleWithBLOBs(MerInfoExample example);

    List<MerInfo> selectByExample(MerInfoExample example);

    MerInfo selectByPrimaryKey(Long merId);

    int updateByExampleSelective(@Param("record") MerInfo record, @Param("example") MerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") MerInfo record, @Param("example") MerInfoExample example);

    int updateByExample(@Param("record") MerInfo record, @Param("example") MerInfoExample example);

    int updateByPrimaryKeySelective(MerInfo record);

    int updateByPrimaryKeyWithBLOBs(MerInfo record);

    int updateByPrimaryKey(MerInfo record);
}