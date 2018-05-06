package com.longwu.maney.model;

import java.util.ArrayList;
import java.util.List;

public class VideoInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoInfoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("VIDEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("VIDEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("VIDEO_ID =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("VIDEO_ID <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("VIDEO_ID >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VIDEO_ID >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("VIDEO_ID <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("VIDEO_ID <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("VIDEO_ID in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("VIDEO_ID not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("VIDEO_ID between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("VIDEO_ID not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("VIDEO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("VIDEO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("VIDEO_NAME =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("VIDEO_NAME <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("VIDEO_NAME >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_NAME >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("VIDEO_NAME <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_NAME <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("VIDEO_NAME like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("VIDEO_NAME not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("VIDEO_NAME in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("VIDEO_NAME not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("VIDEO_NAME between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("VIDEO_NAME not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("VIDEO_URL is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("VIDEO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("VIDEO_URL =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("VIDEO_URL <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("VIDEO_URL >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("VIDEO_URL <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("VIDEO_URL like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("VIDEO_URL not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("VIDEO_URL in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("VIDEO_URL not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("VIDEO_URL between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("VIDEO_URL not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoThuIsNull() {
            addCriterion("VIDEO_THU is null");
            return (Criteria) this;
        }

        public Criteria andVideoThuIsNotNull() {
            addCriterion("VIDEO_THU is not null");
            return (Criteria) this;
        }

        public Criteria andVideoThuEqualTo(String value) {
            addCriterion("VIDEO_THU =", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuNotEqualTo(String value) {
            addCriterion("VIDEO_THU <>", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuGreaterThan(String value) {
            addCriterion("VIDEO_THU >", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_THU >=", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuLessThan(String value) {
            addCriterion("VIDEO_THU <", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_THU <=", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuLike(String value) {
            addCriterion("VIDEO_THU like", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuNotLike(String value) {
            addCriterion("VIDEO_THU not like", value, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuIn(List<String> values) {
            addCriterion("VIDEO_THU in", values, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuNotIn(List<String> values) {
            addCriterion("VIDEO_THU not in", values, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuBetween(String value1, String value2) {
            addCriterion("VIDEO_THU between", value1, value2, "videoThu");
            return (Criteria) this;
        }

        public Criteria andVideoThuNotBetween(String value1, String value2) {
            addCriterion("VIDEO_THU not between", value1, value2, "videoThu");
            return (Criteria) this;
        }

        public Criteria andWatchNumIsNull() {
            addCriterion("WATCH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andWatchNumIsNotNull() {
            addCriterion("WATCH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andWatchNumEqualTo(String value) {
            addCriterion("WATCH_NUM =", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotEqualTo(String value) {
            addCriterion("WATCH_NUM <>", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumGreaterThan(String value) {
            addCriterion("WATCH_NUM >", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumGreaterThanOrEqualTo(String value) {
            addCriterion("WATCH_NUM >=", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumLessThan(String value) {
            addCriterion("WATCH_NUM <", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumLessThanOrEqualTo(String value) {
            addCriterion("WATCH_NUM <=", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumLike(String value) {
            addCriterion("WATCH_NUM like", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotLike(String value) {
            addCriterion("WATCH_NUM not like", value, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumIn(List<String> values) {
            addCriterion("WATCH_NUM in", values, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotIn(List<String> values) {
            addCriterion("WATCH_NUM not in", values, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumBetween(String value1, String value2) {
            addCriterion("WATCH_NUM between", value1, value2, "watchNum");
            return (Criteria) this;
        }

        public Criteria andWatchNumNotBetween(String value1, String value2) {
            addCriterion("WATCH_NUM not between", value1, value2, "watchNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNull() {
            addCriterion("LIKE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNotNull() {
            addCriterion("LIKE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumEqualTo(String value) {
            addCriterion("LIKE_NUM =", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotEqualTo(String value) {
            addCriterion("LIKE_NUM <>", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThan(String value) {
            addCriterion("LIKE_NUM >", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThanOrEqualTo(String value) {
            addCriterion("LIKE_NUM >=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThan(String value) {
            addCriterion("LIKE_NUM <", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThanOrEqualTo(String value) {
            addCriterion("LIKE_NUM <=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLike(String value) {
            addCriterion("LIKE_NUM like", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotLike(String value) {
            addCriterion("LIKE_NUM not like", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIn(List<String> values) {
            addCriterion("LIKE_NUM in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotIn(List<String> values) {
            addCriterion("LIKE_NUM not in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumBetween(String value1, String value2) {
            addCriterion("LIKE_NUM between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotBetween(String value1, String value2) {
            addCriterion("LIKE_NUM not between", value1, value2, "likeNum");
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