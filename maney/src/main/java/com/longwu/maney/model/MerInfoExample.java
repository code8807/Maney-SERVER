package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class MerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerInfoExample() {
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

        public Criteria andMerIdEqualTo(Long value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(Long value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(Long value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(Long value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(Long value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<Long> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<Long> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(Long value1, Long value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(Long value1, Long value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
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

        public Criteria andMerStatIsNull() {
            addCriterion("MER_STAT is null");
            return (Criteria) this;
        }

        public Criteria andMerStatIsNotNull() {
            addCriterion("MER_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andMerStatEqualTo(String value) {
            addCriterion("MER_STAT =", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatNotEqualTo(String value) {
            addCriterion("MER_STAT <>", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatGreaterThan(String value) {
            addCriterion("MER_STAT >", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatGreaterThanOrEqualTo(String value) {
            addCriterion("MER_STAT >=", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatLessThan(String value) {
            addCriterion("MER_STAT <", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatLessThanOrEqualTo(String value) {
            addCriterion("MER_STAT <=", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatLike(String value) {
            addCriterion("MER_STAT like", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatNotLike(String value) {
            addCriterion("MER_STAT not like", value, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatIn(List<String> values) {
            addCriterion("MER_STAT in", values, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatNotIn(List<String> values) {
            addCriterion("MER_STAT not in", values, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatBetween(String value1, String value2) {
            addCriterion("MER_STAT between", value1, value2, "merStat");
            return (Criteria) this;
        }

        public Criteria andMerStatNotBetween(String value1, String value2) {
            addCriterion("MER_STAT not between", value1, value2, "merStat");
            return (Criteria) this;
        }

        public Criteria andRegCodeIsNull() {
            addCriterion("REG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegCodeIsNotNull() {
            addCriterion("REG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegCodeEqualTo(String value) {
            addCriterion("REG_CODE =", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotEqualTo(String value) {
            addCriterion("REG_CODE <>", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeGreaterThan(String value) {
            addCriterion("REG_CODE >", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REG_CODE >=", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLessThan(String value) {
            addCriterion("REG_CODE <", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLessThanOrEqualTo(String value) {
            addCriterion("REG_CODE <=", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLike(String value) {
            addCriterion("REG_CODE like", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotLike(String value) {
            addCriterion("REG_CODE not like", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeIn(List<String> values) {
            addCriterion("REG_CODE in", values, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotIn(List<String> values) {
            addCriterion("REG_CODE not in", values, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeBetween(String value1, String value2) {
            addCriterion("REG_CODE between", value1, value2, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotBetween(String value1, String value2) {
            addCriterion("REG_CODE not between", value1, value2, "regCode");
            return (Criteria) this;
        }

        public Criteria andLegPersonIsNull() {
            addCriterion("LEG_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegPersonIsNotNull() {
            addCriterion("LEG_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegPersonEqualTo(String value) {
            addCriterion("LEG_PERSON =", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonNotEqualTo(String value) {
            addCriterion("LEG_PERSON <>", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonGreaterThan(String value) {
            addCriterion("LEG_PERSON >", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEG_PERSON >=", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonLessThan(String value) {
            addCriterion("LEG_PERSON <", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonLessThanOrEqualTo(String value) {
            addCriterion("LEG_PERSON <=", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonLike(String value) {
            addCriterion("LEG_PERSON like", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonNotLike(String value) {
            addCriterion("LEG_PERSON not like", value, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonIn(List<String> values) {
            addCriterion("LEG_PERSON in", values, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonNotIn(List<String> values) {
            addCriterion("LEG_PERSON not in", values, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonBetween(String value1, String value2) {
            addCriterion("LEG_PERSON between", value1, value2, "legPerson");
            return (Criteria) this;
        }

        public Criteria andLegPersonNotBetween(String value1, String value2) {
            addCriterion("LEG_PERSON not between", value1, value2, "legPerson");
            return (Criteria) this;
        }

        public Criteria andPriChlIsNull() {
            addCriterion("PRI_CHL is null");
            return (Criteria) this;
        }

        public Criteria andPriChlIsNotNull() {
            addCriterion("PRI_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andPriChlEqualTo(String value) {
            addCriterion("PRI_CHL =", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlNotEqualTo(String value) {
            addCriterion("PRI_CHL <>", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlGreaterThan(String value) {
            addCriterion("PRI_CHL >", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_CHL >=", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlLessThan(String value) {
            addCriterion("PRI_CHL <", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlLessThanOrEqualTo(String value) {
            addCriterion("PRI_CHL <=", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlLike(String value) {
            addCriterion("PRI_CHL like", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlNotLike(String value) {
            addCriterion("PRI_CHL not like", value, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlIn(List<String> values) {
            addCriterion("PRI_CHL in", values, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlNotIn(List<String> values) {
            addCriterion("PRI_CHL not in", values, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlBetween(String value1, String value2) {
            addCriterion("PRI_CHL between", value1, value2, "priChl");
            return (Criteria) this;
        }

        public Criteria andPriChlNotBetween(String value1, String value2) {
            addCriterion("PRI_CHL not between", value1, value2, "priChl");
            return (Criteria) this;
        }

        public Criteria andSecChlIsNull() {
            addCriterion("SEC_CHL is null");
            return (Criteria) this;
        }

        public Criteria andSecChlIsNotNull() {
            addCriterion("SEC_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andSecChlEqualTo(String value) {
            addCriterion("SEC_CHL =", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlNotEqualTo(String value) {
            addCriterion("SEC_CHL <>", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlGreaterThan(String value) {
            addCriterion("SEC_CHL >", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlGreaterThanOrEqualTo(String value) {
            addCriterion("SEC_CHL >=", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlLessThan(String value) {
            addCriterion("SEC_CHL <", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlLessThanOrEqualTo(String value) {
            addCriterion("SEC_CHL <=", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlLike(String value) {
            addCriterion("SEC_CHL like", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlNotLike(String value) {
            addCriterion("SEC_CHL not like", value, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlIn(List<String> values) {
            addCriterion("SEC_CHL in", values, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlNotIn(List<String> values) {
            addCriterion("SEC_CHL not in", values, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlBetween(String value1, String value2) {
            addCriterion("SEC_CHL between", value1, value2, "secChl");
            return (Criteria) this;
        }

        public Criteria andSecChlNotBetween(String value1, String value2) {
            addCriterion("SEC_CHL not between", value1, value2, "secChl");
            return (Criteria) this;
        }

        public Criteria andMerAddrIsNull() {
            addCriterion("MER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andMerAddrIsNotNull() {
            addCriterion("MER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMerAddrEqualTo(String value) {
            addCriterion("MER_ADDR =", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotEqualTo(String value) {
            addCriterion("MER_ADDR <>", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrGreaterThan(String value) {
            addCriterion("MER_ADDR >", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ADDR >=", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrLessThan(String value) {
            addCriterion("MER_ADDR <", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrLessThanOrEqualTo(String value) {
            addCriterion("MER_ADDR <=", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrLike(String value) {
            addCriterion("MER_ADDR like", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotLike(String value) {
            addCriterion("MER_ADDR not like", value, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrIn(List<String> values) {
            addCriterion("MER_ADDR in", values, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotIn(List<String> values) {
            addCriterion("MER_ADDR not in", values, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrBetween(String value1, String value2) {
            addCriterion("MER_ADDR between", value1, value2, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerAddrNotBetween(String value1, String value2) {
            addCriterion("MER_ADDR not between", value1, value2, "merAddr");
            return (Criteria) this;
        }

        public Criteria andMerLalIsNull() {
            addCriterion("MER_LAL is null");
            return (Criteria) this;
        }

        public Criteria andMerLalIsNotNull() {
            addCriterion("MER_LAL is not null");
            return (Criteria) this;
        }

        public Criteria andMerLalEqualTo(String value) {
            addCriterion("MER_LAL =", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalNotEqualTo(String value) {
            addCriterion("MER_LAL <>", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalGreaterThan(String value) {
            addCriterion("MER_LAL >", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalGreaterThanOrEqualTo(String value) {
            addCriterion("MER_LAL >=", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalLessThan(String value) {
            addCriterion("MER_LAL <", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalLessThanOrEqualTo(String value) {
            addCriterion("MER_LAL <=", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalLike(String value) {
            addCriterion("MER_LAL like", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalNotLike(String value) {
            addCriterion("MER_LAL not like", value, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalIn(List<String> values) {
            addCriterion("MER_LAL in", values, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalNotIn(List<String> values) {
            addCriterion("MER_LAL not in", values, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalBetween(String value1, String value2) {
            addCriterion("MER_LAL between", value1, value2, "merLal");
            return (Criteria) this;
        }

        public Criteria andMerLalNotBetween(String value1, String value2) {
            addCriterion("MER_LAL not between", value1, value2, "merLal");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("KEYWORD =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("KEYWORD <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("KEYWORD >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("KEYWORD <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("KEYWORD <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("KEYWORD like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("KEYWORD not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("KEYWORD in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("KEYWORD not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("KEYWORD between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("KEYWORD not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNull() {
            addCriterion("LOGO_PATH is null");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNotNull() {
            addCriterion("LOGO_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPathEqualTo(String value) {
            addCriterion("LOGO_PATH =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotEqualTo(String value) {
            addCriterion("LOGO_PATH <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThan(String value) {
            addCriterion("LOGO_PATH >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO_PATH >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThan(String value) {
            addCriterion("LOGO_PATH <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThanOrEqualTo(String value) {
            addCriterion("LOGO_PATH <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLike(String value) {
            addCriterion("LOGO_PATH like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotLike(String value) {
            addCriterion("LOGO_PATH not like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathIn(List<String> values) {
            addCriterion("LOGO_PATH in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotIn(List<String> values) {
            addCriterion("LOGO_PATH not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathBetween(String value1, String value2) {
            addCriterion("LOGO_PATH between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotBetween(String value1, String value2) {
            addCriterion("LOGO_PATH not between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andSupMerIsNull() {
            addCriterion("SUP_MER is null");
            return (Criteria) this;
        }

        public Criteria andSupMerIsNotNull() {
            addCriterion("SUP_MER is not null");
            return (Criteria) this;
        }

        public Criteria andSupMerEqualTo(String value) {
            addCriterion("SUP_MER =", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerNotEqualTo(String value) {
            addCriterion("SUP_MER <>", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerGreaterThan(String value) {
            addCriterion("SUP_MER >", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_MER >=", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerLessThan(String value) {
            addCriterion("SUP_MER <", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerLessThanOrEqualTo(String value) {
            addCriterion("SUP_MER <=", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerLike(String value) {
            addCriterion("SUP_MER like", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerNotLike(String value) {
            addCriterion("SUP_MER not like", value, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerIn(List<String> values) {
            addCriterion("SUP_MER in", values, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerNotIn(List<String> values) {
            addCriterion("SUP_MER not in", values, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerBetween(String value1, String value2) {
            addCriterion("SUP_MER between", value1, value2, "supMer");
            return (Criteria) this;
        }

        public Criteria andSupMerNotBetween(String value1, String value2) {
            addCriterion("SUP_MER not between", value1, value2, "supMer");
            return (Criteria) this;
        }

        public Criteria andMerDomainIsNull() {
            addCriterion("MER_DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andMerDomainIsNotNull() {
            addCriterion("MER_DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andMerDomainEqualTo(String value) {
            addCriterion("MER_DOMAIN =", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainNotEqualTo(String value) {
            addCriterion("MER_DOMAIN <>", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainGreaterThan(String value) {
            addCriterion("MER_DOMAIN >", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainGreaterThanOrEqualTo(String value) {
            addCriterion("MER_DOMAIN >=", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainLessThan(String value) {
            addCriterion("MER_DOMAIN <", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainLessThanOrEqualTo(String value) {
            addCriterion("MER_DOMAIN <=", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainLike(String value) {
            addCriterion("MER_DOMAIN like", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainNotLike(String value) {
            addCriterion("MER_DOMAIN not like", value, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainIn(List<String> values) {
            addCriterion("MER_DOMAIN in", values, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainNotIn(List<String> values) {
            addCriterion("MER_DOMAIN not in", values, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainBetween(String value1, String value2) {
            addCriterion("MER_DOMAIN between", value1, value2, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerDomainNotBetween(String value1, String value2) {
            addCriterion("MER_DOMAIN not between", value1, value2, "merDomain");
            return (Criteria) this;
        }

        public Criteria andMerConnectIsNull() {
            addCriterion("MER_CONNECT is null");
            return (Criteria) this;
        }

        public Criteria andMerConnectIsNotNull() {
            addCriterion("MER_CONNECT is not null");
            return (Criteria) this;
        }

        public Criteria andMerConnectEqualTo(String value) {
            addCriterion("MER_CONNECT =", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectNotEqualTo(String value) {
            addCriterion("MER_CONNECT <>", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectGreaterThan(String value) {
            addCriterion("MER_CONNECT >", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectGreaterThanOrEqualTo(String value) {
            addCriterion("MER_CONNECT >=", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectLessThan(String value) {
            addCriterion("MER_CONNECT <", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectLessThanOrEqualTo(String value) {
            addCriterion("MER_CONNECT <=", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectLike(String value) {
            addCriterion("MER_CONNECT like", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectNotLike(String value) {
            addCriterion("MER_CONNECT not like", value, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectIn(List<String> values) {
            addCriterion("MER_CONNECT in", values, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectNotIn(List<String> values) {
            addCriterion("MER_CONNECT not in", values, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectBetween(String value1, String value2) {
            addCriterion("MER_CONNECT between", value1, value2, "merConnect");
            return (Criteria) this;
        }

        public Criteria andMerConnectNotBetween(String value1, String value2) {
            addCriterion("MER_CONNECT not between", value1, value2, "merConnect");
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

        public Criteria andVerPicIsNull() {
            addCriterion("VER_PIC is null");
            return (Criteria) this;
        }

        public Criteria andVerPicIsNotNull() {
            addCriterion("VER_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andVerPicEqualTo(String value) {
            addCriterion("VER_PIC =", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicNotEqualTo(String value) {
            addCriterion("VER_PIC <>", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicGreaterThan(String value) {
            addCriterion("VER_PIC >", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicGreaterThanOrEqualTo(String value) {
            addCriterion("VER_PIC >=", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicLessThan(String value) {
            addCriterion("VER_PIC <", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicLessThanOrEqualTo(String value) {
            addCriterion("VER_PIC <=", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicLike(String value) {
            addCriterion("VER_PIC like", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicNotLike(String value) {
            addCriterion("VER_PIC not like", value, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicIn(List<String> values) {
            addCriterion("VER_PIC in", values, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicNotIn(List<String> values) {
            addCriterion("VER_PIC not in", values, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicBetween(String value1, String value2) {
            addCriterion("VER_PIC between", value1, value2, "verPic");
            return (Criteria) this;
        }

        public Criteria andVerPicNotBetween(String value1, String value2) {
            addCriterion("VER_PIC not between", value1, value2, "verPic");
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