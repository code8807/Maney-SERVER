package com.longwu.maney.model;

public class SystemParam {
    private Integer paramId;

    private String paramStat;

    private String paramValue;

    private String paramIni;

    private String paramRem;

    private String createTime;

    private String updateTime;

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getParamStat() {
        return paramStat;
    }

    public void setParamStat(String paramStat) {
        this.paramStat = paramStat == null ? null : paramStat.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getParamIni() {
        return paramIni;
    }

    public void setParamIni(String paramIni) {
        this.paramIni = paramIni == null ? null : paramIni.trim();
    }

    public String getParamRem() {
        return paramRem;
    }

    public void setParamRem(String paramRem) {
        this.paramRem = paramRem == null ? null : paramRem.trim();
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