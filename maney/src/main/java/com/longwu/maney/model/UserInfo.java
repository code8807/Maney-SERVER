package com.longwu.maney.model;

import java.math.BigDecimal;

public class UserInfo {
    private Long userId;

    private String nickname;

    private String userPwd;

    private BigDecimal maneyBal;

    private String userLevel;

    private String userStat;

    private String userMobile;

    private String userAlipay;

    private String userVarEmail;

    private String userDomain;

    private BigDecimal userPoint;

    private String userMood;

    private String userHp;

    private String createTime;

    private String updateTime;

    private String userWxoi;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public BigDecimal getManeyBal() {
        return maneyBal;
    }

    public void setManeyBal(BigDecimal maneyBal) {
        this.maneyBal = maneyBal;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public String getUserStat() {
        return userStat;
    }

    public void setUserStat(String userStat) {
        this.userStat = userStat == null ? null : userStat.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserAlipay() {
        return userAlipay;
    }

    public void setUserAlipay(String userAlipay) {
        this.userAlipay = userAlipay == null ? null : userAlipay.trim();
    }

    public String getUserVarEmail() {
        return userVarEmail;
    }

    public void setUserVarEmail(String userVarEmail) {
        this.userVarEmail = userVarEmail == null ? null : userVarEmail.trim();
    }

    public String getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain == null ? null : userDomain.trim();
    }

    public BigDecimal getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(BigDecimal userPoint) {
        this.userPoint = userPoint;
    }

    public String getUserMood() {
        return userMood;
    }

    public void setUserMood(String userMood) {
        this.userMood = userMood == null ? null : userMood.trim();
    }

    public String getUserHp() {
        return userHp;
    }

    public void setUserHp(String userHp) {
        this.userHp = userHp == null ? null : userHp.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getUserWxoi() {
        return userWxoi;
    }

    public void setUserWxoi(String userWxoi) {
        this.userWxoi = userWxoi == null ? null : userWxoi.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", nickname='" + nickname + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", maneyBal=" + maneyBal +
                ", userLevel='" + userLevel + '\'' +
                ", userStat='" + userStat + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userAlipay='" + userAlipay + '\'' +
                ", userVarEmail='" + userVarEmail + '\'' +
                ", userDomain='" + userDomain + '\'' +
                ", userPoint=" + userPoint +
                ", userMood='" + userMood + '\'' +
                ", userHp='" + userHp + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", userWxoi='" + userWxoi + '\'' +
                '}';
    }
}