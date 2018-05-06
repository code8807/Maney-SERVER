package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class ChannelContrastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelContrastExample() {
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

        public Criteria andChlIdIsNull() {
            addCriterion("CHL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChlIdIsNotNull() {
            addCriterion("CHL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChlIdEqualTo(Integer value) {
            addCriterion("CHL_ID =", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotEqualTo(Integer value) {
            addCriterion("CHL_ID <>", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdGreaterThan(Integer value) {
            addCriterion("CHL_ID >", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHL_ID >=", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdLessThan(Integer value) {
            addCriterion("CHL_ID <", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHL_ID <=", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdIn(List<Integer> values) {
            addCriterion("CHL_ID in", values, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotIn(List<Integer> values) {
            addCriterion("CHL_ID not in", values, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdBetween(Integer value1, Integer value2) {
            addCriterion("CHL_ID between", value1, value2, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHL_ID not between", value1, value2, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlLevelIsNull() {
            addCriterion("CHL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andChlLevelIsNotNull() {
            addCriterion("CHL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andChlLevelEqualTo(String value) {
            addCriterion("CHL_LEVEL =", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelNotEqualTo(String value) {
            addCriterion("CHL_LEVEL <>", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelGreaterThan(String value) {
            addCriterion("CHL_LEVEL >", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_LEVEL >=", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelLessThan(String value) {
            addCriterion("CHL_LEVEL <", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelLessThanOrEqualTo(String value) {
            addCriterion("CHL_LEVEL <=", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelLike(String value) {
            addCriterion("CHL_LEVEL like", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelNotLike(String value) {
            addCriterion("CHL_LEVEL not like", value, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelIn(List<String> values) {
            addCriterion("CHL_LEVEL in", values, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelNotIn(List<String> values) {
            addCriterion("CHL_LEVEL not in", values, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelBetween(String value1, String value2) {
            addCriterion("CHL_LEVEL between", value1, value2, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlLevelNotBetween(String value1, String value2) {
            addCriterion("CHL_LEVEL not between", value1, value2, "chlLevel");
            return (Criteria) this;
        }

        public Criteria andChlRemIsNull() {
            addCriterion("CHL_REM is null");
            return (Criteria) this;
        }

        public Criteria andChlRemIsNotNull() {
            addCriterion("CHL_REM is not null");
            return (Criteria) this;
        }

        public Criteria andChlRemEqualTo(String value) {
            addCriterion("CHL_REM =", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemNotEqualTo(String value) {
            addCriterion("CHL_REM <>", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemGreaterThan(String value) {
            addCriterion("CHL_REM >", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemGreaterThanOrEqualTo(String value) {
            addCriterion("CHL_REM >=", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemLessThan(String value) {
            addCriterion("CHL_REM <", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemLessThanOrEqualTo(String value) {
            addCriterion("CHL_REM <=", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemLike(String value) {
            addCriterion("CHL_REM like", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemNotLike(String value) {
            addCriterion("CHL_REM not like", value, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemIn(List<String> values) {
            addCriterion("CHL_REM in", values, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemNotIn(List<String> values) {
            addCriterion("CHL_REM not in", values, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemBetween(String value1, String value2) {
            addCriterion("CHL_REM between", value1, value2, "chlRem");
            return (Criteria) this;
        }

        public Criteria andChlRemNotBetween(String value1, String value2) {
            addCriterion("CHL_REM not between", value1, value2, "chlRem");
            return (Criteria) this;
        }

        public Criteria andPreChlIsNull() {
            addCriterion("PRE_CHL is null");
            return (Criteria) this;
        }

        public Criteria andPreChlIsNotNull() {
            addCriterion("PRE_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andPreChlEqualTo(String value) {
            addCriterion("PRE_CHL =", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlNotEqualTo(String value) {
            addCriterion("PRE_CHL <>", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlGreaterThan(String value) {
            addCriterion("PRE_CHL >", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_CHL >=", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlLessThan(String value) {
            addCriterion("PRE_CHL <", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlLessThanOrEqualTo(String value) {
            addCriterion("PRE_CHL <=", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlLike(String value) {
            addCriterion("PRE_CHL like", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlNotLike(String value) {
            addCriterion("PRE_CHL not like", value, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlIn(List<String> values) {
            addCriterion("PRE_CHL in", values, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlNotIn(List<String> values) {
            addCriterion("PRE_CHL not in", values, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlBetween(String value1, String value2) {
            addCriterion("PRE_CHL between", value1, value2, "preChl");
            return (Criteria) this;
        }

        public Criteria andPreChlNotBetween(String value1, String value2) {
            addCriterion("PRE_CHL not between", value1, value2, "preChl");
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