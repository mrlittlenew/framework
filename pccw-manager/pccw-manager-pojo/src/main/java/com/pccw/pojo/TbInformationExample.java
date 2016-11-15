package com.pccw.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInformationExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andQualificationsIsNull() {
            addCriterion("qualifications is null");
            return (Criteria) this;
        }

        public Criteria andQualificationsIsNotNull() {
            addCriterion("qualifications is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationsEqualTo(String value) {
            addCriterion("qualifications =", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsNotEqualTo(String value) {
            addCriterion("qualifications <>", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsGreaterThan(String value) {
            addCriterion("qualifications >", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsGreaterThanOrEqualTo(String value) {
            addCriterion("qualifications >=", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsLessThan(String value) {
            addCriterion("qualifications <", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsLessThanOrEqualTo(String value) {
            addCriterion("qualifications <=", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsLike(String value) {
            addCriterion("qualifications like", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsNotLike(String value) {
            addCriterion("qualifications not like", value, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsIn(List<String> values) {
            addCriterion("qualifications in", values, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsNotIn(List<String> values) {
            addCriterion("qualifications not in", values, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsBetween(String value1, String value2) {
            addCriterion("qualifications between", value1, value2, "qualifications");
            return (Criteria) this;
        }

        public Criteria andQualificationsNotBetween(String value1, String value2) {
            addCriterion("qualifications not between", value1, value2, "qualifications");
            return (Criteria) this;
        }

        public Criteria andPartakeIsNull() {
            addCriterion("partake is null");
            return (Criteria) this;
        }

        public Criteria andPartakeIsNotNull() {
            addCriterion("partake is not null");
            return (Criteria) this;
        }

        public Criteria andPartakeEqualTo(String value) {
            addCriterion("partake =", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeNotEqualTo(String value) {
            addCriterion("partake <>", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeGreaterThan(String value) {
            addCriterion("partake >", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeGreaterThanOrEqualTo(String value) {
            addCriterion("partake >=", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeLessThan(String value) {
            addCriterion("partake <", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeLessThanOrEqualTo(String value) {
            addCriterion("partake <=", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeLike(String value) {
            addCriterion("partake like", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeNotLike(String value) {
            addCriterion("partake not like", value, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeIn(List<String> values) {
            addCriterion("partake in", values, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeNotIn(List<String> values) {
            addCriterion("partake not in", values, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeBetween(String value1, String value2) {
            addCriterion("partake between", value1, value2, "partake");
            return (Criteria) this;
        }

        public Criteria andPartakeNotBetween(String value1, String value2) {
            addCriterion("partake not between", value1, value2, "partake");
            return (Criteria) this;
        }

        public Criteria andCarIsNull() {
            addCriterion("car is null");
            return (Criteria) this;
        }

        public Criteria andCarIsNotNull() {
            addCriterion("car is not null");
            return (Criteria) this;
        }

        public Criteria andCarEqualTo(String value) {
            addCriterion("car =", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotEqualTo(String value) {
            addCriterion("car <>", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThan(String value) {
            addCriterion("car >", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThanOrEqualTo(String value) {
            addCriterion("car >=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThan(String value) {
            addCriterion("car <", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThanOrEqualTo(String value) {
            addCriterion("car <=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLike(String value) {
            addCriterion("car like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotLike(String value) {
            addCriterion("car not like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarIn(List<String> values) {
            addCriterion("car in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotIn(List<String> values) {
            addCriterion("car not in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarBetween(String value1, String value2) {
            addCriterion("car between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotBetween(String value1, String value2) {
            addCriterion("car not between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfootherIsNull() {
            addCriterion("infoOther is null");
            return (Criteria) this;
        }

        public Criteria andInfootherIsNotNull() {
            addCriterion("infoOther is not null");
            return (Criteria) this;
        }

        public Criteria andInfootherEqualTo(String value) {
            addCriterion("infoOther =", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherNotEqualTo(String value) {
            addCriterion("infoOther <>", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherGreaterThan(String value) {
            addCriterion("infoOther >", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherGreaterThanOrEqualTo(String value) {
            addCriterion("infoOther >=", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherLessThan(String value) {
            addCriterion("infoOther <", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherLessThanOrEqualTo(String value) {
            addCriterion("infoOther <=", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherLike(String value) {
            addCriterion("infoOther like", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherNotLike(String value) {
            addCriterion("infoOther not like", value, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherIn(List<String> values) {
            addCriterion("infoOther in", values, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherNotIn(List<String> values) {
            addCriterion("infoOther not in", values, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherBetween(String value1, String value2) {
            addCriterion("infoOther between", value1, value2, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfootherNotBetween(String value1, String value2) {
            addCriterion("infoOther not between", value1, value2, "infoother");
            return (Criteria) this;
        }

        public Criteria andInfoaIsNull() {
            addCriterion("infoA is null");
            return (Criteria) this;
        }

        public Criteria andInfoaIsNotNull() {
            addCriterion("infoA is not null");
            return (Criteria) this;
        }

        public Criteria andInfoaEqualTo(String value) {
            addCriterion("infoA =", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaNotEqualTo(String value) {
            addCriterion("infoA <>", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaGreaterThan(String value) {
            addCriterion("infoA >", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaGreaterThanOrEqualTo(String value) {
            addCriterion("infoA >=", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaLessThan(String value) {
            addCriterion("infoA <", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaLessThanOrEqualTo(String value) {
            addCriterion("infoA <=", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaLike(String value) {
            addCriterion("infoA like", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaNotLike(String value) {
            addCriterion("infoA not like", value, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaIn(List<String> values) {
            addCriterion("infoA in", values, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaNotIn(List<String> values) {
            addCriterion("infoA not in", values, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaBetween(String value1, String value2) {
            addCriterion("infoA between", value1, value2, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfoaNotBetween(String value1, String value2) {
            addCriterion("infoA not between", value1, value2, "infoa");
            return (Criteria) this;
        }

        public Criteria andInfobIsNull() {
            addCriterion("infoB is null");
            return (Criteria) this;
        }

        public Criteria andInfobIsNotNull() {
            addCriterion("infoB is not null");
            return (Criteria) this;
        }

        public Criteria andInfobEqualTo(String value) {
            addCriterion("infoB =", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobNotEqualTo(String value) {
            addCriterion("infoB <>", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobGreaterThan(String value) {
            addCriterion("infoB >", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobGreaterThanOrEqualTo(String value) {
            addCriterion("infoB >=", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobLessThan(String value) {
            addCriterion("infoB <", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobLessThanOrEqualTo(String value) {
            addCriterion("infoB <=", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobLike(String value) {
            addCriterion("infoB like", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobNotLike(String value) {
            addCriterion("infoB not like", value, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobIn(List<String> values) {
            addCriterion("infoB in", values, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobNotIn(List<String> values) {
            addCriterion("infoB not in", values, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobBetween(String value1, String value2) {
            addCriterion("infoB between", value1, value2, "infob");
            return (Criteria) this;
        }

        public Criteria andInfobNotBetween(String value1, String value2) {
            addCriterion("infoB not between", value1, value2, "infob");
            return (Criteria) this;
        }

        public Criteria andInfocIsNull() {
            addCriterion("infoC is null");
            return (Criteria) this;
        }

        public Criteria andInfocIsNotNull() {
            addCriterion("infoC is not null");
            return (Criteria) this;
        }

        public Criteria andInfocEqualTo(String value) {
            addCriterion("infoC =", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocNotEqualTo(String value) {
            addCriterion("infoC <>", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocGreaterThan(String value) {
            addCriterion("infoC >", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocGreaterThanOrEqualTo(String value) {
            addCriterion("infoC >=", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocLessThan(String value) {
            addCriterion("infoC <", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocLessThanOrEqualTo(String value) {
            addCriterion("infoC <=", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocLike(String value) {
            addCriterion("infoC like", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocNotLike(String value) {
            addCriterion("infoC not like", value, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocIn(List<String> values) {
            addCriterion("infoC in", values, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocNotIn(List<String> values) {
            addCriterion("infoC not in", values, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocBetween(String value1, String value2) {
            addCriterion("infoC between", value1, value2, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfocNotBetween(String value1, String value2) {
            addCriterion("infoC not between", value1, value2, "infoc");
            return (Criteria) this;
        }

        public Criteria andInfodIsNull() {
            addCriterion("infoD is null");
            return (Criteria) this;
        }

        public Criteria andInfodIsNotNull() {
            addCriterion("infoD is not null");
            return (Criteria) this;
        }

        public Criteria andInfodEqualTo(String value) {
            addCriterion("infoD =", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodNotEqualTo(String value) {
            addCriterion("infoD <>", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodGreaterThan(String value) {
            addCriterion("infoD >", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodGreaterThanOrEqualTo(String value) {
            addCriterion("infoD >=", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodLessThan(String value) {
            addCriterion("infoD <", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodLessThanOrEqualTo(String value) {
            addCriterion("infoD <=", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodLike(String value) {
            addCriterion("infoD like", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodNotLike(String value) {
            addCriterion("infoD not like", value, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodIn(List<String> values) {
            addCriterion("infoD in", values, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodNotIn(List<String> values) {
            addCriterion("infoD not in", values, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodBetween(String value1, String value2) {
            addCriterion("infoD between", value1, value2, "infod");
            return (Criteria) this;
        }

        public Criteria andInfodNotBetween(String value1, String value2) {
            addCriterion("infoD not between", value1, value2, "infod");
            return (Criteria) this;
        }

        public Criteria andInfoeIsNull() {
            addCriterion("infoE is null");
            return (Criteria) this;
        }

        public Criteria andInfoeIsNotNull() {
            addCriterion("infoE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoeEqualTo(String value) {
            addCriterion("infoE =", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeNotEqualTo(String value) {
            addCriterion("infoE <>", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeGreaterThan(String value) {
            addCriterion("infoE >", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeGreaterThanOrEqualTo(String value) {
            addCriterion("infoE >=", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeLessThan(String value) {
            addCriterion("infoE <", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeLessThanOrEqualTo(String value) {
            addCriterion("infoE <=", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeLike(String value) {
            addCriterion("infoE like", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeNotLike(String value) {
            addCriterion("infoE not like", value, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeIn(List<String> values) {
            addCriterion("infoE in", values, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeNotIn(List<String> values) {
            addCriterion("infoE not in", values, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeBetween(String value1, String value2) {
            addCriterion("infoE between", value1, value2, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfoeNotBetween(String value1, String value2) {
            addCriterion("infoE not between", value1, value2, "infoe");
            return (Criteria) this;
        }

        public Criteria andInfofIsNull() {
            addCriterion("infoF is null");
            return (Criteria) this;
        }

        public Criteria andInfofIsNotNull() {
            addCriterion("infoF is not null");
            return (Criteria) this;
        }

        public Criteria andInfofEqualTo(String value) {
            addCriterion("infoF =", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofNotEqualTo(String value) {
            addCriterion("infoF <>", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofGreaterThan(String value) {
            addCriterion("infoF >", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofGreaterThanOrEqualTo(String value) {
            addCriterion("infoF >=", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofLessThan(String value) {
            addCriterion("infoF <", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofLessThanOrEqualTo(String value) {
            addCriterion("infoF <=", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofLike(String value) {
            addCriterion("infoF like", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofNotLike(String value) {
            addCriterion("infoF not like", value, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofIn(List<String> values) {
            addCriterion("infoF in", values, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofNotIn(List<String> values) {
            addCriterion("infoF not in", values, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofBetween(String value1, String value2) {
            addCriterion("infoF between", value1, value2, "infof");
            return (Criteria) this;
        }

        public Criteria andInfofNotBetween(String value1, String value2) {
            addCriterion("infoF not between", value1, value2, "infof");
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