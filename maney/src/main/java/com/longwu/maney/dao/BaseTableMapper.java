package com.longwu.maney.dao;


import com.longwu.maney.model.BaseTable;

public interface BaseTableMapper {

	/* 读取表的元数据*/
	BaseTable getMetaData(String tableName);
	
	/*生成一个uuid*/
	String createUUid();
}
