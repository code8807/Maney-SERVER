package com.longwu.maney.model;

public class MerSchedule {
    private String merId;

    private String monItem;

    private String tueItem;

    private String wedItem;

    private String thuItem;

    private String friItem;

    private String satItem;

    private String sunItem;

    private String createTime;

    private String updateTime;

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getMonItem() {
        return monItem;
    }

    public void setMonItem(String monItem) {
        this.monItem = monItem == null ? null : monItem.trim();
    }

    public String getTueItem() {
        return tueItem;
    }

    public void setTueItem(String tueItem) {
        this.tueItem = tueItem == null ? null : tueItem.trim();
    }

    public String getWedItem() {
        return wedItem;
    }

    public void setWedItem(String wedItem) {
        this.wedItem = wedItem == null ? null : wedItem.trim();
    }

    public String getThuItem() {
        return thuItem;
    }

    public void setThuItem(String thuItem) {
        this.thuItem = thuItem == null ? null : thuItem.trim();
    }

    public String getFriItem() {
        return friItem;
    }

    public void setFriItem(String friItem) {
        this.friItem = friItem == null ? null : friItem.trim();
    }

    public String getSatItem() {
        return satItem;
    }

    public void setSatItem(String satItem) {
        this.satItem = satItem == null ? null : satItem.trim();
    }

    public String getSunItem() {
        return sunItem;
    }

    public void setSunItem(String sunItem) {
        this.sunItem = sunItem == null ? null : sunItem.trim();
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