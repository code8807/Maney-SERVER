package com.longwu.maney.dao;

import com.longwu.maney.model.Mnotice;
import com.longwu.maney.model.MnoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MnoticeMapper {
    long countByExample(MnoticeExample example);

    int deleteByExample(MnoticeExample example);

    int insert(Mnotice record);

    int insertSelective(Mnotice record);

    List<Mnotice> selectByExampleWithBLOBs(MnoticeExample example);

    List<Mnotice> selectByExample(MnoticeExample example);

    int updateByExampleSelective(@Param("record") Mnotice record, @Param("example") MnoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") Mnotice record, @Param("example") MnoticeExample example);

    int updateByExample(@Param("record") Mnotice record, @Param("example") MnoticeExample example);
}