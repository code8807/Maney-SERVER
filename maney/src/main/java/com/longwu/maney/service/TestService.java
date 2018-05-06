package com.longwu.maney.service;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.dao.UserInfoMapper;
import com.longwu.maney.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RedisCacheUtil<UserInfo> redisCacheUtil;
    @Autowired
    UserInfoMapper userInfoMapper;


    public String setRedis(String userId){
        UserInfo userInfo = this.userInfoMapper.selectByPrimaryKey(Long.valueOf(userId));
        this.redisCacheUtil.setCacheObject(userId, userInfo,120L);
        return Constant.AJAX_MSG_SUCCESS;
    }

    public UserInfo getRedis(String userId){
        return this.redisCacheUtil.getCacheObject(userId);
    }
}
