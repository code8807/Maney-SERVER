package com.longwu.maney.model;

import java.math.BigDecimal;

public class CardInfo {
    private Long cardId;

    private String userId;

    private String cardStat;

    private String numLim;

    private String merId;

    private BigDecimal cardRemain;

    private String openTime;

    private String endTime;

    private String buyTime;

    private String goodsId;

    private String orderId;

    private String timeLim;

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCardStat() {
        return cardStat;
    }

    public void setCardStat(String cardStat) {
        this.cardStat = cardStat == null ? null : cardStat.trim();
    }

    public String getNumLim() {
        return numLim;
    }

    public void setNumLim(String numLim) {
        this.numLim = numLim == null ? null : numLim.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public BigDecimal getCardRemain() {
        return cardRemain;
    }

    public void setCardRemain(BigDecimal cardRemain) {
        this.cardRemain = cardRemain;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime == null ? null : buyTime.trim();
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

    public String getTimeLim() {
        return timeLim;
    }

    public void setTimeLim(String timeLim) {
        this.timeLim = timeLim == null ? null : timeLim.trim();
    }
}