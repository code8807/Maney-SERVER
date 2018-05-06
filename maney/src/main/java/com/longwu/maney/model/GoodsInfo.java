package com.longwu.maney.model;

import java.math.BigDecimal;

public class GoodsInfo {
    private Long goodsId;

    private String merId;

    private BigDecimal goodsPrice;

    private String goodsName;

    private String goodsRem;

    private String goodsType;

    private String goodsTime;

    private String goodsLoc;

    private String goodsLeader;

    private String goodsPhoto;

    private String createTime;

    private String updateTime;

    private String goodsDur;

    private Long goodsSales;

    private String goodsStat;

    private String canAfl;

    private String goodsSort;

    private String cardType;

    private String timeLim;

    private String numLim;

    private String isAct;

    private String goodsNum;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsRem() {
        return goodsRem;
    }

    public void setGoodsRem(String goodsRem) {
        this.goodsRem = goodsRem == null ? null : goodsRem.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsTime() {
        return goodsTime;
    }

    public void setGoodsTime(String goodsTime) {
        this.goodsTime = goodsTime == null ? null : goodsTime.trim();
    }

    public String getGoodsLoc() {
        return goodsLoc;
    }

    public void setGoodsLoc(String goodsLoc) {
        this.goodsLoc = goodsLoc == null ? null : goodsLoc.trim();
    }

    public String getGoodsLeader() {
        return goodsLeader;
    }

    public void setGoodsLeader(String goodsLeader) {
        this.goodsLeader = goodsLeader == null ? null : goodsLeader.trim();
    }

    public String getGoodsPhoto() {
        return goodsPhoto;
    }

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto == null ? null : goodsPhoto.trim();
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

    public String getGoodsDur() {
        return goodsDur;
    }

    public void setGoodsDur(String goodsDur) {
        this.goodsDur = goodsDur == null ? null : goodsDur.trim();
    }

    public Long getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Long goodsSales) {
        this.goodsSales = goodsSales;
    }

    public String getGoodsStat() {
        return goodsStat;
    }

    public void setGoodsStat(String goodsStat) {
        this.goodsStat = goodsStat == null ? null : goodsStat.trim();
    }

    public String getCanAfl() {
        return canAfl;
    }

    public void setCanAfl(String canAfl) {
        this.canAfl = canAfl == null ? null : canAfl.trim();
    }

    public String getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(String goodsSort) {
        this.goodsSort = goodsSort == null ? null : goodsSort.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getTimeLim() {
        return timeLim;
    }

    public void setTimeLim(String timeLim) {
        this.timeLim = timeLim == null ? null : timeLim.trim();
    }

    public String getNumLim() {
        return numLim;
    }

    public void setNumLim(String numLim) {
        this.numLim = numLim == null ? null : numLim.trim();
    }

    public String getIsAct() {
        return isAct;
    }

    public void setIsAct(String isAct) {
        this.isAct = isAct == null ? null : isAct.trim();
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum == null ? null : goodsNum.trim();
    }
}