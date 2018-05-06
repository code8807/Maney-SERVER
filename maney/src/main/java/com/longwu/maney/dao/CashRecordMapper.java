package com.longwu.maney.dao;

import com.longwu.maney.model.CashRecord;
import com.longwu.maney.model.CashRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashRecordMapper {
    long countByExample(CashRecordExample example);

    int deleteByExample(CashRecordExample example);

    int deleteByPrimaryKey(Long cashId);

    int insert(CashRecord record);

    int insertSelective(CashRecord record);

    List<CashRecord> selectByExample(CashRecordExample example);

    CashRecord selectByPrimaryKey(Long cashId);

    int updateByExampleSelective(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByExample(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByPrimaryKeySelective(CashRecord record);

    int updateByPrimaryKey(CashRecord record);
}