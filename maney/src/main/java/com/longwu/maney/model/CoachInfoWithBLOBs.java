package com.longwu.maney.model;

public class CoachInfoWithBLOBs extends CoachInfo {
    private String goodAt;

    private String coachAbout;

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt == null ? null : goodAt.trim();
    }

    public String getCoachAbout() {
        return coachAbout;
    }

    public void setCoachAbout(String coachAbout) {
        this.coachAbout = coachAbout == null ? null : coachAbout.trim();
    }
}