package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class CoachInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoachInfoExample() {
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

        public Criteria andCoachIdIsNull() {
            addCriterion("COACH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNotNull() {
            addCriterion("COACH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCoachIdEqualTo(Long value) {
            addCriterion("COACH_ID =", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotEqualTo(Long value) {
            addCriterion("COACH_ID <>", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThan(Long value) {
            addCriterion("COACH_ID >", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COACH_ID >=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThan(Long value) {
            addCriterion("COACH_ID <", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThanOrEqualTo(Long value) {
            addCriterion("COACH_ID <=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIn(List<Long> values) {
            addCriterion("COACH_ID in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotIn(List<Long> values) {
            addCriterion("COACH_ID not in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdBetween(Long value1, Long value2) {
            addCriterion("COACH_ID between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotBetween(Long value1, Long value2) {
            addCriterion("COACH_ID not between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNull() {
            addCriterion("COACH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNotNull() {
            addCriterion("COACH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoachNameEqualTo(String value) {
            addCriterion("COACH_NAME =", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotEqualTo(String value) {
            addCriterion("COACH_NAME <>", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThan(String value) {
            addCriterion("COACH_NAME >", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_NAME >=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThan(String value) {
            addCriterion("COACH_NAME <", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThanOrEqualTo(String value) {
            addCriterion("COACH_NAME <=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLike(String value) {
            addCriterion("COACH_NAME like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotLike(String value) {
            addCriterion("COACH_NAME not like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameIn(List<String> values) {
            addCriterion("COACH_NAME in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotIn(List<String> values) {
            addCriterion("COACH_NAME not in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameBetween(String value1, String value2) {
            addCriterion("COACH_NAME between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotBetween(String value1, String value2) {
            addCriterion("COACH_NAME not between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachMobIsNull() {
            addCriterion("COACH_MOB is null");
            return (Criteria) this;
        }

        public Criteria andCoachMobIsNotNull() {
            addCriterion("COACH_MOB is not null");
            return (Criteria) this;
        }

        public Criteria andCoachMobEqualTo(String value) {
            addCriterion("COACH_MOB =", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobNotEqualTo(String value) {
            addCriterion("COACH_MOB <>", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobGreaterThan(String value) {
            addCriterion("COACH_MOB >", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_MOB >=", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobLessThan(String value) {
            addCriterion("COACH_MOB <", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobLessThanOrEqualTo(String value) {
            addCriterion("COACH_MOB <=", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobLike(String value) {
            addCriterion("COACH_MOB like", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobNotLike(String value) {
            addCriterion("COACH_MOB not like", value, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobIn(List<String> values) {
            addCriterion("COACH_MOB in", values, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobNotIn(List<String> values) {
            addCriterion("COACH_MOB not in", values, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobBetween(String value1, String value2) {
            addCriterion("COACH_MOB between", value1, value2, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachMobNotBetween(String value1, String value2) {
            addCriterion("COACH_MOB not between", value1, value2, "coachMob");
            return (Criteria) this;
        }

        public Criteria andCoachAgeIsNull() {
            addCriterion("COACH_AGE is null");
            return (Criteria) this;
        }

        public Criteria andCoachAgeIsNotNull() {
            addCriterion("COACH_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andCoachAgeEqualTo(String value) {
            addCriterion("COACH_AGE =", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeNotEqualTo(String value) {
            addCriterion("COACH_AGE <>", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeGreaterThan(String value) {
            addCriterion("COACH_AGE >", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_AGE >=", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeLessThan(String value) {
            addCriterion("COACH_AGE <", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeLessThanOrEqualTo(String value) {
            addCriterion("COACH_AGE <=", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeLike(String value) {
            addCriterion("COACH_AGE like", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeNotLike(String value) {
            addCriterion("COACH_AGE not like", value, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeIn(List<String> values) {
            addCriterion("COACH_AGE in", values, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeNotIn(List<String> values) {
            addCriterion("COACH_AGE not in", values, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeBetween(String value1, String value2) {
            addCriterion("COACH_AGE between", value1, value2, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachAgeNotBetween(String value1, String value2) {
            addCriterion("COACH_AGE not between", value1, value2, "coachAge");
            return (Criteria) this;
        }

        public Criteria andCoachSexIsNull() {
            addCriterion("COACH_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCoachSexIsNotNull() {
            addCriterion("COACH_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCoachSexEqualTo(String value) {
            addCriterion("COACH_SEX =", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexNotEqualTo(String value) {
            addCriterion("COACH_SEX <>", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexGreaterThan(String value) {
            addCriterion("COACH_SEX >", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_SEX >=", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexLessThan(String value) {
            addCriterion("COACH_SEX <", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexLessThanOrEqualTo(String value) {
            addCriterion("COACH_SEX <=", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexLike(String value) {
            addCriterion("COACH_SEX like", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexNotLike(String value) {
            addCriterion("COACH_SEX not like", value, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexIn(List<String> values) {
            addCriterion("COACH_SEX in", values, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexNotIn(List<String> values) {
            addCriterion("COACH_SEX not in", values, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexBetween(String value1, String value2) {
            addCriterion("COACH_SEX between", value1, value2, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachSexNotBetween(String value1, String value2) {
            addCriterion("COACH_SEX not between", value1, value2, "coachSex");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameIsNull() {
            addCriterion("COACH_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameIsNotNull() {
            addCriterion("COACH_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameEqualTo(String value) {
            addCriterion("COACH_NICKNAME =", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameNotEqualTo(String value) {
            addCriterion("COACH_NICKNAME <>", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameGreaterThan(String value) {
            addCriterion("COACH_NICKNAME >", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_NICKNAME >=", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameLessThan(String value) {
            addCriterion("COACH_NICKNAME <", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameLessThanOrEqualTo(String value) {
            addCriterion("COACH_NICKNAME <=", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameLike(String value) {
            addCriterion("COACH_NICKNAME like", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameNotLike(String value) {
            addCriterion("COACH_NICKNAME not like", value, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameIn(List<String> values) {
            addCriterion("COACH_NICKNAME in", values, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameNotIn(List<String> values) {
            addCriterion("COACH_NICKNAME not in", values, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameBetween(String value1, String value2) {
            addCriterion("COACH_NICKNAME between", value1, value2, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachNicknameNotBetween(String value1, String value2) {
            addCriterion("COACH_NICKNAME not between", value1, value2, "coachNickname");
            return (Criteria) this;
        }

        public Criteria andCoachEduIsNull() {
            addCriterion("COACH_EDU is null");
            return (Criteria) this;
        }

        public Criteria andCoachEduIsNotNull() {
            addCriterion("COACH_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andCoachEduEqualTo(String value) {
            addCriterion("COACH_EDU =", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduNotEqualTo(String value) {
            addCriterion("COACH_EDU <>", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduGreaterThan(String value) {
            addCriterion("COACH_EDU >", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_EDU >=", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduLessThan(String value) {
            addCriterion("COACH_EDU <", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduLessThanOrEqualTo(String value) {
            addCriterion("COACH_EDU <=", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduLike(String value) {
            addCriterion("COACH_EDU like", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduNotLike(String value) {
            addCriterion("COACH_EDU not like", value, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduIn(List<String> values) {
            addCriterion("COACH_EDU in", values, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduNotIn(List<String> values) {
            addCriterion("COACH_EDU not in", values, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduBetween(String value1, String value2) {
            addCriterion("COACH_EDU between", value1, value2, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachEduNotBetween(String value1, String value2) {
            addCriterion("COACH_EDU not between", value1, value2, "coachEdu");
            return (Criteria) this;
        }

        public Criteria andCoachLevelIsNull() {
            addCriterion("COACH_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCoachLevelIsNotNull() {
            addCriterion("COACH_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCoachLevelEqualTo(String value) {
            addCriterion("COACH_LEVEL =", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelNotEqualTo(String value) {
            addCriterion("COACH_LEVEL <>", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelGreaterThan(String value) {
            addCriterion("COACH_LEVEL >", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_LEVEL >=", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelLessThan(String value) {
            addCriterion("COACH_LEVEL <", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelLessThanOrEqualTo(String value) {
            addCriterion("COACH_LEVEL <=", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelLike(String value) {
            addCriterion("COACH_LEVEL like", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelNotLike(String value) {
            addCriterion("COACH_LEVEL not like", value, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelIn(List<String> values) {
            addCriterion("COACH_LEVEL in", values, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelNotIn(List<String> values) {
            addCriterion("COACH_LEVEL not in", values, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelBetween(String value1, String value2) {
            addCriterion("COACH_LEVEL between", value1, value2, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachLevelNotBetween(String value1, String value2) {
            addCriterion("COACH_LEVEL not between", value1, value2, "coachLevel");
            return (Criteria) this;
        }

        public Criteria andCoachTypeIsNull() {
            addCriterion("COACH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoachTypeIsNotNull() {
            addCriterion("COACH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoachTypeEqualTo(String value) {
            addCriterion("COACH_TYPE =", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeNotEqualTo(String value) {
            addCriterion("COACH_TYPE <>", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeGreaterThan(String value) {
            addCriterion("COACH_TYPE >", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_TYPE >=", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeLessThan(String value) {
            addCriterion("COACH_TYPE <", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeLessThanOrEqualTo(String value) {
            addCriterion("COACH_TYPE <=", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeLike(String value) {
            addCriterion("COACH_TYPE like", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeNotLike(String value) {
            addCriterion("COACH_TYPE not like", value, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeIn(List<String> values) {
            addCriterion("COACH_TYPE in", values, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeNotIn(List<String> values) {
            addCriterion("COACH_TYPE not in", values, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeBetween(String value1, String value2) {
            addCriterion("COACH_TYPE between", value1, value2, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachTypeNotBetween(String value1, String value2) {
            addCriterion("COACH_TYPE not between", value1, value2, "coachType");
            return (Criteria) this;
        }

        public Criteria andCoachStatIsNull() {
            addCriterion("COACH_STAT is null");
            return (Criteria) this;
        }

        public Criteria andCoachStatIsNotNull() {
            addCriterion("COACH_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andCoachStatEqualTo(String value) {
            addCriterion("COACH_STAT =", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatNotEqualTo(String value) {
            addCriterion("COACH_STAT <>", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatGreaterThan(String value) {
            addCriterion("COACH_STAT >", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_STAT >=", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatLessThan(String value) {
            addCriterion("COACH_STAT <", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatLessThanOrEqualTo(String value) {
            addCriterion("COACH_STAT <=", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatLike(String value) {
            addCriterion("COACH_STAT like", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatNotLike(String value) {
            addCriterion("COACH_STAT not like", value, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatIn(List<String> values) {
            addCriterion("COACH_STAT in", values, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatNotIn(List<String> values) {
            addCriterion("COACH_STAT not in", values, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatBetween(String value1, String value2) {
            addCriterion("COACH_STAT between", value1, value2, "coachStat");
            return (Criteria) this;
        }

        public Criteria andCoachStatNotBetween(String value1, String value2) {
            addCriterion("COACH_STAT not between", value1, value2, "coachStat");
            return (Criteria) this;
        }

        public Criteria andMapperManeyIsNull() {
            addCriterion("MAPPER_MANEY is null");
            return (Criteria) this;
        }

        public Criteria andMapperManeyIsNotNull() {
            addCriterion("MAPPER_MANEY is not null");
            return (Criteria) this;
        }

        public Criteria andMapperManeyEqualTo(String value) {
            addCriterion("MAPPER_MANEY =", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyNotEqualTo(String value) {
            addCriterion("MAPPER_MANEY <>", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyGreaterThan(String value) {
            addCriterion("MAPPER_MANEY >", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyGreaterThanOrEqualTo(String value) {
            addCriterion("MAPPER_MANEY >=", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyLessThan(String value) {
            addCriterion("MAPPER_MANEY <", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyLessThanOrEqualTo(String value) {
            addCriterion("MAPPER_MANEY <=", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyLike(String value) {
            addCriterion("MAPPER_MANEY like", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyNotLike(String value) {
            addCriterion("MAPPER_MANEY not like", value, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyIn(List<String> values) {
            addCriterion("MAPPER_MANEY in", values, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyNotIn(List<String> values) {
            addCriterion("MAPPER_MANEY not in", values, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyBetween(String value1, String value2) {
            addCriterion("MAPPER_MANEY between", value1, value2, "mapperManey");
            return (Criteria) this;
        }

        public Criteria andMapperManeyNotBetween(String value1, String value2) {
            addCriterion("MAPPER_MANEY not between", value1, value2, "mapperManey");
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