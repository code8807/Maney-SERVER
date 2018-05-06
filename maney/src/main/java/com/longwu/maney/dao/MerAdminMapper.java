package com.longwu.maney.dao;

import com.longwu.maney.model.MerAdmin;
import com.longwu.maney.model.MerAdminExample;
import com.longwu.maney.model.MerAdminKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerAdminMapper {
    long countByExample(MerAdminExample example);

    int deleteByExample(MerAdminExample example);

    int deleteByPrimaryKey(MerAdminKey key);

    int insert(MerAdmin record);

    int insertSelective(MerAdmin record);

    List<MerAdmin> selectByExample(MerAdminExample example);

    MerAdmin selectByPrimaryKey(MerAdminKey key);

    int updateByExampleSelective(@Param("record") MerAdmin record, @Param("example") MerAdminExample example);

    int updateByExample(@Param("record") MerAdmin record, @Param("example") MerAdminExample example);

    int updateByPrimaryKeySelective(MerAdmin record);

    int updateByPrimaryKey(MerAdmin record);
}