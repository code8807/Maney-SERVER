package com.longwu.maney.service.user;

import com.longwu.maney.dao.UserLoginMapper;
import com.longwu.maney.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userLoginService")
public class UserLoginService {

    @Autowired
    UserLoginMapper userLoginMapper;

    public UserLogin findByUserId(String userId){
        return this.userLoginMapper.selectByPrimaryKey(userId);
    }

    public void addUserLogin(UserLogin userLogin){
        this.userLoginMapper.insert(userLogin);
    }

    public void updateUserLogin(UserLogin userLogin){
        this.userLoginMapper.updateByPrimaryKey(userLogin);
    }
}
