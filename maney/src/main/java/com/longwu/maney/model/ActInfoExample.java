package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class ActInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActInfoExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("ACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("ACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Long value) {
            addCriterion("ACT_ID =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Long value) {
            addCriterion("ACT_ID <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Long value) {
            addCriterion("ACT_ID >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACT_ID >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Long value) {
            addCriterion("ACT_ID <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Long value) {
            addCriterion("ACT_ID <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Long> values) {
            addCriterion("ACT_ID in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Long> values) {
            addCriterion("ACT_ID not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Long value1, Long value2) {
            addCriterion("ACT_ID between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Long value1, Long value2) {
            addCriterion("ACT_ID not between", value1, value2, "actId");
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

        public Criteria andActDateIsNull() {
            addCriterion("ACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActDateIsNotNull() {
            addCriterion("ACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActDateEqualTo(String value) {
            addCriterion("ACT_DATE =", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotEqualTo(String value) {
            addCriterion("ACT_DATE <>", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThan(String value) {
            addCriterion("ACT_DATE >", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_DATE >=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThan(String value) {
            addCriterion("ACT_DATE <", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLessThanOrEqualTo(String value) {
            addCriterion("ACT_DATE <=", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateLike(String value) {
            addCriterion("ACT_DATE like", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotLike(String value) {
            addCriterion("ACT_DATE not like", value, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateIn(List<String> values) {
            addCriterion("ACT_DATE in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotIn(List<String> values) {
            addCriterion("ACT_DATE not in", values, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateBetween(String value1, String value2) {
            addCriterion("ACT_DATE between", value1, value2, "actDate");
            return (Criteria) this;
        }

        public Criteria andActDateNotBetween(String value1, String value2) {
            addCriterion("ACT_DATE not between", value1, value2, "actDate");
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

        public Criteria andT5IsNull() {
            addCriterion("T5 is null");
            return (Criteria) this;
        }

        public Criteria andT5IsNotNull() {
            addCriterion("T5 is not null");
            return (Criteria) this;
        }

        public Criteria andT5EqualTo(String value) {
            addCriterion("T5 =", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotEqualTo(String value) {
            addCriterion("T5 <>", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5GreaterThan(String value) {
            addCriterion("T5 >", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5GreaterThanOrEqualTo(String value) {
            addCriterion("T5 >=", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5LessThan(String value) {
            addCriterion("T5 <", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5LessThanOrEqualTo(String value) {
            addCriterion("T5 <=", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5Like(String value) {
            addCriterion("T5 like", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotLike(String value) {
            addCriterion("T5 not like", value, "t5");
            return (Criteria) this;
        }

        public Criteria andT5In(List<String> values) {
            addCriterion("T5 in", values, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotIn(List<String> values) {
            addCriterion("T5 not in", values, "t5");
            return (Criteria) this;
        }

        public Criteria andT5Between(String value1, String value2) {
            addCriterion("T5 between", value1, value2, "t5");
            return (Criteria) this;
        }

        public Criteria andT5NotBetween(String value1, String value2) {
            addCriterion("T5 not between", value1, value2, "t5");
            return (Criteria) this;
        }

        public Criteria andT6IsNull() {
            addCriterion("T6 is null");
            return (Criteria) this;
        }

        public Criteria andT6IsNotNull() {
            addCriterion("T6 is not null");
            return (Criteria) this;
        }

        public Criteria andT6EqualTo(String value) {
            addCriterion("T6 =", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotEqualTo(String value) {
            addCriterion("T6 <>", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6GreaterThan(String value) {
            addCriterion("T6 >", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6GreaterThanOrEqualTo(String value) {
            addCriterion("T6 >=", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6LessThan(String value) {
            addCriterion("T6 <", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6LessThanOrEqualTo(String value) {
            addCriterion("T6 <=", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6Like(String value) {
            addCriterion("T6 like", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotLike(String value) {
            addCriterion("T6 not like", value, "t6");
            return (Criteria) this;
        }

        public Criteria andT6In(List<String> values) {
            addCriterion("T6 in", values, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotIn(List<String> values) {
            addCriterion("T6 not in", values, "t6");
            return (Criteria) this;
        }

        public Criteria andT6Between(String value1, String value2) {
            addCriterion("T6 between", value1, value2, "t6");
            return (Criteria) this;
        }

        public Criteria andT6NotBetween(String value1, String value2) {
            addCriterion("T6 not between", value1, value2, "t6");
            return (Criteria) this;
        }

        public Criteria andT7IsNull() {
            addCriterion("T7 is null");
            return (Criteria) this;
        }

        public Criteria andT7IsNotNull() {
            addCriterion("T7 is not null");
            return (Criteria) this;
        }

        public Criteria andT7EqualTo(String value) {
            addCriterion("T7 =", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotEqualTo(String value) {
            addCriterion("T7 <>", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7GreaterThan(String value) {
            addCriterion("T7 >", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7GreaterThanOrEqualTo(String value) {
            addCriterion("T7 >=", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7LessThan(String value) {
            addCriterion("T7 <", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7LessThanOrEqualTo(String value) {
            addCriterion("T7 <=", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7Like(String value) {
            addCriterion("T7 like", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotLike(String value) {
            addCriterion("T7 not like", value, "t7");
            return (Criteria) this;
        }

        public Criteria andT7In(List<String> values) {
            addCriterion("T7 in", values, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotIn(List<String> values) {
            addCriterion("T7 not in", values, "t7");
            return (Criteria) this;
        }

        public Criteria andT7Between(String value1, String value2) {
            addCriterion("T7 between", value1, value2, "t7");
            return (Criteria) this;
        }

        public Criteria andT7NotBetween(String value1, String value2) {
            addCriterion("T7 not between", value1, value2, "t7");
            return (Criteria) this;
        }

        public Criteria andT8IsNull() {
            addCriterion("T8 is null");
            return (Criteria) this;
        }

        public Criteria andT8IsNotNull() {
            addCriterion("T8 is not null");
            return (Criteria) this;
        }

        public Criteria andT8EqualTo(String value) {
            addCriterion("T8 =", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotEqualTo(String value) {
            addCriterion("T8 <>", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8GreaterThan(String value) {
            addCriterion("T8 >", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8GreaterThanOrEqualTo(String value) {
            addCriterion("T8 >=", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8LessThan(String value) {
            addCriterion("T8 <", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8LessThanOrEqualTo(String value) {
            addCriterion("T8 <=", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8Like(String value) {
            addCriterion("T8 like", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotLike(String value) {
            addCriterion("T8 not like", value, "t8");
            return (Criteria) this;
        }

        public Criteria andT8In(List<String> values) {
            addCriterion("T8 in", values, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotIn(List<String> values) {
            addCriterion("T8 not in", values, "t8");
            return (Criteria) this;
        }

        public Criteria andT8Between(String value1, String value2) {
            addCriterion("T8 between", value1, value2, "t8");
            return (Criteria) this;
        }

        public Criteria andT8NotBetween(String value1, String value2) {
            addCriterion("T8 not between", value1, value2, "t8");
            return (Criteria) this;
        }

        public Criteria andT9IsNull() {
            addCriterion("T9 is null");
            return (Criteria) this;
        }

        public Criteria andT9IsNotNull() {
            addCriterion("T9 is not null");
            return (Criteria) this;
        }

        public Criteria andT9EqualTo(String value) {
            addCriterion("T9 =", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotEqualTo(String value) {
            addCriterion("T9 <>", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9GreaterThan(String value) {
            addCriterion("T9 >", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9GreaterThanOrEqualTo(String value) {
            addCriterion("T9 >=", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9LessThan(String value) {
            addCriterion("T9 <", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9LessThanOrEqualTo(String value) {
            addCriterion("T9 <=", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9Like(String value) {
            addCriterion("T9 like", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotLike(String value) {
            addCriterion("T9 not like", value, "t9");
            return (Criteria) this;
        }

        public Criteria andT9In(List<String> values) {
            addCriterion("T9 in", values, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotIn(List<String> values) {
            addCriterion("T9 not in", values, "t9");
            return (Criteria) this;
        }

        public Criteria andT9Between(String value1, String value2) {
            addCriterion("T9 between", value1, value2, "t9");
            return (Criteria) this;
        }

        public Criteria andT9NotBetween(String value1, String value2) {
            addCriterion("T9 not between", value1, value2, "t9");
            return (Criteria) this;
        }

        public Criteria andT10IsNull() {
            addCriterion("T10 is null");
            return (Criteria) this;
        }

        public Criteria andT10IsNotNull() {
            addCriterion("T10 is not null");
            return (Criteria) this;
        }

        public Criteria andT10EqualTo(String value) {
            addCriterion("T10 =", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotEqualTo(String value) {
            addCriterion("T10 <>", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10GreaterThan(String value) {
            addCriterion("T10 >", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10GreaterThanOrEqualTo(String value) {
            addCriterion("T10 >=", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10LessThan(String value) {
            addCriterion("T10 <", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10LessThanOrEqualTo(String value) {
            addCriterion("T10 <=", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10Like(String value) {
            addCriterion("T10 like", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotLike(String value) {
            addCriterion("T10 not like", value, "t10");
            return (Criteria) this;
        }

        public Criteria andT10In(List<String> values) {
            addCriterion("T10 in", values, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotIn(List<String> values) {
            addCriterion("T10 not in", values, "t10");
            return (Criteria) this;
        }

        public Criteria andT10Between(String value1, String value2) {
            addCriterion("T10 between", value1, value2, "t10");
            return (Criteria) this;
        }

        public Criteria andT10NotBetween(String value1, String value2) {
            addCriterion("T10 not between", value1, value2, "t10");
            return (Criteria) this;
        }

        public Criteria andT11IsNull() {
            addCriterion("T11 is null");
            return (Criteria) this;
        }

        public Criteria andT11IsNotNull() {
            addCriterion("T11 is not null");
            return (Criteria) this;
        }

        public Criteria andT11EqualTo(String value) {
            addCriterion("T11 =", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotEqualTo(String value) {
            addCriterion("T11 <>", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11GreaterThan(String value) {
            addCriterion("T11 >", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11GreaterThanOrEqualTo(String value) {
            addCriterion("T11 >=", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11LessThan(String value) {
            addCriterion("T11 <", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11LessThanOrEqualTo(String value) {
            addCriterion("T11 <=", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11Like(String value) {
            addCriterion("T11 like", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotLike(String value) {
            addCriterion("T11 not like", value, "t11");
            return (Criteria) this;
        }

        public Criteria andT11In(List<String> values) {
            addCriterion("T11 in", values, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotIn(List<String> values) {
            addCriterion("T11 not in", values, "t11");
            return (Criteria) this;
        }

        public Criteria andT11Between(String value1, String value2) {
            addCriterion("T11 between", value1, value2, "t11");
            return (Criteria) this;
        }

        public Criteria andT11NotBetween(String value1, String value2) {
            addCriterion("T11 not between", value1, value2, "t11");
            return (Criteria) this;
        }

        public Criteria andT12IsNull() {
            addCriterion("T12 is null");
            return (Criteria) this;
        }

        public Criteria andT12IsNotNull() {
            addCriterion("T12 is not null");
            return (Criteria) this;
        }

        public Criteria andT12EqualTo(String value) {
            addCriterion("T12 =", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotEqualTo(String value) {
            addCriterion("T12 <>", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12GreaterThan(String value) {
            addCriterion("T12 >", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12GreaterThanOrEqualTo(String value) {
            addCriterion("T12 >=", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12LessThan(String value) {
            addCriterion("T12 <", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12LessThanOrEqualTo(String value) {
            addCriterion("T12 <=", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12Like(String value) {
            addCriterion("T12 like", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotLike(String value) {
            addCriterion("T12 not like", value, "t12");
            return (Criteria) this;
        }

        public Criteria andT12In(List<String> values) {
            addCriterion("T12 in", values, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotIn(List<String> values) {
            addCriterion("T12 not in", values, "t12");
            return (Criteria) this;
        }

        public Criteria andT12Between(String value1, String value2) {
            addCriterion("T12 between", value1, value2, "t12");
            return (Criteria) this;
        }

        public Criteria andT12NotBetween(String value1, String value2) {
            addCriterion("T12 not between", value1, value2, "t12");
            return (Criteria) this;
        }

        public Criteria andT13IsNull() {
            addCriterion("T13 is null");
            return (Criteria) this;
        }

        public Criteria andT13IsNotNull() {
            addCriterion("T13 is not null");
            return (Criteria) this;
        }

        public Criteria andT13EqualTo(String value) {
            addCriterion("T13 =", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotEqualTo(String value) {
            addCriterion("T13 <>", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13GreaterThan(String value) {
            addCriterion("T13 >", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13GreaterThanOrEqualTo(String value) {
            addCriterion("T13 >=", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13LessThan(String value) {
            addCriterion("T13 <", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13LessThanOrEqualTo(String value) {
            addCriterion("T13 <=", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13Like(String value) {
            addCriterion("T13 like", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotLike(String value) {
            addCriterion("T13 not like", value, "t13");
            return (Criteria) this;
        }

        public Criteria andT13In(List<String> values) {
            addCriterion("T13 in", values, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotIn(List<String> values) {
            addCriterion("T13 not in", values, "t13");
            return (Criteria) this;
        }

        public Criteria andT13Between(String value1, String value2) {
            addCriterion("T13 between", value1, value2, "t13");
            return (Criteria) this;
        }

        public Criteria andT13NotBetween(String value1, String value2) {
            addCriterion("T13 not between", value1, value2, "t13");
            return (Criteria) this;
        }

        public Criteria andT14IsNull() {
            addCriterion("T14 is null");
            return (Criteria) this;
        }

        public Criteria andT14IsNotNull() {
            addCriterion("T14 is not null");
            return (Criteria) this;
        }

        public Criteria andT14EqualTo(String value) {
            addCriterion("T14 =", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotEqualTo(String value) {
            addCriterion("T14 <>", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14GreaterThan(String value) {
            addCriterion("T14 >", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14GreaterThanOrEqualTo(String value) {
            addCriterion("T14 >=", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14LessThan(String value) {
            addCriterion("T14 <", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14LessThanOrEqualTo(String value) {
            addCriterion("T14 <=", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14Like(String value) {
            addCriterion("T14 like", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotLike(String value) {
            addCriterion("T14 not like", value, "t14");
            return (Criteria) this;
        }

        public Criteria andT14In(List<String> values) {
            addCriterion("T14 in", values, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotIn(List<String> values) {
            addCriterion("T14 not in", values, "t14");
            return (Criteria) this;
        }

        public Criteria andT14Between(String value1, String value2) {
            addCriterion("T14 between", value1, value2, "t14");
            return (Criteria) this;
        }

        public Criteria andT14NotBetween(String value1, String value2) {
            addCriterion("T14 not between", value1, value2, "t14");
            return (Criteria) this;
        }

        public Criteria andT15IsNull() {
            addCriterion("T15 is null");
            return (Criteria) this;
        }

        public Criteria andT15IsNotNull() {
            addCriterion("T15 is not null");
            return (Criteria) this;
        }

        public Criteria andT15EqualTo(String value) {
            addCriterion("T15 =", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotEqualTo(String value) {
            addCriterion("T15 <>", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15GreaterThan(String value) {
            addCriterion("T15 >", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15GreaterThanOrEqualTo(String value) {
            addCriterion("T15 >=", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15LessThan(String value) {
            addCriterion("T15 <", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15LessThanOrEqualTo(String value) {
            addCriterion("T15 <=", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15Like(String value) {
            addCriterion("T15 like", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotLike(String value) {
            addCriterion("T15 not like", value, "t15");
            return (Criteria) this;
        }

        public Criteria andT15In(List<String> values) {
            addCriterion("T15 in", values, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotIn(List<String> values) {
            addCriterion("T15 not in", values, "t15");
            return (Criteria) this;
        }

        public Criteria andT15Between(String value1, String value2) {
            addCriterion("T15 between", value1, value2, "t15");
            return (Criteria) this;
        }

        public Criteria andT15NotBetween(String value1, String value2) {
            addCriterion("T15 not between", value1, value2, "t15");
            return (Criteria) this;
        }

        public Criteria andT16IsNull() {
            addCriterion("T16 is null");
            return (Criteria) this;
        }

        public Criteria andT16IsNotNull() {
            addCriterion("T16 is not null");
            return (Criteria) this;
        }

        public Criteria andT16EqualTo(String value) {
            addCriterion("T16 =", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotEqualTo(String value) {
            addCriterion("T16 <>", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16GreaterThan(String value) {
            addCriterion("T16 >", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16GreaterThanOrEqualTo(String value) {
            addCriterion("T16 >=", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16LessThan(String value) {
            addCriterion("T16 <", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16LessThanOrEqualTo(String value) {
            addCriterion("T16 <=", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16Like(String value) {
            addCriterion("T16 like", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotLike(String value) {
            addCriterion("T16 not like", value, "t16");
            return (Criteria) this;
        }

        public Criteria andT16In(List<String> values) {
            addCriterion("T16 in", values, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotIn(List<String> values) {
            addCriterion("T16 not in", values, "t16");
            return (Criteria) this;
        }

        public Criteria andT16Between(String value1, String value2) {
            addCriterion("T16 between", value1, value2, "t16");
            return (Criteria) this;
        }

        public Criteria andT16NotBetween(String value1, String value2) {
            addCriterion("T16 not between", value1, value2, "t16");
            return (Criteria) this;
        }

        public Criteria andT17IsNull() {
            addCriterion("T17 is null");
            return (Criteria) this;
        }

        public Criteria andT17IsNotNull() {
            addCriterion("T17 is not null");
            return (Criteria) this;
        }

        public Criteria andT17EqualTo(String value) {
            addCriterion("T17 =", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotEqualTo(String value) {
            addCriterion("T17 <>", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17GreaterThan(String value) {
            addCriterion("T17 >", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17GreaterThanOrEqualTo(String value) {
            addCriterion("T17 >=", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17LessThan(String value) {
            addCriterion("T17 <", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17LessThanOrEqualTo(String value) {
            addCriterion("T17 <=", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17Like(String value) {
            addCriterion("T17 like", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotLike(String value) {
            addCriterion("T17 not like", value, "t17");
            return (Criteria) this;
        }

        public Criteria andT17In(List<String> values) {
            addCriterion("T17 in", values, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotIn(List<String> values) {
            addCriterion("T17 not in", values, "t17");
            return (Criteria) this;
        }

        public Criteria andT17Between(String value1, String value2) {
            addCriterion("T17 between", value1, value2, "t17");
            return (Criteria) this;
        }

        public Criteria andT17NotBetween(String value1, String value2) {
            addCriterion("T17 not between", value1, value2, "t17");
            return (Criteria) this;
        }

        public Criteria andT18IsNull() {
            addCriterion("T18 is null");
            return (Criteria) this;
        }

        public Criteria andT18IsNotNull() {
            addCriterion("T18 is not null");
            return (Criteria) this;
        }

        public Criteria andT18EqualTo(String value) {
            addCriterion("T18 =", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotEqualTo(String value) {
            addCriterion("T18 <>", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18GreaterThan(String value) {
            addCriterion("T18 >", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18GreaterThanOrEqualTo(String value) {
            addCriterion("T18 >=", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18LessThan(String value) {
            addCriterion("T18 <", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18LessThanOrEqualTo(String value) {
            addCriterion("T18 <=", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18Like(String value) {
            addCriterion("T18 like", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotLike(String value) {
            addCriterion("T18 not like", value, "t18");
            return (Criteria) this;
        }

        public Criteria andT18In(List<String> values) {
            addCriterion("T18 in", values, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotIn(List<String> values) {
            addCriterion("T18 not in", values, "t18");
            return (Criteria) this;
        }

        public Criteria andT18Between(String value1, String value2) {
            addCriterion("T18 between", value1, value2, "t18");
            return (Criteria) this;
        }

        public Criteria andT18NotBetween(String value1, String value2) {
            addCriterion("T18 not between", value1, value2, "t18");
            return (Criteria) this;
        }

        public Criteria andT19IsNull() {
            addCriterion("T19 is null");
            return (Criteria) this;
        }

        public Criteria andT19IsNotNull() {
            addCriterion("T19 is not null");
            return (Criteria) this;
        }

        public Criteria andT19EqualTo(String value) {
            addCriterion("T19 =", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19NotEqualTo(String value) {
            addCriterion("T19 <>", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19GreaterThan(String value) {
            addCriterion("T19 >", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19GreaterThanOrEqualTo(String value) {
            addCriterion("T19 >=", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19LessThan(String value) {
            addCriterion("T19 <", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19LessThanOrEqualTo(String value) {
            addCriterion("T19 <=", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19Like(String value) {
            addCriterion("T19 like", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19NotLike(String value) {
            addCriterion("T19 not like", value, "t19");
            return (Criteria) this;
        }

        public Criteria andT19In(List<String> values) {
            addCriterion("T19 in", values, "t19");
            return (Criteria) this;
        }

        public Criteria andT19NotIn(List<String> values) {
            addCriterion("T19 not in", values, "t19");
            return (Criteria) this;
        }

        public Criteria andT19Between(String value1, String value2) {
            addCriterion("T19 between", value1, value2, "t19");
            return (Criteria) this;
        }

        public Criteria andT19NotBetween(String value1, String value2) {
            addCriterion("T19 not between", value1, value2, "t19");
            return (Criteria) this;
        }

        public Criteria andT20IsNull() {
            addCriterion("T20 is null");
            return (Criteria) this;
        }

        public Criteria andT20IsNotNull() {
            addCriterion("T20 is not null");
            return (Criteria) this;
        }

        public Criteria andT20EqualTo(String value) {
            addCriterion("T20 =", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20NotEqualTo(String value) {
            addCriterion("T20 <>", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20GreaterThan(String value) {
            addCriterion("T20 >", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20GreaterThanOrEqualTo(String value) {
            addCriterion("T20 >=", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20LessThan(String value) {
            addCriterion("T20 <", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20LessThanOrEqualTo(String value) {
            addCriterion("T20 <=", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20Like(String value) {
            addCriterion("T20 like", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20NotLike(String value) {
            addCriterion("T20 not like", value, "t20");
            return (Criteria) this;
        }

        public Criteria andT20In(List<String> values) {
            addCriterion("T20 in", values, "t20");
            return (Criteria) this;
        }

        public Criteria andT20NotIn(List<String> values) {
            addCriterion("T20 not in", values, "t20");
            return (Criteria) this;
        }

        public Criteria andT20Between(String value1, String value2) {
            addCriterion("T20 between", value1, value2, "t20");
            return (Criteria) this;
        }

        public Criteria andT20NotBetween(String value1, String value2) {
            addCriterion("T20 not between", value1, value2, "t20");
            return (Criteria) this;
        }

        public Criteria andT21IsNull() {
            addCriterion("T21 is null");
            return (Criteria) this;
        }

        public Criteria andT21IsNotNull() {
            addCriterion("T21 is not null");
            return (Criteria) this;
        }

        public Criteria andT21EqualTo(String value) {
            addCriterion("T21 =", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21NotEqualTo(String value) {
            addCriterion("T21 <>", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21GreaterThan(String value) {
            addCriterion("T21 >", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21GreaterThanOrEqualTo(String value) {
            addCriterion("T21 >=", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21LessThan(String value) {
            addCriterion("T21 <", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21LessThanOrEqualTo(String value) {
            addCriterion("T21 <=", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21Like(String value) {
            addCriterion("T21 like", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21NotLike(String value) {
            addCriterion("T21 not like", value, "t21");
            return (Criteria) this;
        }

        public Criteria andT21In(List<String> values) {
            addCriterion("T21 in", values, "t21");
            return (Criteria) this;
        }

        public Criteria andT21NotIn(List<String> values) {
            addCriterion("T21 not in", values, "t21");
            return (Criteria) this;
        }

        public Criteria andT21Between(String value1, String value2) {
            addCriterion("T21 between", value1, value2, "t21");
            return (Criteria) this;
        }

        public Criteria andT21NotBetween(String value1, String value2) {
            addCriterion("T21 not between", value1, value2, "t21");
            return (Criteria) this;
        }

        public Criteria andT22IsNull() {
            addCriterion("T22 is null");
            return (Criteria) this;
        }

        public Criteria andT22IsNotNull() {
            addCriterion("T22 is not null");
            return (Criteria) this;
        }

        public Criteria andT22EqualTo(String value) {
            addCriterion("T22 =", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22NotEqualTo(String value) {
            addCriterion("T22 <>", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22GreaterThan(String value) {
            addCriterion("T22 >", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22GreaterThanOrEqualTo(String value) {
            addCriterion("T22 >=", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22LessThan(String value) {
            addCriterion("T22 <", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22LessThanOrEqualTo(String value) {
            addCriterion("T22 <=", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22Like(String value) {
            addCriterion("T22 like", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22NotLike(String value) {
            addCriterion("T22 not like", value, "t22");
            return (Criteria) this;
        }

        public Criteria andT22In(List<String> values) {
            addCriterion("T22 in", values, "t22");
            return (Criteria) this;
        }

        public Criteria andT22NotIn(List<String> values) {
            addCriterion("T22 not in", values, "t22");
            return (Criteria) this;
        }

        public Criteria andT22Between(String value1, String value2) {
            addCriterion("T22 between", value1, value2, "t22");
            return (Criteria) this;
        }

        public Criteria andT22NotBetween(String value1, String value2) {
            addCriterion("T22 not between", value1, value2, "t22");
            return (Criteria) this;
        }

        public Criteria andT23IsNull() {
            addCriterion("T23 is null");
            return (Criteria) this;
        }

        public Criteria andT23IsNotNull() {
            addCriterion("T23 is not null");
            return (Criteria) this;
        }

        public Criteria andT23EqualTo(String value) {
            addCriterion("T23 =", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23NotEqualTo(String value) {
            addCriterion("T23 <>", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23GreaterThan(String value) {
            addCriterion("T23 >", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23GreaterThanOrEqualTo(String value) {
            addCriterion("T23 >=", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23LessThan(String value) {
            addCriterion("T23 <", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23LessThanOrEqualTo(String value) {
            addCriterion("T23 <=", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23Like(String value) {
            addCriterion("T23 like", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23NotLike(String value) {
            addCriterion("T23 not like", value, "t23");
            return (Criteria) this;
        }

        public Criteria andT23In(List<String> values) {
            addCriterion("T23 in", values, "t23");
            return (Criteria) this;
        }

        public Criteria andT23NotIn(List<String> values) {
            addCriterion("T23 not in", values, "t23");
            return (Criteria) this;
        }

        public Criteria andT23Between(String value1, String value2) {
            addCriterion("T23 between", value1, value2, "t23");
            return (Criteria) this;
        }

        public Criteria andT23NotBetween(String value1, String value2) {
            addCriterion("T23 not between", value1, value2, "t23");
            return (Criteria) this;
        }

        public Criteria andT24IsNull() {
            addCriterion("T24 is null");
            return (Criteria) this;
        }

        public Criteria andT24IsNotNull() {
            addCriterion("T24 is not null");
            return (Criteria) this;
        }

        public Criteria andT24EqualTo(String value) {
            addCriterion("T24 =", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24NotEqualTo(String value) {
            addCriterion("T24 <>", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24GreaterThan(String value) {
            addCriterion("T24 >", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24GreaterThanOrEqualTo(String value) {
            addCriterion("T24 >=", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24LessThan(String value) {
            addCriterion("T24 <", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24LessThanOrEqualTo(String value) {
            addCriterion("T24 <=", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24Like(String value) {
            addCriterion("T24 like", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24NotLike(String value) {
            addCriterion("T24 not like", value, "t24");
            return (Criteria) this;
        }

        public Criteria andT24In(List<String> values) {
            addCriterion("T24 in", values, "t24");
            return (Criteria) this;
        }

        public Criteria andT24NotIn(List<String> values) {
            addCriterion("T24 not in", values, "t24");
            return (Criteria) this;
        }

        public Criteria andT24Between(String value1, String value2) {
            addCriterion("T24 between", value1, value2, "t24");
            return (Criteria) this;
        }

        public Criteria andT24NotBetween(String value1, String value2) {
            addCriterion("T24 not between", value1, value2, "t24");
            return (Criteria) this;
        }

        public Criteria andT5rIsNull() {
            addCriterion("T5R is null");
            return (Criteria) this;
        }

        public Criteria andT5rIsNotNull() {
            addCriterion("T5R is not null");
            return (Criteria) this;
        }

        public Criteria andT5rEqualTo(String value) {
            addCriterion("T5R =", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rNotEqualTo(String value) {
            addCriterion("T5R <>", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rGreaterThan(String value) {
            addCriterion("T5R >", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rGreaterThanOrEqualTo(String value) {
            addCriterion("T5R >=", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rLessThan(String value) {
            addCriterion("T5R <", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rLessThanOrEqualTo(String value) {
            addCriterion("T5R <=", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rLike(String value) {
            addCriterion("T5R like", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rNotLike(String value) {
            addCriterion("T5R not like", value, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rIn(List<String> values) {
            addCriterion("T5R in", values, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rNotIn(List<String> values) {
            addCriterion("T5R not in", values, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rBetween(String value1, String value2) {
            addCriterion("T5R between", value1, value2, "t5r");
            return (Criteria) this;
        }

        public Criteria andT5rNotBetween(String value1, String value2) {
            addCriterion("T5R not between", value1, value2, "t5r");
            return (Criteria) this;
        }

        public Criteria andT6rIsNull() {
            addCriterion("T6R is null");
            return (Criteria) this;
        }

        public Criteria andT6rIsNotNull() {
            addCriterion("T6R is not null");
            return (Criteria) this;
        }

        public Criteria andT6rEqualTo(String value) {
            addCriterion("T6R =", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rNotEqualTo(String value) {
            addCriterion("T6R <>", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rGreaterThan(String value) {
            addCriterion("T6R >", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rGreaterThanOrEqualTo(String value) {
            addCriterion("T6R >=", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rLessThan(String value) {
            addCriterion("T6R <", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rLessThanOrEqualTo(String value) {
            addCriterion("T6R <=", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rLike(String value) {
            addCriterion("T6R like", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rNotLike(String value) {
            addCriterion("T6R not like", value, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rIn(List<String> values) {
            addCriterion("T6R in", values, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rNotIn(List<String> values) {
            addCriterion("T6R not in", values, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rBetween(String value1, String value2) {
            addCriterion("T6R between", value1, value2, "t6r");
            return (Criteria) this;
        }

        public Criteria andT6rNotBetween(String value1, String value2) {
            addCriterion("T6R not between", value1, value2, "t6r");
            return (Criteria) this;
        }

        public Criteria andT7rIsNull() {
            addCriterion("T7R is null");
            return (Criteria) this;
        }

        public Criteria andT7rIsNotNull() {
            addCriterion("T7R is not null");
            return (Criteria) this;
        }

        public Criteria andT7rEqualTo(String value) {
            addCriterion("T7R =", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rNotEqualTo(String value) {
            addCriterion("T7R <>", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rGreaterThan(String value) {
            addCriterion("T7R >", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rGreaterThanOrEqualTo(String value) {
            addCriterion("T7R >=", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rLessThan(String value) {
            addCriterion("T7R <", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rLessThanOrEqualTo(String value) {
            addCriterion("T7R <=", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rLike(String value) {
            addCriterion("T7R like", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rNotLike(String value) {
            addCriterion("T7R not like", value, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rIn(List<String> values) {
            addCriterion("T7R in", values, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rNotIn(List<String> values) {
            addCriterion("T7R not in", values, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rBetween(String value1, String value2) {
            addCriterion("T7R between", value1, value2, "t7r");
            return (Criteria) this;
        }

        public Criteria andT7rNotBetween(String value1, String value2) {
            addCriterion("T7R not between", value1, value2, "t7r");
            return (Criteria) this;
        }

        public Criteria andT8rIsNull() {
            addCriterion("T8R is null");
            return (Criteria) this;
        }

        public Criteria andT8rIsNotNull() {
            addCriterion("T8R is not null");
            return (Criteria) this;
        }

        public Criteria andT8rEqualTo(String value) {
            addCriterion("T8R =", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rNotEqualTo(String value) {
            addCriterion("T8R <>", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rGreaterThan(String value) {
            addCriterion("T8R >", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rGreaterThanOrEqualTo(String value) {
            addCriterion("T8R >=", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rLessThan(String value) {
            addCriterion("T8R <", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rLessThanOrEqualTo(String value) {
            addCriterion("T8R <=", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rLike(String value) {
            addCriterion("T8R like", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rNotLike(String value) {
            addCriterion("T8R not like", value, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rIn(List<String> values) {
            addCriterion("T8R in", values, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rNotIn(List<String> values) {
            addCriterion("T8R not in", values, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rBetween(String value1, String value2) {
            addCriterion("T8R between", value1, value2, "t8r");
            return (Criteria) this;
        }

        public Criteria andT8rNotBetween(String value1, String value2) {
            addCriterion("T8R not between", value1, value2, "t8r");
            return (Criteria) this;
        }

        public Criteria andT9rIsNull() {
            addCriterion("T9R is null");
            return (Criteria) this;
        }

        public Criteria andT9rIsNotNull() {
            addCriterion("T9R is not null");
            return (Criteria) this;
        }

        public Criteria andT9rEqualTo(String value) {
            addCriterion("T9R =", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rNotEqualTo(String value) {
            addCriterion("T9R <>", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rGreaterThan(String value) {
            addCriterion("T9R >", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rGreaterThanOrEqualTo(String value) {
            addCriterion("T9R >=", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rLessThan(String value) {
            addCriterion("T9R <", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rLessThanOrEqualTo(String value) {
            addCriterion("T9R <=", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rLike(String value) {
            addCriterion("T9R like", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rNotLike(String value) {
            addCriterion("T9R not like", value, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rIn(List<String> values) {
            addCriterion("T9R in", values, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rNotIn(List<String> values) {
            addCriterion("T9R not in", values, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rBetween(String value1, String value2) {
            addCriterion("T9R between", value1, value2, "t9r");
            return (Criteria) this;
        }

        public Criteria andT9rNotBetween(String value1, String value2) {
            addCriterion("T9R not between", value1, value2, "t9r");
            return (Criteria) this;
        }

        public Criteria andT10rIsNull() {
            addCriterion("T10R is null");
            return (Criteria) this;
        }

        public Criteria andT10rIsNotNull() {
            addCriterion("T10R is not null");
            return (Criteria) this;
        }

        public Criteria andT10rEqualTo(String value) {
            addCriterion("T10R =", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rNotEqualTo(String value) {
            addCriterion("T10R <>", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rGreaterThan(String value) {
            addCriterion("T10R >", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rGreaterThanOrEqualTo(String value) {
            addCriterion("T10R >=", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rLessThan(String value) {
            addCriterion("T10R <", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rLessThanOrEqualTo(String value) {
            addCriterion("T10R <=", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rLike(String value) {
            addCriterion("T10R like", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rNotLike(String value) {
            addCriterion("T10R not like", value, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rIn(List<String> values) {
            addCriterion("T10R in", values, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rNotIn(List<String> values) {
            addCriterion("T10R not in", values, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rBetween(String value1, String value2) {
            addCriterion("T10R between", value1, value2, "t10r");
            return (Criteria) this;
        }

        public Criteria andT10rNotBetween(String value1, String value2) {
            addCriterion("T10R not between", value1, value2, "t10r");
            return (Criteria) this;
        }

        public Criteria andT11rIsNull() {
            addCriterion("T11R is null");
            return (Criteria) this;
        }

        public Criteria andT11rIsNotNull() {
            addCriterion("T11R is not null");
            return (Criteria) this;
        }

        public Criteria andT11rEqualTo(String value) {
            addCriterion("T11R =", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rNotEqualTo(String value) {
            addCriterion("T11R <>", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rGreaterThan(String value) {
            addCriterion("T11R >", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rGreaterThanOrEqualTo(String value) {
            addCriterion("T11R >=", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rLessThan(String value) {
            addCriterion("T11R <", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rLessThanOrEqualTo(String value) {
            addCriterion("T11R <=", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rLike(String value) {
            addCriterion("T11R like", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rNotLike(String value) {
            addCriterion("T11R not like", value, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rIn(List<String> values) {
            addCriterion("T11R in", values, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rNotIn(List<String> values) {
            addCriterion("T11R not in", values, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rBetween(String value1, String value2) {
            addCriterion("T11R between", value1, value2, "t11r");
            return (Criteria) this;
        }

        public Criteria andT11rNotBetween(String value1, String value2) {
            addCriterion("T11R not between", value1, value2, "t11r");
            return (Criteria) this;
        }

        public Criteria andT12rIsNull() {
            addCriterion("T12R is null");
            return (Criteria) this;
        }

        public Criteria andT12rIsNotNull() {
            addCriterion("T12R is not null");
            return (Criteria) this;
        }

        public Criteria andT12rEqualTo(String value) {
            addCriterion("T12R =", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rNotEqualTo(String value) {
            addCriterion("T12R <>", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rGreaterThan(String value) {
            addCriterion("T12R >", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rGreaterThanOrEqualTo(String value) {
            addCriterion("T12R >=", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rLessThan(String value) {
            addCriterion("T12R <", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rLessThanOrEqualTo(String value) {
            addCriterion("T12R <=", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rLike(String value) {
            addCriterion("T12R like", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rNotLike(String value) {
            addCriterion("T12R not like", value, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rIn(List<String> values) {
            addCriterion("T12R in", values, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rNotIn(List<String> values) {
            addCriterion("T12R not in", values, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rBetween(String value1, String value2) {
            addCriterion("T12R between", value1, value2, "t12r");
            return (Criteria) this;
        }

        public Criteria andT12rNotBetween(String value1, String value2) {
            addCriterion("T12R not between", value1, value2, "t12r");
            return (Criteria) this;
        }

        public Criteria andT13rIsNull() {
            addCriterion("T13R is null");
            return (Criteria) this;
        }

        public Criteria andT13rIsNotNull() {
            addCriterion("T13R is not null");
            return (Criteria) this;
        }

        public Criteria andT13rEqualTo(String value) {
            addCriterion("T13R =", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rNotEqualTo(String value) {
            addCriterion("T13R <>", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rGreaterThan(String value) {
            addCriterion("T13R >", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rGreaterThanOrEqualTo(String value) {
            addCriterion("T13R >=", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rLessThan(String value) {
            addCriterion("T13R <", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rLessThanOrEqualTo(String value) {
            addCriterion("T13R <=", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rLike(String value) {
            addCriterion("T13R like", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rNotLike(String value) {
            addCriterion("T13R not like", value, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rIn(List<String> values) {
            addCriterion("T13R in", values, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rNotIn(List<String> values) {
            addCriterion("T13R not in", values, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rBetween(String value1, String value2) {
            addCriterion("T13R between", value1, value2, "t13r");
            return (Criteria) this;
        }

        public Criteria andT13rNotBetween(String value1, String value2) {
            addCriterion("T13R not between", value1, value2, "t13r");
            return (Criteria) this;
        }

        public Criteria andT14rIsNull() {
            addCriterion("T14R is null");
            return (Criteria) this;
        }

        public Criteria andT14rIsNotNull() {
            addCriterion("T14R is not null");
            return (Criteria) this;
        }

        public Criteria andT14rEqualTo(String value) {
            addCriterion("T14R =", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rNotEqualTo(String value) {
            addCriterion("T14R <>", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rGreaterThan(String value) {
            addCriterion("T14R >", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rGreaterThanOrEqualTo(String value) {
            addCriterion("T14R >=", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rLessThan(String value) {
            addCriterion("T14R <", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rLessThanOrEqualTo(String value) {
            addCriterion("T14R <=", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rLike(String value) {
            addCriterion("T14R like", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rNotLike(String value) {
            addCriterion("T14R not like", value, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rIn(List<String> values) {
            addCriterion("T14R in", values, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rNotIn(List<String> values) {
            addCriterion("T14R not in", values, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rBetween(String value1, String value2) {
            addCriterion("T14R between", value1, value2, "t14r");
            return (Criteria) this;
        }

        public Criteria andT14rNotBetween(String value1, String value2) {
            addCriterion("T14R not between", value1, value2, "t14r");
            return (Criteria) this;
        }

        public Criteria andT15rIsNull() {
            addCriterion("T15R is null");
            return (Criteria) this;
        }

        public Criteria andT15rIsNotNull() {
            addCriterion("T15R is not null");
            return (Criteria) this;
        }

        public Criteria andT15rEqualTo(String value) {
            addCriterion("T15R =", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rNotEqualTo(String value) {
            addCriterion("T15R <>", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rGreaterThan(String value) {
            addCriterion("T15R >", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rGreaterThanOrEqualTo(String value) {
            addCriterion("T15R >=", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rLessThan(String value) {
            addCriterion("T15R <", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rLessThanOrEqualTo(String value) {
            addCriterion("T15R <=", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rLike(String value) {
            addCriterion("T15R like", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rNotLike(String value) {
            addCriterion("T15R not like", value, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rIn(List<String> values) {
            addCriterion("T15R in", values, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rNotIn(List<String> values) {
            addCriterion("T15R not in", values, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rBetween(String value1, String value2) {
            addCriterion("T15R between", value1, value2, "t15r");
            return (Criteria) this;
        }

        public Criteria andT15rNotBetween(String value1, String value2) {
            addCriterion("T15R not between", value1, value2, "t15r");
            return (Criteria) this;
        }

        public Criteria andT16rIsNull() {
            addCriterion("T16R is null");
            return (Criteria) this;
        }

        public Criteria andT16rIsNotNull() {
            addCriterion("T16R is not null");
            return (Criteria) this;
        }

        public Criteria andT16rEqualTo(String value) {
            addCriterion("T16R =", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rNotEqualTo(String value) {
            addCriterion("T16R <>", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rGreaterThan(String value) {
            addCriterion("T16R >", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rGreaterThanOrEqualTo(String value) {
            addCriterion("T16R >=", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rLessThan(String value) {
            addCriterion("T16R <", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rLessThanOrEqualTo(String value) {
            addCriterion("T16R <=", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rLike(String value) {
            addCriterion("T16R like", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rNotLike(String value) {
            addCriterion("T16R not like", value, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rIn(List<String> values) {
            addCriterion("T16R in", values, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rNotIn(List<String> values) {
            addCriterion("T16R not in", values, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rBetween(String value1, String value2) {
            addCriterion("T16R between", value1, value2, "t16r");
            return (Criteria) this;
        }

        public Criteria andT16rNotBetween(String value1, String value2) {
            addCriterion("T16R not between", value1, value2, "t16r");
            return (Criteria) this;
        }

        public Criteria andT17rIsNull() {
            addCriterion("T17R is null");
            return (Criteria) this;
        }

        public Criteria andT17rIsNotNull() {
            addCriterion("T17R is not null");
            return (Criteria) this;
        }

        public Criteria andT17rEqualTo(String value) {
            addCriterion("T17R =", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rNotEqualTo(String value) {
            addCriterion("T17R <>", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rGreaterThan(String value) {
            addCriterion("T17R >", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rGreaterThanOrEqualTo(String value) {
            addCriterion("T17R >=", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rLessThan(String value) {
            addCriterion("T17R <", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rLessThanOrEqualTo(String value) {
            addCriterion("T17R <=", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rLike(String value) {
            addCriterion("T17R like", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rNotLike(String value) {
            addCriterion("T17R not like", value, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rIn(List<String> values) {
            addCriterion("T17R in", values, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rNotIn(List<String> values) {
            addCriterion("T17R not in", values, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rBetween(String value1, String value2) {
            addCriterion("T17R between", value1, value2, "t17r");
            return (Criteria) this;
        }

        public Criteria andT17rNotBetween(String value1, String value2) {
            addCriterion("T17R not between", value1, value2, "t17r");
            return (Criteria) this;
        }

        public Criteria andT18rIsNull() {
            addCriterion("T18R is null");
            return (Criteria) this;
        }

        public Criteria andT18rIsNotNull() {
            addCriterion("T18R is not null");
            return (Criteria) this;
        }

        public Criteria andT18rEqualTo(String value) {
            addCriterion("T18R =", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rNotEqualTo(String value) {
            addCriterion("T18R <>", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rGreaterThan(String value) {
            addCriterion("T18R >", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rGreaterThanOrEqualTo(String value) {
            addCriterion("T18R >=", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rLessThan(String value) {
            addCriterion("T18R <", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rLessThanOrEqualTo(String value) {
            addCriterion("T18R <=", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rLike(String value) {
            addCriterion("T18R like", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rNotLike(String value) {
            addCriterion("T18R not like", value, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rIn(List<String> values) {
            addCriterion("T18R in", values, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rNotIn(List<String> values) {
            addCriterion("T18R not in", values, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rBetween(String value1, String value2) {
            addCriterion("T18R between", value1, value2, "t18r");
            return (Criteria) this;
        }

        public Criteria andT18rNotBetween(String value1, String value2) {
            addCriterion("T18R not between", value1, value2, "t18r");
            return (Criteria) this;
        }

        public Criteria andT19rIsNull() {
            addCriterion("T19R is null");
            return (Criteria) this;
        }

        public Criteria andT19rIsNotNull() {
            addCriterion("T19R is not null");
            return (Criteria) this;
        }

        public Criteria andT19rEqualTo(String value) {
            addCriterion("T19R =", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rNotEqualTo(String value) {
            addCriterion("T19R <>", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rGreaterThan(String value) {
            addCriterion("T19R >", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rGreaterThanOrEqualTo(String value) {
            addCriterion("T19R >=", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rLessThan(String value) {
            addCriterion("T19R <", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rLessThanOrEqualTo(String value) {
            addCriterion("T19R <=", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rLike(String value) {
            addCriterion("T19R like", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rNotLike(String value) {
            addCriterion("T19R not like", value, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rIn(List<String> values) {
            addCriterion("T19R in", values, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rNotIn(List<String> values) {
            addCriterion("T19R not in", values, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rBetween(String value1, String value2) {
            addCriterion("T19R between", value1, value2, "t19r");
            return (Criteria) this;
        }

        public Criteria andT19rNotBetween(String value1, String value2) {
            addCriterion("T19R not between", value1, value2, "t19r");
            return (Criteria) this;
        }

        public Criteria andT20rIsNull() {
            addCriterion("T20R is null");
            return (Criteria) this;
        }

        public Criteria andT20rIsNotNull() {
            addCriterion("T20R is not null");
            return (Criteria) this;
        }

        public Criteria andT20rEqualTo(String value) {
            addCriterion("T20R =", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rNotEqualTo(String value) {
            addCriterion("T20R <>", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rGreaterThan(String value) {
            addCriterion("T20R >", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rGreaterThanOrEqualTo(String value) {
            addCriterion("T20R >=", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rLessThan(String value) {
            addCriterion("T20R <", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rLessThanOrEqualTo(String value) {
            addCriterion("T20R <=", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rLike(String value) {
            addCriterion("T20R like", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rNotLike(String value) {
            addCriterion("T20R not like", value, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rIn(List<String> values) {
            addCriterion("T20R in", values, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rNotIn(List<String> values) {
            addCriterion("T20R not in", values, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rBetween(String value1, String value2) {
            addCriterion("T20R between", value1, value2, "t20r");
            return (Criteria) this;
        }

        public Criteria andT20rNotBetween(String value1, String value2) {
            addCriterion("T20R not between", value1, value2, "t20r");
            return (Criteria) this;
        }

        public Criteria andT21rIsNull() {
            addCriterion("T21R is null");
            return (Criteria) this;
        }

        public Criteria andT21rIsNotNull() {
            addCriterion("T21R is not null");
            return (Criteria) this;
        }

        public Criteria andT21rEqualTo(String value) {
            addCriterion("T21R =", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rNotEqualTo(String value) {
            addCriterion("T21R <>", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rGreaterThan(String value) {
            addCriterion("T21R >", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rGreaterThanOrEqualTo(String value) {
            addCriterion("T21R >=", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rLessThan(String value) {
            addCriterion("T21R <", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rLessThanOrEqualTo(String value) {
            addCriterion("T21R <=", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rLike(String value) {
            addCriterion("T21R like", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rNotLike(String value) {
            addCriterion("T21R not like", value, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rIn(List<String> values) {
            addCriterion("T21R in", values, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rNotIn(List<String> values) {
            addCriterion("T21R not in", values, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rBetween(String value1, String value2) {
            addCriterion("T21R between", value1, value2, "t21r");
            return (Criteria) this;
        }

        public Criteria andT21rNotBetween(String value1, String value2) {
            addCriterion("T21R not between", value1, value2, "t21r");
            return (Criteria) this;
        }

        public Criteria andT22rIsNull() {
            addCriterion("T22R is null");
            return (Criteria) this;
        }

        public Criteria andT22rIsNotNull() {
            addCriterion("T22R is not null");
            return (Criteria) this;
        }

        public Criteria andT22rEqualTo(String value) {
            addCriterion("T22R =", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rNotEqualTo(String value) {
            addCriterion("T22R <>", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rGreaterThan(String value) {
            addCriterion("T22R >", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rGreaterThanOrEqualTo(String value) {
            addCriterion("T22R >=", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rLessThan(String value) {
            addCriterion("T22R <", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rLessThanOrEqualTo(String value) {
            addCriterion("T22R <=", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rLike(String value) {
            addCriterion("T22R like", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rNotLike(String value) {
            addCriterion("T22R not like", value, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rIn(List<String> values) {
            addCriterion("T22R in", values, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rNotIn(List<String> values) {
            addCriterion("T22R not in", values, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rBetween(String value1, String value2) {
            addCriterion("T22R between", value1, value2, "t22r");
            return (Criteria) this;
        }

        public Criteria andT22rNotBetween(String value1, String value2) {
            addCriterion("T22R not between", value1, value2, "t22r");
            return (Criteria) this;
        }

        public Criteria andT23rIsNull() {
            addCriterion("T23R is null");
            return (Criteria) this;
        }

        public Criteria andT23rIsNotNull() {
            addCriterion("T23R is not null");
            return (Criteria) this;
        }

        public Criteria andT23rEqualTo(String value) {
            addCriterion("T23R =", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rNotEqualTo(String value) {
            addCriterion("T23R <>", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rGreaterThan(String value) {
            addCriterion("T23R >", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rGreaterThanOrEqualTo(String value) {
            addCriterion("T23R >=", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rLessThan(String value) {
            addCriterion("T23R <", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rLessThanOrEqualTo(String value) {
            addCriterion("T23R <=", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rLike(String value) {
            addCriterion("T23R like", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rNotLike(String value) {
            addCriterion("T23R not like", value, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rIn(List<String> values) {
            addCriterion("T23R in", values, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rNotIn(List<String> values) {
            addCriterion("T23R not in", values, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rBetween(String value1, String value2) {
            addCriterion("T23R between", value1, value2, "t23r");
            return (Criteria) this;
        }

        public Criteria andT23rNotBetween(String value1, String value2) {
            addCriterion("T23R not between", value1, value2, "t23r");
            return (Criteria) this;
        }

        public Criteria andT24rIsNull() {
            addCriterion("T24R is null");
            return (Criteria) this;
        }

        public Criteria andT24rIsNotNull() {
            addCriterion("T24R is not null");
            return (Criteria) this;
        }

        public Criteria andT24rEqualTo(String value) {
            addCriterion("T24R =", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rNotEqualTo(String value) {
            addCriterion("T24R <>", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rGreaterThan(String value) {
            addCriterion("T24R >", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rGreaterThanOrEqualTo(String value) {
            addCriterion("T24R >=", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rLessThan(String value) {
            addCriterion("T24R <", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rLessThanOrEqualTo(String value) {
            addCriterion("T24R <=", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rLike(String value) {
            addCriterion("T24R like", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rNotLike(String value) {
            addCriterion("T24R not like", value, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rIn(List<String> values) {
            addCriterion("T24R in", values, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rNotIn(List<String> values) {
            addCriterion("T24R not in", values, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rBetween(String value1, String value2) {
            addCriterion("T24R between", value1, value2, "t24r");
            return (Criteria) this;
        }

        public Criteria andT24rNotBetween(String value1, String value2) {
            addCriterion("T24R not between", value1, value2, "t24r");
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