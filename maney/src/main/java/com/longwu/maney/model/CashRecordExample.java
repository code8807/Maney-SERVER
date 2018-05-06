package com.longwu.maney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CashRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashRecordExample() {
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

        public Criteria andCashIdIsNull() {
            addCriterion("CASH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCashIdIsNotNull() {
            addCriterion("CASH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCashIdEqualTo(Long value) {
            addCriterion("CASH_ID =", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotEqualTo(Long value) {
            addCriterion("CASH_ID <>", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdGreaterThan(Long value) {
            addCriterion("CASH_ID >", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CASH_ID >=", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLessThan(Long value) {
            addCriterion("CASH_ID <", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLessThanOrEqualTo(Long value) {
            addCriterion("CASH_ID <=", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdIn(List<Long> values) {
            addCriterion("CASH_ID in", values, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotIn(List<Long> values) {
            addCriterion("CASH_ID not in", values, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdBetween(Long value1, Long value2) {
            addCriterion("CASH_ID between", value1, value2, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotBetween(Long value1, Long value2) {
            addCriterion("CASH_ID not between", value1, value2, "cashId");
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

        public Criteria andCashAmountIsNull() {
            addCriterion("CASH_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNotNull() {
            addCriterion("CASH_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCashAmountEqualTo(BigDecimal value) {
            addCriterion("CASH_AMOUNT =", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotEqualTo(BigDecimal value) {
            addCriterion("CASH_AMOUNT <>", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThan(BigDecimal value) {
            addCriterion("CASH_AMOUNT >", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_AMOUNT >=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThan(BigDecimal value) {
            addCriterion("CASH_AMOUNT <", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_AMOUNT <=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIn(List<BigDecimal> values) {
            addCriterion("CASH_AMOUNT in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotIn(List<BigDecimal> values) {
            addCriterion("CASH_AMOUNT not in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_AMOUNT between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_AMOUNT not between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashTimeIsNull() {
            addCriterion("CASH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCashTimeIsNotNull() {
            addCriterion("CASH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCashTimeEqualTo(String value) {
            addCriterion("CASH_TIME =", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotEqualTo(String value) {
            addCriterion("CASH_TIME <>", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeGreaterThan(String value) {
            addCriterion("CASH_TIME >", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_TIME >=", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLessThan(String value) {
            addCriterion("CASH_TIME <", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLessThanOrEqualTo(String value) {
            addCriterion("CASH_TIME <=", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLike(String value) {
            addCriterion("CASH_TIME like", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotLike(String value) {
            addCriterion("CASH_TIME not like", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeIn(List<String> values) {
            addCriterion("CASH_TIME in", values, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotIn(List<String> values) {
            addCriterion("CASH_TIME not in", values, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeBetween(String value1, String value2) {
            addCriterion("CASH_TIME between", value1, value2, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotBetween(String value1, String value2) {
            addCriterion("CASH_TIME not between", value1, value2, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashBankIsNull() {
            addCriterion("CASH_BANK is null");
            return (Criteria) this;
        }

        public Criteria andCashBankIsNotNull() {
            addCriterion("CASH_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andCashBankEqualTo(String value) {
            addCriterion("CASH_BANK =", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankNotEqualTo(String value) {
            addCriterion("CASH_BANK <>", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankGreaterThan(String value) {
            addCriterion("CASH_BANK >", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_BANK >=", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankLessThan(String value) {
            addCriterion("CASH_BANK <", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankLessThanOrEqualTo(String value) {
            addCriterion("CASH_BANK <=", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankLike(String value) {
            addCriterion("CASH_BANK like", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankNotLike(String value) {
            addCriterion("CASH_BANK not like", value, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankIn(List<String> values) {
            addCriterion("CASH_BANK in", values, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankNotIn(List<String> values) {
            addCriterion("CASH_BANK not in", values, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankBetween(String value1, String value2) {
            addCriterion("CASH_BANK between", value1, value2, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashBankNotBetween(String value1, String value2) {
            addCriterion("CASH_BANK not between", value1, value2, "cashBank");
            return (Criteria) this;
        }

        public Criteria andCashAccountIsNull() {
            addCriterion("CASH_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCashAccountIsNotNull() {
            addCriterion("CASH_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCashAccountEqualTo(String value) {
            addCriterion("CASH_ACCOUNT =", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountNotEqualTo(String value) {
            addCriterion("CASH_ACCOUNT <>", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountGreaterThan(String value) {
            addCriterion("CASH_ACCOUNT >", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_ACCOUNT >=", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountLessThan(String value) {
            addCriterion("CASH_ACCOUNT <", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountLessThanOrEqualTo(String value) {
            addCriterion("CASH_ACCOUNT <=", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountLike(String value) {
            addCriterion("CASH_ACCOUNT like", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountNotLike(String value) {
            addCriterion("CASH_ACCOUNT not like", value, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountIn(List<String> values) {
            addCriterion("CASH_ACCOUNT in", values, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountNotIn(List<String> values) {
            addCriterion("CASH_ACCOUNT not in", values, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountBetween(String value1, String value2) {
            addCriterion("CASH_ACCOUNT between", value1, value2, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashAccountNotBetween(String value1, String value2) {
            addCriterion("CASH_ACCOUNT not between", value1, value2, "cashAccount");
            return (Criteria) this;
        }

        public Criteria andCashFeeIsNull() {
            addCriterion("CASH_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCashFeeIsNotNull() {
            addCriterion("CASH_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashFeeEqualTo(BigDecimal value) {
            addCriterion("CASH_FEE =", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotEqualTo(BigDecimal value) {
            addCriterion("CASH_FEE <>", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeGreaterThan(BigDecimal value) {
            addCriterion("CASH_FEE >", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_FEE >=", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeLessThan(BigDecimal value) {
            addCriterion("CASH_FEE <", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_FEE <=", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeIn(List<BigDecimal> values) {
            addCriterion("CASH_FEE in", values, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotIn(List<BigDecimal> values) {
            addCriterion("CASH_FEE not in", values, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_FEE between", value1, value2, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_FEE not between", value1, value2, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashNameIsNull() {
            addCriterion("CASH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCashNameIsNotNull() {
            addCriterion("CASH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCashNameEqualTo(String value) {
            addCriterion("CASH_NAME =", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameNotEqualTo(String value) {
            addCriterion("CASH_NAME <>", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameGreaterThan(String value) {
            addCriterion("CASH_NAME >", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_NAME >=", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameLessThan(String value) {
            addCriterion("CASH_NAME <", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameLessThanOrEqualTo(String value) {
            addCriterion("CASH_NAME <=", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameLike(String value) {
            addCriterion("CASH_NAME like", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameNotLike(String value) {
            addCriterion("CASH_NAME not like", value, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameIn(List<String> values) {
            addCriterion("CASH_NAME in", values, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameNotIn(List<String> values) {
            addCriterion("CASH_NAME not in", values, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameBetween(String value1, String value2) {
            addCriterion("CASH_NAME between", value1, value2, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashNameNotBetween(String value1, String value2) {
            addCriterion("CASH_NAME not between", value1, value2, "cashName");
            return (Criteria) this;
        }

        public Criteria andCashStatIsNull() {
            addCriterion("CASH_STAT is null");
            return (Criteria) this;
        }

        public Criteria andCashStatIsNotNull() {
            addCriterion("CASH_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andCashStatEqualTo(String value) {
            addCriterion("CASH_STAT =", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatNotEqualTo(String value) {
            addCriterion("CASH_STAT <>", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatGreaterThan(String value) {
            addCriterion("CASH_STAT >", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_STAT >=", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatLessThan(String value) {
            addCriterion("CASH_STAT <", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatLessThanOrEqualTo(String value) {
            addCriterion("CASH_STAT <=", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatLike(String value) {
            addCriterion("CASH_STAT like", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatNotLike(String value) {
            addCriterion("CASH_STAT not like", value, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatIn(List<String> values) {
            addCriterion("CASH_STAT in", values, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatNotIn(List<String> values) {
            addCriterion("CASH_STAT not in", values, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatBetween(String value1, String value2) {
            addCriterion("CASH_STAT between", value1, value2, "cashStat");
            return (Criteria) this;
        }

        public Criteria andCashStatNotBetween(String value1, String value2) {
            addCriterion("CASH_STAT not between", value1, value2, "cashStat");
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