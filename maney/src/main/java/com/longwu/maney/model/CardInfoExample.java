package com.longwu.maney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CardInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardInfoExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
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

        public Criteria andCardStatIsNull() {
            addCriterion("CARD_STAT is null");
            return (Criteria) this;
        }

        public Criteria andCardStatIsNotNull() {
            addCriterion("CARD_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andCardStatEqualTo(String value) {
            addCriterion("CARD_STAT =", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatNotEqualTo(String value) {
            addCriterion("CARD_STAT <>", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatGreaterThan(String value) {
            addCriterion("CARD_STAT >", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_STAT >=", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatLessThan(String value) {
            addCriterion("CARD_STAT <", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatLessThanOrEqualTo(String value) {
            addCriterion("CARD_STAT <=", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatLike(String value) {
            addCriterion("CARD_STAT like", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatNotLike(String value) {
            addCriterion("CARD_STAT not like", value, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatIn(List<String> values) {
            addCriterion("CARD_STAT in", values, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatNotIn(List<String> values) {
            addCriterion("CARD_STAT not in", values, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatBetween(String value1, String value2) {
            addCriterion("CARD_STAT between", value1, value2, "cardStat");
            return (Criteria) this;
        }

        public Criteria andCardStatNotBetween(String value1, String value2) {
            addCriterion("CARD_STAT not between", value1, value2, "cardStat");
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

        public Criteria andCardRemainIsNull() {
            addCriterion("CARD_REMAIN is null");
            return (Criteria) this;
        }

        public Criteria andCardRemainIsNotNull() {
            addCriterion("CARD_REMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCardRemainEqualTo(BigDecimal value) {
            addCriterion("CARD_REMAIN =", value, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainNotEqualTo(BigDecimal value) {
            addCriterion("CARD_REMAIN <>", value, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainGreaterThan(BigDecimal value) {
            addCriterion("CARD_REMAIN >", value, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_REMAIN >=", value, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainLessThan(BigDecimal value) {
            addCriterion("CARD_REMAIN <", value, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARD_REMAIN <=", value, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainIn(List<BigDecimal> values) {
            addCriterion("CARD_REMAIN in", values, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainNotIn(List<BigDecimal> values) {
            addCriterion("CARD_REMAIN not in", values, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_REMAIN between", value1, value2, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andCardRemainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARD_REMAIN not between", value1, value2, "cardRemain");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("OPEN_TIME =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("OPEN_TIME <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("OPEN_TIME >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_TIME >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("OPEN_TIME <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("OPEN_TIME <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("OPEN_TIME like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("OPEN_TIME not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("OPEN_TIME in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("OPEN_TIME not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("OPEN_TIME between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("OPEN_TIME not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNull() {
            addCriterion("BUY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("BUY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(String value) {
            addCriterion("BUY_TIME =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(String value) {
            addCriterion("BUY_TIME <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(String value) {
            addCriterion("BUY_TIME >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_TIME >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(String value) {
            addCriterion("BUY_TIME <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(String value) {
            addCriterion("BUY_TIME <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLike(String value) {
            addCriterion("BUY_TIME like", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotLike(String value) {
            addCriterion("BUY_TIME not like", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<String> values) {
            addCriterion("BUY_TIME in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<String> values) {
            addCriterion("BUY_TIME not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(String value1, String value2) {
            addCriterion("BUY_TIME between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(String value1, String value2) {
            addCriterion("BUY_TIME not between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("GOODS_ID like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("GOODS_ID not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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