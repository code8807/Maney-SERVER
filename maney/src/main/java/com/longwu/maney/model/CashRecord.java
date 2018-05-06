package com.longwu.maney.model;

import java.math.BigDecimal;

public class CashRecord {
    private Long cashId;

    private String merId;

    private String userId;

    private BigDecimal cashAmount;

    private String cashTime;

    private String cashBank;

    private String cashAccount;

    private BigDecimal cashFee;

    private String cashName;

    private String cashStat;

    private String merName;

    private String createTime;

    private String updateTime;

    public Long getCashId() {
        return cashId;
    }

    public void setCashId(Long cashId) {
        this.cashId = cashId;
    }

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

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getCashTime() {
        return cashTime;
    }

    public void setCashTime(String cashTime) {
        this.cashTime = cashTime == null ? null : cashTime.trim();
    }

    public String getCashBank() {
        return cashBank;
    }

    public void setCashBank(String cashBank) {
        this.cashBank = cashBank == null ? null : cashBank.trim();
    }

    public String getCashAccount() {
        return cashAccount;
    }

    public void setCashAccount(String cashAccount) {
        this.cashAccount = cashAccount == null ? null : cashAccount.trim();
    }

    public BigDecimal getCashFee() {
        return cashFee;
    }

    public void setCashFee(BigDecimal cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName == null ? null : cashName.trim();
    }

    public String getCashStat() {
        return cashStat;
    }

    public void setCashStat(String cashStat) {
        this.cashStat = cashStat == null ? null : cashStat.trim();
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
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