package gradle.master.entity.fourth;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItgProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItgProjectExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andBusiOrgIsNull() {
            addCriterion("busi_org is null");
            return (Criteria) this;
        }

        public Criteria andBusiOrgIsNotNull() {
            addCriterion("busi_org is not null");
            return (Criteria) this;
        }

        public Criteria andBusiOrgEqualTo(String value) {
            addCriterion("busi_org =", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgNotEqualTo(String value) {
            addCriterion("busi_org <>", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgGreaterThan(String value) {
            addCriterion("busi_org >", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgGreaterThanOrEqualTo(String value) {
            addCriterion("busi_org >=", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgLessThan(String value) {
            addCriterion("busi_org <", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgLessThanOrEqualTo(String value) {
            addCriterion("busi_org <=", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgLike(String value) {
            addCriterion("busi_org like", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgNotLike(String value) {
            addCriterion("busi_org not like", value, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgIn(List<String> values) {
            addCriterion("busi_org in", values, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgNotIn(List<String> values) {
            addCriterion("busi_org not in", values, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgBetween(String value1, String value2) {
            addCriterion("busi_org between", value1, value2, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andBusiOrgNotBetween(String value1, String value2) {
            addCriterion("busi_org not between", value1, value2, "busiOrg");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNull() {
            addCriterion("investor is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNotNull() {
            addCriterion("investor is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorEqualTo(String value) {
            addCriterion("investor =", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotEqualTo(String value) {
            addCriterion("investor <>", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThan(String value) {
            addCriterion("investor >", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThanOrEqualTo(String value) {
            addCriterion("investor >=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThan(String value) {
            addCriterion("investor <", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThanOrEqualTo(String value) {
            addCriterion("investor <=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLike(String value) {
            addCriterion("investor like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotLike(String value) {
            addCriterion("investor not like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorIn(List<String> values) {
            addCriterion("investor in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotIn(List<String> values) {
            addCriterion("investor not in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorBetween(String value1, String value2) {
            addCriterion("investor between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotBetween(String value1, String value2) {
            addCriterion("investor not between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterIsNull() {
            addCriterion("investor_cost_center is null");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterIsNotNull() {
            addCriterion("investor_cost_center is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterEqualTo(String value) {
            addCriterion("investor_cost_center =", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterNotEqualTo(String value) {
            addCriterion("investor_cost_center <>", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterGreaterThan(String value) {
            addCriterion("investor_cost_center >", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterGreaterThanOrEqualTo(String value) {
            addCriterion("investor_cost_center >=", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterLessThan(String value) {
            addCriterion("investor_cost_center <", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterLessThanOrEqualTo(String value) {
            addCriterion("investor_cost_center <=", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterLike(String value) {
            addCriterion("investor_cost_center like", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterNotLike(String value) {
            addCriterion("investor_cost_center not like", value, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterIn(List<String> values) {
            addCriterion("investor_cost_center in", values, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterNotIn(List<String> values) {
            addCriterion("investor_cost_center not in", values, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterBetween(String value1, String value2) {
            addCriterion("investor_cost_center between", value1, value2, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andInvestorCostCenterNotBetween(String value1, String value2) {
            addCriterion("investor_cost_center not between", value1, value2, "investorCostCenter");
            return (Criteria) this;
        }

        public Criteria andWbsCodeIsNull() {
            addCriterion("wbs_code is null");
            return (Criteria) this;
        }

        public Criteria andWbsCodeIsNotNull() {
            addCriterion("wbs_code is not null");
            return (Criteria) this;
        }

        public Criteria andWbsCodeEqualTo(String value) {
            addCriterion("wbs_code =", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeNotEqualTo(String value) {
            addCriterion("wbs_code <>", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeGreaterThan(String value) {
            addCriterion("wbs_code >", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("wbs_code >=", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeLessThan(String value) {
            addCriterion("wbs_code <", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeLessThanOrEqualTo(String value) {
            addCriterion("wbs_code <=", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeLike(String value) {
            addCriterion("wbs_code like", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeNotLike(String value) {
            addCriterion("wbs_code not like", value, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeIn(List<String> values) {
            addCriterion("wbs_code in", values, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeNotIn(List<String> values) {
            addCriterion("wbs_code not in", values, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeBetween(String value1, String value2) {
            addCriterion("wbs_code between", value1, value2, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andWbsCodeNotBetween(String value1, String value2) {
            addCriterion("wbs_code not between", value1, value2, "wbsCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceIsNull() {
            addCriterion("build_balance is null");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceIsNotNull() {
            addCriterion("build_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceEqualTo(BigDecimal value) {
            addCriterion("build_balance =", value, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceNotEqualTo(BigDecimal value) {
            addCriterion("build_balance <>", value, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceGreaterThan(BigDecimal value) {
            addCriterion("build_balance >", value, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("build_balance >=", value, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceLessThan(BigDecimal value) {
            addCriterion("build_balance <", value, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("build_balance <=", value, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceIn(List<BigDecimal> values) {
            addCriterion("build_balance in", values, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceNotIn(List<BigDecimal> values) {
            addCriterion("build_balance not in", values, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("build_balance between", value1, value2, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("build_balance not between", value1, value2, "buildBalance");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNull() {
            addCriterion("build_date is null");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNotNull() {
            addCriterion("build_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDateEqualTo(Date value) {
            addCriterionForJDBCDate("build_date =", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("build_date <>", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThan(Date value) {
            addCriterionForJDBCDate("build_date >", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_date >=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThan(Date value) {
            addCriterionForJDBCDate("build_date <", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_date <=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateIn(List<Date> values) {
            addCriterionForJDBCDate("build_date in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("build_date not in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_date between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_date not between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(BigDecimal value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(BigDecimal value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(BigDecimal value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(BigDecimal value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<BigDecimal> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<BigDecimal> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestIsNull() {
            addCriterion("accumulated_interest is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestIsNotNull() {
            addCriterion("accumulated_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestEqualTo(BigDecimal value) {
            addCriterion("accumulated_interest =", value, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestNotEqualTo(BigDecimal value) {
            addCriterion("accumulated_interest <>", value, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestGreaterThan(BigDecimal value) {
            addCriterion("accumulated_interest >", value, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulated_interest >=", value, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestLessThan(BigDecimal value) {
            addCriterion("accumulated_interest <", value, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulated_interest <=", value, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestIn(List<BigDecimal> values) {
            addCriterion("accumulated_interest in", values, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestNotIn(List<BigDecimal> values) {
            addCriterion("accumulated_interest not in", values, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulated_interest between", value1, value2, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andAccumulatedInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulated_interest not between", value1, value2, "accumulatedInterest");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodIsNull() {
            addCriterion("interest_period is null");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodIsNotNull() {
            addCriterion("interest_period is not null");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodEqualTo(String value) {
            addCriterion("interest_period =", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodNotEqualTo(String value) {
            addCriterion("interest_period <>", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodGreaterThan(String value) {
            addCriterion("interest_period >", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("interest_period >=", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodLessThan(String value) {
            addCriterion("interest_period <", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodLessThanOrEqualTo(String value) {
            addCriterion("interest_period <=", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodLike(String value) {
            addCriterion("interest_period like", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodNotLike(String value) {
            addCriterion("interest_period not like", value, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodIn(List<String> values) {
            addCriterion("interest_period in", values, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodNotIn(List<String> values) {
            addCriterion("interest_period not in", values, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodBetween(String value1, String value2) {
            addCriterion("interest_period between", value1, value2, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestPeriodNotBetween(String value1, String value2) {
            addCriterion("interest_period not between", value1, value2, "interestPeriod");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("last_update_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("last_update_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(Long value) {
            addCriterion("last_update_by =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(Long value) {
            addCriterion("last_update_by <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(Long value) {
            addCriterion("last_update_by >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("last_update_by >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(Long value) {
            addCriterion("last_update_by <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("last_update_by <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<Long> values) {
            addCriterion("last_update_by in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<Long> values) {
            addCriterion("last_update_by not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(Long value1, Long value2) {
            addCriterion("last_update_by between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("last_update_by not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameIsNull() {
            addCriterion("last_update_name is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameIsNotNull() {
            addCriterion("last_update_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameEqualTo(String value) {
            addCriterion("last_update_name =", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameNotEqualTo(String value) {
            addCriterion("last_update_name <>", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameGreaterThan(String value) {
            addCriterion("last_update_name >", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_name >=", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameLessThan(String value) {
            addCriterion("last_update_name <", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("last_update_name <=", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameLike(String value) {
            addCriterion("last_update_name like", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameNotLike(String value) {
            addCriterion("last_update_name not like", value, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameIn(List<String> values) {
            addCriterion("last_update_name in", values, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameNotIn(List<String> values) {
            addCriterion("last_update_name not in", values, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameBetween(String value1, String value2) {
            addCriterion("last_update_name between", value1, value2, "lastUpdateName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNameNotBetween(String value1, String value2) {
            addCriterion("last_update_name not between", value1, value2, "lastUpdateName");
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