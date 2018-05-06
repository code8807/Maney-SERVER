package com.longwu.maney.dao;

import com.longwu.maney.model.MerGoodstype;
import com.longwu.maney.model.MerGoodstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerGoodstypeMapper {
    long countByExample(MerGoodstypeExample example);

    int deleteByExample(MerGoodstypeExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(MerGoodstype record);

    int insertSelective(MerGoodstype record);

    List<MerGoodstype> selectByExample(MerGoodstypeExample example);

    MerGoodstype selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") MerGoodstype record, @Param("example") MerGoodstypeExample example);

    int updateByExample(@Param("record") MerGoodstype record, @Param("example") MerGoodstypeExample example);

    int updateByPrimaryKeySelective(MerGoodstype record);

    int updateByPrimaryKey(MerGoodstype record);
}