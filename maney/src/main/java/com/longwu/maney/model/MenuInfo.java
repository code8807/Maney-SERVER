package com.longwu.maney.model;

public class MenuInfo {
    private Integer menuId;

    private String menuStat;

    private String menuSys;

    private String menuName;

    private String menuLoc;

    private String menuLevel;

    private String menuAct;

    private String isLeaf;

    private String menuPhoto;

    private String createTime;

    private String updateTime;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuStat() {
        return menuStat;
    }

    public void setMenuStat(String menuStat) {
        this.menuStat = menuStat == null ? null : menuStat.trim();
    }

    public String getMenuSys() {
        return menuSys;
    }

    public void setMenuSys(String menuSys) {
        this.menuSys = menuSys == null ? null : menuSys.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuLoc() {
        return menuLoc;
    }

    public void setMenuLoc(String menuLoc) {
        this.menuLoc = menuLoc == null ? null : menuLoc.trim();
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel == null ? null : menuLevel.trim();
    }

    public String getMenuAct() {
        return menuAct;
    }

    public void setMenuAct(String menuAct) {
        this.menuAct = menuAct == null ? null : menuAct.trim();
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    public String getMenuPhoto() {
        return menuPhoto;
    }

    public void setMenuPhoto(String menuPhoto) {
        this.menuPhoto = menuPhoto == null ? null : menuPhoto.trim();
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