package com.longwu.maney.dao;

import com.longwu.maney.model.CoachInfo;
import com.longwu.maney.model.CoachInfoExample;
import com.longwu.maney.model.CoachInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoachInfoMapper {
    long countByExample(CoachInfoExample example);

    int deleteByExample(CoachInfoExample example);

    int deleteByPrimaryKey(Long coachId);

    int insert(CoachInfoWithBLOBs record);

    int insertSelective(CoachInfoWithBLOBs record);

    List<CoachInfoWithBLOBs> selectByExampleWithBLOBs(CoachInfoExample example);

    List<CoachInfo> selectByExample(CoachInfoExample example);

    CoachInfoWithBLOBs selectByPrimaryKey(Long coachId);

    int updateByExampleSelective(@Param("record") CoachInfoWithBLOBs record, @Param("example") CoachInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CoachInfoWithBLOBs record, @Param("example") CoachInfoExample example);

    int updateByExample(@Param("record") CoachInfo record, @Param("example") CoachInfoExample example);

    int updateByPrimaryKeySelective(CoachInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CoachInfoWithBLOBs record);

    int updateByPrimaryKey(CoachInfo record);
}