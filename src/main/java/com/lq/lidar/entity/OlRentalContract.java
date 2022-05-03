package com.lq.lidar.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 租赁合同
 * </p>
 *
 * @author LQ
 * @since 2022-04-19
 */
@TableName("ol_rental_contract")
public class OlRentalContract implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，没有业务含义，系统自动生成
     */
    @TableId("\"SEQNO\"")
    private String seqno;

    /**
     * 外部合同编号
     */
    @TableField("\"EXTERNAL_CONTRACT_NBR\"")
    private String externalContractNbr;

    /**
     * 项目名称
     */
    @TableField("\"PROJECT_NAME\"")
    private String projectName;

    /**
     * 下拉框;默认当前用户所在部门，可修改
     */
    @TableField("\"DEPARTMENT_CDE\"")
    private String departmentCde;

    /**
     * 根据所选的部门ID自动填入
     */
    @TableField("\"DEPARTMENT_NAME\"")
    private String departmentName;

    /**
     * 下拉框;根据发起部门显示对应中心的下拉框
     */
    @TableField("\"SECTION_ID\"")
    private String sectionId;

    /**
     * 根据所选的中心ID自动填入
     */
    @TableField("\"SECTION_NAME\"")
    private String sectionName;

    /**
     * 起租日期
     */
    @TableField("\"START_DATE\"")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime startDate;

    /**
     * 产品大类
     */
    @TableField("\"PRODUCT_CATEGORY\"")
    private String productCategory;

    @TableField("\"PRODUCT_CATEGORY_DESC\"")
    private String productCategoryDesc;

    /**
     * 产品子类下拉框;根据产品大类显示不同选项
     */
    @TableField("\"PRODUCT_SUB_CATEGORY\"")
    private String productSubCategory;

    @TableField("\"PRODUCT_SUB_CATEGORY_DESC\"")
    private String productSubCategoryDesc;

    /**
     * 主办客户经理ID
     */
    @TableField("\"MAIN_MANAGER_ID\"")
    private String mainManagerId;

    /**
     * 主办客户经理名称
     */
    @TableField("\"MAIN_MANAGER_NAME\"")
    private String mainManagerName;

    /**
     * 协办客户经理ID
     */
    @TableField("\"CO_MANAGER_ID\"")
    private String coManagerId;

    /**
     * 协办客户经理名称
     */
    @TableField("\"CO_MANAGER_NAME\"")
    private String coManagerName;

    /**
     * SPV下拉框
     * 出租人ID
     */
    @TableField("\"LEASER_ID\"")
    private String leaserId;

    /**
     * 出租人
     */
    @TableField("\"LEASER_NAME\"")
    private String leaserName;

    /**
     * F:境内/T:境外
     * 根据SPV确定合同是境内还是境外，境外交易不涉及增值税
     */
    @TableField("\"IS_OVERSEA\"")
    private String isOversea;

    /**
     * 承租人ID
     */
    @TableField("\"LESSEE_ID\"")
    private String lesseeId;

    /**
     * 承租人
     */
    @TableField("\"LESSEE_NAME\"")
    private String lesseeName;

    /**
     * 下拉框：
     * 自主选择租赁物	客户选择租赁物
     */
    @TableField("\"PROJECT_CATEGORY\"")
    private String projectCategory;

    /**
     * 租赁类型
     */
    @TableField("\"LEASE_CATEGORY\"")
    private String leaseCategory;

    /**
     */
    @TableField("\"INCOME_MTHD_CD\"")
    private String incomeMthdCd;

    /**
     */
    @TableField("\"IS_BUY_BACK\"")
    private String isBuyBack;

    /**
     * 合作伙伴查询框，资产大类是船舶时显示
     */
    @TableField("\"SHIP_BUILDER_ID\"")
    private String shipBuilderId;

    @TableField("\"SHIP_BUILDER_NAME\"")
    private String shipBuilderName;

    /**
     * 合作伙伴查询框，资产大类是船舶时显示
     */
    @TableField("\"SHIP_MANAGER_ID\"")
    private String shipManagerId;

    @TableField("\"SHIP_MANAGER_NAME\"")
    private String shipManagerName;

    @TableField("\"CONTRACT_SIGN_DATE\"")
    private LocalDateTime contractSignDate;

    @TableField("\"CONTRACT_DELIVERY_DATE\"")
    private LocalDateTime contractDeliveryDate;

    @TableField("\"ACT_DELIVERY_DATE\"")
    private LocalDateTime actDeliveryDate;

    /**
     * 退租日期
     */
    @TableField("\"CONTRACT_OVER_DATE\"")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime contractOverDate;

    @TableField("\"ACT_OVER_DATE\"")
    private LocalDateTime actOverDate;

    @TableField("\"EARLY_TERMINATION_DATE\"")
    private LocalDateTime earlyTerminationDate;

    @TableField("\"RENT_TERM\"")
    private BigDecimal rentTerm;

    /**
     * 下拉框：
     * 日/月/季/年
     */
    @TableField("\"RENT_TERM_MULT\"")
    private String rentTermMult;

    @TableField("\"MEMO\"")
    private String memo;

    @TableField("\"VER\"")
    private BigDecimal ver;

    @TableField("\"CREATOR_ID\"")
    private String creatorId;

    @TableField("\"CREATOR_NAME\"")
    private String creatorName;

    @TableField("\"LAST_UPDATE_TIME\"")
    private LocalDateTime lastUpdateTime;

    /**
     * 合同状态
     */
    @TableField("\"CONTRACT_STATUS\"")
    private String contractStatus;

    /**
     * 下拉框
     */
    @TableField("\"RENTAL_TAX_RATE\"")
    private String rentalTaxRate;

    /**
     * 费用税率
     */
    @TableField("\"FEE_RATE\"")
    private BigDecimal feeRate;

    @TableField("\"IS_EARLY_TERMINATION\"")
    private String isEarlyTermination;

    /**
     * 币种
     */
    @TableField("\"CURRENCY_CDE\"")
    private String currencyCde;

    /**
     * 罚息率
     */
    @TableField("\"PENALTY_INTEREST\"")
    private BigDecimal penaltyInterest;

    @TableField("\"PENALTY_GRACE_DAYS\"")
    private BigDecimal penaltyGraceDays;

    @TableField("\"TOTAL_RENT_AMT\"")
    private BigDecimal totalRentAmt;

    @TableField("\"TOTAL_SECURITY_DEPOSIT_AMT\"")
    private BigDecimal totalSecurityDepositAmt;

    @TableField("\"TOTAL_COMMISSION_AMT\"")
    private BigDecimal totalCommissionAmt;

    @TableField("\"RECVD_RENT_AMT\"")
    private BigDecimal recvdRentAmt;

    @TableField("\"RECVD_SECURITY_DEPOSIT_AMT\"")
    private BigDecimal recvdSecurityDepositAmt;

    @TableField("\"RECVD_COMMISSION_AMT\"")
    private BigDecimal recvdCommissionAmt;

    /**
     * 下拉框：我方支付/承租人支付
     */
    @TableField("\"TAX_PAYER\"")
    private String taxPayer;

    @TableField("\"MTHD_END\"")
    private String mthdEnd;

    /**
     * 其他当事方
     */
    @TableField("\"OTHER_RELA\"")
    private String otherRela;

    /**
     * 合同ID
     */
    @TableField("\"CONTRACT_ID\"")
    private String contractId;

    @TableField("\"SUPPLIER_ID\"")
    private String supplierId;

    @TableField("\"SUPPLIER_NAME\"")
    private String supplierName;

    @TableField("\"ACT_MANAGE_ID\"")
    private String actManageId;

    @TableField("\"ACT_MANAGE_NAME\"")
    private String actManageName;

    @TableField("\"IS_RENTAL_INCOME_WITH_TAX\"")
    private String isRentalIncomeWithTax;

    @TableField("\"CONTRACT_HOURS\"")
    private BigDecimal contractHours;

    @TableField("\"OVERTIME_AMT_HOUR\"")
    private BigDecimal overtimeAmtHour;

    @TableField("\"RECV_TERM_AMT\"")
    private BigDecimal recvTermAmt;

    @TableField("\"RECV_TERM\"")
    private BigDecimal recvTerm;

    @TableField("\"RECV_TERM_MULT\"")
    private String recvTermMult;

    @TableField("\"RECV_TOTAL_TERMS\"")
    private BigDecimal recvTotalTerms;

    @TableField("\"FIRST_RENT_DATE\"")
    private LocalDateTime firstRentDate;

    @TableField("\"VAT_TERM_AMT\"")
    private BigDecimal vatTermAmt;

    @TableField("\"VAT_TERM\"")
    private BigDecimal vatTerm;

    @TableField("\"VAT_TERM_MULT\"")
    private String vatTermMult;

    @TableField("\"VAT_TOTAL_TERMS\"")
    private BigDecimal vatTotalTerms;

    @TableField("\"FIRST_VAT_DATE\"")
    private LocalDateTime firstVatDate;

    @TableField("\"VAT_CURRENCY\"")
    private String vatCurrency;

    @TableField("\"ASSET_DESC\"")
    private String assetDesc;

    @TableField("\"RECV_ACCT_NO\"")
    private String recvAcctNo;

    @TableField("\"PAY_ACCT_NO\"")
    private String payAcctNo;

    @TableField("\"RENT_CALC_TYPE\"")
    private String rentCalcType;

    @TableField("\"RENT_CALC_ADJUST_DAYS\"")
    private BigDecimal rentCalcAdjustDays;

    @TableField("\"RENT_FLOAT_TYPE\"")
    private String rentFloatType;

    @TableField("\"FLOAT_BASE_AMT\"")
    private BigDecimal floatBaseAmt;

    @TableField("\"SPLIT_PROFIT_RENT_CALC_TYPE\"")
    private String splitProfitRentCalcType;

    @TableField("\"SPLIT_PROFIT_RECV_TERM\"")
    private BigDecimal splitProfitRecvTerm;

    @TableField("\"SPLIT_PROFIT_RECV_TERM_MULT\"")
    private String splitProfitRecvTermMult;

    @TableField("\"SPLIT_PROFIT_RECV_TOTAL_TERMS\"")
    private BigDecimal splitProfitRecvTotalTerms;

    @TableField("\"SPLIT_PROFIT_FIRST_RENT_DATE\"")
    private LocalDateTime splitProfitFirstRentDate;

    @TableField("\"RENT_INCOME_EQUAL_CURRENCY\"")
    private String rentIncomeEqualCurrency;

    @TableField("\"RENT_INCOME_EQUAL_RATE_TYPE\"")
    private String rentIncomeEqualRateType;

    @TableField("\"RENT_INCOME_EQUAL_ADJUST_DAYS\"")
    private BigDecimal rentIncomeEqualAdjustDays;

    /**
     * 是否代收代付增值税
     */
    @TableField("\"IS_COLLECT_VAT\"")
    private String isCollectVat;

    /**
     * 代收增值税计算方式
     */
    @TableField("\"COLLECT_VAT_CALC_TYPE\"")
    private String collectVatCalcType;

    /**
     * 增值税汇率类别
     */
    @TableField("\"VAT_EXCH_RATE_TYPE\"")
    private String vatExchRateType;

    /**
     * 出租人收款银行账户_增值税
     */
    @TableField("\"RECV_ACCT_NO_VAT\"")
    private String recvAcctNoVat;

    /**
     * 租金支付日类别 先付/后付
     */
    @TableField("\"RENT_PAY_STYLE\"")
    private String rentPayStyle;

    /**
     * 租金收入科目 应收租金/预收租金
     */
    @TableField("\"INCOME_SUBJECT\"")
    private String incomeSubject;

    /**
     * 结构化租赁类别        下拉框:无/法税结构
     */
    @TableField("\"STRUCTURED_TYPE\"")
    private String structuredType;

    /**
     * 结构化租赁出租SPV
     */
    @TableField("\"STRUCTURED_LEASER\"")
    private String structuredLeaser;

    /**
     * 结构化租赁出租人收款账户
     */
    @TableField("\"STRUCTURED_RECV_ACCT_NO\"")
    private String structuredRecvAcctNo;

    /**
     * 结构化租赁出租人付款账户
     */
    @TableField("\"STRUCTURED_PAY_ACCT_NO\"")
    private String structuredPayAcctNo;

    /**
     * 内部租金计算方式      下拉框:按原始租金比例/按固定金额
     */
    @TableField("\"STRUCTURED_RENT_CALC_TYPE\"")
    private String structuredRentCalcType;

    /**
     * 租金转移比例%
     */
    @TableField("\"STRUCTURED_PAY_PERCENT\"")
    private BigDecimal structuredPayPercent;

    /**
     * 租金转移金额
     */
    @TableField("\"STRUCTURED_PAY_AMT\"")
    private BigDecimal structuredPayAmt;

    /**
     * 转移租金过渡科目      下拉框:待核销/应付款项/租金收入
     */
    @TableField("\"STRUCTURED_TEMP_SUBJECT\"")
    private String structuredTempSubject;

    @TableField("\"IS_RENT_STAMP_TAX\"")
    private String isRentStampTax;

    /**
     * 租金比例浮动百分比
     */
    @TableField("\"RENT_FLOAT_PERCENT\"")
    private BigDecimal rentFloatPercent;

    @TableField("\"RENT_FLOAT_FIRST_TERM\"")
    private BigDecimal rentFloatFirstTerm;

    @TableField("\"RENT_FLOAT_INTERVAL_TERMS\"")
    private BigDecimal rentFloatIntervalTerms;

    /**
     * Assumed_Swap_Rate(%)
     */
    @TableField("\"ASSUMED_SWAP_RATE\"")
    private BigDecimal assumedSwapRate;

    @TableField("\"BASE_RATE_DEFINE\"")
    private String baseRateDefine;

    @TableField("\"BASE_RATE_TERM\"")
    private BigDecimal baseRateTerm;

    @TableField("\"BASE_RATE_TERM_MULT\"")
    private String baseRateTermMult;

    /**
     * 签约时基准利率(%)
     */
    @TableField("\"BASE_RATE\"")
    private BigDecimal baseRate;

    @TableField("\"BASE_RATE_ADJUST_TYPE\"")
    private String baseRateAdjustType;

    @TableField("\"BASE_RATE_ADJUST_DAYS\"")
    private BigDecimal baseRateAdjustDays;

    /**
     * Adjustment Factor
     */
    @TableField("\"ADJUSTMENT_FACTOR\"")
    private BigDecimal adjustmentFactor;

    @TableField("\"ADJUSTMENT_FACTOR_CALC_TYPE\"")
    private String adjustmentFactorCalcType;

    @TableField("\"ADJUSTMENT_FACTOR_FIRSTCHGTERM\"")
    private BigDecimal adjustmentFactorFirstchgterm;

    /**
     * Adjustment Factor变动比例(%)
     */
    @TableField("\"ADJUSTMENT_FACTOR_PERCENT\"")
    private BigDecimal adjustmentFactorPercent;

    @TableField("\"ADJUSTMENT_FACTOR_INTERVALTERM\"")
    private BigDecimal adjustmentFactorIntervalterm;

    @TableField("\"TCE_DEFINE\"")
    private String tceDefine;

    @TableField("\"TCE_TERM\"")
    private BigDecimal tceTerm;

    @TableField("\"TCE_TERM_MULT\"")
    private String tceTermMult;

    @TableField("\"TCE_ADJUST_TYPE\"")
    private String tceAdjustType;

    @TableField("\"TCE_ADJUST_DAYS\"")
    private BigDecimal tceAdjustDays;

    @TableField("\"TCE_VARIATION\"")
    private BigDecimal tceVariation;

    @TableField("\"SPLIT_BASE_AMT\"")
    private BigDecimal splitBaseAmt;

    /**
     * 第二主办客户经理ID
     */
    @TableField("\"MAIN_MANAGER_IDA\"")
    private String mainManagerIda;

    /**
     * 第二主办客户经理名字
     */
    @TableField("\"MAIN_MANAGER_NAMEA\"")
    private String mainManagerNamea;

    /**
     * 第三主办客户经理ID
     */
    @TableField("\"MAIN_MANAGER_IDB\"")
    private String mainManagerIdb;

    /**
     * 第三主办客户经理名字
     */
    @TableField("\"MAIN_MANAGER_NAMEB\"")
    private String mainManagerNameb;

    /**
     * 第二协办客户经理ID
     */
    @TableField("\"CO_MANAGER_IDA\"")
    private String coManagerIda;

    /**
     * 第二协办客户经理名字
     */
    @TableField("\"CO_MANAGER_NAMEA\"")
    private String coManagerNamea;

    /**
     * 第三协办客户经理ID
     */
    @TableField("\"CO_MANAGER_IDB\"")
    private String coManagerIdb;

    /**
     * 第三协办客户经理名字
     */
    @TableField("\"CO_MANAGER_NAMEB\"")
    private String coManagerNameb;

    @TableField("\"TERM_INCOME_DESC\"")
    private String termIncomeDesc;

    /**
     * 保底租金计算方式
     */
    @TableField("\"BASE_RENT_CALC_TYPE\"")
    private String baseRentCalcType;

    /**
     * 保底租金变动指数
     */
    @TableField("\"BASE_RENT_RATE_DEFINE\"")
    private String baseRentRateDefine;

    /**
     * 保底租金变动指数期限
     */
    @TableField("\"BASE_RENT_RATE_TERM\"")
    private BigDecimal baseRentRateTerm;

    /**
     * 保底租金变动指数期限单位
     */
    @TableField("\"BASE_RENT_RATE_TERM_MULT\"")
    private String baseRentRateTermMult;

    /**
     * 保底租金第一期起算日(含)
     */
    @TableField("\"BASE_RENT_FIRST_DATE\"")
    private LocalDateTime baseRentFirstDate;

    /**
     * 保底租金第二期起算日(含)
     */
    @TableField("\"BASE_RENT_SEC_DATE\"")
    private LocalDateTime baseRentSecDate;

    /**
     * 分成租金第一期起算日(含)
     */
    @TableField("\"SPLIT_PROFIT_RENT_FIRST_DATE\"")
    private LocalDateTime splitProfitRentFirstDate;

    /**
     * 分成租金第二期起算日(含)
     */
    @TableField("\"SPLIT_PROFIT_RENT_SEC_DATE\"")
    private LocalDateTime splitProfitRentSecDate;

    /**
     * 保底租金估算每期租金
     */
    @TableField("\"ESTIMATE_BASE_TERM_AMT\"")
    private BigDecimal estimateBaseTermAmt;

    /**
     * 分成租金估算每期租金
     */
    @TableField("\"ESTIMATE_SPLIT_TERM_AMT\"")
    private BigDecimal estimateSplitTermAmt;

    /**
     * 保底租金第二次收租日
     */
    @TableField("\"SEC_RENT_DATE\"")
    private LocalDateTime secRentDate;

    /**
     * 分成租金第二次收租日
     */
    @TableField("\"SPLIT_PROFIT_SEC_RENT_DATE\"")
    private LocalDateTime splitProfitSecRentDate;

    @TableField("\"FLOAT_INDEX_SUBTRACTOR\"")
    private BigDecimal floatIndexSubtractor;

    @TableField("\"FLOAT_INDEX_FIRST_DATE\"")
    private LocalDateTime floatIndexFirstDate;

    @TableField("\"FLOAT_INDEX_SEC_DATE\"")
    private LocalDateTime floatIndexSecDate;

    @TableField("\"FLOAT_RENT_RATE_TERM\"")
    private BigDecimal floatRentRateTerm;

    @TableField("\"FLOAT_RENT_RATE_TERM_MULT\"")
    private String floatRentRateTermMult;

    @TableField("\"RISK_CONTRACT_NBR\"")
    private String riskContractNbr;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getExternalContractNbr() {
        return externalContractNbr;
    }

    public void setExternalContractNbr(String externalContractNbr) {
        this.externalContractNbr = externalContractNbr;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDepartmentCde() {
        return departmentCde;
    }

    public void setDepartmentCde(String departmentCde) {
        this.departmentCde = departmentCde;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductCategoryDesc() {
        return productCategoryDesc;
    }

    public void setProductCategoryDesc(String productCategoryDesc) {
        this.productCategoryDesc = productCategoryDesc;
    }

    public String getProductSubCategory() {
        return productSubCategory;
    }

    public void setProductSubCategory(String productSubCategory) {
        this.productSubCategory = productSubCategory;
    }

    public String getProductSubCategoryDesc() {
        return productSubCategoryDesc;
    }

    public void setProductSubCategoryDesc(String productSubCategoryDesc) {
        this.productSubCategoryDesc = productSubCategoryDesc;
    }

    public String getMainManagerId() {
        return mainManagerId;
    }

    public void setMainManagerId(String mainManagerId) {
        this.mainManagerId = mainManagerId;
    }

    public String getMainManagerName() {
        return mainManagerName;
    }

    public void setMainManagerName(String mainManagerName) {
        this.mainManagerName = mainManagerName;
    }

    public String getCoManagerId() {
        return coManagerId;
    }

    public void setCoManagerId(String coManagerId) {
        this.coManagerId = coManagerId;
    }

    public String getCoManagerName() {
        return coManagerName;
    }

    public void setCoManagerName(String coManagerName) {
        this.coManagerName = coManagerName;
    }

    public String getLeaserId() {
        return leaserId;
    }

    public void setLeaserId(String leaserId) {
        this.leaserId = leaserId;
    }

    public String getLeaserName() {
        return leaserName;
    }

    public void setLeaserName(String leaserName) {
        this.leaserName = leaserName;
    }

    public String getIsOversea() {
        return isOversea;
    }

    public void setIsOversea(String isOversea) {
        this.isOversea = isOversea;
    }

    public String getLesseeId() {
        return lesseeId;
    }

    public void setLesseeId(String lesseeId) {
        this.lesseeId = lesseeId;
    }

    public String getLesseeName() {
        return lesseeName;
    }

    public void setLesseeName(String lesseeName) {
        this.lesseeName = lesseeName;
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    public String getLeaseCategory() {
        return leaseCategory;
    }

    public void setLeaseCategory(String leaseCategory) {
        this.leaseCategory = leaseCategory;
    }

    public String getIncomeMthdCd() {
        return incomeMthdCd;
    }

    public void setIncomeMthdCd(String incomeMthdCd) {
        this.incomeMthdCd = incomeMthdCd;
    }

    public String getIsBuyBack() {
        return isBuyBack;
    }

    public void setIsBuyBack(String isBuyBack) {
        this.isBuyBack = isBuyBack;
    }

    public String getShipBuilderId() {
        return shipBuilderId;
    }

    public void setShipBuilderId(String shipBuilderId) {
        this.shipBuilderId = shipBuilderId;
    }

    public String getShipBuilderName() {
        return shipBuilderName;
    }

    public void setShipBuilderName(String shipBuilderName) {
        this.shipBuilderName = shipBuilderName;
    }

    public String getShipManagerId() {
        return shipManagerId;
    }

    public void setShipManagerId(String shipManagerId) {
        this.shipManagerId = shipManagerId;
    }

    public String getShipManagerName() {
        return shipManagerName;
    }

    public void setShipManagerName(String shipManagerName) {
        this.shipManagerName = shipManagerName;
    }

    public LocalDateTime getContractSignDate() {
        return contractSignDate;
    }

    public void setContractSignDate(LocalDateTime contractSignDate) {
        this.contractSignDate = contractSignDate;
    }

    public LocalDateTime getContractDeliveryDate() {
        return contractDeliveryDate;
    }

    public void setContractDeliveryDate(LocalDateTime contractDeliveryDate) {
        this.contractDeliveryDate = contractDeliveryDate;
    }

    public LocalDateTime getActDeliveryDate() {
        return actDeliveryDate;
    }

    public void setActDeliveryDate(LocalDateTime actDeliveryDate) {
        this.actDeliveryDate = actDeliveryDate;
    }

    public LocalDateTime getContractOverDate() {
        return contractOverDate;
    }

    public void setContractOverDate(LocalDateTime contractOverDate) {
        this.contractOverDate = contractOverDate;
    }

    public LocalDateTime getActOverDate() {
        return actOverDate;
    }

    public void setActOverDate(LocalDateTime actOverDate) {
        this.actOverDate = actOverDate;
    }

    public LocalDateTime getEarlyTerminationDate() {
        return earlyTerminationDate;
    }

    public void setEarlyTerminationDate(LocalDateTime earlyTerminationDate) {
        this.earlyTerminationDate = earlyTerminationDate;
    }

    public BigDecimal getRentTerm() {
        return rentTerm;
    }

    public void setRentTerm(BigDecimal rentTerm) {
        this.rentTerm = rentTerm;
    }

    public String getRentTermMult() {
        return rentTermMult;
    }

    public void setRentTermMult(String rentTermMult) {
        this.rentTermMult = rentTermMult;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getVer() {
        return ver;
    }

    public void setVer(BigDecimal ver) {
        this.ver = ver;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getRentalTaxRate() {
        return rentalTaxRate;
    }

    public void setRentalTaxRate(String rentalTaxRate) {
        this.rentalTaxRate = rentalTaxRate;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getIsEarlyTermination() {
        return isEarlyTermination;
    }

    public void setIsEarlyTermination(String isEarlyTermination) {
        this.isEarlyTermination = isEarlyTermination;
    }

    public String getCurrencyCde() {
        return currencyCde;
    }

    public void setCurrencyCde(String currencyCde) {
        this.currencyCde = currencyCde;
    }

    public BigDecimal getPenaltyInterest() {
        return penaltyInterest;
    }

    public void setPenaltyInterest(BigDecimal penaltyInterest) {
        this.penaltyInterest = penaltyInterest;
    }

    public BigDecimal getPenaltyGraceDays() {
        return penaltyGraceDays;
    }

    public void setPenaltyGraceDays(BigDecimal penaltyGraceDays) {
        this.penaltyGraceDays = penaltyGraceDays;
    }

    public BigDecimal getTotalRentAmt() {
        return totalRentAmt;
    }

    public void setTotalRentAmt(BigDecimal totalRentAmt) {
        this.totalRentAmt = totalRentAmt;
    }

    public BigDecimal getTotalSecurityDepositAmt() {
        return totalSecurityDepositAmt;
    }

    public void setTotalSecurityDepositAmt(BigDecimal totalSecurityDepositAmt) {
        this.totalSecurityDepositAmt = totalSecurityDepositAmt;
    }

    public BigDecimal getTotalCommissionAmt() {
        return totalCommissionAmt;
    }

    public void setTotalCommissionAmt(BigDecimal totalCommissionAmt) {
        this.totalCommissionAmt = totalCommissionAmt;
    }

    public BigDecimal getRecvdRentAmt() {
        return recvdRentAmt;
    }

    public void setRecvdRentAmt(BigDecimal recvdRentAmt) {
        this.recvdRentAmt = recvdRentAmt;
    }

    public BigDecimal getRecvdSecurityDepositAmt() {
        return recvdSecurityDepositAmt;
    }

    public void setRecvdSecurityDepositAmt(BigDecimal recvdSecurityDepositAmt) {
        this.recvdSecurityDepositAmt = recvdSecurityDepositAmt;
    }

    public BigDecimal getRecvdCommissionAmt() {
        return recvdCommissionAmt;
    }

    public void setRecvdCommissionAmt(BigDecimal recvdCommissionAmt) {
        this.recvdCommissionAmt = recvdCommissionAmt;
    }

    public String getTaxPayer() {
        return taxPayer;
    }

    public void setTaxPayer(String taxPayer) {
        this.taxPayer = taxPayer;
    }

    public String getMthdEnd() {
        return mthdEnd;
    }

    public void setMthdEnd(String mthdEnd) {
        this.mthdEnd = mthdEnd;
    }

    public String getOtherRela() {
        return otherRela;
    }

    public void setOtherRela(String otherRela) {
        this.otherRela = otherRela;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getActManageId() {
        return actManageId;
    }

    public void setActManageId(String actManageId) {
        this.actManageId = actManageId;
    }

    public String getActManageName() {
        return actManageName;
    }

    public void setActManageName(String actManageName) {
        this.actManageName = actManageName;
    }

    public String getIsRentalIncomeWithTax() {
        return isRentalIncomeWithTax;
    }

    public void setIsRentalIncomeWithTax(String isRentalIncomeWithTax) {
        this.isRentalIncomeWithTax = isRentalIncomeWithTax;
    }

    public BigDecimal getContractHours() {
        return contractHours;
    }

    public void setContractHours(BigDecimal contractHours) {
        this.contractHours = contractHours;
    }

    public BigDecimal getOvertimeAmtHour() {
        return overtimeAmtHour;
    }

    public void setOvertimeAmtHour(BigDecimal overtimeAmtHour) {
        this.overtimeAmtHour = overtimeAmtHour;
    }

    public BigDecimal getRecvTermAmt() {
        return recvTermAmt;
    }

    public void setRecvTermAmt(BigDecimal recvTermAmt) {
        this.recvTermAmt = recvTermAmt;
    }

    public BigDecimal getRecvTerm() {
        return recvTerm;
    }

    public void setRecvTerm(BigDecimal recvTerm) {
        this.recvTerm = recvTerm;
    }

    public String getRecvTermMult() {
        return recvTermMult;
    }

    public void setRecvTermMult(String recvTermMult) {
        this.recvTermMult = recvTermMult;
    }

    public BigDecimal getRecvTotalTerms() {
        return recvTotalTerms;
    }

    public void setRecvTotalTerms(BigDecimal recvTotalTerms) {
        this.recvTotalTerms = recvTotalTerms;
    }

    public LocalDateTime getFirstRentDate() {
        return firstRentDate;
    }

    public void setFirstRentDate(LocalDateTime firstRentDate) {
        this.firstRentDate = firstRentDate;
    }

    public BigDecimal getVatTermAmt() {
        return vatTermAmt;
    }

    public void setVatTermAmt(BigDecimal vatTermAmt) {
        this.vatTermAmt = vatTermAmt;
    }

    public BigDecimal getVatTerm() {
        return vatTerm;
    }

    public void setVatTerm(BigDecimal vatTerm) {
        this.vatTerm = vatTerm;
    }

    public String getVatTermMult() {
        return vatTermMult;
    }

    public void setVatTermMult(String vatTermMult) {
        this.vatTermMult = vatTermMult;
    }

    public BigDecimal getVatTotalTerms() {
        return vatTotalTerms;
    }

    public void setVatTotalTerms(BigDecimal vatTotalTerms) {
        this.vatTotalTerms = vatTotalTerms;
    }

    public LocalDateTime getFirstVatDate() {
        return firstVatDate;
    }

    public void setFirstVatDate(LocalDateTime firstVatDate) {
        this.firstVatDate = firstVatDate;
    }

    public String getVatCurrency() {
        return vatCurrency;
    }

    public void setVatCurrency(String vatCurrency) {
        this.vatCurrency = vatCurrency;
    }

    public String getAssetDesc() {
        return assetDesc;
    }

    public void setAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
    }

    public String getRecvAcctNo() {
        return recvAcctNo;
    }

    public void setRecvAcctNo(String recvAcctNo) {
        this.recvAcctNo = recvAcctNo;
    }

    public String getPayAcctNo() {
        return payAcctNo;
    }

    public void setPayAcctNo(String payAcctNo) {
        this.payAcctNo = payAcctNo;
    }

    public String getRentCalcType() {
        return rentCalcType;
    }

    public void setRentCalcType(String rentCalcType) {
        this.rentCalcType = rentCalcType;
    }

    public BigDecimal getRentCalcAdjustDays() {
        return rentCalcAdjustDays;
    }

    public void setRentCalcAdjustDays(BigDecimal rentCalcAdjustDays) {
        this.rentCalcAdjustDays = rentCalcAdjustDays;
    }

    public String getRentFloatType() {
        return rentFloatType;
    }

    public void setRentFloatType(String rentFloatType) {
        this.rentFloatType = rentFloatType;
    }

    public BigDecimal getFloatBaseAmt() {
        return floatBaseAmt;
    }

    public void setFloatBaseAmt(BigDecimal floatBaseAmt) {
        this.floatBaseAmt = floatBaseAmt;
    }

    public String getSplitProfitRentCalcType() {
        return splitProfitRentCalcType;
    }

    public void setSplitProfitRentCalcType(String splitProfitRentCalcType) {
        this.splitProfitRentCalcType = splitProfitRentCalcType;
    }

    public BigDecimal getSplitProfitRecvTerm() {
        return splitProfitRecvTerm;
    }

    public void setSplitProfitRecvTerm(BigDecimal splitProfitRecvTerm) {
        this.splitProfitRecvTerm = splitProfitRecvTerm;
    }

    public String getSplitProfitRecvTermMult() {
        return splitProfitRecvTermMult;
    }

    public void setSplitProfitRecvTermMult(String splitProfitRecvTermMult) {
        this.splitProfitRecvTermMult = splitProfitRecvTermMult;
    }

    public BigDecimal getSplitProfitRecvTotalTerms() {
        return splitProfitRecvTotalTerms;
    }

    public void setSplitProfitRecvTotalTerms(BigDecimal splitProfitRecvTotalTerms) {
        this.splitProfitRecvTotalTerms = splitProfitRecvTotalTerms;
    }

    public LocalDateTime getSplitProfitFirstRentDate() {
        return splitProfitFirstRentDate;
    }

    public void setSplitProfitFirstRentDate(LocalDateTime splitProfitFirstRentDate) {
        this.splitProfitFirstRentDate = splitProfitFirstRentDate;
    }

    public String getRentIncomeEqualCurrency() {
        return rentIncomeEqualCurrency;
    }

    public void setRentIncomeEqualCurrency(String rentIncomeEqualCurrency) {
        this.rentIncomeEqualCurrency = rentIncomeEqualCurrency;
    }

    public String getRentIncomeEqualRateType() {
        return rentIncomeEqualRateType;
    }

    public void setRentIncomeEqualRateType(String rentIncomeEqualRateType) {
        this.rentIncomeEqualRateType = rentIncomeEqualRateType;
    }

    public BigDecimal getRentIncomeEqualAdjustDays() {
        return rentIncomeEqualAdjustDays;
    }

    public void setRentIncomeEqualAdjustDays(BigDecimal rentIncomeEqualAdjustDays) {
        this.rentIncomeEqualAdjustDays = rentIncomeEqualAdjustDays;
    }

    public String getIsCollectVat() {
        return isCollectVat;
    }

    public void setIsCollectVat(String isCollectVat) {
        this.isCollectVat = isCollectVat;
    }

    public String getCollectVatCalcType() {
        return collectVatCalcType;
    }

    public void setCollectVatCalcType(String collectVatCalcType) {
        this.collectVatCalcType = collectVatCalcType;
    }

    public String getVatExchRateType() {
        return vatExchRateType;
    }

    public void setVatExchRateType(String vatExchRateType) {
        this.vatExchRateType = vatExchRateType;
    }

    public String getRecvAcctNoVat() {
        return recvAcctNoVat;
    }

    public void setRecvAcctNoVat(String recvAcctNoVat) {
        this.recvAcctNoVat = recvAcctNoVat;
    }

    public String getRentPayStyle() {
        return rentPayStyle;
    }

    public void setRentPayStyle(String rentPayStyle) {
        this.rentPayStyle = rentPayStyle;
    }

    public String getIncomeSubject() {
        return incomeSubject;
    }

    public void setIncomeSubject(String incomeSubject) {
        this.incomeSubject = incomeSubject;
    }

    public String getStructuredType() {
        return structuredType;
    }

    public void setStructuredType(String structuredType) {
        this.structuredType = structuredType;
    }

    public String getStructuredLeaser() {
        return structuredLeaser;
    }

    public void setStructuredLeaser(String structuredLeaser) {
        this.structuredLeaser = structuredLeaser;
    }

    public String getStructuredRecvAcctNo() {
        return structuredRecvAcctNo;
    }

    public void setStructuredRecvAcctNo(String structuredRecvAcctNo) {
        this.structuredRecvAcctNo = structuredRecvAcctNo;
    }

    public String getStructuredPayAcctNo() {
        return structuredPayAcctNo;
    }

    public void setStructuredPayAcctNo(String structuredPayAcctNo) {
        this.structuredPayAcctNo = structuredPayAcctNo;
    }

    public String getStructuredRentCalcType() {
        return structuredRentCalcType;
    }

    public void setStructuredRentCalcType(String structuredRentCalcType) {
        this.structuredRentCalcType = structuredRentCalcType;
    }

    public BigDecimal getStructuredPayPercent() {
        return structuredPayPercent;
    }

    public void setStructuredPayPercent(BigDecimal structuredPayPercent) {
        this.structuredPayPercent = structuredPayPercent;
    }

    public BigDecimal getStructuredPayAmt() {
        return structuredPayAmt;
    }

    public void setStructuredPayAmt(BigDecimal structuredPayAmt) {
        this.structuredPayAmt = structuredPayAmt;
    }

    public String getStructuredTempSubject() {
        return structuredTempSubject;
    }

    public void setStructuredTempSubject(String structuredTempSubject) {
        this.structuredTempSubject = structuredTempSubject;
    }

    public String getIsRentStampTax() {
        return isRentStampTax;
    }

    public void setIsRentStampTax(String isRentStampTax) {
        this.isRentStampTax = isRentStampTax;
    }

    public BigDecimal getRentFloatPercent() {
        return rentFloatPercent;
    }

    public void setRentFloatPercent(BigDecimal rentFloatPercent) {
        this.rentFloatPercent = rentFloatPercent;
    }

    public BigDecimal getRentFloatFirstTerm() {
        return rentFloatFirstTerm;
    }

    public void setRentFloatFirstTerm(BigDecimal rentFloatFirstTerm) {
        this.rentFloatFirstTerm = rentFloatFirstTerm;
    }

    public BigDecimal getRentFloatIntervalTerms() {
        return rentFloatIntervalTerms;
    }

    public void setRentFloatIntervalTerms(BigDecimal rentFloatIntervalTerms) {
        this.rentFloatIntervalTerms = rentFloatIntervalTerms;
    }

    public BigDecimal getAssumedSwapRate() {
        return assumedSwapRate;
    }

    public void setAssumedSwapRate(BigDecimal assumedSwapRate) {
        this.assumedSwapRate = assumedSwapRate;
    }

    public String getBaseRateDefine() {
        return baseRateDefine;
    }

    public void setBaseRateDefine(String baseRateDefine) {
        this.baseRateDefine = baseRateDefine;
    }

    public BigDecimal getBaseRateTerm() {
        return baseRateTerm;
    }

    public void setBaseRateTerm(BigDecimal baseRateTerm) {
        this.baseRateTerm = baseRateTerm;
    }

    public String getBaseRateTermMult() {
        return baseRateTermMult;
    }

    public void setBaseRateTermMult(String baseRateTermMult) {
        this.baseRateTermMult = baseRateTermMult;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public String getBaseRateAdjustType() {
        return baseRateAdjustType;
    }

    public void setBaseRateAdjustType(String baseRateAdjustType) {
        this.baseRateAdjustType = baseRateAdjustType;
    }

    public BigDecimal getBaseRateAdjustDays() {
        return baseRateAdjustDays;
    }

    public void setBaseRateAdjustDays(BigDecimal baseRateAdjustDays) {
        this.baseRateAdjustDays = baseRateAdjustDays;
    }

    public BigDecimal getAdjustmentFactor() {
        return adjustmentFactor;
    }

    public void setAdjustmentFactor(BigDecimal adjustmentFactor) {
        this.adjustmentFactor = adjustmentFactor;
    }

    public String getAdjustmentFactorCalcType() {
        return adjustmentFactorCalcType;
    }

    public void setAdjustmentFactorCalcType(String adjustmentFactorCalcType) {
        this.adjustmentFactorCalcType = adjustmentFactorCalcType;
    }

    public BigDecimal getAdjustmentFactorFirstchgterm() {
        return adjustmentFactorFirstchgterm;
    }

    public void setAdjustmentFactorFirstchgterm(BigDecimal adjustmentFactorFirstchgterm) {
        this.adjustmentFactorFirstchgterm = adjustmentFactorFirstchgterm;
    }

    public BigDecimal getAdjustmentFactorPercent() {
        return adjustmentFactorPercent;
    }

    public void setAdjustmentFactorPercent(BigDecimal adjustmentFactorPercent) {
        this.adjustmentFactorPercent = adjustmentFactorPercent;
    }

    public BigDecimal getAdjustmentFactorIntervalterm() {
        return adjustmentFactorIntervalterm;
    }

    public void setAdjustmentFactorIntervalterm(BigDecimal adjustmentFactorIntervalterm) {
        this.adjustmentFactorIntervalterm = adjustmentFactorIntervalterm;
    }

    public String getTceDefine() {
        return tceDefine;
    }

    public void setTceDefine(String tceDefine) {
        this.tceDefine = tceDefine;
    }

    public BigDecimal getTceTerm() {
        return tceTerm;
    }

    public void setTceTerm(BigDecimal tceTerm) {
        this.tceTerm = tceTerm;
    }

    public String getTceTermMult() {
        return tceTermMult;
    }

    public void setTceTermMult(String tceTermMult) {
        this.tceTermMult = tceTermMult;
    }

    public String getTceAdjustType() {
        return tceAdjustType;
    }

    public void setTceAdjustType(String tceAdjustType) {
        this.tceAdjustType = tceAdjustType;
    }

    public BigDecimal getTceAdjustDays() {
        return tceAdjustDays;
    }

    public void setTceAdjustDays(BigDecimal tceAdjustDays) {
        this.tceAdjustDays = tceAdjustDays;
    }

    public BigDecimal getTceVariation() {
        return tceVariation;
    }

    public void setTceVariation(BigDecimal tceVariation) {
        this.tceVariation = tceVariation;
    }

    public BigDecimal getSplitBaseAmt() {
        return splitBaseAmt;
    }

    public void setSplitBaseAmt(BigDecimal splitBaseAmt) {
        this.splitBaseAmt = splitBaseAmt;
    }

    public String getMainManagerIda() {
        return mainManagerIda;
    }

    public void setMainManagerIda(String mainManagerIda) {
        this.mainManagerIda = mainManagerIda;
    }

    public String getMainManagerNamea() {
        return mainManagerNamea;
    }

    public void setMainManagerNamea(String mainManagerNamea) {
        this.mainManagerNamea = mainManagerNamea;
    }

    public String getMainManagerIdb() {
        return mainManagerIdb;
    }

    public void setMainManagerIdb(String mainManagerIdb) {
        this.mainManagerIdb = mainManagerIdb;
    }

    public String getMainManagerNameb() {
        return mainManagerNameb;
    }

    public void setMainManagerNameb(String mainManagerNameb) {
        this.mainManagerNameb = mainManagerNameb;
    }

    public String getCoManagerIda() {
        return coManagerIda;
    }

    public void setCoManagerIda(String coManagerIda) {
        this.coManagerIda = coManagerIda;
    }

    public String getCoManagerNamea() {
        return coManagerNamea;
    }

    public void setCoManagerNamea(String coManagerNamea) {
        this.coManagerNamea = coManagerNamea;
    }

    public String getCoManagerIdb() {
        return coManagerIdb;
    }

    public void setCoManagerIdb(String coManagerIdb) {
        this.coManagerIdb = coManagerIdb;
    }

    public String getCoManagerNameb() {
        return coManagerNameb;
    }

    public void setCoManagerNameb(String coManagerNameb) {
        this.coManagerNameb = coManagerNameb;
    }

    public String getTermIncomeDesc() {
        return termIncomeDesc;
    }

    public void setTermIncomeDesc(String termIncomeDesc) {
        this.termIncomeDesc = termIncomeDesc;
    }

    public String getBaseRentCalcType() {
        return baseRentCalcType;
    }

    public void setBaseRentCalcType(String baseRentCalcType) {
        this.baseRentCalcType = baseRentCalcType;
    }

    public String getBaseRentRateDefine() {
        return baseRentRateDefine;
    }

    public void setBaseRentRateDefine(String baseRentRateDefine) {
        this.baseRentRateDefine = baseRentRateDefine;
    }

    public BigDecimal getBaseRentRateTerm() {
        return baseRentRateTerm;
    }

    public void setBaseRentRateTerm(BigDecimal baseRentRateTerm) {
        this.baseRentRateTerm = baseRentRateTerm;
    }

    public String getBaseRentRateTermMult() {
        return baseRentRateTermMult;
    }

    public void setBaseRentRateTermMult(String baseRentRateTermMult) {
        this.baseRentRateTermMult = baseRentRateTermMult;
    }

    public LocalDateTime getBaseRentFirstDate() {
        return baseRentFirstDate;
    }

    public void setBaseRentFirstDate(LocalDateTime baseRentFirstDate) {
        this.baseRentFirstDate = baseRentFirstDate;
    }

    public LocalDateTime getBaseRentSecDate() {
        return baseRentSecDate;
    }

    public void setBaseRentSecDate(LocalDateTime baseRentSecDate) {
        this.baseRentSecDate = baseRentSecDate;
    }

    public LocalDateTime getSplitProfitRentFirstDate() {
        return splitProfitRentFirstDate;
    }

    public void setSplitProfitRentFirstDate(LocalDateTime splitProfitRentFirstDate) {
        this.splitProfitRentFirstDate = splitProfitRentFirstDate;
    }

    public LocalDateTime getSplitProfitRentSecDate() {
        return splitProfitRentSecDate;
    }

    public void setSplitProfitRentSecDate(LocalDateTime splitProfitRentSecDate) {
        this.splitProfitRentSecDate = splitProfitRentSecDate;
    }

    public BigDecimal getEstimateBaseTermAmt() {
        return estimateBaseTermAmt;
    }

    public void setEstimateBaseTermAmt(BigDecimal estimateBaseTermAmt) {
        this.estimateBaseTermAmt = estimateBaseTermAmt;
    }

    public BigDecimal getEstimateSplitTermAmt() {
        return estimateSplitTermAmt;
    }

    public void setEstimateSplitTermAmt(BigDecimal estimateSplitTermAmt) {
        this.estimateSplitTermAmt = estimateSplitTermAmt;
    }

    public LocalDateTime getSecRentDate() {
        return secRentDate;
    }

    public void setSecRentDate(LocalDateTime secRentDate) {
        this.secRentDate = secRentDate;
    }

    public LocalDateTime getSplitProfitSecRentDate() {
        return splitProfitSecRentDate;
    }

    public void setSplitProfitSecRentDate(LocalDateTime splitProfitSecRentDate) {
        this.splitProfitSecRentDate = splitProfitSecRentDate;
    }

    public BigDecimal getFloatIndexSubtractor() {
        return floatIndexSubtractor;
    }

    public void setFloatIndexSubtractor(BigDecimal floatIndexSubtractor) {
        this.floatIndexSubtractor = floatIndexSubtractor;
    }

    public LocalDateTime getFloatIndexFirstDate() {
        return floatIndexFirstDate;
    }

    public void setFloatIndexFirstDate(LocalDateTime floatIndexFirstDate) {
        this.floatIndexFirstDate = floatIndexFirstDate;
    }

    public LocalDateTime getFloatIndexSecDate() {
        return floatIndexSecDate;
    }

    public void setFloatIndexSecDate(LocalDateTime floatIndexSecDate) {
        this.floatIndexSecDate = floatIndexSecDate;
    }

    public BigDecimal getFloatRentRateTerm() {
        return floatRentRateTerm;
    }

    public void setFloatRentRateTerm(BigDecimal floatRentRateTerm) {
        this.floatRentRateTerm = floatRentRateTerm;
    }

    public String getFloatRentRateTermMult() {
        return floatRentRateTermMult;
    }

    public void setFloatRentRateTermMult(String floatRentRateTermMult) {
        this.floatRentRateTermMult = floatRentRateTermMult;
    }

    public String getRiskContractNbr() {
        return riskContractNbr;
    }

    public void setRiskContractNbr(String riskContractNbr) {
        this.riskContractNbr = riskContractNbr;
    }

    @Override
    public String toString() {
        return "OlRentalContract{" + "seqno=" + seqno + ", externalContractNbr=" + externalContractNbr + ", projectName=" + projectName + ", departmentCde=" + departmentCde + ", departmentName=" + departmentName + ", sectionId=" + sectionId + ", sectionName=" + sectionName + ", startDate=" + startDate + ", productCategory=" + productCategory + ", productCategoryDesc=" + productCategoryDesc + ", productSubCategory=" + productSubCategory + ", productSubCategoryDesc=" + productSubCategoryDesc + ", mainManagerId=" + mainManagerId + ", mainManagerName=" + mainManagerName + ", coManagerId=" + coManagerId + ", coManagerName=" + coManagerName + ", leaserId=" + leaserId + ", leaserName=" + leaserName + ", isOversea=" + isOversea + ", lesseeId=" + lesseeId + ", lesseeName=" + lesseeName + ", projectCategory=" + projectCategory + ", leaseCategory=" + leaseCategory + ", incomeMthdCd=" + incomeMthdCd + ", isBuyBack=" + isBuyBack + ", shipBuilderId=" + shipBuilderId + ", shipBuilderName=" + shipBuilderName + ", shipManagerId=" + shipManagerId + ", shipManagerName=" + shipManagerName + ", contractSignDate=" + contractSignDate + ", contractDeliveryDate=" + contractDeliveryDate + ", actDeliveryDate=" + actDeliveryDate + ", contractOverDate=" + contractOverDate + ", actOverDate=" + actOverDate + ", earlyTerminationDate=" + earlyTerminationDate + ", rentTerm=" + rentTerm + ", rentTermMult=" + rentTermMult + ", memo=" + memo + ", ver=" + ver + ", creatorId=" + creatorId + ", creatorName=" + creatorName + ", lastUpdateTime=" + lastUpdateTime + ", contractStatus=" + contractStatus + ", rentalTaxRate=" + rentalTaxRate + ", feeRate=" + feeRate + ", isEarlyTermination=" + isEarlyTermination + ", currencyCde=" + currencyCde + ", penaltyInterest=" + penaltyInterest + ", penaltyGraceDays=" + penaltyGraceDays + ", totalRentAmt=" + totalRentAmt + ", totalSecurityDepositAmt=" + totalSecurityDepositAmt + ", totalCommissionAmt=" + totalCommissionAmt + ", recvdRentAmt=" + recvdRentAmt + ", recvdSecurityDepositAmt=" + recvdSecurityDepositAmt + ", recvdCommissionAmt=" + recvdCommissionAmt + ", taxPayer=" + taxPayer + ", mthdEnd=" + mthdEnd + ", otherRela=" + otherRela + ", contractId=" + contractId + ", supplierId=" + supplierId + ", supplierName=" + supplierName + ", actManageId=" + actManageId + ", actManageName=" + actManageName + ", isRentalIncomeWithTax=" + isRentalIncomeWithTax + ", contractHours=" + contractHours + ", overtimeAmtHour=" + overtimeAmtHour + ", recvTermAmt=" + recvTermAmt + ", recvTerm=" + recvTerm + ", recvTermMult=" + recvTermMult + ", recvTotalTerms=" + recvTotalTerms + ", firstRentDate=" + firstRentDate + ", vatTermAmt=" + vatTermAmt + ", vatTerm=" + vatTerm + ", vatTermMult=" + vatTermMult + ", vatTotalTerms=" + vatTotalTerms + ", firstVatDate=" + firstVatDate + ", vatCurrency=" + vatCurrency + ", assetDesc=" + assetDesc + ", recvAcctNo=" + recvAcctNo + ", payAcctNo=" + payAcctNo + ", rentCalcType=" + rentCalcType + ", rentCalcAdjustDays=" + rentCalcAdjustDays + ", rentFloatType=" + rentFloatType + ", floatBaseAmt=" + floatBaseAmt + ", splitProfitRentCalcType=" + splitProfitRentCalcType + ", splitProfitRecvTerm=" + splitProfitRecvTerm + ", splitProfitRecvTermMult=" + splitProfitRecvTermMult + ", splitProfitRecvTotalTerms=" + splitProfitRecvTotalTerms + ", splitProfitFirstRentDate=" + splitProfitFirstRentDate + ", rentIncomeEqualCurrency=" + rentIncomeEqualCurrency + ", rentIncomeEqualRateType=" + rentIncomeEqualRateType + ", rentIncomeEqualAdjustDays=" + rentIncomeEqualAdjustDays + ", isCollectVat=" + isCollectVat + ", collectVatCalcType=" + collectVatCalcType + ", vatExchRateType=" + vatExchRateType + ", recvAcctNoVat=" + recvAcctNoVat + ", rentPayStyle=" + rentPayStyle + ", incomeSubject=" + incomeSubject + ", structuredType=" + structuredType + ", structuredLeaser=" + structuredLeaser + ", structuredRecvAcctNo=" + structuredRecvAcctNo + ", structuredPayAcctNo=" + structuredPayAcctNo + ", structuredRentCalcType=" + structuredRentCalcType + ", structuredPayPercent=" + structuredPayPercent + ", structuredPayAmt=" + structuredPayAmt + ", structuredTempSubject=" + structuredTempSubject + ", isRentStampTax=" + isRentStampTax + ", rentFloatPercent=" + rentFloatPercent + ", rentFloatFirstTerm=" + rentFloatFirstTerm + ", rentFloatIntervalTerms=" + rentFloatIntervalTerms + ", assumedSwapRate=" + assumedSwapRate + ", baseRateDefine=" + baseRateDefine + ", baseRateTerm=" + baseRateTerm + ", baseRateTermMult=" + baseRateTermMult + ", baseRate=" + baseRate + ", baseRateAdjustType=" + baseRateAdjustType + ", baseRateAdjustDays=" + baseRateAdjustDays + ", adjustmentFactor=" + adjustmentFactor + ", adjustmentFactorCalcType=" + adjustmentFactorCalcType + ", adjustmentFactorFirstchgterm=" + adjustmentFactorFirstchgterm + ", adjustmentFactorPercent=" + adjustmentFactorPercent + ", adjustmentFactorIntervalterm=" + adjustmentFactorIntervalterm + ", tceDefine=" + tceDefine + ", tceTerm=" + tceTerm + ", tceTermMult=" + tceTermMult + ", tceAdjustType=" + tceAdjustType + ", tceAdjustDays=" + tceAdjustDays + ", tceVariation=" + tceVariation + ", splitBaseAmt=" + splitBaseAmt + ", mainManagerIda=" + mainManagerIda + ", mainManagerNamea=" + mainManagerNamea + ", mainManagerIdb=" + mainManagerIdb + ", mainManagerNameb=" + mainManagerNameb + ", coManagerIda=" + coManagerIda + ", coManagerNamea=" + coManagerNamea + ", coManagerIdb=" + coManagerIdb + ", coManagerNameb=" + coManagerNameb + ", termIncomeDesc=" + termIncomeDesc + ", baseRentCalcType=" + baseRentCalcType + ", baseRentRateDefine=" + baseRentRateDefine + ", baseRentRateTerm=" + baseRentRateTerm + ", baseRentRateTermMult=" + baseRentRateTermMult + ", baseRentFirstDate=" + baseRentFirstDate + ", baseRentSecDate=" + baseRentSecDate + ", splitProfitRentFirstDate=" + splitProfitRentFirstDate + ", splitProfitRentSecDate=" + splitProfitRentSecDate + ", estimateBaseTermAmt=" + estimateBaseTermAmt + ", estimateSplitTermAmt=" + estimateSplitTermAmt + ", secRentDate=" + secRentDate + ", splitProfitSecRentDate=" + splitProfitSecRentDate + ", floatIndexSubtractor=" + floatIndexSubtractor + ", floatIndexFirstDate=" + floatIndexFirstDate + ", floatIndexSecDate=" + floatIndexSecDate + ", floatRentRateTerm=" + floatRentRateTerm + ", floatRentRateTermMult=" + floatRentRateTermMult + ", riskContractNbr=" + riskContractNbr + "}";
    }
}
