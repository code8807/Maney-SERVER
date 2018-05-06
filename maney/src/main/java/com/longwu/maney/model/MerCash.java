package com.longwu.maney.model;

import java.math.BigDecimal;

public class MerCash {
    private String merId;

    private String userId;

    private BigDecimal cashLimit;

    private String cashRate;

    private String lastCashTime;

    private BigDecimal avlLimit;

    private BigDecimal olLimit;

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(BigDecimal cashLimit) {
        this.cashLimit = cashLimit;
    }

    public String getCashRate() {
        return cashRate;
    }

    public void setCashRate(String cashRate) {
        this.cashRate = cashRate == null ? null : cashRate.trim();
    }

    public String getLastCashTime() {
        return lastCashTime;
    }

    public void setLastCashTime(String lastCashTime) {
        this.lastCashTime = lastCashTime == null ? null : lastCashTime.trim();
    }

    public BigDecimal getAvlLimit() {
        return avlLimit;
    }

    public void setAvlLimit(BigDecimal avlLimit) {
        this.avlLimit = avlLimit;
    }

    public BigDecimal getOlLimit() {
        return olLimit;
    }

    public void setOlLimit(BigDecimal olLimit) {
        this.olLimit = olLimit;
    }
}