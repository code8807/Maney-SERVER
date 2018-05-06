package com.longwu.maney.model;

public class VideoInfo {
    private Long videoId;

    private String videoName;

    private String videoUrl;

    private String videoThu;

    private String watchNum;

    private String likeNum;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoThu() {
        return videoThu;
    }

    public void setVideoThu(String videoThu) {
        this.videoThu = videoThu == null ? null : videoThu.trim();
    }

    public String getWatchNum() {
        return watchNum;
    }

    public void setWatchNum(String watchNum) {
        this.watchNum = watchNum == null ? null : watchNum.trim();
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum == null ? null : likeNum.trim();
    }
}