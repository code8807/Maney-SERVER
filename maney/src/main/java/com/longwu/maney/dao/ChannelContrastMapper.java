package com.longwu.maney.dao;

import com.longwu.maney.model.ChannelContrast;
import com.longwu.maney.model.ChannelContrastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelContrastMapper {
    long countByExample(ChannelContrastExample example);

    int deleteByExample(ChannelContrastExample example);

    int deleteByPrimaryKey(Integer chlId);

    int insert(ChannelContrast record);

    int insertSelective(ChannelContrast record);

    List<ChannelContrast> selectByExample(ChannelContrastExample example);

    ChannelContrast selectByPrimaryKey(Integer chlId);

    int updateByExampleSelective(@Param("record") ChannelContrast record, @Param("example") ChannelContrastExample example);

    int updateByExample(@Param("record") ChannelContrast record, @Param("example") ChannelContrastExample example);

    int updateByPrimaryKeySelective(ChannelContrast record);

    int updateByPrimaryKey(ChannelContrast record);
}