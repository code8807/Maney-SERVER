package com.longwu.maney.model;

public class ActRecord {
    private Long actOrdid;

    private String userId;

    private String merId;

    private String actTime;

    private String actStat;

    private String goodsId;

    private String orderId;

    private String createTime;

    private String updateTime;

    public Long getActOrdid() {
        return actOrdid;
    }

    public void setActOrdid(Long actOrdid) {
        this.actOrdid = actOrdid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getActTime() {
        return actTime;
    }

    public void setActTime(String actTime) {
        this.actTime = actTime == null ? null : actTime.trim();
    }

    public String getActStat() {
        return actStat;
    }

    public void setActStat(String actStat) {
        this.actStat = actStat == null ? null : actStat.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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