package com.longwu.maney.model;

public class MerCoachMapper {
    private String mapperId;

    private String merId;

    private String coachId;

    private String mapperStat;

    private String createTime;

    private String updateTime;

    public String getMapperId() {
        return mapperId;
    }

    public void setMapperId(String mapperId) {
        this.mapperId = mapperId == null ? null : mapperId.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId == null ? null : coachId.trim();
    }

    public String getMapperStat() {
        return mapperStat;
    }

    public void setMapperStat(String mapperStat) {
        this.mapperStat = mapperStat == null ? null : mapperStat.trim();
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