package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class MerScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerScheduleExample() {
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

        public Criteria andMonItemIsNull() {
            addCriterion("MON_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andMonItemIsNotNull() {
            addCriterion("MON_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andMonItemEqualTo(String value) {
            addCriterion("MON_ITEM =", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemNotEqualTo(String value) {
            addCriterion("MON_ITEM <>", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemGreaterThan(String value) {
            addCriterion("MON_ITEM >", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemGreaterThanOrEqualTo(String value) {
            addCriterion("MON_ITEM >=", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemLessThan(String value) {
            addCriterion("MON_ITEM <", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemLessThanOrEqualTo(String value) {
            addCriterion("MON_ITEM <=", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemLike(String value) {
            addCriterion("MON_ITEM like", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemNotLike(String value) {
            addCriterion("MON_ITEM not like", value, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemIn(List<String> values) {
            addCriterion("MON_ITEM in", values, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemNotIn(List<String> values) {
            addCriterion("MON_ITEM not in", values, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemBetween(String value1, String value2) {
            addCriterion("MON_ITEM between", value1, value2, "monItem");
            return (Criteria) this;
        }

        public Criteria andMonItemNotBetween(String value1, String value2) {
            addCriterion("MON_ITEM not between", value1, value2, "monItem");
            return (Criteria) this;
        }

        public Criteria andTueItemIsNull() {
            addCriterion("TUE_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andTueItemIsNotNull() {
            addCriterion("TUE_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andTueItemEqualTo(String value) {
            addCriterion("TUE_ITEM =", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemNotEqualTo(String value) {
            addCriterion("TUE_ITEM <>", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemGreaterThan(String value) {
            addCriterion("TUE_ITEM >", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemGreaterThanOrEqualTo(String value) {
            addCriterion("TUE_ITEM >=", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemLessThan(String value) {
            addCriterion("TUE_ITEM <", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemLessThanOrEqualTo(String value) {
            addCriterion("TUE_ITEM <=", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemLike(String value) {
            addCriterion("TUE_ITEM like", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemNotLike(String value) {
            addCriterion("TUE_ITEM not like", value, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemIn(List<String> values) {
            addCriterion("TUE_ITEM in", values, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemNotIn(List<String> values) {
            addCriterion("TUE_ITEM not in", values, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemBetween(String value1, String value2) {
            addCriterion("TUE_ITEM between", value1, value2, "tueItem");
            return (Criteria) this;
        }

        public Criteria andTueItemNotBetween(String value1, String value2) {
            addCriterion("TUE_ITEM not between", value1, value2, "tueItem");
            return (Criteria) this;
        }

        public Criteria andWedItemIsNull() {
            addCriterion("WED_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andWedItemIsNotNull() {
            addCriterion("WED_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andWedItemEqualTo(String value) {
            addCriterion("WED_ITEM =", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemNotEqualTo(String value) {
            addCriterion("WED_ITEM <>", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemGreaterThan(String value) {
            addCriterion("WED_ITEM >", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemGreaterThanOrEqualTo(String value) {
            addCriterion("WED_ITEM >=", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemLessThan(String value) {
            addCriterion("WED_ITEM <", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemLessThanOrEqualTo(String value) {
            addCriterion("WED_ITEM <=", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemLike(String value) {
            addCriterion("WED_ITEM like", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemNotLike(String value) {
            addCriterion("WED_ITEM not like", value, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemIn(List<String> values) {
            addCriterion("WED_ITEM in", values, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemNotIn(List<String> values) {
            addCriterion("WED_ITEM not in", values, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemBetween(String value1, String value2) {
            addCriterion("WED_ITEM between", value1, value2, "wedItem");
            return (Criteria) this;
        }

        public Criteria andWedItemNotBetween(String value1, String value2) {
            addCriterion("WED_ITEM not between", value1, value2, "wedItem");
            return (Criteria) this;
        }

        public Criteria andThuItemIsNull() {
            addCriterion("THU_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andThuItemIsNotNull() {
            addCriterion("THU_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andThuItemEqualTo(String value) {
            addCriterion("THU_ITEM =", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemNotEqualTo(String value) {
            addCriterion("THU_ITEM <>", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemGreaterThan(String value) {
            addCriterion("THU_ITEM >", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemGreaterThanOrEqualTo(String value) {
            addCriterion("THU_ITEM >=", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemLessThan(String value) {
            addCriterion("THU_ITEM <", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemLessThanOrEqualTo(String value) {
            addCriterion("THU_ITEM <=", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemLike(String value) {
            addCriterion("THU_ITEM like", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemNotLike(String value) {
            addCriterion("THU_ITEM not like", value, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemIn(List<String> values) {
            addCriterion("THU_ITEM in", values, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemNotIn(List<String> values) {
            addCriterion("THU_ITEM not in", values, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemBetween(String value1, String value2) {
            addCriterion("THU_ITEM between", value1, value2, "thuItem");
            return (Criteria) this;
        }

        public Criteria andThuItemNotBetween(String value1, String value2) {
            addCriterion("THU_ITEM not between", value1, value2, "thuItem");
            return (Criteria) this;
        }

        public Criteria andFriItemIsNull() {
            addCriterion("FRI_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andFriItemIsNotNull() {
            addCriterion("FRI_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andFriItemEqualTo(String value) {
            addCriterion("FRI_ITEM =", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemNotEqualTo(String value) {
            addCriterion("FRI_ITEM <>", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemGreaterThan(String value) {
            addCriterion("FRI_ITEM >", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemGreaterThanOrEqualTo(String value) {
            addCriterion("FRI_ITEM >=", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemLessThan(String value) {
            addCriterion("FRI_ITEM <", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemLessThanOrEqualTo(String value) {
            addCriterion("FRI_ITEM <=", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemLike(String value) {
            addCriterion("FRI_ITEM like", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemNotLike(String value) {
            addCriterion("FRI_ITEM not like", value, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemIn(List<String> values) {
            addCriterion("FRI_ITEM in", values, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemNotIn(List<String> values) {
            addCriterion("FRI_ITEM not in", values, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemBetween(String value1, String value2) {
            addCriterion("FRI_ITEM between", value1, value2, "friItem");
            return (Criteria) this;
        }

        public Criteria andFriItemNotBetween(String value1, String value2) {
            addCriterion("FRI_ITEM not between", value1, value2, "friItem");
            return (Criteria) this;
        }

        public Criteria andSatItemIsNull() {
            addCriterion("SAT_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andSatItemIsNotNull() {
            addCriterion("SAT_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andSatItemEqualTo(String value) {
            addCriterion("SAT_ITEM =", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemNotEqualTo(String value) {
            addCriterion("SAT_ITEM <>", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemGreaterThan(String value) {
            addCriterion("SAT_ITEM >", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemGreaterThanOrEqualTo(String value) {
            addCriterion("SAT_ITEM >=", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemLessThan(String value) {
            addCriterion("SAT_ITEM <", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemLessThanOrEqualTo(String value) {
            addCriterion("SAT_ITEM <=", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemLike(String value) {
            addCriterion("SAT_ITEM like", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemNotLike(String value) {
            addCriterion("SAT_ITEM not like", value, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemIn(List<String> values) {
            addCriterion("SAT_ITEM in", values, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemNotIn(List<String> values) {
            addCriterion("SAT_ITEM not in", values, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemBetween(String value1, String value2) {
            addCriterion("SAT_ITEM between", value1, value2, "satItem");
            return (Criteria) this;
        }

        public Criteria andSatItemNotBetween(String value1, String value2) {
            addCriterion("SAT_ITEM not between", value1, value2, "satItem");
            return (Criteria) this;
        }

        public Criteria andSunItemIsNull() {
            addCriterion("SUN_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andSunItemIsNotNull() {
            addCriterion("SUN_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andSunItemEqualTo(String value) {
            addCriterion("SUN_ITEM =", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemNotEqualTo(String value) {
            addCriterion("SUN_ITEM <>", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemGreaterThan(String value) {
            addCriterion("SUN_ITEM >", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemGreaterThanOrEqualTo(String value) {
            addCriterion("SUN_ITEM >=", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemLessThan(String value) {
            addCriterion("SUN_ITEM <", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemLessThanOrEqualTo(String value) {
            addCriterion("SUN_ITEM <=", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemLike(String value) {
            addCriterion("SUN_ITEM like", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemNotLike(String value) {
            addCriterion("SUN_ITEM not like", value, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemIn(List<String> values) {
            addCriterion("SUN_ITEM in", values, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemNotIn(List<String> values) {
            addCriterion("SUN_ITEM not in", values, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemBetween(String value1, String value2) {
            addCriterion("SUN_ITEM between", value1, value2, "sunItem");
            return (Criteria) this;
        }

        public Criteria andSunItemNotBetween(String value1, String value2) {
            addCriterion("SUN_ITEM not between", value1, value2, "sunItem");
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