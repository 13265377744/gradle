package gradle.master.entity.fourth;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItgProject implements Serializable {
    private Long id;

    private String companyCode;

    private String busiOrg;

    private String investor;

    private String investorCostCenter;

    private String wbsCode;

    private String projectCode;

    private String projectName;

    private BigDecimal buildBalance;

    private Date buildDate;

    private BigDecimal budget;

    private BigDecimal accumulatedInterest;

    private String interestPeriod;

    private BigDecimal interest;

    private Date lastUpdateDate;

    private Long lastUpdateBy;

    private Date createDate;

    private Long createBy;

    private String createName;

    private String lastUpdateName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getBusiOrg() {
        return busiOrg;
    }

    public void setBusiOrg(String busiOrg) {
        this.busiOrg = busiOrg == null ? null : busiOrg.trim();
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor == null ? null : investor.trim();
    }

    public String getInvestorCostCenter() {
        return investorCostCenter;
    }

    public void setInvestorCostCenter(String investorCostCenter) {
        this.investorCostCenter = investorCostCenter == null ? null : investorCostCenter.trim();
    }

    public String getWbsCode() {
        return wbsCode;
    }

    public void setWbsCode(String wbsCode) {
        this.wbsCode = wbsCode == null ? null : wbsCode.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public BigDecimal getBuildBalance() {
        return buildBalance;
    }

    public void setBuildBalance(BigDecimal buildBalance) {
        this.buildBalance = buildBalance;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public BigDecimal getAccumulatedInterest() {
        return accumulatedInterest;
    }

    public void setAccumulatedInterest(BigDecimal accumulatedInterest) {
        this.accumulatedInterest = accumulatedInterest;
    }

    public String getInterestPeriod() {
        return interestPeriod;
    }

    public void setInterestPeriod(String interestPeriod) {
        this.interestPeriod = interestPeriod == null ? null : interestPeriod.trim();
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public String getLastUpdateName() {
        return lastUpdateName;
    }

    public void setLastUpdateName(String lastUpdateName) {
        this.lastUpdateName = lastUpdateName == null ? null : lastUpdateName.trim();
    }
}