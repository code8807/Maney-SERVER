package com.longwu.maney.model;

public class MerInfo {
    private Long merId;

    private String merName;

    private String merStat;

    private String regCode;

    private String legPerson;

    private String priChl;

    private String secChl;

    private String merAddr;

    private String merLal;

    private String keyword;

    private String logoPath;

    private String supMer;

    private String merDomain;

    private String merConnect;

    private String createTime;

    private String updateTime;

    private String verPic;

    private String userCode;

    public Long getMerId() {
        return merId;
    }

    public void setMerId(Long merId) {
        this.merId = merId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getMerStat() {
        return merStat;
    }

    public void setMerStat(String merStat) {
        this.merStat = merStat == null ? null : merStat.trim();
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode == null ? null : regCode.trim();
    }

    public String getLegPerson() {
        return legPerson;
    }

    public void setLegPerson(String legPerson) {
        this.legPerson = legPerson == null ? null : legPerson.trim();
    }

    public String getPriChl() {
        return priChl;
    }

    public void setPriChl(String priChl) {
        this.priChl = priChl == null ? null : priChl.trim();
    }

    public String getSecChl() {
        return secChl;
    }

    public void setSecChl(String secChl) {
        this.secChl = secChl == null ? null : secChl.trim();
    }

    public String getMerAddr() {
        return merAddr;
    }

    public void setMerAddr(String merAddr) {
        this.merAddr = merAddr == null ? null : merAddr.trim();
    }

    public String getMerLal() {
        return merLal;
    }

    public void setMerLal(String merLal) {
        this.merLal = merLal == null ? null : merLal.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public String getSupMer() {
        return supMer;
    }

    public void setSupMer(String supMer) {
        this.supMer = supMer == null ? null : supMer.trim();
    }

    public String getMerDomain() {
        return merDomain;
    }

    public void setMerDomain(String merDomain) {
        this.merDomain = merDomain == null ? null : merDomain.trim();
    }

    public String getMerConnect() {
        return merConnect;
    }

    public void setMerConnect(String merConnect) {
        this.merConnect = merConnect == null ? null : merConnect.trim();
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

    public String getVerPic() {
        return verPic;
    }

    public void setVerPic(String verPic) {
        this.verPic = verPic == null ? null : verPic.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }
}