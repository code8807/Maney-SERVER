package com.longwu.maney.vo;

import java.io.Serializable;

public class TestVo implements Serializable {

    private static final long serialVersionUID = 4635960726236591698L;

    String userId;
    String nickName;
    String userMob;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserMob() {
        return userMob;
    }

    public void setUserMob(String userMob) {
        this.userMob = userMob;
    }
}
