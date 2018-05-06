package com.longwu.maney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
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

        public Criteria andGoodsPriceIsNull() {
            addCriterion("GOODS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("GOODS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("GOODS_PRICE >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("GOODS_PRICE <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("GOODS_PRICE in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_PRICE not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_PRICE between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_PRICE not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsRemIsNull() {
            addCriterion("GOODS_REM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRemIsNotNull() {
            addCriterion("GOODS_REM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRemEqualTo(String value) {
            addCriterion("GOODS_REM =", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemNotEqualTo(String value) {
            addCriterion("GOODS_REM <>", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemGreaterThan(String value) {
            addCriterion("GOODS_REM >", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_REM >=", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemLessThan(String value) {
            addCriterion("GOODS_REM <", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemLessThanOrEqualTo(String value) {
            addCriterion("GOODS_REM <=", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemLike(String value) {
            addCriterion("GOODS_REM like", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemNotLike(String value) {
            addCriterion("GOODS_REM not like", value, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemIn(List<String> values) {
            addCriterion("GOODS_REM in", values, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemNotIn(List<String> values) {
            addCriterion("GOODS_REM not in", values, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemBetween(String value1, String value2) {
            addCriterion("GOODS_REM between", value1, value2, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsRemNotBetween(String value1, String value2) {
            addCriterion("GOODS_REM not between", value1, value2, "goodsRem");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeIsNull() {
            addCriterion("GOODS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeIsNotNull() {
            addCriterion("GOODS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeEqualTo(String value) {
            addCriterion("GOODS_TIME =", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeNotEqualTo(String value) {
            addCriterion("GOODS_TIME <>", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeGreaterThan(String value) {
            addCriterion("GOODS_TIME >", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TIME >=", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeLessThan(String value) {
            addCriterion("GOODS_TIME <", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TIME <=", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeLike(String value) {
            addCriterion("GOODS_TIME like", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeNotLike(String value) {
            addCriterion("GOODS_TIME not like", value, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeIn(List<String> values) {
            addCriterion("GOODS_TIME in", values, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeNotIn(List<String> values) {
            addCriterion("GOODS_TIME not in", values, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeBetween(String value1, String value2) {
            addCriterion("GOODS_TIME between", value1, value2, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTimeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TIME not between", value1, value2, "goodsTime");
            return (Criteria) this;
        }

        public Criteria andGoodsLocIsNull() {
            addCriterion("GOODS_LOC is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLocIsNotNull() {
            addCriterion("GOODS_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLocEqualTo(String value) {
            addCriterion("GOODS_LOC =", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocNotEqualTo(String value) {
            addCriterion("GOODS_LOC <>", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocGreaterThan(String value) {
            addCriterion("GOODS_LOC >", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_LOC >=", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocLessThan(String value) {
            addCriterion("GOODS_LOC <", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocLessThanOrEqualTo(String value) {
            addCriterion("GOODS_LOC <=", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocLike(String value) {
            addCriterion("GOODS_LOC like", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocNotLike(String value) {
            addCriterion("GOODS_LOC not like", value, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocIn(List<String> values) {
            addCriterion("GOODS_LOC in", values, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocNotIn(List<String> values) {
            addCriterion("GOODS_LOC not in", values, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocBetween(String value1, String value2) {
            addCriterion("GOODS_LOC between", value1, value2, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLocNotBetween(String value1, String value2) {
            addCriterion("GOODS_LOC not between", value1, value2, "goodsLoc");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderIsNull() {
            addCriterion("GOODS_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderIsNotNull() {
            addCriterion("GOODS_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderEqualTo(String value) {
            addCriterion("GOODS_LEADER =", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderNotEqualTo(String value) {
            addCriterion("GOODS_LEADER <>", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderGreaterThan(String value) {
            addCriterion("GOODS_LEADER >", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_LEADER >=", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderLessThan(String value) {
            addCriterion("GOODS_LEADER <", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderLessThanOrEqualTo(String value) {
            addCriterion("GOODS_LEADER <=", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderLike(String value) {
            addCriterion("GOODS_LEADER like", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderNotLike(String value) {
            addCriterion("GOODS_LEADER not like", value, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderIn(List<String> values) {
            addCriterion("GOODS_LEADER in", values, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderNotIn(List<String> values) {
            addCriterion("GOODS_LEADER not in", values, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderBetween(String value1, String value2) {
            addCriterion("GOODS_LEADER between", value1, value2, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsLeaderNotBetween(String value1, String value2) {
            addCriterion("GOODS_LEADER not between", value1, value2, "goodsLeader");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoIsNull() {
            addCriterion("GOODS_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoIsNotNull() {
            addCriterion("GOODS_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoEqualTo(String value) {
            addCriterion("GOODS_PHOTO =", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotEqualTo(String value) {
            addCriterion("GOODS_PHOTO <>", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoGreaterThan(String value) {
            addCriterion("GOODS_PHOTO >", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_PHOTO >=", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoLessThan(String value) {
            addCriterion("GOODS_PHOTO <", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoLessThanOrEqualTo(String value) {
            addCriterion("GOODS_PHOTO <=", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoLike(String value) {
            addCriterion("GOODS_PHOTO like", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotLike(String value) {
            addCriterion("GOODS_PHOTO not like", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoIn(List<String> values) {
            addCriterion("GOODS_PHOTO in", values, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotIn(List<String> values) {
            addCriterion("GOODS_PHOTO not in", values, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoBetween(String value1, String value2) {
            addCriterion("GOODS_PHOTO between", value1, value2, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotBetween(String value1, String value2) {
            addCriterion("GOODS_PHOTO not between", value1, value2, "goodsPhoto");
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

        public Criteria andGoodsDurIsNull() {
            addCriterion("GOODS_DUR is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDurIsNotNull() {
            addCriterion("GOODS_DUR is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDurEqualTo(String value) {
            addCriterion("GOODS_DUR =", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurNotEqualTo(String value) {
            addCriterion("GOODS_DUR <>", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurGreaterThan(String value) {
            addCriterion("GOODS_DUR >", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_DUR >=", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurLessThan(String value) {
            addCriterion("GOODS_DUR <", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurLessThanOrEqualTo(String value) {
            addCriterion("GOODS_DUR <=", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurLike(String value) {
            addCriterion("GOODS_DUR like", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurNotLike(String value) {
            addCriterion("GOODS_DUR not like", value, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurIn(List<String> values) {
            addCriterion("GOODS_DUR in", values, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurNotIn(List<String> values) {
            addCriterion("GOODS_DUR not in", values, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurBetween(String value1, String value2) {
            addCriterion("GOODS_DUR between", value1, value2, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsDurNotBetween(String value1, String value2) {
            addCriterion("GOODS_DUR not between", value1, value2, "goodsDur");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNull() {
            addCriterion("GOODS_SALES is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNotNull() {
            addCriterion("GOODS_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesEqualTo(Long value) {
            addCriterion("GOODS_SALES =", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotEqualTo(Long value) {
            addCriterion("GOODS_SALES <>", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThan(Long value) {
            addCriterion("GOODS_SALES >", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_SALES >=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThan(Long value) {
            addCriterion("GOODS_SALES <", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_SALES <=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIn(List<Long> values) {
            addCriterion("GOODS_SALES in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotIn(List<Long> values) {
            addCriterion("GOODS_SALES not in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesBetween(Long value1, Long value2) {
            addCriterion("GOODS_SALES between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_SALES not between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsStatIsNull() {
            addCriterion("GOODS_STAT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatIsNotNull() {
            addCriterion("GOODS_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatEqualTo(String value) {
            addCriterion("GOODS_STAT =", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatNotEqualTo(String value) {
            addCriterion("GOODS_STAT <>", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatGreaterThan(String value) {
            addCriterion("GOODS_STAT >", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_STAT >=", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatLessThan(String value) {
            addCriterion("GOODS_STAT <", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatLessThanOrEqualTo(String value) {
            addCriterion("GOODS_STAT <=", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatLike(String value) {
            addCriterion("GOODS_STAT like", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatNotLike(String value) {
            addCriterion("GOODS_STAT not like", value, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatIn(List<String> values) {
            addCriterion("GOODS_STAT in", values, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatNotIn(List<String> values) {
            addCriterion("GOODS_STAT not in", values, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatBetween(String value1, String value2) {
            addCriterion("GOODS_STAT between", value1, value2, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andGoodsStatNotBetween(String value1, String value2) {
            addCriterion("GOODS_STAT not between", value1, value2, "goodsStat");
            return (Criteria) this;
        }

        public Criteria andCanAflIsNull() {
            addCriterion("CAN_AFL is null");
            return (Criteria) this;
        }

        public Criteria andCanAflIsNotNull() {
            addCriterion("CAN_AFL is not null");
            return (Criteria) this;
        }

        public Criteria andCanAflEqualTo(String value) {
            addCriterion("CAN_AFL =", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflNotEqualTo(String value) {
            addCriterion("CAN_AFL <>", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflGreaterThan(String value) {
            addCriterion("CAN_AFL >", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_AFL >=", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflLessThan(String value) {
            addCriterion("CAN_AFL <", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflLessThanOrEqualTo(String value) {
            addCriterion("CAN_AFL <=", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflLike(String value) {
            addCriterion("CAN_AFL like", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflNotLike(String value) {
            addCriterion("CAN_AFL not like", value, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflIn(List<String> values) {
            addCriterion("CAN_AFL in", values, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflNotIn(List<String> values) {
            addCriterion("CAN_AFL not in", values, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflBetween(String value1, String value2) {
            addCriterion("CAN_AFL between", value1, value2, "canAfl");
            return (Criteria) this;
        }

        public Criteria andCanAflNotBetween(String value1, String value2) {
            addCriterion("CAN_AFL not between", value1, value2, "canAfl");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNull() {
            addCriterion("GOODS_SORT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNotNull() {
            addCriterion("GOODS_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortEqualTo(String value) {
            addCriterion("GOODS_SORT =", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotEqualTo(String value) {
            addCriterion("GOODS_SORT <>", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThan(String value) {
            addCriterion("GOODS_SORT >", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_SORT >=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThan(String value) {
            addCriterion("GOODS_SORT <", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThanOrEqualTo(String value) {
            addCriterion("GOODS_SORT <=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLike(String value) {
            addCriterion("GOODS_SORT like", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotLike(String value) {
            addCriterion("GOODS_SORT not like", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIn(List<String> values) {
            addCriterion("GOODS_SORT in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotIn(List<String> values) {
            addCriterion("GOODS_SORT not in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortBetween(String value1, String value2) {
            addCriterion("GOODS_SORT between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotBetween(String value1, String value2) {
            addCriterion("GOODS_SORT not between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andTimeLimIsNull() {
            addCriterion("TIME_LIM is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimIsNotNull() {
            addCriterion("TIME_LIM is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimEqualTo(String value) {
            addCriterion("TIME_LIM =", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimNotEqualTo(String value) {
            addCriterion("TIME_LIM <>", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimGreaterThan(String value) {
            addCriterion("TIME_LIM >", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_LIM >=", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimLessThan(String value) {
            addCriterion("TIME_LIM <", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimLessThanOrEqualTo(String value) {
            addCriterion("TIME_LIM <=", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimLike(String value) {
            addCriterion("TIME_LIM like", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimNotLike(String value) {
            addCriterion("TIME_LIM not like", value, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimIn(List<String> values) {
            addCriterion("TIME_LIM in", values, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimNotIn(List<String> values) {
            addCriterion("TIME_LIM not in", values, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimBetween(String value1, String value2) {
            addCriterion("TIME_LIM between", value1, value2, "timeLim");
            return (Criteria) this;
        }

        public Criteria andTimeLimNotBetween(String value1, String value2) {
            addCriterion("TIME_LIM not between", value1, value2, "timeLim");
            return (Criteria) this;
        }

        public Criteria andNumLimIsNull() {
            addCriterion("NUM_LIM is null");
            return (Criteria) this;
        }

        public Criteria andNumLimIsNotNull() {
            addCriterion("NUM_LIM is not null");
            return (Criteria) this;
        }

        public Criteria andNumLimEqualTo(String value) {
            addCriterion("NUM_LIM =", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimNotEqualTo(String value) {
            addCriterion("NUM_LIM <>", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimGreaterThan(String value) {
            addCriterion("NUM_LIM >", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_LIM >=", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimLessThan(String value) {
            addCriterion("NUM_LIM <", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimLessThanOrEqualTo(String value) {
            addCriterion("NUM_LIM <=", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimLike(String value) {
            addCriterion("NUM_LIM like", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimNotLike(String value) {
            addCriterion("NUM_LIM not like", value, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimIn(List<String> values) {
            addCriterion("NUM_LIM in", values, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimNotIn(List<String> values) {
            addCriterion("NUM_LIM not in", values, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimBetween(String value1, String value2) {
            addCriterion("NUM_LIM between", value1, value2, "numLim");
            return (Criteria) this;
        }

        public Criteria andNumLimNotBetween(String value1, String value2) {
            addCriterion("NUM_LIM not between", value1, value2, "numLim");
            return (Criteria) this;
        }

        public Criteria andIsActIsNull() {
            addCriterion("IS_ACT is null");
            return (Criteria) this;
        }

        public Criteria andIsActIsNotNull() {
            addCriterion("IS_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andIsActEqualTo(String value) {
            addCriterion("IS_ACT =", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActNotEqualTo(String value) {
            addCriterion("IS_ACT <>", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActGreaterThan(String value) {
            addCriterion("IS_ACT >", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACT >=", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActLessThan(String value) {
            addCriterion("IS_ACT <", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActLessThanOrEqualTo(String value) {
            addCriterion("IS_ACT <=", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActLike(String value) {
            addCriterion("IS_ACT like", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActNotLike(String value) {
            addCriterion("IS_ACT not like", value, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActIn(List<String> values) {
            addCriterion("IS_ACT in", values, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActNotIn(List<String> values) {
            addCriterion("IS_ACT not in", values, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActBetween(String value1, String value2) {
            addCriterion("IS_ACT between", value1, value2, "isAct");
            return (Criteria) this;
        }

        public Criteria andIsActNotBetween(String value1, String value2) {
            addCriterion("IS_ACT not between", value1, value2, "isAct");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("GOODS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("GOODS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(String value) {
            addCriterion("GOODS_NUM =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(String value) {
            addCriterion("GOODS_NUM <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(String value) {
            addCriterion("GOODS_NUM >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NUM >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(String value) {
            addCriterion("GOODS_NUM <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NUM <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLike(String value) {
            addCriterion("GOODS_NUM like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotLike(String value) {
            addCriterion("GOODS_NUM not like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<String> values) {
            addCriterion("GOODS_NUM in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<String> values) {
            addCriterion("GOODS_NUM not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(String value1, String value2) {
            addCriterion("GOODS_NUM between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(String value1, String value2) {
            addCriterion("GOODS_NUM not between", value1, value2, "goodsNum");
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