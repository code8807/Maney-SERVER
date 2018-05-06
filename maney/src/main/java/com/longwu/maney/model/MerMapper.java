package com.longwu.maney.model;

public class MerMapper {
    private String mapperId;

    private String preMerId;

    private String merId;

    private String status;

    private String createTime;

    private String updateTime;

    public String getMapperId() {
        return mapperId;
    }

    public void setMapperId(String mapperId) {
        this.mapperId = mapperId == null ? null : mapperId.trim();
    }

    public String getPreMerId() {
        return preMerId;
    }

    public void setPreMerId(String preMerId) {
        this.preMerId = preMerId == null ? null : preMerId.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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