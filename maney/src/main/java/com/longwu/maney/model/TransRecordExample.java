package com.longwu.maney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransRecordExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("PAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("PAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("PAY_ID =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("PAY_ID <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("PAY_ID >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ID >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("PAY_ID <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_ID <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("PAY_ID like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("PAY_ID not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("PAY_ID in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("PAY_ID not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("PAY_ID between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("PAY_ID not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNull() {
            addCriterion("REC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("REC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(String value) {
            addCriterion("REC_ID =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(String value) {
            addCriterion("REC_ID <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(String value) {
            addCriterion("REC_ID >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(String value) {
            addCriterion("REC_ID >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(String value) {
            addCriterion("REC_ID <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(String value) {
            addCriterion("REC_ID <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLike(String value) {
            addCriterion("REC_ID like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotLike(String value) {
            addCriterion("REC_ID not like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<String> values) {
            addCriterion("REC_ID in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<String> values) {
            addCriterion("REC_ID not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(String value1, String value2) {
            addCriterion("REC_ID between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(String value1, String value2) {
            addCriterion("REC_ID not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andManeyAmountIsNull() {
            addCriterion("MANEY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andManeyAmountIsNotNull() {
            addCriterion("MANEY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andManeyAmountEqualTo(BigDecimal value) {
            addCriterion("MANEY_AMOUNT =", value, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountNotEqualTo(BigDecimal value) {
            addCriterion("MANEY_AMOUNT <>", value, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountGreaterThan(BigDecimal value) {
            addCriterion("MANEY_AMOUNT >", value, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MANEY_AMOUNT >=", value, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountLessThan(BigDecimal value) {
            addCriterion("MANEY_AMOUNT <", value, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MANEY_AMOUNT <=", value, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountIn(List<BigDecimal> values) {
            addCriterion("MANEY_AMOUNT in", values, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountNotIn(List<BigDecimal> values) {
            addCriterion("MANEY_AMOUNT not in", values, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANEY_AMOUNT between", value1, value2, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andManeyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANEY_AMOUNT not between", value1, value2, "maneyAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("GOODS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("GOODS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("GOODS_CODE =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("GOODS_CODE <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("GOODS_CODE >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_CODE >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("GOODS_CODE <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_CODE <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("GOODS_CODE like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("GOODS_CODE not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("GOODS_CODE in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("GOODS_CODE not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("GOODS_CODE between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("GOODS_CODE not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andPayRemIsNull() {
            addCriterion("PAY_REM is null");
            return (Criteria) this;
        }

        public Criteria andPayRemIsNotNull() {
            addCriterion("PAY_REM is not null");
            return (Criteria) this;
        }

        public Criteria andPayRemEqualTo(String value) {
            addCriterion("PAY_REM =", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotEqualTo(String value) {
            addCriterion("PAY_REM <>", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemGreaterThan(String value) {
            addCriterion("PAY_REM >", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REM >=", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLessThan(String value) {
            addCriterion("PAY_REM <", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLessThanOrEqualTo(String value) {
            addCriterion("PAY_REM <=", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLike(String value) {
            addCriterion("PAY_REM like", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotLike(String value) {
            addCriterion("PAY_REM not like", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemIn(List<String> values) {
            addCriterion("PAY_REM in", values, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotIn(List<String> values) {
            addCriterion("PAY_REM not in", values, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemBetween(String value1, String value2) {
            addCriterion("PAY_REM between", value1, value2, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotBetween(String value1, String value2) {
            addCriterion("PAY_REM not between", value1, value2, "payRem");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaIsNull() {
            addCriterion("GOODS_QUA is null");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaIsNotNull() {
            addCriterion("GOODS_QUA is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaEqualTo(String value) {
            addCriterion("GOODS_QUA =", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaNotEqualTo(String value) {
            addCriterion("GOODS_QUA <>", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaGreaterThan(String value) {
            addCriterion("GOODS_QUA >", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_QUA >=", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaLessThan(String value) {
            addCriterion("GOODS_QUA <", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaLessThanOrEqualTo(String value) {
            addCriterion("GOODS_QUA <=", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaLike(String value) {
            addCriterion("GOODS_QUA like", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaNotLike(String value) {
            addCriterion("GOODS_QUA not like", value, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaIn(List<String> values) {
            addCriterion("GOODS_QUA in", values, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaNotIn(List<String> values) {
            addCriterion("GOODS_QUA not in", values, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaBetween(String value1, String value2) {
            addCriterion("GOODS_QUA between", value1, value2, "goodsQua");
            return (Criteria) this;
        }

        public Criteria andGoodsQuaNotBetween(String value1, String value2) {
            addCriterion("GOODS_QUA not between", value1, value2, "goodsQua");
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

        public Criteria andPayStatIsNull() {
            addCriterion("PAY_STAT is null");
            return (Criteria) this;
        }

        public Criteria andPayStatIsNotNull() {
            addCriterion("PAY_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatEqualTo(String value) {
            addCriterion("PAY_STAT =", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatNotEqualTo(String value) {
            addCriterion("PAY_STAT <>", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatGreaterThan(String value) {
            addCriterion("PAY_STAT >", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_STAT >=", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatLessThan(String value) {
            addCriterion("PAY_STAT <", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatLessThanOrEqualTo(String value) {
            addCriterion("PAY_STAT <=", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatLike(String value) {
            addCriterion("PAY_STAT like", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatNotLike(String value) {
            addCriterion("PAY_STAT not like", value, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatIn(List<String> values) {
            addCriterion("PAY_STAT in", values, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatNotIn(List<String> values) {
            addCriterion("PAY_STAT not in", values, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatBetween(String value1, String value2) {
            addCriterion("PAY_STAT between", value1, value2, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayStatNotBetween(String value1, String value2) {
            addCriterion("PAY_STAT not between", value1, value2, "payStat");
            return (Criteria) this;
        }

        public Criteria andPayChlIsNull() {
            addCriterion("PAY_CHL is null");
            return (Criteria) this;
        }

        public Criteria andPayChlIsNotNull() {
            addCriterion("PAY_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChlEqualTo(String value) {
            addCriterion("PAY_CHL =", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotEqualTo(String value) {
            addCriterion("PAY_CHL <>", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlGreaterThan(String value) {
            addCriterion("PAY_CHL >", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHL >=", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlLessThan(String value) {
            addCriterion("PAY_CHL <", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHL <=", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlLike(String value) {
            addCriterion("PAY_CHL like", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotLike(String value) {
            addCriterion("PAY_CHL not like", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlIn(List<String> values) {
            addCriterion("PAY_CHL in", values, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotIn(List<String> values) {
            addCriterion("PAY_CHL not in", values, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlBetween(String value1, String value2) {
            addCriterion("PAY_CHL between", value1, value2, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotBetween(String value1, String value2) {
            addCriterion("PAY_CHL not between", value1, value2, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayAddrIsNull() {
            addCriterion("PAY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andPayAddrIsNotNull() {
            addCriterion("PAY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andPayAddrEqualTo(String value) {
            addCriterion("PAY_ADDR =", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrNotEqualTo(String value) {
            addCriterion("PAY_ADDR <>", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrGreaterThan(String value) {
            addCriterion("PAY_ADDR >", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ADDR >=", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrLessThan(String value) {
            addCriterion("PAY_ADDR <", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrLessThanOrEqualTo(String value) {
            addCriterion("PAY_ADDR <=", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrLike(String value) {
            addCriterion("PAY_ADDR like", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrNotLike(String value) {
            addCriterion("PAY_ADDR not like", value, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrIn(List<String> values) {
            addCriterion("PAY_ADDR in", values, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrNotIn(List<String> values) {
            addCriterion("PAY_ADDR not in", values, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrBetween(String value1, String value2) {
            addCriterion("PAY_ADDR between", value1, value2, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayAddrNotBetween(String value1, String value2) {
            addCriterion("PAY_ADDR not between", value1, value2, "payAddr");
            return (Criteria) this;
        }

        public Criteria andPayOrderidIsNull() {
            addCriterion("PAY_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderidIsNotNull() {
            addCriterion("PAY_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderidEqualTo(String value) {
            addCriterion("PAY_ORDERID =", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidNotEqualTo(String value) {
            addCriterion("PAY_ORDERID <>", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidGreaterThan(String value) {
            addCriterion("PAY_ORDERID >", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDERID >=", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidLessThan(String value) {
            addCriterion("PAY_ORDERID <", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDERID <=", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidLike(String value) {
            addCriterion("PAY_ORDERID like", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidNotLike(String value) {
            addCriterion("PAY_ORDERID not like", value, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidIn(List<String> values) {
            addCriterion("PAY_ORDERID in", values, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidNotIn(List<String> values) {
            addCriterion("PAY_ORDERID not in", values, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidBetween(String value1, String value2) {
            addCriterion("PAY_ORDERID between", value1, value2, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andPayOrderidNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDERID not between", value1, value2, "payOrderid");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNull() {
            addCriterion("MER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("MER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("MER_NAME =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("MER_NAME <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("MER_NAME >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NAME >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("MER_NAME <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("MER_NAME <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("MER_NAME like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("MER_NAME not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("MER_NAME in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("MER_NAME not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("MER_NAME between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("MER_NAME not between", value1, value2, "merName");
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

        public Criteria andBtlIdIsNull() {
            addCriterion("BTL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBtlIdIsNotNull() {
            addCriterion("BTL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBtlIdEqualTo(String value) {
            addCriterion("BTL_ID =", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdNotEqualTo(String value) {
            addCriterion("BTL_ID <>", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdGreaterThan(String value) {
            addCriterion("BTL_ID >", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdGreaterThanOrEqualTo(String value) {
            addCriterion("BTL_ID >=", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdLessThan(String value) {
            addCriterion("BTL_ID <", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdLessThanOrEqualTo(String value) {
            addCriterion("BTL_ID <=", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdLike(String value) {
            addCriterion("BTL_ID like", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdNotLike(String value) {
            addCriterion("BTL_ID not like", value, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdIn(List<String> values) {
            addCriterion("BTL_ID in", values, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdNotIn(List<String> values) {
            addCriterion("BTL_ID not in", values, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdBetween(String value1, String value2) {
            addCriterion("BTL_ID between", value1, value2, "btlId");
            return (Criteria) this;
        }

        public Criteria andBtlIdNotBetween(String value1, String value2) {
            addCriterion("BTL_ID not between", value1, value2, "btlId");
            return (Criteria) this;
        }

        public Criteria andResOneIsNull() {
            addCriterion("RES_ONE is null");
            return (Criteria) this;
        }

        public Criteria andResOneIsNotNull() {
            addCriterion("RES_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andResOneEqualTo(String value) {
            addCriterion("RES_ONE =", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotEqualTo(String value) {
            addCriterion("RES_ONE <>", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThan(String value) {
            addCriterion("RES_ONE >", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneGreaterThanOrEqualTo(String value) {
            addCriterion("RES_ONE >=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThan(String value) {
            addCriterion("RES_ONE <", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLessThanOrEqualTo(String value) {
            addCriterion("RES_ONE <=", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneLike(String value) {
            addCriterion("RES_ONE like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotLike(String value) {
            addCriterion("RES_ONE not like", value, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneIn(List<String> values) {
            addCriterion("RES_ONE in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotIn(List<String> values) {
            addCriterion("RES_ONE not in", values, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneBetween(String value1, String value2) {
            addCriterion("RES_ONE between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResOneNotBetween(String value1, String value2) {
            addCriterion("RES_ONE not between", value1, value2, "resOne");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNull() {
            addCriterion("RES_TWO is null");
            return (Criteria) this;
        }

        public Criteria andResTwoIsNotNull() {
            addCriterion("RES_TWO is not null");
            return (Criteria) this;
        }

        public Criteria andResTwoEqualTo(String value) {
            addCriterion("RES_TWO =", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotEqualTo(String value) {
            addCriterion("RES_TWO <>", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThan(String value) {
            addCriterion("RES_TWO >", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoGreaterThanOrEqualTo(String value) {
            addCriterion("RES_TWO >=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThan(String value) {
            addCriterion("RES_TWO <", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLessThanOrEqualTo(String value) {
            addCriterion("RES_TWO <=", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoLike(String value) {
            addCriterion("RES_TWO like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotLike(String value) {
            addCriterion("RES_TWO not like", value, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoIn(List<String> values) {
            addCriterion("RES_TWO in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotIn(List<String> values) {
            addCriterion("RES_TWO not in", values, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoBetween(String value1, String value2) {
            addCriterion("RES_TWO between", value1, value2, "resTwo");
            return (Criteria) this;
        }

        public Criteria andResTwoNotBetween(String value1, String value2) {
            addCriterion("RES_TWO not between", value1, value2, "resTwo");
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