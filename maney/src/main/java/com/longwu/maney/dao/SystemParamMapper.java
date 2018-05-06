package com.longwu.maney.dao;

import com.longwu.maney.model.SystemParam;
import com.longwu.maney.model.SystemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemParamMapper {
    long countByExample(SystemParamExample example);

    int deleteByExample(SystemParamExample example);

    int deleteByPrimaryKey(Integer paramId);

    int insert(SystemParam record);

    int insertSelective(SystemParam record);

    List<SystemParam> selectByExample(SystemParamExample example);

    SystemParam selectByPrimaryKey(Integer paramId);

    int updateByExampleSelective(@Param("record") SystemParam record, @Param("example") SystemParamExample example);

    int updateByExample(@Param("record") SystemParam record, @Param("example") SystemParamExample example);

    int updateByPrimaryKeySelective(SystemParam record);

    int updateByPrimaryKey(SystemParam record);
}