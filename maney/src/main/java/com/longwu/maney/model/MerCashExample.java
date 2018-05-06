package com.longwu.maney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MerCashExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerCashExample() {
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

        public Criteria andMerIdIsNull() {
            addCriterion("MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("MER_ID like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("MER_ID not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCashLimitIsNull() {
            addCriterion("CASH_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCashLimitIsNotNull() {
            addCriterion("CASH_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCashLimitEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT =", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitNotEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT <>", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitGreaterThan(BigDecimal value) {
            addCriterion("CASH_LIMIT >", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT >=", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitLessThan(BigDecimal value) {
            addCriterion("CASH_LIMIT <", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_LIMIT <=", value, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitIn(List<BigDecimal> values) {
            addCriterion("CASH_LIMIT in", values, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitNotIn(List<BigDecimal> values) {
            addCriterion("CASH_LIMIT not in", values, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_LIMIT between", value1, value2, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_LIMIT not between", value1, value2, "cashLimit");
            return (Criteria) this;
        }

        public Criteria andCashRateIsNull() {
            addCriterion("CASH_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCashRateIsNotNull() {
            addCriterion("CASH_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCashRateEqualTo(String value) {
            addCriterion("CASH_RATE =", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateNotEqualTo(String value) {
            addCriterion("CASH_RATE <>", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateGreaterThan(String value) {
            addCriterion("CASH_RATE >", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_RATE >=", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateLessThan(String value) {
            addCriterion("CASH_RATE <", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateLessThanOrEqualTo(String value) {
            addCriterion("CASH_RATE <=", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateLike(String value) {
            addCriterion("CASH_RATE like", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateNotLike(String value) {
            addCriterion("CASH_RATE not like", value, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateIn(List<String> values) {
            addCriterion("CASH_RATE in", values, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateNotIn(List<String> values) {
            addCriterion("CASH_RATE not in", values, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateBetween(String value1, String value2) {
            addCriterion("CASH_RATE between", value1, value2, "cashRate");
            return (Criteria) this;
        }

        public Criteria andCashRateNotBetween(String value1, String value2) {
            addCriterion("CASH_RATE not between", value1, value2, "cashRate");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeIsNull() {
            addCriterion("LAST_CASH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeIsNotNull() {
            addCriterion("LAST_CASH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeEqualTo(String value) {
            addCriterion("LAST_CASH_TIME =", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeNotEqualTo(String value) {
            addCriterion("LAST_CASH_TIME <>", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeGreaterThan(String value) {
            addCriterion("LAST_CASH_TIME >", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CASH_TIME >=", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeLessThan(String value) {
            addCriterion("LAST_CASH_TIME <", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_CASH_TIME <=", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeLike(String value) {
            addCriterion("LAST_CASH_TIME like", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeNotLike(String value) {
            addCriterion("LAST_CASH_TIME not like", value, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeIn(List<String> values) {
            addCriterion("LAST_CASH_TIME in", values, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeNotIn(List<String> values) {
            addCriterion("LAST_CASH_TIME not in", values, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeBetween(String value1, String value2) {
            addCriterion("LAST_CASH_TIME between", value1, value2, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andLastCashTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_CASH_TIME not between", value1, value2, "lastCashTime");
            return (Criteria) this;
        }

        public Criteria andAvlLimitIsNull() {
            addCriterion("AVL_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAvlLimitIsNotNull() {
            addCriterion("AVL_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAvlLimitEqualTo(BigDecimal value) {
            addCriterion("AVL_LIMIT =", value, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitNotEqualTo(BigDecimal value) {
            addCriterion("AVL_LIMIT <>", value, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitGreaterThan(BigDecimal value) {
            addCriterion("AVL_LIMIT >", value, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVL_LIMIT >=", value, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitLessThan(BigDecimal value) {
            addCriterion("AVL_LIMIT <", value, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVL_LIMIT <=", value, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitIn(List<BigDecimal> values) {
            addCriterion("AVL_LIMIT in", values, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitNotIn(List<BigDecimal> values) {
            addCriterion("AVL_LIMIT not in", values, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVL_LIMIT between", value1, value2, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andAvlLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVL_LIMIT not between", value1, value2, "avlLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitIsNull() {
            addCriterion("OL_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andOlLimitIsNotNull() {
            addCriterion("OL_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andOlLimitEqualTo(BigDecimal value) {
            addCriterion("OL_LIMIT =", value, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitNotEqualTo(BigDecimal value) {
            addCriterion("OL_LIMIT <>", value, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitGreaterThan(BigDecimal value) {
            addCriterion("OL_LIMIT >", value, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OL_LIMIT >=", value, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitLessThan(BigDecimal value) {
            addCriterion("OL_LIMIT <", value, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OL_LIMIT <=", value, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitIn(List<BigDecimal> values) {
            addCriterion("OL_LIMIT in", values, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitNotIn(List<BigDecimal> values) {
            addCriterion("OL_LIMIT not in", values, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OL_LIMIT between", value1, value2, "olLimit");
            return (Criteria) this;
        }

        public Criteria andOlLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OL_LIMIT not between", value1, value2, "olLimit");
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