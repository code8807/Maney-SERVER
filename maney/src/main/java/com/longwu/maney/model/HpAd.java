package com.longwu.maney.model;

public class HpAd {
    private String merId;

    private String logoPath;

    private String merInfo;

    private String beginTime;

    private String endTime;

    private String adStat;

    private String createTime;

    private String updateTime;

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public String getMerInfo() {
        return merInfo;
    }

    public void setMerInfo(String merInfo) {
        this.merInfo = merInfo == null ? null : merInfo.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getAdStat() {
        return adStat;
    }

    public void setAdStat(String adStat) {
        this.adStat = adStat == null ? null : adStat.trim();
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
}