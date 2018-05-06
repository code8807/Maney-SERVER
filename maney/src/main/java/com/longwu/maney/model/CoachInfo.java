package com.longwu.maney.model;

public class CoachInfo {
    private Long coachId;

    private String coachName;

    private String coachMob;

    private String coachAge;

    private String coachSex;

    private String coachNickname;

    private String coachEdu;

    private String coachLevel;

    private String coachType;

    private String coachStat;

    private String mapperManey;

    private String resOne;

    private String resTwo;

    private String createTime;

    private String updateTime;

    public Long getCoachId() {
        return coachId;
    }

    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName == null ? null : coachName.trim();
    }

    public String getCoachMob() {
        return coachMob;
    }

    public void setCoachMob(String coachMob) {
        this.coachMob = coachMob == null ? null : coachMob.trim();
    }

    public String getCoachAge() {
        return coachAge;
    }

    public void setCoachAge(String coachAge) {
        this.coachAge = coachAge == null ? null : coachAge.trim();
    }

    public String getCoachSex() {
        return coachSex;
    }

    public void setCoachSex(String coachSex) {
        this.coachSex = coachSex == null ? null : coachSex.trim();
    }

    public String getCoachNickname() {
        return coachNickname;
    }

    public void setCoachNickname(String coachNickname) {
        this.coachNickname = coachNickname == null ? null : coachNickname.trim();
    }

    public String getCoachEdu() {
        return coachEdu;
    }

    public void setCoachEdu(String coachEdu) {
        this.coachEdu = coachEdu == null ? null : coachEdu.trim();
    }

    public String getCoachLevel() {
        return coachLevel;
    }

    public void setCoachLevel(String coachLevel) {
        this.coachLevel = coachLevel == null ? null : coachLevel.trim();
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType == null ? null : coachType.trim();
    }

    public String getCoachStat() {
        return coachStat;
    }

    public void setCoachStat(String coachStat) {
        this.coachStat = coachStat == null ? null : coachStat.trim();
    }

    public String getMapperManey() {
        return mapperManey;
    }

    public void setMapperManey(String mapperManey) {
        this.mapperManey = mapperManey == null ? null : mapperManey.trim();
    }

    public String getResOne() {
        return resOne;
    }

    public void setResOne(String resOne) {
        this.resOne = resOne == null ? null : resOne.trim();
    }

    public String getResTwo() {
        return resTwo;
    }

    public void setResTwo(String resTwo) {
        this.resTwo = resTwo == null ? null : resTwo.trim();
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