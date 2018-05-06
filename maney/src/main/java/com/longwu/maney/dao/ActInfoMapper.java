package com.longwu.maney.dao;

import com.longwu.maney.model.ActInfo;
import com.longwu.maney.model.ActInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActInfoMapper {
    long countByExample(ActInfoExample example);

    int deleteByExample(ActInfoExample example);

    int deleteByPrimaryKey(Long actId);

    int insert(ActInfo record);

    int insertSelective(ActInfo record);

    List<ActInfo> selectByExample(ActInfoExample example);

    ActInfo selectByPrimaryKey(Long actId);

    int updateByExampleSelective(@Param("record") ActInfo record, @Param("example") ActInfoExample example);

    int updateByExample(@Param("record") ActInfo record, @Param("example") ActInfoExample example);

    int updateByPrimaryKeySelective(ActInfo record);

    int updateByPrimaryKey(ActInfo record);
}