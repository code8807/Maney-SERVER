package com.longwu.maney.dao;

import com.longwu.maney.model.CardInfo;
import com.longwu.maney.model.CardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardInfoMapper {
    long countByExample(CardInfoExample example);

    int deleteByExample(CardInfoExample example);

    int deleteByPrimaryKey(Long cardId);

    int insert(CardInfo record);

    int insertSelective(CardInfo record);

    List<CardInfo> selectByExample(CardInfoExample example);

    CardInfo selectByPrimaryKey(Long cardId);

    int updateByExampleSelective(@Param("record") CardInfo record, @Param("example") CardInfoExample example);

    int updateByExample(@Param("record") CardInfo record, @Param("example") CardInfoExample example);

    int updateByPrimaryKeySelective(CardInfo record);

    int updateByPrimaryKey(CardInfo record);
}