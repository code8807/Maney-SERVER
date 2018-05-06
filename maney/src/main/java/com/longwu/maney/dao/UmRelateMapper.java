package com.longwu.maney.dao;

import com.longwu.maney.model.UmRelate;
import com.longwu.maney.model.UmRelateExample;
import com.longwu.maney.model.UmRelateKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmRelateMapper {
    long countByExample(UmRelateExample example);

    int deleteByExample(UmRelateExample example);

    int deleteByPrimaryKey(UmRelateKey key);

    int insert(UmRelate record);

    int insertSelective(UmRelate record);

    List<UmRelate> selectByExample(UmRelateExample example);

    UmRelate selectByPrimaryKey(UmRelateKey key);

    int updateByExampleSelective(@Param("record") UmRelate record, @Param("example") UmRelateExample example);

    int updateByExample(@Param("record") UmRelate record, @Param("example") UmRelateExample example);

    int updateByPrimaryKeySelective(UmRelate record);

    int updateByPrimaryKey(UmRelate record);
}