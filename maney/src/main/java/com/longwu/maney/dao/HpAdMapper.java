package com.longwu.maney.dao;

import com.longwu.maney.model.HpAd;
import com.longwu.maney.model.HpAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HpAdMapper {
    long countByExample(HpAdExample example);

    int deleteByExample(HpAdExample example);

    int deleteByPrimaryKey(String merId);

    int insert(HpAd record);

    int insertSelective(HpAd record);

    List<HpAd> selectByExample(HpAdExample example);

    HpAd selectByPrimaryKey(String merId);

    int updateByExampleSelective(@Param("record") HpAd record, @Param("example") HpAdExample example);

    int updateByExample(@Param("record") HpAd record, @Param("example") HpAdExample example);

    int updateByPrimaryKeySelective(HpAd record);

    int updateByPrimaryKey(HpAd record);
}