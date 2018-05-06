package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class RegInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegInfoExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserCerIsNull() {
            addCriterion("USER_CER is null");
            return (Criteria) this;
        }

        public Criteria andUserCerIsNotNull() {
            addCriterion("USER_CER is not null");
            return (Criteria) this;
        }

        public Criteria andUserCerEqualTo(String value) {
            addCriterion("USER_CER =", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerNotEqualTo(String value) {
            addCriterion("USER_CER <>", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerGreaterThan(String value) {
            addCriterion("USER_CER >", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CER >=", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerLessThan(String value) {
            addCriterion("USER_CER <", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerLessThanOrEqualTo(String value) {
            addCriterion("USER_CER <=", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerLike(String value) {
            addCriterion("USER_CER like", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerNotLike(String value) {
            addCriterion("USER_CER not like", value, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerIn(List<String> values) {
            addCriterion("USER_CER in", values, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerNotIn(List<String> values) {
            addCriterion("USER_CER not in", values, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerBetween(String value1, String value2) {
            addCriterion("USER_CER between", value1, value2, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserCerNotBetween(String value1, String value2) {
            addCriterion("USER_CER not between", value1, value2, "userCer");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("USER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("USER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("USER_SEX =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("USER_SEX <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("USER_SEX >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEX >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("USER_SEX <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("USER_SEX <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("USER_SEX like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("USER_SEX not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("USER_SEX in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("USER_SEX not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("USER_SEX between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("USER_SEX not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserNationIsNull() {
            addCriterion("USER_NATION is null");
            return (Criteria) this;
        }

        public Criteria andUserNationIsNotNull() {
            addCriterion("USER_NATION is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationEqualTo(String value) {
            addCriterion("USER_NATION =", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotEqualTo(String value) {
            addCriterion("USER_NATION <>", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationGreaterThan(String value) {
            addCriterion("USER_NATION >", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NATION >=", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLessThan(String value) {
            addCriterion("USER_NATION <", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLessThanOrEqualTo(String value) {
            addCriterion("USER_NATION <=", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLike(String value) {
            addCriterion("USER_NATION like", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotLike(String value) {
            addCriterion("USER_NATION not like", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationIn(List<String> values) {
            addCriterion("USER_NATION in", values, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotIn(List<String> values) {
            addCriterion("USER_NATION not in", values, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationBetween(String value1, String value2) {
            addCriterion("USER_NATION between", value1, value2, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotBetween(String value1, String value2) {
            addCriterion("USER_NATION not between", value1, value2, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNull() {
            addCriterion("USER_AREA is null");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNotNull() {
            addCriterion("USER_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andUserAreaEqualTo(String value) {
            addCriterion("USER_AREA =", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotEqualTo(String value) {
            addCriterion("USER_AREA <>", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThan(String value) {
            addCriterion("USER_AREA >", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThanOrEqualTo(String value) {
            addCriterion("USER_AREA >=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThan(String value) {
            addCriterion("USER_AREA <", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThanOrEqualTo(String value) {
            addCriterion("USER_AREA <=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLike(String value) {
            addCriterion("USER_AREA like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotLike(String value) {
            addCriterion("USER_AREA not like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaIn(List<String> values) {
            addCriterion("USER_AREA in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotIn(List<String> values) {
            addCriterion("USER_AREA not in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaBetween(String value1, String value2) {
            addCriterion("USER_AREA between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotBetween(String value1, String value2) {
            addCriterion("USER_AREA not between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAddrIsNull() {
            addCriterion("USER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUserAddrIsNotNull() {
            addCriterion("USER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddrEqualTo(String value) {
            addCriterion("USER_ADDR =", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotEqualTo(String value) {
            addCriterion("USER_ADDR <>", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrGreaterThan(String value) {
            addCriterion("USER_ADDR >", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADDR >=", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLessThan(String value) {
            addCriterion("USER_ADDR <", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLessThanOrEqualTo(String value) {
            addCriterion("USER_ADDR <=", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrLike(String value) {
            addCriterion("USER_ADDR like", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotLike(String value) {
            addCriterion("USER_ADDR not like", value, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrIn(List<String> values) {
            addCriterion("USER_ADDR in", values, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotIn(List<String> values) {
            addCriterion("USER_ADDR not in", values, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrBetween(String value1, String value2) {
            addCriterion("USER_ADDR between", value1, value2, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserAddrNotBetween(String value1, String value2) {
            addCriterion("USER_ADDR not between", value1, value2, "userAddr");
            return (Criteria) this;
        }

        public Criteria andUserIndIsNull() {
            addCriterion("USER_IND is null");
            return (Criteria) this;
        }

        public Criteria andUserIndIsNotNull() {
            addCriterion("USER_IND is not null");
            return (Criteria) this;
        }

        public Criteria andUserIndEqualTo(String value) {
            addCriterion("USER_IND =", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndNotEqualTo(String value) {
            addCriterion("USER_IND <>", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndGreaterThan(String value) {
            addCriterion("USER_IND >", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IND >=", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndLessThan(String value) {
            addCriterion("USER_IND <", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndLessThanOrEqualTo(String value) {
            addCriterion("USER_IND <=", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndLike(String value) {
            addCriterion("USER_IND like", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndNotLike(String value) {
            addCriterion("USER_IND not like", value, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndIn(List<String> values) {
            addCriterion("USER_IND in", values, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndNotIn(List<String> values) {
            addCriterion("USER_IND not in", values, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndBetween(String value1, String value2) {
            addCriterion("USER_IND between", value1, value2, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserIndNotBetween(String value1, String value2) {
            addCriterion("USER_IND not between", value1, value2, "userInd");
            return (Criteria) this;
        }

        public Criteria andUserPosIsNull() {
            addCriterion("USER_POS is null");
            return (Criteria) this;
        }

        public Criteria andUserPosIsNotNull() {
            addCriterion("USER_POS is not null");
            return (Criteria) this;
        }

        public Criteria andUserPosEqualTo(String value) {
            addCriterion("USER_POS =", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosNotEqualTo(String value) {
            addCriterion("USER_POS <>", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosGreaterThan(String value) {
            addCriterion("USER_POS >", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosGreaterThanOrEqualTo(String value) {
            addCriterion("USER_POS >=", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosLessThan(String value) {
            addCriterion("USER_POS <", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosLessThanOrEqualTo(String value) {
            addCriterion("USER_POS <=", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosLike(String value) {
            addCriterion("USER_POS like", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosNotLike(String value) {
            addCriterion("USER_POS not like", value, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosIn(List<String> values) {
            addCriterion("USER_POS in", values, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosNotIn(List<String> values) {
            addCriterion("USER_POS not in", values, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosBetween(String value1, String value2) {
            addCriterion("USER_POS between", value1, value2, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserPosNotBetween(String value1, String value2) {
            addCriterion("USER_POS not between", value1, value2, "userPos");
            return (Criteria) this;
        }

        public Criteria andUserIntIsNull() {
            addCriterion("USER_INT is null");
            return (Criteria) this;
        }

        public Criteria andUserIntIsNotNull() {
            addCriterion("USER_INT is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntEqualTo(String value) {
            addCriterion("USER_INT =", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntNotEqualTo(String value) {
            addCriterion("USER_INT <>", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntGreaterThan(String value) {
            addCriterion("USER_INT >", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntGreaterThanOrEqualTo(String value) {
            addCriterion("USER_INT >=", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntLessThan(String value) {
            addCriterion("USER_INT <", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntLessThanOrEqualTo(String value) {
            addCriterion("USER_INT <=", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntLike(String value) {
            addCriterion("USER_INT like", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntNotLike(String value) {
            addCriterion("USER_INT not like", value, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntIn(List<String> values) {
            addCriterion("USER_INT in", values, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntNotIn(List<String> values) {
            addCriterion("USER_INT not in", values, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntBetween(String value1, String value2) {
            addCriterion("USER_INT between", value1, value2, "userInt");
            return (Criteria) this;
        }

        public Criteria andUserIntNotBetween(String value1, String value2) {
            addCriterion("USER_INT not between", value1, value2, "userInt");
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

        public Criteria andUserOldIsNull() {
            addCriterion("USER_OLD is null");
            return (Criteria) this;
        }

        public Criteria andUserOldIsNotNull() {
            addCriterion("USER_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andUserOldEqualTo(String value) {
            addCriterion("USER_OLD =", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldNotEqualTo(String value) {
            addCriterion("USER_OLD <>", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldGreaterThan(String value) {
            addCriterion("USER_OLD >", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldGreaterThanOrEqualTo(String value) {
            addCriterion("USER_OLD >=", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldLessThan(String value) {
            addCriterion("USER_OLD <", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldLessThanOrEqualTo(String value) {
            addCriterion("USER_OLD <=", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldLike(String value) {
            addCriterion("USER_OLD like", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldNotLike(String value) {
            addCriterion("USER_OLD not like", value, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldIn(List<String> values) {
            addCriterion("USER_OLD in", values, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldNotIn(List<String> values) {
            addCriterion("USER_OLD not in", values, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldBetween(String value1, String value2) {
            addCriterion("USER_OLD between", value1, value2, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserOldNotBetween(String value1, String value2) {
            addCriterion("USER_OLD not between", value1, value2, "userOld");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("USER_MOBILE =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("USER_MOBILE <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("USER_MOBILE >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("USER_MOBILE <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("USER_MOBILE like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("USER_MOBILE not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("USER_MOBILE in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("USER_MOBILE not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("USER_MOBILE between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("USER_MOBILE not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserGuaIsNull() {
            addCriterion("USER_GUA is null");
            return (Criteria) this;
        }

        public Criteria andUserGuaIsNotNull() {
            addCriterion("USER_GUA is not null");
            return (Criteria) this;
        }

        public Criteria andUserGuaEqualTo(String value) {
            addCriterion("USER_GUA =", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaNotEqualTo(String value) {
            addCriterion("USER_GUA <>", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaGreaterThan(String value) {
            addCriterion("USER_GUA >", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GUA >=", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaLessThan(String value) {
            addCriterion("USER_GUA <", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaLessThanOrEqualTo(String value) {
            addCriterion("USER_GUA <=", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaLike(String value) {
            addCriterion("USER_GUA like", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaNotLike(String value) {
            addCriterion("USER_GUA not like", value, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaIn(List<String> values) {
            addCriterion("USER_GUA in", values, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaNotIn(List<String> values) {
            addCriterion("USER_GUA not in", values, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaBetween(String value1, String value2) {
            addCriterion("USER_GUA between", value1, value2, "userGua");
            return (Criteria) this;
        }

        public Criteria andUserGuaNotBetween(String value1, String value2) {
            addCriterion("USER_GUA not between", value1, value2, "userGua");
            return (Criteria) this;
        }

        public Criteria andRelUserIsNull() {
            addCriterion("REL_USER is null");
            return (Criteria) this;
        }

        public Criteria andRelUserIsNotNull() {
            addCriterion("REL_USER is not null");
            return (Criteria) this;
        }

        public Criteria andRelUserEqualTo(String value) {
            addCriterion("REL_USER =", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserNotEqualTo(String value) {
            addCriterion("REL_USER <>", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserGreaterThan(String value) {
            addCriterion("REL_USER >", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserGreaterThanOrEqualTo(String value) {
            addCriterion("REL_USER >=", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserLessThan(String value) {
            addCriterion("REL_USER <", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserLessThanOrEqualTo(String value) {
            addCriterion("REL_USER <=", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserLike(String value) {
            addCriterion("REL_USER like", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserNotLike(String value) {
            addCriterion("REL_USER not like", value, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserIn(List<String> values) {
            addCriterion("REL_USER in", values, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserNotIn(List<String> values) {
            addCriterion("REL_USER not in", values, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserBetween(String value1, String value2) {
            addCriterion("REL_USER between", value1, value2, "relUser");
            return (Criteria) this;
        }

        public Criteria andRelUserNotBetween(String value1, String value2) {
            addCriterion("REL_USER not between", value1, value2, "relUser");
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