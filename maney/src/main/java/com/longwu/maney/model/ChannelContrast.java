package com.longwu.maney.model;

public class ChannelContrast {
    private Integer chlId;

    private String chlLevel;

    private String chlRem;

    private String preChl;

    private String createTime;

    private String updateTime;

    public Integer getChlId() {
        return chlId;
    }

    public void setChlId(Integer chlId) {
        this.chlId = chlId;
    }

    public String getChlLevel() {
        return chlLevel;
    }

    public void setChlLevel(String chlLevel) {
        this.chlLevel = chlLevel == null ? null : chlLevel.trim();
    }

    public String getChlRem() {
        return chlRem;
    }

    public void setChlRem(String chlRem) {
        this.chlRem = chlRem == null ? null : chlRem.trim();
    }

    public String getPreChl() {
        return preChl;
    }

    public void setPreChl(String preChl) {
        this.preChl = preChl == null ? null : preChl.trim();
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