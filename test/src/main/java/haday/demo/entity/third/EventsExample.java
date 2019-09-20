package haday.demo.entity.third;

import java.util.ArrayList;
import java.util.List;

public class EventsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andEventDataIsNull() {
            addCriterion("event_data is null");
            return (Criteria) this;
        }

        public Criteria andEventDataIsNotNull() {
            addCriterion("event_data is not null");
            return (Criteria) this;
        }

        public Criteria andEventDataEqualTo(String value) {
            addCriterion("event_data =", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataNotEqualTo(String value) {
            addCriterion("event_data <>", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataGreaterThan(String value) {
            addCriterion("event_data >", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataGreaterThanOrEqualTo(String value) {
            addCriterion("event_data >=", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataLessThan(String value) {
            addCriterion("event_data <", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataLessThanOrEqualTo(String value) {
            addCriterion("event_data <=", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataLike(String value) {
            addCriterion("event_data like", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataNotLike(String value) {
            addCriterion("event_data not like", value, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataIn(List<String> values) {
            addCriterion("event_data in", values, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataNotIn(List<String> values) {
            addCriterion("event_data not in", values, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataBetween(String value1, String value2) {
            addCriterion("event_data between", value1, value2, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDataNotBetween(String value1, String value2) {
            addCriterion("event_data not between", value1, value2, "eventData");
            return (Criteria) this;
        }

        public Criteria andEventDateIsNull() {
            addCriterion("event_date is null");
            return (Criteria) this;
        }

        public Criteria andEventDateIsNotNull() {
            addCriterion("event_date is not null");
            return (Criteria) this;
        }

        public Criteria andEventDateEqualTo(Long value) {
            addCriterion("event_date =", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotEqualTo(Long value) {
            addCriterion("event_date <>", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateGreaterThan(Long value) {
            addCriterion("event_date >", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateGreaterThanOrEqualTo(Long value) {
            addCriterion("event_date >=", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLessThan(Long value) {
            addCriterion("event_date <", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLessThanOrEqualTo(Long value) {
            addCriterion("event_date <=", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateIn(List<Long> values) {
            addCriterion("event_date in", values, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotIn(List<Long> values) {
            addCriterion("event_date not in", values, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateBetween(Long value1, Long value2) {
            addCriterion("event_date between", value1, value2, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotBetween(Long value1, Long value2) {
            addCriterion("event_date not between", value1, value2, "eventDate");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Long value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Long value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Long value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Long value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Long value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Long> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Long> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Long value1, Long value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Long value1, Long value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andComponentUuidIsNull() {
            addCriterion("component_uuid is null");
            return (Criteria) this;
        }

        public Criteria andComponentUuidIsNotNull() {
            addCriterion("component_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andComponentUuidEqualTo(String value) {
            addCriterion("component_uuid =", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidNotEqualTo(String value) {
            addCriterion("component_uuid <>", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidGreaterThan(String value) {
            addCriterion("component_uuid >", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidGreaterThanOrEqualTo(String value) {
            addCriterion("component_uuid >=", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidLessThan(String value) {
            addCriterion("component_uuid <", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidLessThanOrEqualTo(String value) {
            addCriterion("component_uuid <=", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidLike(String value) {
            addCriterion("component_uuid like", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidNotLike(String value) {
            addCriterion("component_uuid not like", value, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidIn(List<String> values) {
            addCriterion("component_uuid in", values, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidNotIn(List<String> values) {
            addCriterion("component_uuid not in", values, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidBetween(String value1, String value2) {
            addCriterion("component_uuid between", value1, value2, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andComponentUuidNotBetween(String value1, String value2) {
            addCriterion("component_uuid not between", value1, value2, "componentUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidIsNull() {
            addCriterion("analysis_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidIsNotNull() {
            addCriterion("analysis_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidEqualTo(String value) {
            addCriterion("analysis_uuid =", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidNotEqualTo(String value) {
            addCriterion("analysis_uuid <>", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidGreaterThan(String value) {
            addCriterion("analysis_uuid >", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidGreaterThanOrEqualTo(String value) {
            addCriterion("analysis_uuid >=", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidLessThan(String value) {
            addCriterion("analysis_uuid <", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidLessThanOrEqualTo(String value) {
            addCriterion("analysis_uuid <=", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidLike(String value) {
            addCriterion("analysis_uuid like", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidNotLike(String value) {
            addCriterion("analysis_uuid not like", value, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidIn(List<String> values) {
            addCriterion("analysis_uuid in", values, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidNotIn(List<String> values) {
            addCriterion("analysis_uuid not in", values, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidBetween(String value1, String value2) {
            addCriterion("analysis_uuid between", value1, value2, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andAnalysisUuidNotBetween(String value1, String value2) {
            addCriterion("analysis_uuid not between", value1, value2, "analysisUuid");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
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