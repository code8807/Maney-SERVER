package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class MerCoachMapperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerCoachMapperExample() {
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

        public Criteria andMapperIdIsNull() {
            addCriterion("MAPPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMapperIdIsNotNull() {
            addCriterion("MAPPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMapperIdEqualTo(String value) {
            addCriterion("MAPPER_ID =", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdNotEqualTo(String value) {
            addCriterion("MAPPER_ID <>", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdGreaterThan(String value) {
            addCriterion("MAPPER_ID >", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAPPER_ID >=", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdLessThan(String value) {
            addCriterion("MAPPER_ID <", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdLessThanOrEqualTo(String value) {
            addCriterion("MAPPER_ID <=", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdLike(String value) {
            addCriterion("MAPPER_ID like", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdNotLike(String value) {
            addCriterion("MAPPER_ID not like", value, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdIn(List<String> values) {
            addCriterion("MAPPER_ID in", values, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdNotIn(List<String> values) {
            addCriterion("MAPPER_ID not in", values, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdBetween(String value1, String value2) {
            addCriterion("MAPPER_ID between", value1, value2, "mapperId");
            return (Criteria) this;
        }

        public Criteria andMapperIdNotBetween(String value1, String value2) {
            addCriterion("MAPPER_ID not between", value1, value2, "mapperId");
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

        public Criteria andCoachIdIsNull() {
            addCriterion("COACH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNotNull() {
            addCriterion("COACH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCoachIdEqualTo(String value) {
            addCriterion("COACH_ID =", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotEqualTo(String value) {
            addCriterion("COACH_ID <>", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThan(String value) {
            addCriterion("COACH_ID >", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_ID >=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThan(String value) {
            addCriterion("COACH_ID <", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThanOrEqualTo(String value) {
            addCriterion("COACH_ID <=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLike(String value) {
            addCriterion("COACH_ID like", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotLike(String value) {
            addCriterion("COACH_ID not like", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIn(List<String> values) {
            addCriterion("COACH_ID in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotIn(List<String> values) {
            addCriterion("COACH_ID not in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdBetween(String value1, String value2) {
            addCriterion("COACH_ID between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotBetween(String value1, String value2) {
            addCriterion("COACH_ID not between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andMapperStatIsNull() {
            addCriterion("MAPPER_STAT is null");
            return (Criteria) this;
        }

        public Criteria andMapperStatIsNotNull() {
            addCriterion("MAPPER_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andMapperStatEqualTo(String value) {
            addCriterion("MAPPER_STAT =", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatNotEqualTo(String value) {
            addCriterion("MAPPER_STAT <>", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatGreaterThan(String value) {
            addCriterion("MAPPER_STAT >", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatGreaterThanOrEqualTo(String value) {
            addCriterion("MAPPER_STAT >=", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatLessThan(String value) {
            addCriterion("MAPPER_STAT <", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatLessThanOrEqualTo(String value) {
            addCriterion("MAPPER_STAT <=", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatLike(String value) {
            addCriterion("MAPPER_STAT like", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatNotLike(String value) {
            addCriterion("MAPPER_STAT not like", value, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatIn(List<String> values) {
            addCriterion("MAPPER_STAT in", values, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatNotIn(List<String> values) {
            addCriterion("MAPPER_STAT not in", values, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatBetween(String value1, String value2) {
            addCriterion("MAPPER_STAT between", value1, value2, "mapperStat");
            return (Criteria) this;
        }

        public Criteria andMapperStatNotBetween(String value1, String value2) {
            addCriterion("MAPPER_STAT not between", value1, value2, "mapperStat");
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