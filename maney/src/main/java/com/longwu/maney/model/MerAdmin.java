package com.longwu.maney.model;

public class MerAdmin extends MerAdminKey {
    private String adminLevel;

    private String adminRem;

    private String createTime;

    private String updateTime;

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel == null ? null : adminLevel.trim();
    }

    public String getAdminRem() {
        return adminRem;
    }

    public void setAdminRem(String adminRem) {
        this.adminRem = adminRem == null ? null : adminRem.trim();
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