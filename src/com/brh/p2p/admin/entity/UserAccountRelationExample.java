package com.brh.p2p.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class UserAccountRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountRelationExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAcctnoIsNull() {
            addCriterion("ACCTNO is null");
            return (Criteria) this;
        }

        public Criteria andAcctnoIsNotNull() {
            addCriterion("ACCTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAcctnoEqualTo(String value) {
            addCriterion("ACCTNO =", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoNotEqualTo(String value) {
            addCriterion("ACCTNO <>", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoGreaterThan(String value) {
            addCriterion("ACCTNO >", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTNO >=", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoLessThan(String value) {
            addCriterion("ACCTNO <", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoLessThanOrEqualTo(String value) {
            addCriterion("ACCTNO <=", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoLike(String value) {
            addCriterion("ACCTNO like", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoNotLike(String value) {
            addCriterion("ACCTNO not like", value, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoIn(List<String> values) {
            addCriterion("ACCTNO in", values, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoNotIn(List<String> values) {
            addCriterion("ACCTNO not in", values, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoBetween(String value1, String value2) {
            addCriterion("ACCTNO between", value1, value2, "acctno");
            return (Criteria) this;
        }

        public Criteria andAcctnoNotBetween(String value1, String value2) {
            addCriterion("ACCTNO not between", value1, value2, "acctno");
            return (Criteria) this;
        }

        public Criteria andAccttypeIsNull() {
            addCriterion("ACCTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccttypeIsNotNull() {
            addCriterion("ACCTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccttypeEqualTo(String value) {
            addCriterion("ACCTTYPE =", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotEqualTo(String value) {
            addCriterion("ACCTTYPE <>", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeGreaterThan(String value) {
            addCriterion("ACCTTYPE >", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTTYPE >=", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeLessThan(String value) {
            addCriterion("ACCTTYPE <", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeLessThanOrEqualTo(String value) {
            addCriterion("ACCTTYPE <=", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeLike(String value) {
            addCriterion("ACCTTYPE like", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotLike(String value) {
            addCriterion("ACCTTYPE not like", value, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeIn(List<String> values) {
            addCriterion("ACCTTYPE in", values, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotIn(List<String> values) {
            addCriterion("ACCTTYPE not in", values, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeBetween(String value1, String value2) {
            addCriterion("ACCTTYPE between", value1, value2, "accttype");
            return (Criteria) this;
        }

        public Criteria andAccttypeNotBetween(String value1, String value2) {
            addCriterion("ACCTTYPE not between", value1, value2, "accttype");
            return (Criteria) this;
        }

        public Criteria andAcctroleIsNull() {
            addCriterion("ACCTROLE is null");
            return (Criteria) this;
        }

        public Criteria andAcctroleIsNotNull() {
            addCriterion("ACCTROLE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctroleEqualTo(String value) {
            addCriterion("ACCTROLE =", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleNotEqualTo(String value) {
            addCriterion("ACCTROLE <>", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleGreaterThan(String value) {
            addCriterion("ACCTROLE >", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTROLE >=", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleLessThan(String value) {
            addCriterion("ACCTROLE <", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleLessThanOrEqualTo(String value) {
            addCriterion("ACCTROLE <=", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleLike(String value) {
            addCriterion("ACCTROLE like", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleNotLike(String value) {
            addCriterion("ACCTROLE not like", value, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleIn(List<String> values) {
            addCriterion("ACCTROLE in", values, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleNotIn(List<String> values) {
            addCriterion("ACCTROLE not in", values, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleBetween(String value1, String value2) {
            addCriterion("ACCTROLE between", value1, value2, "acctrole");
            return (Criteria) this;
        }

        public Criteria andAcctroleNotBetween(String value1, String value2) {
            addCriterion("ACCTROLE not between", value1, value2, "acctrole");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("CARDNO =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("CARDNO <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("CARDNO >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNO >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("CARDNO <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("CARDNO <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("CARDNO like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("CARDNO not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("CARDNO in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("CARDNO not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("CARDNO between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("CARDNO not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("ACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("ACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("ACCOUNTNAME =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("ACCOUNTNAME <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("ACCOUNTNAME >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("ACCOUNTNAME <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("ACCOUNTNAME like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("ACCOUNTNAME not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("ACCOUNTNAME in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("ACCOUNTNAME not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountbelongIsNull() {
            addCriterion("ACCOUNTBELONG is null");
            return (Criteria) this;
        }

        public Criteria andAccountbelongIsNotNull() {
            addCriterion("ACCOUNTBELONG is not null");
            return (Criteria) this;
        }

        public Criteria andAccountbelongEqualTo(String value) {
            addCriterion("ACCOUNTBELONG =", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongNotEqualTo(String value) {
            addCriterion("ACCOUNTBELONG <>", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongGreaterThan(String value) {
            addCriterion("ACCOUNTBELONG >", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTBELONG >=", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongLessThan(String value) {
            addCriterion("ACCOUNTBELONG <", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTBELONG <=", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongLike(String value) {
            addCriterion("ACCOUNTBELONG like", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongNotLike(String value) {
            addCriterion("ACCOUNTBELONG not like", value, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongIn(List<String> values) {
            addCriterion("ACCOUNTBELONG in", values, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongNotIn(List<String> values) {
            addCriterion("ACCOUNTBELONG not in", values, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongBetween(String value1, String value2) {
            addCriterion("ACCOUNTBELONG between", value1, value2, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andAccountbelongNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTBELONG not between", value1, value2, "accountbelong");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLimitamountIsNull() {
            addCriterion("LIMITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLimitamountIsNotNull() {
            addCriterion("LIMITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLimitamountEqualTo(String value) {
            addCriterion("LIMITAMOUNT =", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountNotEqualTo(String value) {
            addCriterion("LIMITAMOUNT <>", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountGreaterThan(String value) {
            addCriterion("LIMITAMOUNT >", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountGreaterThanOrEqualTo(String value) {
            addCriterion("LIMITAMOUNT >=", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountLessThan(String value) {
            addCriterion("LIMITAMOUNT <", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountLessThanOrEqualTo(String value) {
            addCriterion("LIMITAMOUNT <=", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountLike(String value) {
            addCriterion("LIMITAMOUNT like", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountNotLike(String value) {
            addCriterion("LIMITAMOUNT not like", value, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountIn(List<String> values) {
            addCriterion("LIMITAMOUNT in", values, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountNotIn(List<String> values) {
            addCriterion("LIMITAMOUNT not in", values, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountBetween(String value1, String value2) {
            addCriterion("LIMITAMOUNT between", value1, value2, "limitamount");
            return (Criteria) this;
        }

        public Criteria andLimitamountNotBetween(String value1, String value2) {
            addCriterion("LIMITAMOUNT not between", value1, value2, "limitamount");
            return (Criteria) this;
        }

        public Criteria andBelongareaIsNull() {
            addCriterion("BELONGAREA is null");
            return (Criteria) this;
        }

        public Criteria andBelongareaIsNotNull() {
            addCriterion("BELONGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andBelongareaEqualTo(String value) {
            addCriterion("BELONGAREA =", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotEqualTo(String value) {
            addCriterion("BELONGAREA <>", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaGreaterThan(String value) {
            addCriterion("BELONGAREA >", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGAREA >=", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLessThan(String value) {
            addCriterion("BELONGAREA <", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLessThanOrEqualTo(String value) {
            addCriterion("BELONGAREA <=", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLike(String value) {
            addCriterion("BELONGAREA like", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotLike(String value) {
            addCriterion("BELONGAREA not like", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaIn(List<String> values) {
            addCriterion("BELONGAREA in", values, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotIn(List<String> values) {
            addCriterion("BELONGAREA not in", values, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaBetween(String value1, String value2) {
            addCriterion("BELONGAREA between", value1, value2, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotBetween(String value1, String value2) {
            addCriterion("BELONGAREA not between", value1, value2, "belongarea");
            return (Criteria) this;
        }

        public Criteria andChecknumberIsNull() {
            addCriterion("CHECKNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andChecknumberIsNotNull() {
            addCriterion("CHECKNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andChecknumberEqualTo(String value) {
            addCriterion("CHECKNUMBER =", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotEqualTo(String value) {
            addCriterion("CHECKNUMBER <>", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberGreaterThan(String value) {
            addCriterion("CHECKNUMBER >", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNUMBER >=", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLessThan(String value) {
            addCriterion("CHECKNUMBER <", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLessThanOrEqualTo(String value) {
            addCriterion("CHECKNUMBER <=", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberLike(String value) {
            addCriterion("CHECKNUMBER like", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotLike(String value) {
            addCriterion("CHECKNUMBER not like", value, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberIn(List<String> values) {
            addCriterion("CHECKNUMBER in", values, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotIn(List<String> values) {
            addCriterion("CHECKNUMBER not in", values, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberBetween(String value1, String value2) {
            addCriterion("CHECKNUMBER between", value1, value2, "checknumber");
            return (Criteria) this;
        }

        public Criteria andChecknumberNotBetween(String value1, String value2) {
            addCriterion("CHECKNUMBER not between", value1, value2, "checknumber");
            return (Criteria) this;
        }

        public Criteria andCardno2IsNull() {
            addCriterion("CARDNO2 is null");
            return (Criteria) this;
        }

        public Criteria andCardno2IsNotNull() {
            addCriterion("CARDNO2 is not null");
            return (Criteria) this;
        }

        public Criteria andCardno2EqualTo(String value) {
            addCriterion("CARDNO2 =", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2NotEqualTo(String value) {
            addCriterion("CARDNO2 <>", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2GreaterThan(String value) {
            addCriterion("CARDNO2 >", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2GreaterThanOrEqualTo(String value) {
            addCriterion("CARDNO2 >=", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2LessThan(String value) {
            addCriterion("CARDNO2 <", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2LessThanOrEqualTo(String value) {
            addCriterion("CARDNO2 <=", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2Like(String value) {
            addCriterion("CARDNO2 like", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2NotLike(String value) {
            addCriterion("CARDNO2 not like", value, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2In(List<String> values) {
            addCriterion("CARDNO2 in", values, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2NotIn(List<String> values) {
            addCriterion("CARDNO2 not in", values, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2Between(String value1, String value2) {
            addCriterion("CARDNO2 between", value1, value2, "cardno2");
            return (Criteria) this;
        }

        public Criteria andCardno2NotBetween(String value1, String value2) {
            addCriterion("CARDNO2 not between", value1, value2, "cardno2");
            return (Criteria) this;
        }

        public Criteria andVerifytypeIsNull() {
            addCriterion("VERIFYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVerifytypeIsNotNull() {
            addCriterion("VERIFYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifytypeEqualTo(String value) {
            addCriterion("VERIFYTYPE =", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotEqualTo(String value) {
            addCriterion("VERIFYTYPE <>", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeGreaterThan(String value) {
            addCriterion("VERIFYTYPE >", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFYTYPE >=", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeLessThan(String value) {
            addCriterion("VERIFYTYPE <", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeLessThanOrEqualTo(String value) {
            addCriterion("VERIFYTYPE <=", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeLike(String value) {
            addCriterion("VERIFYTYPE like", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotLike(String value) {
            addCriterion("VERIFYTYPE not like", value, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeIn(List<String> values) {
            addCriterion("VERIFYTYPE in", values, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotIn(List<String> values) {
            addCriterion("VERIFYTYPE not in", values, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeBetween(String value1, String value2) {
            addCriterion("VERIFYTYPE between", value1, value2, "verifytype");
            return (Criteria) this;
        }

        public Criteria andVerifytypeNotBetween(String value1, String value2) {
            addCriterion("VERIFYTYPE not between", value1, value2, "verifytype");
            return (Criteria) this;
        }

        public Criteria andRelatypeIsNull() {
            addCriterion("RELATYPE is null");
            return (Criteria) this;
        }

        public Criteria andRelatypeIsNotNull() {
            addCriterion("RELATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRelatypeEqualTo(String value) {
            addCriterion("RELATYPE =", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeNotEqualTo(String value) {
            addCriterion("RELATYPE <>", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeGreaterThan(String value) {
            addCriterion("RELATYPE >", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeGreaterThanOrEqualTo(String value) {
            addCriterion("RELATYPE >=", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeLessThan(String value) {
            addCriterion("RELATYPE <", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeLessThanOrEqualTo(String value) {
            addCriterion("RELATYPE <=", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeLike(String value) {
            addCriterion("RELATYPE like", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeNotLike(String value) {
            addCriterion("RELATYPE not like", value, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeIn(List<String> values) {
            addCriterion("RELATYPE in", values, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeNotIn(List<String> values) {
            addCriterion("RELATYPE not in", values, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeBetween(String value1, String value2) {
            addCriterion("RELATYPE between", value1, value2, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelatypeNotBetween(String value1, String value2) {
            addCriterion("RELATYPE not between", value1, value2, "relatype");
            return (Criteria) this;
        }

        public Criteria andRelacustidIsNull() {
            addCriterion("RELACUSTID is null");
            return (Criteria) this;
        }

        public Criteria andRelacustidIsNotNull() {
            addCriterion("RELACUSTID is not null");
            return (Criteria) this;
        }

        public Criteria andRelacustidEqualTo(String value) {
            addCriterion("RELACUSTID =", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidNotEqualTo(String value) {
            addCriterion("RELACUSTID <>", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidGreaterThan(String value) {
            addCriterion("RELACUSTID >", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidGreaterThanOrEqualTo(String value) {
            addCriterion("RELACUSTID >=", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidLessThan(String value) {
            addCriterion("RELACUSTID <", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidLessThanOrEqualTo(String value) {
            addCriterion("RELACUSTID <=", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidLike(String value) {
            addCriterion("RELACUSTID like", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidNotLike(String value) {
            addCriterion("RELACUSTID not like", value, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidIn(List<String> values) {
            addCriterion("RELACUSTID in", values, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidNotIn(List<String> values) {
            addCriterion("RELACUSTID not in", values, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidBetween(String value1, String value2) {
            addCriterion("RELACUSTID between", value1, value2, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustidNotBetween(String value1, String value2) {
            addCriterion("RELACUSTID not between", value1, value2, "relacustid");
            return (Criteria) this;
        }

        public Criteria andRelacustid2IsNull() {
            addCriterion("RELACUSTID2 is null");
            return (Criteria) this;
        }

        public Criteria andRelacustid2IsNotNull() {
            addCriterion("RELACUSTID2 is not null");
            return (Criteria) this;
        }

        public Criteria andRelacustid2EqualTo(String value) {
            addCriterion("RELACUSTID2 =", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2NotEqualTo(String value) {
            addCriterion("RELACUSTID2 <>", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2GreaterThan(String value) {
            addCriterion("RELACUSTID2 >", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2GreaterThanOrEqualTo(String value) {
            addCriterion("RELACUSTID2 >=", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2LessThan(String value) {
            addCriterion("RELACUSTID2 <", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2LessThanOrEqualTo(String value) {
            addCriterion("RELACUSTID2 <=", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2Like(String value) {
            addCriterion("RELACUSTID2 like", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2NotLike(String value) {
            addCriterion("RELACUSTID2 not like", value, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2In(List<String> values) {
            addCriterion("RELACUSTID2 in", values, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2NotIn(List<String> values) {
            addCriterion("RELACUSTID2 not in", values, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2Between(String value1, String value2) {
            addCriterion("RELACUSTID2 between", value1, value2, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andRelacustid2NotBetween(String value1, String value2) {
            addCriterion("RELACUSTID2 not between", value1, value2, "relacustid2");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeIsNull() {
            addCriterion("USERCARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeIsNotNull() {
            addCriterion("USERCARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeEqualTo(String value) {
            addCriterion("USERCARDTYPE =", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeNotEqualTo(String value) {
            addCriterion("USERCARDTYPE <>", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeGreaterThan(String value) {
            addCriterion("USERCARDTYPE >", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERCARDTYPE >=", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeLessThan(String value) {
            addCriterion("USERCARDTYPE <", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeLessThanOrEqualTo(String value) {
            addCriterion("USERCARDTYPE <=", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeLike(String value) {
            addCriterion("USERCARDTYPE like", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeNotLike(String value) {
            addCriterion("USERCARDTYPE not like", value, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeIn(List<String> values) {
            addCriterion("USERCARDTYPE in", values, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeNotIn(List<String> values) {
            addCriterion("USERCARDTYPE not in", values, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeBetween(String value1, String value2) {
            addCriterion("USERCARDTYPE between", value1, value2, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andUsercardtypeNotBetween(String value1, String value2) {
            addCriterion("USERCARDTYPE not between", value1, value2, "usercardtype");
            return (Criteria) this;
        }

        public Criteria andBankmobileIsNull() {
            addCriterion("BANKMOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBankmobileIsNotNull() {
            addCriterion("BANKMOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBankmobileEqualTo(String value) {
            addCriterion("BANKMOBILE =", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileNotEqualTo(String value) {
            addCriterion("BANKMOBILE <>", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileGreaterThan(String value) {
            addCriterion("BANKMOBILE >", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileGreaterThanOrEqualTo(String value) {
            addCriterion("BANKMOBILE >=", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileLessThan(String value) {
            addCriterion("BANKMOBILE <", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileLessThanOrEqualTo(String value) {
            addCriterion("BANKMOBILE <=", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileLike(String value) {
            addCriterion("BANKMOBILE like", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileNotLike(String value) {
            addCriterion("BANKMOBILE not like", value, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileIn(List<String> values) {
            addCriterion("BANKMOBILE in", values, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileNotIn(List<String> values) {
            addCriterion("BANKMOBILE not in", values, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileBetween(String value1, String value2) {
            addCriterion("BANKMOBILE between", value1, value2, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBankmobileNotBetween(String value1, String value2) {
            addCriterion("BANKMOBILE not between", value1, value2, "bankmobile");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceIsNull() {
            addCriterion("BELONGPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceIsNotNull() {
            addCriterion("BELONGPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceEqualTo(String value) {
            addCriterion("BELONGPROVINCE =", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceNotEqualTo(String value) {
            addCriterion("BELONGPROVINCE <>", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceGreaterThan(String value) {
            addCriterion("BELONGPROVINCE >", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGPROVINCE >=", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceLessThan(String value) {
            addCriterion("BELONGPROVINCE <", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceLessThanOrEqualTo(String value) {
            addCriterion("BELONGPROVINCE <=", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceLike(String value) {
            addCriterion("BELONGPROVINCE like", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceNotLike(String value) {
            addCriterion("BELONGPROVINCE not like", value, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceIn(List<String> values) {
            addCriterion("BELONGPROVINCE in", values, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceNotIn(List<String> values) {
            addCriterion("BELONGPROVINCE not in", values, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceBetween(String value1, String value2) {
            addCriterion("BELONGPROVINCE between", value1, value2, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongprovinceNotBetween(String value1, String value2) {
            addCriterion("BELONGPROVINCE not between", value1, value2, "belongprovince");
            return (Criteria) this;
        }

        public Criteria andBelongcityIsNull() {
            addCriterion("BELONGCITY is null");
            return (Criteria) this;
        }

        public Criteria andBelongcityIsNotNull() {
            addCriterion("BELONGCITY is not null");
            return (Criteria) this;
        }

        public Criteria andBelongcityEqualTo(String value) {
            addCriterion("BELONGCITY =", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotEqualTo(String value) {
            addCriterion("BELONGCITY <>", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityGreaterThan(String value) {
            addCriterion("BELONGCITY >", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGCITY >=", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityLessThan(String value) {
            addCriterion("BELONGCITY <", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityLessThanOrEqualTo(String value) {
            addCriterion("BELONGCITY <=", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityLike(String value) {
            addCriterion("BELONGCITY like", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotLike(String value) {
            addCriterion("BELONGCITY not like", value, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityIn(List<String> values) {
            addCriterion("BELONGCITY in", values, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotIn(List<String> values) {
            addCriterion("BELONGCITY not in", values, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityBetween(String value1, String value2) {
            addCriterion("BELONGCITY between", value1, value2, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBelongcityNotBetween(String value1, String value2) {
            addCriterion("BELONGCITY not between", value1, value2, "belongcity");
            return (Criteria) this;
        }

        public Criteria andBranchbankIsNull() {
            addCriterion("BRANCHBANK is null");
            return (Criteria) this;
        }

        public Criteria andBranchbankIsNotNull() {
            addCriterion("BRANCHBANK is not null");
            return (Criteria) this;
        }

        public Criteria andBranchbankEqualTo(String value) {
            addCriterion("BRANCHBANK =", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankNotEqualTo(String value) {
            addCriterion("BRANCHBANK <>", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankGreaterThan(String value) {
            addCriterion("BRANCHBANK >", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCHBANK >=", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankLessThan(String value) {
            addCriterion("BRANCHBANK <", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankLessThanOrEqualTo(String value) {
            addCriterion("BRANCHBANK <=", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankLike(String value) {
            addCriterion("BRANCHBANK like", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankNotLike(String value) {
            addCriterion("BRANCHBANK not like", value, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankIn(List<String> values) {
            addCriterion("BRANCHBANK in", values, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankNotIn(List<String> values) {
            addCriterion("BRANCHBANK not in", values, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankBetween(String value1, String value2) {
            addCriterion("BRANCHBANK between", value1, value2, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbankNotBetween(String value1, String value2) {
            addCriterion("BRANCHBANK not between", value1, value2, "branchbank");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameIsNull() {
            addCriterion("BRANCHBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameIsNotNull() {
            addCriterion("BRANCHBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameEqualTo(String value) {
            addCriterion("BRANCHBANKNAME =", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameNotEqualTo(String value) {
            addCriterion("BRANCHBANKNAME <>", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameGreaterThan(String value) {
            addCriterion("BRANCHBANKNAME >", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCHBANKNAME >=", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameLessThan(String value) {
            addCriterion("BRANCHBANKNAME <", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameLessThanOrEqualTo(String value) {
            addCriterion("BRANCHBANKNAME <=", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameLike(String value) {
            addCriterion("BRANCHBANKNAME like", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameNotLike(String value) {
            addCriterion("BRANCHBANKNAME not like", value, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameIn(List<String> values) {
            addCriterion("BRANCHBANKNAME in", values, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameNotIn(List<String> values) {
            addCriterion("BRANCHBANKNAME not in", values, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameBetween(String value1, String value2) {
            addCriterion("BRANCHBANKNAME between", value1, value2, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andBranchbanknameNotBetween(String value1, String value2) {
            addCriterion("BRANCHBANKNAME not between", value1, value2, "branchbankname");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNull() {
            addCriterion("INPUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNotNull() {
            addCriterion("INPUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInputtimeEqualTo(String value) {
            addCriterion("INPUTTIME =", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotEqualTo(String value) {
            addCriterion("INPUTTIME <>", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThan(String value) {
            addCriterion("INPUTTIME >", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTTIME >=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThan(String value) {
            addCriterion("INPUTTIME <", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThanOrEqualTo(String value) {
            addCriterion("INPUTTIME <=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLike(String value) {
            addCriterion("INPUTTIME like", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotLike(String value) {
            addCriterion("INPUTTIME not like", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeIn(List<String> values) {
            addCriterion("INPUTTIME in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotIn(List<String> values) {
            addCriterion("INPUTTIME not in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeBetween(String value1, String value2) {
            addCriterion("INPUTTIME between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotBetween(String value1, String value2) {
            addCriterion("INPUTTIME not between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagIsNull() {
            addCriterion("SPEWITHDRAWACCTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagIsNotNull() {
            addCriterion("SPEWITHDRAWACCTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagEqualTo(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG =", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagNotEqualTo(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG <>", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagGreaterThan(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG >", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagGreaterThanOrEqualTo(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG >=", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagLessThan(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG <", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagLessThanOrEqualTo(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG <=", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagLike(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG like", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagNotLike(String value) {
            addCriterion("SPEWITHDRAWACCTFLAG not like", value, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagIn(List<String> values) {
            addCriterion("SPEWITHDRAWACCTFLAG in", values, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagNotIn(List<String> values) {
            addCriterion("SPEWITHDRAWACCTFLAG not in", values, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagBetween(String value1, String value2) {
            addCriterion("SPEWITHDRAWACCTFLAG between", value1, value2, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andSpewithdrawacctflagNotBetween(String value1, String value2) {
            addCriterion("SPEWITHDRAWACCTFLAG not between", value1, value2, "spewithdrawacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagIsNull() {
            addCriterion("COMPENSATIONACCTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagIsNotNull() {
            addCriterion("COMPENSATIONACCTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagEqualTo(String value) {
            addCriterion("COMPENSATIONACCTFLAG =", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagNotEqualTo(String value) {
            addCriterion("COMPENSATIONACCTFLAG <>", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagGreaterThan(String value) {
            addCriterion("COMPENSATIONACCTFLAG >", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagGreaterThanOrEqualTo(String value) {
            addCriterion("COMPENSATIONACCTFLAG >=", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagLessThan(String value) {
            addCriterion("COMPENSATIONACCTFLAG <", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagLessThanOrEqualTo(String value) {
            addCriterion("COMPENSATIONACCTFLAG <=", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagLike(String value) {
            addCriterion("COMPENSATIONACCTFLAG like", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagNotLike(String value) {
            addCriterion("COMPENSATIONACCTFLAG not like", value, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagIn(List<String> values) {
            addCriterion("COMPENSATIONACCTFLAG in", values, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagNotIn(List<String> values) {
            addCriterion("COMPENSATIONACCTFLAG not in", values, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagBetween(String value1, String value2) {
            addCriterion("COMPENSATIONACCTFLAG between", value1, value2, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andCompensationacctflagNotBetween(String value1, String value2) {
            addCriterion("COMPENSATIONACCTFLAG not between", value1, value2, "compensationacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagIsNull() {
            addCriterion("BONDACCTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andBondacctflagIsNotNull() {
            addCriterion("BONDACCTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBondacctflagEqualTo(String value) {
            addCriterion("BONDACCTFLAG =", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagNotEqualTo(String value) {
            addCriterion("BONDACCTFLAG <>", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagGreaterThan(String value) {
            addCriterion("BONDACCTFLAG >", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagGreaterThanOrEqualTo(String value) {
            addCriterion("BONDACCTFLAG >=", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagLessThan(String value) {
            addCriterion("BONDACCTFLAG <", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagLessThanOrEqualTo(String value) {
            addCriterion("BONDACCTFLAG <=", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagLike(String value) {
            addCriterion("BONDACCTFLAG like", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagNotLike(String value) {
            addCriterion("BONDACCTFLAG not like", value, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagIn(List<String> values) {
            addCriterion("BONDACCTFLAG in", values, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagNotIn(List<String> values) {
            addCriterion("BONDACCTFLAG not in", values, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagBetween(String value1, String value2) {
            addCriterion("BONDACCTFLAG between", value1, value2, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andBondacctflagNotBetween(String value1, String value2) {
            addCriterion("BONDACCTFLAG not between", value1, value2, "bondacctflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagIsNull() {
            addCriterion("INVESTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andInvestflagIsNotNull() {
            addCriterion("INVESTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInvestflagEqualTo(String value) {
            addCriterion("INVESTFLAG =", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagNotEqualTo(String value) {
            addCriterion("INVESTFLAG <>", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagGreaterThan(String value) {
            addCriterion("INVESTFLAG >", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTFLAG >=", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagLessThan(String value) {
            addCriterion("INVESTFLAG <", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagLessThanOrEqualTo(String value) {
            addCriterion("INVESTFLAG <=", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagLike(String value) {
            addCriterion("INVESTFLAG like", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagNotLike(String value) {
            addCriterion("INVESTFLAG not like", value, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagIn(List<String> values) {
            addCriterion("INVESTFLAG in", values, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagNotIn(List<String> values) {
            addCriterion("INVESTFLAG not in", values, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagBetween(String value1, String value2) {
            addCriterion("INVESTFLAG between", value1, value2, "investflag");
            return (Criteria) this;
        }

        public Criteria andInvestflagNotBetween(String value1, String value2) {
            addCriterion("INVESTFLAG not between", value1, value2, "investflag");
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