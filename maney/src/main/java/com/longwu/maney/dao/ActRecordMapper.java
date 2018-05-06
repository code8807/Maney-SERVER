package com.longwu.maney.dao;

import com.longwu.maney.model.ActRecord;
import com.longwu.maney.model.ActRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRecordMapper {
    long countByExample(ActRecordExample example);

    int deleteByExample(ActRecordExample example);

    int deleteByPrimaryKey(Long actOrdid);

    int insert(ActRecord record);

    int insertSelective(ActRecord record);

    List<ActRecord> selectByExample(ActRecordExample example);

    ActRecord selectByPrimaryKey(Long actOrdid);

    int updateByExampleSelective(@Param("record") ActRecord record, @Param("example") ActRecordExample example);

    int updateByExample(@Param("record") ActRecord record, @Param("example") ActRecordExample example);

    int updateByPrimaryKeySelective(ActRecord record);

    int updateByPrimaryKey(ActRecord record);
}