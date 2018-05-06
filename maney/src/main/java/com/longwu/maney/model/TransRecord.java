package com.longwu.maney.model;

import java.math.BigDecimal;

public class TransRecord {
    private Long orderId;

    private String payId;

    private String recId;

    private BigDecimal maneyAmount;

    private String goodsCode;

    private String payRem;

    private String goodsQua;

    private String createTime;

    private String updateTime;

    private String payStat;

    private String payChl;

    private String payAddr;

    private String payOrderid;

    private String merName;

    private String goodsName;

    private String btlId;

    private String resOne;

    private String resTwo;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId == null ? null : recId.trim();
    }

    public BigDecimal getManeyAmount() {
        return maneyAmount;
    }

    public void setManeyAmount(BigDecimal maneyAmount) {
        this.maneyAmount = maneyAmount;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getPayRem() {
        return payRem;
    }

    public void setPayRem(String payRem) {
        this.payRem = payRem == null ? null : payRem.trim();
    }

    public String getGoodsQua() {
        return goodsQua;
    }

    public void setGoodsQua(String goodsQua) {
        this.goodsQua = goodsQua == null ? null : goodsQua.trim();
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

    public String getPayStat() {
        return payStat;
    }

    public void setPayStat(String payStat) {
        this.payStat = payStat == null ? null : payStat.trim();
    }

    public String getPayChl() {
        return payChl;
    }

    public void setPayChl(String payChl) {
        this.payChl = payChl == null ? null : payChl.trim();
    }

    public String getPayAddr() {
        return payAddr;
    }

    public void setPayAddr(String payAddr) {
        this.payAddr = payAddr == null ? null : payAddr.trim();
    }

    public String getPayOrderid() {
        return payOrderid;
    }

    public void setPayOrderid(String payOrderid) {
        this.payOrderid = payOrderid == null ? null : payOrderid.trim();
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getBtlId() {
        return btlId;
    }

    public void setBtlId(String btlId) {
        this.btlId = btlId == null ? null : btlId.trim();
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
}