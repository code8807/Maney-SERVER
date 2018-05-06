package com.longwu.maney.dao;

import com.longwu.maney.model.TransRecord;
import com.longwu.maney.model.TransRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransRecordMapper {
    long countByExample(TransRecordExample example);

    int deleteByExample(TransRecordExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(TransRecord record);

    int insertSelective(TransRecord record);

    List<TransRecord> selectByExample(TransRecordExample example);

    TransRecord selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") TransRecord record, @Param("example") TransRecordExample example);

    int updateByExample(@Param("record") TransRecord record, @Param("example") TransRecordExample example);

    int updateByPrimaryKeySelective(TransRecord record);

    int updateByPrimaryKey(TransRecord record);
}