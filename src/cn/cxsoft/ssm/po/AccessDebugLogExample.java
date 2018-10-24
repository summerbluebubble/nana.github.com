package cn.cxsoft.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccessDebugLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessDebugLogExample() {
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

        public Criteria andUniqueIdIsNull() {
            addCriterion("unique_id is null");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIsNotNull() {
            addCriterion("unique_id is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueIdEqualTo(String value) {
            addCriterion("unique_id =", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotEqualTo(String value) {
            addCriterion("unique_id <>", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdGreaterThan(String value) {
            addCriterion("unique_id >", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdGreaterThanOrEqualTo(String value) {
            addCriterion("unique_id >=", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLessThan(String value) {
            addCriterion("unique_id <", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLessThanOrEqualTo(String value) {
            addCriterion("unique_id <=", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdLike(String value) {
            addCriterion("unique_id like", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotLike(String value) {
            addCriterion("unique_id not like", value, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdIn(List<String> values) {
            addCriterion("unique_id in", values, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotIn(List<String> values) {
            addCriterion("unique_id not in", values, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdBetween(String value1, String value2) {
            addCriterion("unique_id between", value1, value2, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andUniqueIdNotBetween(String value1, String value2) {
            addCriterion("unique_id not between", value1, value2, "uniqueId");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("client_ip is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("client_ip =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("client_ip <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("client_ip >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("client_ip <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("client_ip <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("client_ip like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("client_ip not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("client_ip in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("client_ip not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("client_ip between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("client_ip not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andCommandIsNull() {
            addCriterion("command is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("command is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("command =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("command <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("command >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("command >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("command <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("command <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("command like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("command not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("command in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("command not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("command between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("command not between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andDebugTypeIsNull() {
            addCriterion("debug_type is null");
            return (Criteria) this;
        }

        public Criteria andDebugTypeIsNotNull() {
            addCriterion("debug_type is not null");
            return (Criteria) this;
        }

        public Criteria andDebugTypeEqualTo(String value) {
            addCriterion("debug_type =", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeNotEqualTo(String value) {
            addCriterion("debug_type <>", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeGreaterThan(String value) {
            addCriterion("debug_type >", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeGreaterThanOrEqualTo(String value) {
            addCriterion("debug_type >=", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeLessThan(String value) {
            addCriterion("debug_type <", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeLessThanOrEqualTo(String value) {
            addCriterion("debug_type <=", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeLike(String value) {
            addCriterion("debug_type like", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeNotLike(String value) {
            addCriterion("debug_type not like", value, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeIn(List<String> values) {
            addCriterion("debug_type in", values, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeNotIn(List<String> values) {
            addCriterion("debug_type not in", values, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeBetween(String value1, String value2) {
            addCriterion("debug_type between", value1, value2, "debugType");
            return (Criteria) this;
        }

        public Criteria andDebugTypeNotBetween(String value1, String value2) {
            addCriterion("debug_type not between", value1, value2, "debugType");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeIsNull() {
            addCriterion("gb_receive_rep_time is null");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeIsNotNull() {
            addCriterion("gb_receive_rep_time is not null");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeEqualTo(Date value) {
            addCriterion("gb_receive_rep_time =", value, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeNotEqualTo(Date value) {
            addCriterion("gb_receive_rep_time <>", value, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeGreaterThan(Date value) {
            addCriterion("gb_receive_rep_time >", value, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gb_receive_rep_time >=", value, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeLessThan(Date value) {
            addCriterion("gb_receive_rep_time <", value, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeLessThanOrEqualTo(Date value) {
            addCriterion("gb_receive_rep_time <=", value, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeIn(List<Date> values) {
            addCriterion("gb_receive_rep_time in", values, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeNotIn(List<Date> values) {
            addCriterion("gb_receive_rep_time not in", values, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeBetween(Date value1, Date value2) {
            addCriterion("gb_receive_rep_time between", value1, value2, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveRepTimeNotBetween(Date value1, Date value2) {
            addCriterion("gb_receive_rep_time not between", value1, value2, "gbReceiveRepTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeIsNull() {
            addCriterion("gb_receive_req_time is null");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeIsNotNull() {
            addCriterion("gb_receive_req_time is not null");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeEqualTo(Date value) {
            addCriterion("gb_receive_req_time =", value, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeNotEqualTo(Date value) {
            addCriterion("gb_receive_req_time <>", value, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeGreaterThan(Date value) {
            addCriterion("gb_receive_req_time >", value, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gb_receive_req_time >=", value, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeLessThan(Date value) {
            addCriterion("gb_receive_req_time <", value, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("gb_receive_req_time <=", value, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeIn(List<Date> values) {
            addCriterion("gb_receive_req_time in", values, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeNotIn(List<Date> values) {
            addCriterion("gb_receive_req_time not in", values, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeBetween(Date value1, Date value2) {
            addCriterion("gb_receive_req_time between", value1, value2, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andGbReceiveReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("gb_receive_req_time not between", value1, value2, "gbReceiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeIsNull() {
            addCriterion("receive_rep_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeIsNotNull() {
            addCriterion("receive_rep_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeEqualTo(Date value) {
            addCriterion("receive_rep_time =", value, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeNotEqualTo(Date value) {
            addCriterion("receive_rep_time <>", value, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeGreaterThan(Date value) {
            addCriterion("receive_rep_time >", value, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_rep_time >=", value, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeLessThan(Date value) {
            addCriterion("receive_rep_time <", value, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_rep_time <=", value, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeIn(List<Date> values) {
            addCriterion("receive_rep_time in", values, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeNotIn(List<Date> values) {
            addCriterion("receive_rep_time not in", values, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeBetween(Date value1, Date value2) {
            addCriterion("receive_rep_time between", value1, value2, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRepTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_rep_time not between", value1, value2, "receiveRepTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeIsNull() {
            addCriterion("receive_req_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeIsNotNull() {
            addCriterion("receive_req_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeEqualTo(Date value) {
            addCriterion("receive_req_time =", value, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeNotEqualTo(Date value) {
            addCriterion("receive_req_time <>", value, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeGreaterThan(Date value) {
            addCriterion("receive_req_time >", value, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_req_time >=", value, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeLessThan(Date value) {
            addCriterion("receive_req_time <", value, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_req_time <=", value, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeIn(List<Date> values) {
            addCriterion("receive_req_time in", values, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeNotIn(List<Date> values) {
            addCriterion("receive_req_time not in", values, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeBetween(Date value1, Date value2) {
            addCriterion("receive_req_time between", value1, value2, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andReceiveReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_req_time not between", value1, value2, "receiveReqTime");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
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