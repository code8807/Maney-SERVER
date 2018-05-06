package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class MenuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuStatIsNull() {
            addCriterion("MENU_STAT is null");
            return (Criteria) this;
        }

        public Criteria andMenuStatIsNotNull() {
            addCriterion("MENU_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStatEqualTo(String value) {
            addCriterion("MENU_STAT =", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotEqualTo(String value) {
            addCriterion("MENU_STAT <>", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatGreaterThan(String value) {
            addCriterion("MENU_STAT >", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_STAT >=", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatLessThan(String value) {
            addCriterion("MENU_STAT <", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatLessThanOrEqualTo(String value) {
            addCriterion("MENU_STAT <=", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatLike(String value) {
            addCriterion("MENU_STAT like", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotLike(String value) {
            addCriterion("MENU_STAT not like", value, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatIn(List<String> values) {
            addCriterion("MENU_STAT in", values, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotIn(List<String> values) {
            addCriterion("MENU_STAT not in", values, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatBetween(String value1, String value2) {
            addCriterion("MENU_STAT between", value1, value2, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuStatNotBetween(String value1, String value2) {
            addCriterion("MENU_STAT not between", value1, value2, "menuStat");
            return (Criteria) this;
        }

        public Criteria andMenuSysIsNull() {
            addCriterion("MENU_SYS is null");
            return (Criteria) this;
        }

        public Criteria andMenuSysIsNotNull() {
            addCriterion("MENU_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSysEqualTo(String value) {
            addCriterion("MENU_SYS =", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysNotEqualTo(String value) {
            addCriterion("MENU_SYS <>", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysGreaterThan(String value) {
            addCriterion("MENU_SYS >", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_SYS >=", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysLessThan(String value) {
            addCriterion("MENU_SYS <", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysLessThanOrEqualTo(String value) {
            addCriterion("MENU_SYS <=", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysLike(String value) {
            addCriterion("MENU_SYS like", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysNotLike(String value) {
            addCriterion("MENU_SYS not like", value, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysIn(List<String> values) {
            addCriterion("MENU_SYS in", values, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysNotIn(List<String> values) {
            addCriterion("MENU_SYS not in", values, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysBetween(String value1, String value2) {
            addCriterion("MENU_SYS between", value1, value2, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuSysNotBetween(String value1, String value2) {
            addCriterion("MENU_SYS not between", value1, value2, "menuSys");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuLocIsNull() {
            addCriterion("MENU_LOC is null");
            return (Criteria) this;
        }

        public Criteria andMenuLocIsNotNull() {
            addCriterion("MENU_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLocEqualTo(String value) {
            addCriterion("MENU_LOC =", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocNotEqualTo(String value) {
            addCriterion("MENU_LOC <>", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocGreaterThan(String value) {
            addCriterion("MENU_LOC >", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_LOC >=", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocLessThan(String value) {
            addCriterion("MENU_LOC <", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocLessThanOrEqualTo(String value) {
            addCriterion("MENU_LOC <=", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocLike(String value) {
            addCriterion("MENU_LOC like", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocNotLike(String value) {
            addCriterion("MENU_LOC not like", value, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocIn(List<String> values) {
            addCriterion("MENU_LOC in", values, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocNotIn(List<String> values) {
            addCriterion("MENU_LOC not in", values, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocBetween(String value1, String value2) {
            addCriterion("MENU_LOC between", value1, value2, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLocNotBetween(String value1, String value2) {
            addCriterion("MENU_LOC not between", value1, value2, "menuLoc");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNull() {
            addCriterion("MENU_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("MENU_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(String value) {
            addCriterion("MENU_LEVEL =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(String value) {
            addCriterion("MENU_LEVEL <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(String value) {
            addCriterion("MENU_LEVEL >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_LEVEL >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(String value) {
            addCriterion("MENU_LEVEL <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(String value) {
            addCriterion("MENU_LEVEL <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLike(String value) {
            addCriterion("MENU_LEVEL like", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotLike(String value) {
            addCriterion("MENU_LEVEL not like", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<String> values) {
            addCriterion("MENU_LEVEL in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<String> values) {
            addCriterion("MENU_LEVEL not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(String value1, String value2) {
            addCriterion("MENU_LEVEL between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(String value1, String value2) {
            addCriterion("MENU_LEVEL not between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuActIsNull() {
            addCriterion("MENU_ACT is null");
            return (Criteria) this;
        }

        public Criteria andMenuActIsNotNull() {
            addCriterion("MENU_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuActEqualTo(String value) {
            addCriterion("MENU_ACT =", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActNotEqualTo(String value) {
            addCriterion("MENU_ACT <>", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActGreaterThan(String value) {
            addCriterion("MENU_ACT >", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ACT >=", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActLessThan(String value) {
            addCriterion("MENU_ACT <", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActLessThanOrEqualTo(String value) {
            addCriterion("MENU_ACT <=", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActLike(String value) {
            addCriterion("MENU_ACT like", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActNotLike(String value) {
            addCriterion("MENU_ACT not like", value, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActIn(List<String> values) {
            addCriterion("MENU_ACT in", values, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActNotIn(List<String> values) {
            addCriterion("MENU_ACT not in", values, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActBetween(String value1, String value2) {
            addCriterion("MENU_ACT between", value1, value2, "menuAct");
            return (Criteria) this;
        }

        public Criteria andMenuActNotBetween(String value1, String value2) {
            addCriterion("MENU_ACT not between", value1, value2, "menuAct");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNull() {
            addCriterion("IS_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNotNull() {
            addCriterion("IS_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeafEqualTo(String value) {
            addCriterion("IS_LEAF =", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotEqualTo(String value) {
            addCriterion("IS_LEAF <>", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThan(String value) {
            addCriterion("IS_LEAF >", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LEAF >=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThan(String value) {
            addCriterion("IS_LEAF <", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThanOrEqualTo(String value) {
            addCriterion("IS_LEAF <=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLike(String value) {
            addCriterion("IS_LEAF like", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotLike(String value) {
            addCriterion("IS_LEAF not like", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafIn(List<String> values) {
            addCriterion("IS_LEAF in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotIn(List<String> values) {
            addCriterion("IS_LEAF not in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafBetween(String value1, String value2) {
            addCriterion("IS_LEAF between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotBetween(String value1, String value2) {
            addCriterion("IS_LEAF not between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoIsNull() {
            addCriterion("MENU_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoIsNotNull() {
            addCriterion("MENU_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoEqualTo(String value) {
            addCriterion("MENU_PHOTO =", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoNotEqualTo(String value) {
            addCriterion("MENU_PHOTO <>", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoGreaterThan(String value) {
            addCriterion("MENU_PHOTO >", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PHOTO >=", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoLessThan(String value) {
            addCriterion("MENU_PHOTO <", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoLessThanOrEqualTo(String value) {
            addCriterion("MENU_PHOTO <=", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoLike(String value) {
            addCriterion("MENU_PHOTO like", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoNotLike(String value) {
            addCriterion("MENU_PHOTO not like", value, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoIn(List<String> values) {
            addCriterion("MENU_PHOTO in", values, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoNotIn(List<String> values) {
            addCriterion("MENU_PHOTO not in", values, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoBetween(String value1, String value2) {
            addCriterion("MENU_PHOTO between", value1, value2, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andMenuPhotoNotBetween(String value1, String value2) {
            addCriterion("MENU_PHOTO not between", value1, value2, "menuPhoto");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}