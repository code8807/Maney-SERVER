package com.longwu.maney.model;

public class UmRelate extends UmRelateKey {
    private String relateStat;

    private String createTime;

    private String updateTime;

    private String isReg;

    public String getRelateStat() {
        return relateStat;
    }

    public void setRelateStat(String relateStat) {
        this.relateStat = relateStat == null ? null : relateStat.trim();
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

    public String getIsReg() {
        return isReg;
    }

    public void setIsReg(String isReg) {
        this.isReg = isReg == null ? null : isReg.trim();
    }
}