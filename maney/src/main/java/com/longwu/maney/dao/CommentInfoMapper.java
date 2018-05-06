package com.longwu.maney.dao;

import com.longwu.maney.model.CommentInfo;
import com.longwu.maney.model.CommentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentInfoMapper {
    long countByExample(CommentInfoExample example);

    int deleteByExample(CommentInfoExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    List<CommentInfo> selectByExampleWithBLOBs(CommentInfoExample example);

    List<CommentInfo> selectByExample(CommentInfoExample example);

    CommentInfo selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByExample(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKeyWithBLOBs(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}