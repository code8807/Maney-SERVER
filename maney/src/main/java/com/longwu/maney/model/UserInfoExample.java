package com.longwu.maney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andManeyBalIsNull() {
            addCriterion("MANEY_BAL is null");
            return (Criteria) this;
        }

        public Criteria andManeyBalIsNotNull() {
            addCriterion("MANEY_BAL is not null");
            return (Criteria) this;
        }

        public Criteria andManeyBalEqualTo(BigDecimal value) {
            addCriterion("MANEY_BAL =", value, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalNotEqualTo(BigDecimal value) {
            addCriterion("MANEY_BAL <>", value, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalGreaterThan(BigDecimal value) {
            addCriterion("MANEY_BAL >", value, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MANEY_BAL >=", value, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalLessThan(BigDecimal value) {
            addCriterion("MANEY_BAL <", value, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MANEY_BAL <=", value, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalIn(List<BigDecimal> values) {
            addCriterion("MANEY_BAL in", values, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalNotIn(List<BigDecimal> values) {
            addCriterion("MANEY_BAL not in", values, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANEY_BAL between", value1, value2, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andManeyBalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANEY_BAL not between", value1, value2, "maneyBal");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("USER_LEVEL =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("USER_LEVEL <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("USER_LEVEL >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(String value) {
            addCriterion("USER_LEVEL <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("USER_LEVEL like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("USER_LEVEL not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<String> values) {
            addCriterion("USER_LEVEL in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<String> values) {
            addCriterion("USER_LEVEL not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("USER_LEVEL between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserStatIsNull() {
            addCriterion("USER_STAT is null");
            return (Criteria) this;
        }

        public Criteria andUserStatIsNotNull() {
            addCriterion("USER_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatEqualTo(String value) {
            addCriterion("USER_STAT =", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatNotEqualTo(String value) {
            addCriterion("USER_STAT <>", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatGreaterThan(String value) {
            addCriterion("USER_STAT >", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STAT >=", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatLessThan(String value) {
            addCriterion("USER_STAT <", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatLessThanOrEqualTo(String value) {
            addCriterion("USER_STAT <=", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatLike(String value) {
            addCriterion("USER_STAT like", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatNotLike(String value) {
            addCriterion("USER_STAT not like", value, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatIn(List<String> values) {
            addCriterion("USER_STAT in", values, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatNotIn(List<String> values) {
            addCriterion("USER_STAT not in", values, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatBetween(String value1, String value2) {
            addCriterion("USER_STAT between", value1, value2, "userStat");
            return (Criteria) this;
        }

        public Criteria andUserStatNotBetween(String value1, String value2) {
            addCriterion("USER_STAT not between", value1, value2, "userStat");
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

        public Criteria andUserAlipayIsNull() {
            addCriterion("USER_ALIPAY is null");
            return (Criteria) this;
        }

        public Criteria andUserAlipayIsNotNull() {
            addCriterion("USER_ALIPAY is not null");
            return (Criteria) this;
        }

        public Criteria andUserAlipayEqualTo(String value) {
            addCriterion("USER_ALIPAY =", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotEqualTo(String value) {
            addCriterion("USER_ALIPAY <>", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayGreaterThan(String value) {
            addCriterion("USER_ALIPAY >", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ALIPAY >=", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayLessThan(String value) {
            addCriterion("USER_ALIPAY <", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayLessThanOrEqualTo(String value) {
            addCriterion("USER_ALIPAY <=", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayLike(String value) {
            addCriterion("USER_ALIPAY like", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotLike(String value) {
            addCriterion("USER_ALIPAY not like", value, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayIn(List<String> values) {
            addCriterion("USER_ALIPAY in", values, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotIn(List<String> values) {
            addCriterion("USER_ALIPAY not in", values, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayBetween(String value1, String value2) {
            addCriterion("USER_ALIPAY between", value1, value2, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserAlipayNotBetween(String value1, String value2) {
            addCriterion("USER_ALIPAY not between", value1, value2, "userAlipay");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailIsNull() {
            addCriterion("USER_VAR_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailIsNotNull() {
            addCriterion("USER_VAR_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailEqualTo(String value) {
            addCriterion("USER_VAR_EMAIL =", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailNotEqualTo(String value) {
            addCriterion("USER_VAR_EMAIL <>", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailGreaterThan(String value) {
            addCriterion("USER_VAR_EMAIL >", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_VAR_EMAIL >=", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailLessThan(String value) {
            addCriterion("USER_VAR_EMAIL <", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_VAR_EMAIL <=", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailLike(String value) {
            addCriterion("USER_VAR_EMAIL like", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailNotLike(String value) {
            addCriterion("USER_VAR_EMAIL not like", value, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailIn(List<String> values) {
            addCriterion("USER_VAR_EMAIL in", values, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailNotIn(List<String> values) {
            addCriterion("USER_VAR_EMAIL not in", values, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailBetween(String value1, String value2) {
            addCriterion("USER_VAR_EMAIL between", value1, value2, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserVarEmailNotBetween(String value1, String value2) {
            addCriterion("USER_VAR_EMAIL not between", value1, value2, "userVarEmail");
            return (Criteria) this;
        }

        public Criteria andUserDomainIsNull() {
            addCriterion("USER_DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andUserDomainIsNotNull() {
            addCriterion("USER_DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserDomainEqualTo(String value) {
            addCriterion("USER_DOMAIN =", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainNotEqualTo(String value) {
            addCriterion("USER_DOMAIN <>", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainGreaterThan(String value) {
            addCriterion("USER_DOMAIN >", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DOMAIN >=", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainLessThan(String value) {
            addCriterion("USER_DOMAIN <", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainLessThanOrEqualTo(String value) {
            addCriterion("USER_DOMAIN <=", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainLike(String value) {
            addCriterion("USER_DOMAIN like", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainNotLike(String value) {
            addCriterion("USER_DOMAIN not like", value, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainIn(List<String> values) {
            addCriterion("USER_DOMAIN in", values, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainNotIn(List<String> values) {
            addCriterion("USER_DOMAIN not in", values, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainBetween(String value1, String value2) {
            addCriterion("USER_DOMAIN between", value1, value2, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserDomainNotBetween(String value1, String value2) {
            addCriterion("USER_DOMAIN not between", value1, value2, "userDomain");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNull() {
            addCriterion("USER_POINT is null");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNotNull() {
            addCriterion("USER_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointEqualTo(BigDecimal value) {
            addCriterion("USER_POINT =", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotEqualTo(BigDecimal value) {
            addCriterion("USER_POINT <>", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThan(BigDecimal value) {
            addCriterion("USER_POINT >", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_POINT >=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThan(BigDecimal value) {
            addCriterion("USER_POINT <", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_POINT <=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointIn(List<BigDecimal> values) {
            addCriterion("USER_POINT in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotIn(List<BigDecimal> values) {
            addCriterion("USER_POINT not in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_POINT between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_POINT not between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserMoodIsNull() {
            addCriterion("USER_MOOD is null");
            return (Criteria) this;
        }

        public Criteria andUserMoodIsNotNull() {
            addCriterion("USER_MOOD is not null");
            return (Criteria) this;
        }

        public Criteria andUserMoodEqualTo(String value) {
            addCriterion("USER_MOOD =", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodNotEqualTo(String value) {
            addCriterion("USER_MOOD <>", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodGreaterThan(String value) {
            addCriterion("USER_MOOD >", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MOOD >=", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodLessThan(String value) {
            addCriterion("USER_MOOD <", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodLessThanOrEqualTo(String value) {
            addCriterion("USER_MOOD <=", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodLike(String value) {
            addCriterion("USER_MOOD like", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodNotLike(String value) {
            addCriterion("USER_MOOD not like", value, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodIn(List<String> values) {
            addCriterion("USER_MOOD in", values, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodNotIn(List<String> values) {
            addCriterion("USER_MOOD not in", values, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodBetween(String value1, String value2) {
            addCriterion("USER_MOOD between", value1, value2, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserMoodNotBetween(String value1, String value2) {
            addCriterion("USER_MOOD not between", value1, value2, "userMood");
            return (Criteria) this;
        }

        public Criteria andUserHpIsNull() {
            addCriterion("USER_HP is null");
            return (Criteria) this;
        }

        public Criteria andUserHpIsNotNull() {
            addCriterion("USER_HP is not null");
            return (Criteria) this;
        }

        public Criteria andUserHpEqualTo(String value) {
            addCriterion("USER_HP =", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpNotEqualTo(String value) {
            addCriterion("USER_HP <>", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpGreaterThan(String value) {
            addCriterion("USER_HP >", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpGreaterThanOrEqualTo(String value) {
            addCriterion("USER_HP >=", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpLessThan(String value) {
            addCriterion("USER_HP <", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpLessThanOrEqualTo(String value) {
            addCriterion("USER_HP <=", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpLike(String value) {
            addCriterion("USER_HP like", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpNotLike(String value) {
            addCriterion("USER_HP not like", value, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpIn(List<String> values) {
            addCriterion("USER_HP in", values, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpNotIn(List<String> values) {
            addCriterion("USER_HP not in", values, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpBetween(String value1, String value2) {
            addCriterion("USER_HP between", value1, value2, "userHp");
            return (Criteria) this;
        }

        public Criteria andUserHpNotBetween(String value1, String value2) {
            addCriterion("USER_HP not between", value1, value2, "userHp");
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

        public Criteria andUserWxoiIsNull() {
            addCriterion("USER_WXOI is null");
            return (Criteria) this;
        }

        public Criteria andUserWxoiIsNotNull() {
            addCriterion("USER_WXOI is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxoiEqualTo(String value) {
            addCriterion("USER_WXOI =", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiNotEqualTo(String value) {
            addCriterion("USER_WXOI <>", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiGreaterThan(String value) {
            addCriterion("USER_WXOI >", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WXOI >=", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiLessThan(String value) {
            addCriterion("USER_WXOI <", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiLessThanOrEqualTo(String value) {
            addCriterion("USER_WXOI <=", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiLike(String value) {
            addCriterion("USER_WXOI like", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiNotLike(String value) {
            addCriterion("USER_WXOI not like", value, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiIn(List<String> values) {
            addCriterion("USER_WXOI in", values, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiNotIn(List<String> values) {
            addCriterion("USER_WXOI not in", values, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiBetween(String value1, String value2) {
            addCriterion("USER_WXOI between", value1, value2, "userWxoi");
            return (Criteria) this;
        }

        public Criteria andUserWxoiNotBetween(String value1, String value2) {
            addCriterion("USER_WXOI not between", value1, value2, "userWxoi");
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