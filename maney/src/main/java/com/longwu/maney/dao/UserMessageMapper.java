package com.longwu.maney.dao;

import com.longwu.maney.model.UserMessage;
import com.longwu.maney.model.UserMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMessageMapper {
    long countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExampleWithBLOBs(UserMessageExample example);

    List<UserMessage> selectByExample(UserMessageExample example);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);
}