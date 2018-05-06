package com.longwu.maney.dao;

import com.longwu.maney.model.SignInfo;
import com.longwu.maney.model.SignInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignInfoMapper {
    long countByExample(SignInfoExample example);

    int deleteByExample(SignInfoExample example);

    int insert(SignInfo record);

    int insertSelective(SignInfo record);

    List<SignInfo> selectByExample(SignInfoExample example);

    int updateByExampleSelective(@Param("record") SignInfo record, @Param("example") SignInfoExample example);

    int updateByExample(@Param("record") SignInfo record, @Param("example") SignInfoExample example);
}