package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDate;

/**
 * <p>
 * 采购付款审批表
 * </p>
 *
 * @author LQ
 * @since 2022-06-13
 */
@TableName("ol_purch_payment_approval")
public class OlPurchPaymentApproval implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SEQNO")
    private String seqno;

    @TableField("CONTRACT_SEQNO")
    private String contractSeqno;

    @TableField("CONTRACT_ID")
    private String contractId;

    @TableField("EXTERNAL_CONTRACT_NBR")
    private String externalContractNbr;

    @TableField("APPLY_SECTION_NAME")
    private String applySectionName;

//    @TableField("APPLY_LOAN_DATE")
//    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private LocalDate applyLoanDate;

    @TableField("PROJECT_NAME")
    private String projectName;

    @TableField("APPLY_CONTRACT_AMT")
    private BigDecimal applyContractAmt;

    @TableField("APPLY_FEE_AMT")
    private BigDecimal applyFeeAmt;

    @TableField("LOAN_DESC")
    private String loanDesc;

    @TableField("LOAN_TOTAL_NUM")
    private BigDecimal loanTotalNum;

    @TableField("THIS_NUM")
    private BigDecimal thisNum;

    @TableField("CURRENCY_CDE")
    private String currencyCde;

    @TableField("LOAN_TOTAL_AMT")
    private BigDecimal loanTotalAmt;

    @TableField("CURRENCY_CDE_LATER")
    private String currencyCdeLater;

    @TableField("LOAN_AMT_LATER")
    private BigDecimal loanAmtLater;

    @TableField("RECV_ACCT_NAME")
    private String recvAcctName;

    @TableField("RECV_ACCT_BANK")
    private String recvAcctBank;

    @TableField("RECV_ACCT_NO")
    private String recvAcctNo;

    @TableField("PAY_WAY")
    private String payWay;

    @TableField("APPLYER_ID")
    private String applyerId;

    @TableField("APPLYER_NAME")
    private String applyerName;

    @TableField("APPLY_DATE")
    private LocalDate applyDate;

    @TableField("APPLY_LEADER_ID")
    private String applyLeaderId;

    @TableField("APPLY_LEADER_NAME")
    private String applyLeaderName;

    @TableField("APPLY_LEADER_APPROVE_DATE")
    private LocalDate applyLeaderApproveDate;

    @TableField("APPLY_SECTION_OPINION")
    private String applySectionOpinion;

    @TableField("MANAGER_ID")
    private String managerId;

    @TableField("MANAGER_NAME")
    private String managerName;

    @TableField("MANAGER_APPROVE_DATE")
    private LocalDate managerApproveDate;

    @TableField("MANAGE_LEADER_ID")
    private String manageLeaderId;

    @TableField("MANAGE_LEADER_NAME")
    private String manageLeaderName;

    @TableField("MANAGE_LEADER_APPROVE_DATE")
    private LocalDate manageLeaderApproveDate;

    @TableField("MANAGE_APPROVE_OPINION")
    private String manageApproveOpinion;

    @TableField("LEADER_ID")
    private String leaderId;

    @TableField("LEADER_NAME")
    private String leaderName;

    @TableField("LEADER_APPROVE_DATE")
    private LocalDate leaderApproveDate;

    @TableField("LEADER_OPINION")
    private String leaderOpinion;

    @TableField("RIGHT_LEADER_ID")
    private String rightLeaderId;

    @TableField("RIGHT_LEADER_NAME")
    private String rightLeaderName;

    @TableField("RIGHT_LEADER_APPROVE_DATE")
    private LocalDate rightLeaderApproveDate;

    @TableField("RIGHT_LEADER_OPINION")
    private String rightLeaderOpinion;

    @TableField("MEMO")
    private String memo;

    @TableField("PAY_ACCT_NO")
    private String payAcctNo;

    @TableField("APPROVE_STATUS")
    private String approveStatus;

    @TableField("CREATER_ID")
    private String createrId;

    @TableField("CREATER_NAME")
    private String createrName;

    @TableField("LAST_UPDATE_TIME")
    private LocalDate lastUpdateTime;

    @TableField("VER")
    private BigDecimal ver;

    @TableField("CONFIRM_ID")
    private String confirmId;

    @TableField("CONFIRM_NAME")
    private String confirmName;

    /**
     * 是否其他机构代付
     */
    @TableField("IS_AGENT_PAY")
    private String isAgentPay;

    /**
     * 代付SPV ID
     */
    @TableField("AGENT_SPV_ID")
    private String agentSpvId;

    /**
     * 代付spv名称
     */
    @TableField("AGENT_SPV_NAME")
    private String agentSpvName;

    /**
     * 实际付款日期
     */
    @TableField("ACT_PAY_DATE")
    private LocalDate actPayDate;

    @TableField("PAY_ADD_INFO")
    private String payAddInfo;

    @TableField("RECV_BANK_SWIFT_CODE")
    private String recvBankSwiftCode;

    @TableField("RECV_TRANSFER_BANK")
    private String recvTransferBank;

    @TableField("RECV_TRANSFER_BANK_SWIFT_CODE")
    private String recvTransferBankSwiftCode;

    @TableField("IS_DIRECT_PAY")
    private String isDirectPay;

    @TableField("SPV_ID")
    private String spvId;

    @TableField("SPV_NAME")
    private String spvName;

    @TableField("PAY_TYPE")
    private String payType;

    @TableField("RENTAL_CONTRACT_SEQNO")
    private String rentalContractSeqno;

    @TableField("RENTAL_TRANS_DETAIL_SEQNO")
    private String rentalTransDetailSeqno;

    @TableField("SUBLEASE_RENT_SEQNO")
    private String subleaseRentSeqno;

    @TableField("VAT_RATE")
    private String vatRate;

    @TableField("DEPARTMENT_CDE")
    private String departmentCde;

    @TableField("DEPARTMENT_NAME")
    private String departmentName;

    @TableField("OA_WORKFLOW_ID")
    private String oaWorkflowId;

    @TableField("BANK_CHARGE_CURRENCY")
    private String bankChargeCurrency;

    @TableField("BANK_CHARGE_AMT")
    private BigDecimal bankChargeAmt;

    @TableField("EAS_EXCH_RATE")
    private BigDecimal easExchRate;

    @TableField("EAS_AMT")
    private BigDecimal easAmt;

    @TableField("EAS_CURRENCY")
    private String easCurrency;

    @TableField("IS_DIRECT_FIX_ASSET")
    private String isDirectFixAsset;

    @TableField("MAIN_MANAGER_ID")
    private String mainManagerId;

    @TableField("MAIN_MANAGER_NAME")
    private String mainManagerName;

    @TableField("CO_MANAGER_ID")
    private String coManagerId;

    @TableField("CO_MANAGER_NAME")
    private String coManagerName;

    @TableField("ASSET_INFO_ADD_SEQNO")
    private String assetInfoAddSeqno;

    @TableField("ASSET_NAME")
    private String assetName;

    @TableField("BUSI_PROJECT_NAME")
    private String busiProjectName;

    @TableField("PAY_STYLE")
    private String payStyle;

    @TableField("PAY_ACCT_DESC")
    private String payAcctDesc;

    @TableField("IS_PAYED")
    private String isPayed;

    @TableField("ORG_LEADER_ID")
    private String orgLeaderId;

    @TableField("ORG_LEADER_NAME")
    private String orgLeaderName;

    @TableField("ORG_LEADER_APPROVE_DATE")
    private LocalDate orgLeaderApproveDate;

    @TableField("ORG_LEADER_OPINION")
    private String orgLeaderOpinion;

    @TableField("PREMIUM_AMT")
    private BigDecimal premiumAmt;

    @TableField("TECHNICAL_SIGN_ID")
    private String technicalSignId;

    @TableField("TECHNICAL_SIGN_NAME")
    private String technicalSignName;

    @TableField("LAW_SIGN_ID")
    private String lawSignId;

    @TableField("LAW_SIGN_NAME")
    private String lawSignName;

    @TableField("SECTION_LEADER_ID")
    private String sectionLeaderId;

    @TableField("SECTION_LEADER_NAME")
    private String sectionLeaderName;

    @TableField("ORG_GROUP_LEADER_NAME")
    private String orgGroupLeaderName;

    @TableField("ORG_GROUP_LEADER_ID")
    private String orgGroupLeaderId;

    @TableField("CRO_ID")
    private String croId;

    @TableField("CRO_NAME")
    private String croName;

    @TableField("RISK_CENTER_LEADER_ID")
    private String riskCenterLeaderId;

    @TableField("RISK_CENTER_LEADER_NAME")
    private String riskCenterLeaderName;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getContractSeqno() {
        return contractSeqno;
    }

    public void setContractSeqno(String contractSeqno) {
        this.contractSeqno = contractSeqno;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getExternalContractNbr() {
        return externalContractNbr;
    }

    public void setExternalContractNbr(String externalContractNbr) {
        this.externalContractNbr = externalContractNbr;
    }

    public String getApplySectionName() {
        return applySectionName;
    }

    public void setApplySectionName(String applySectionName) {
        this.applySectionName = applySectionName;
    }

    public LocalDate getApplyLoanDate() {
        return applyLoanDate;
    }

    public void setApplyLoanDate(LocalDate applyLoanDate) {
        this.applyLoanDate = applyLoanDate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BigDecimal getApplyContractAmt() {
        return applyContractAmt;
    }

    public void setApplyContractAmt(BigDecimal applyContractAmt) {
        this.applyContractAmt = applyContractAmt;
    }

    public BigDecimal getApplyFeeAmt() {
        return applyFeeAmt;
    }

    public void setApplyFeeAmt(BigDecimal applyFeeAmt) {
        this.applyFeeAmt = applyFeeAmt;
    }

    public String getLoanDesc() {
        return loanDesc;
    }

    public void setLoanDesc(String loanDesc) {
        this.loanDesc = loanDesc;
    }

    public BigDecimal getLoanTotalNum() {
        return loanTotalNum;
    }

    public void setLoanTotalNum(BigDecimal loanTotalNum) {
        this.loanTotalNum = loanTotalNum;
    }

    public BigDecimal getThisNum() {
        return thisNum;
    }

    public void setThisNum(BigDecimal thisNum) {
        this.thisNum = thisNum;
    }

    public String getCurrencyCde() {
        return currencyCde;
    }

    public void setCurrencyCde(String currencyCde) {
        this.currencyCde = currencyCde;
    }

    public BigDecimal getLoanTotalAmt() {
        return loanTotalAmt;
    }

    public void setLoanTotalAmt(BigDecimal loanTotalAmt) {
        this.loanTotalAmt = loanTotalAmt;
    }

    public String getCurrencyCdeLater() {
        return currencyCdeLater;
    }

    public void setCurrencyCdeLater(String currencyCdeLater) {
        this.currencyCdeLater = currencyCdeLater;
    }

    public BigDecimal getLoanAmtLater() {
        return loanAmtLater;
    }

    public void setLoanAmtLater(BigDecimal loanAmtLater) {
        this.loanAmtLater = loanAmtLater;
    }

    public String getRecvAcctName() {
        return recvAcctName;
    }

    public void setRecvAcctName(String recvAcctName) {
        this.recvAcctName = recvAcctName;
    }

    public String getRecvAcctBank() {
        return recvAcctBank;
    }

    public void setRecvAcctBank(String recvAcctBank) {
        this.recvAcctBank = recvAcctBank;
    }

    public String getRecvAcctNo() {
        return recvAcctNo;
    }

    public void setRecvAcctNo(String recvAcctNo) {
        this.recvAcctNo = recvAcctNo;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getApplyerId() {
        return applyerId;
    }

    public void setApplyerId(String applyerId) {
        this.applyerId = applyerId;
    }

    public String getApplyerName() {
        return applyerName;
    }

    public void setApplyerName(String applyerName) {
        this.applyerName = applyerName;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyLeaderId() {
        return applyLeaderId;
    }

    public void setApplyLeaderId(String applyLeaderId) {
        this.applyLeaderId = applyLeaderId;
    }

    public String getApplyLeaderName() {
        return applyLeaderName;
    }

    public void setApplyLeaderName(String applyLeaderName) {
        this.applyLeaderName = applyLeaderName;
    }

    public LocalDate getApplyLeaderApproveDate() {
        return applyLeaderApproveDate;
    }

    public void setApplyLeaderApproveDate(LocalDate applyLeaderApproveDate) {
        this.applyLeaderApproveDate = applyLeaderApproveDate;
    }

    public String getApplySectionOpinion() {
        return applySectionOpinion;
    }

    public void setApplySectionOpinion(String applySectionOpinion) {
        this.applySectionOpinion = applySectionOpinion;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public LocalDate getManagerApproveDate() {
        return managerApproveDate;
    }

    public void setManagerApproveDate(LocalDate managerApproveDate) {
        this.managerApproveDate = managerApproveDate;
    }

    public String getManageLeaderId() {
        return manageLeaderId;
    }

    public void setManageLeaderId(String manageLeaderId) {
        this.manageLeaderId = manageLeaderId;
    }

    public String getManageLeaderName() {
        return manageLeaderName;
    }

    public void setManageLeaderName(String manageLeaderName) {
        this.manageLeaderName = manageLeaderName;
    }

    public LocalDate getManageLeaderApproveDate() {
        return manageLeaderApproveDate;
    }

    public void setManageLeaderApproveDate(LocalDate manageLeaderApproveDate) {
        this.manageLeaderApproveDate = manageLeaderApproveDate;
    }

    public String getManageApproveOpinion() {
        return manageApproveOpinion;
    }

    public void setManageApproveOpinion(String manageApproveOpinion) {
        this.manageApproveOpinion = manageApproveOpinion;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public LocalDate getLeaderApproveDate() {
        return leaderApproveDate;
    }

    public void setLeaderApproveDate(LocalDate leaderApproveDate) {
        this.leaderApproveDate = leaderApproveDate;
    }

    public String getLeaderOpinion() {
        return leaderOpinion;
    }

    public void setLeaderOpinion(String leaderOpinion) {
        this.leaderOpinion = leaderOpinion;
    }

    public String getRightLeaderId() {
        return rightLeaderId;
    }

    public void setRightLeaderId(String rightLeaderId) {
        this.rightLeaderId = rightLeaderId;
    }

    public String getRightLeaderName() {
        return rightLeaderName;
    }

    public void setRightLeaderName(String rightLeaderName) {
        this.rightLeaderName = rightLeaderName;
    }

    public LocalDate getRightLeaderApproveDate() {
        return rightLeaderApproveDate;
    }

    public void setRightLeaderApproveDate(LocalDate rightLeaderApproveDate) {
        this.rightLeaderApproveDate = rightLeaderApproveDate;
    }

    public String getRightLeaderOpinion() {
        return rightLeaderOpinion;
    }

    public void setRightLeaderOpinion(String rightLeaderOpinion) {
        this.rightLeaderOpinion = rightLeaderOpinion;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPayAcctNo() {
        return payAcctNo;
    }

    public void setPayAcctNo(String payAcctNo) {
        this.payAcctNo = payAcctNo;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public LocalDate getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDate lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public BigDecimal getVer() {
        return ver;
    }

    public void setVer(BigDecimal ver) {
        this.ver = ver;
    }

    public String getConfirmId() {
        return confirmId;
    }

    public void setConfirmId(String confirmId) {
        this.confirmId = confirmId;
    }

    public String getConfirmName() {
        return confirmName;
    }

    public void setConfirmName(String confirmName) {
        this.confirmName = confirmName;
    }

    public String getIsAgentPay() {
        return isAgentPay;
    }

    public void setIsAgentPay(String isAgentPay) {
        this.isAgentPay = isAgentPay;
    }

    public String getAgentSpvId() {
        return agentSpvId;
    }

    public void setAgentSpvId(String agentSpvId) {
        this.agentSpvId = agentSpvId;
    }

    public String getAgentSpvName() {
        return agentSpvName;
    }

    public void setAgentSpvName(String agentSpvName) {
        this.agentSpvName = agentSpvName;
    }

    public LocalDate getActPayDate() {
        return actPayDate;
    }

    public void setActPayDate(LocalDate actPayDate) {
        this.actPayDate = actPayDate;
    }

    public String getPayAddInfo() {
        return payAddInfo;
    }

    public void setPayAddInfo(String payAddInfo) {
        this.payAddInfo = payAddInfo;
    }

    public String getRecvBankSwiftCode() {
        return recvBankSwiftCode;
    }

    public void setRecvBankSwiftCode(String recvBankSwiftCode) {
        this.recvBankSwiftCode = recvBankSwiftCode;
    }

    public String getRecvTransferBank() {
        return recvTransferBank;
    }

    public void setRecvTransferBank(String recvTransferBank) {
        this.recvTransferBank = recvTransferBank;
    }

    public String getRecvTransferBankSwiftCode() {
        return recvTransferBankSwiftCode;
    }

    public void setRecvTransferBankSwiftCode(String recvTransferBankSwiftCode) {
        this.recvTransferBankSwiftCode = recvTransferBankSwiftCode;
    }

    public String getIsDirectPay() {
        return isDirectPay;
    }

    public void setIsDirectPay(String isDirectPay) {
        this.isDirectPay = isDirectPay;
    }

    public String getSpvId() {
        return spvId;
    }

    public void setSpvId(String spvId) {
        this.spvId = spvId;
    }

    public String getSpvName() {
        return spvName;
    }

    public void setSpvName(String spvName) {
        this.spvName = spvName;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRentalContractSeqno() {
        return rentalContractSeqno;
    }

    public void setRentalContractSeqno(String rentalContractSeqno) {
        this.rentalContractSeqno = rentalContractSeqno;
    }

    public String getRentalTransDetailSeqno() {
        return rentalTransDetailSeqno;
    }

    public void setRentalTransDetailSeqno(String rentalTransDetailSeqno) {
        this.rentalTransDetailSeqno = rentalTransDetailSeqno;
    }

    public String getSubleaseRentSeqno() {
        return subleaseRentSeqno;
    }

    public void setSubleaseRentSeqno(String subleaseRentSeqno) {
        this.subleaseRentSeqno = subleaseRentSeqno;
    }

    public String getVatRate() {
        return vatRate;
    }

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
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

    public String getOaWorkflowId() {
        return oaWorkflowId;
    }

    public void setOaWorkflowId(String oaWorkflowId) {
        this.oaWorkflowId = oaWorkflowId;
    }

    public String getBankChargeCurrency() {
        return bankChargeCurrency;
    }

    public void setBankChargeCurrency(String bankChargeCurrency) {
        this.bankChargeCurrency = bankChargeCurrency;
    }

    public BigDecimal getBankChargeAmt() {
        return bankChargeAmt;
    }

    public void setBankChargeAmt(BigDecimal bankChargeAmt) {
        this.bankChargeAmt = bankChargeAmt;
    }

    public BigDecimal getEasExchRate() {
        return easExchRate;
    }

    public void setEasExchRate(BigDecimal easExchRate) {
        this.easExchRate = easExchRate;
    }

    public BigDecimal getEasAmt() {
        return easAmt;
    }

    public void setEasAmt(BigDecimal easAmt) {
        this.easAmt = easAmt;
    }

    public String getEasCurrency() {
        return easCurrency;
    }

    public void setEasCurrency(String easCurrency) {
        this.easCurrency = easCurrency;
    }

    public String getIsDirectFixAsset() {
        return isDirectFixAsset;
    }

    public void setIsDirectFixAsset(String isDirectFixAsset) {
        this.isDirectFixAsset = isDirectFixAsset;
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

    public String getAssetInfoAddSeqno() {
        return assetInfoAddSeqno;
    }

    public void setAssetInfoAddSeqno(String assetInfoAddSeqno) {
        this.assetInfoAddSeqno = assetInfoAddSeqno;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getBusiProjectName() {
        return busiProjectName;
    }

    public void setBusiProjectName(String busiProjectName) {
        this.busiProjectName = busiProjectName;
    }

    public String getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(String payStyle) {
        this.payStyle = payStyle;
    }

    public String getPayAcctDesc() {
        return payAcctDesc;
    }

    public void setPayAcctDesc(String payAcctDesc) {
        this.payAcctDesc = payAcctDesc;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(String isPayed) {
        this.isPayed = isPayed;
    }

    public String getOrgLeaderId() {
        return orgLeaderId;
    }

    public void setOrgLeaderId(String orgLeaderId) {
        this.orgLeaderId = orgLeaderId;
    }

    public String getOrgLeaderName() {
        return orgLeaderName;
    }

    public void setOrgLeaderName(String orgLeaderName) {
        this.orgLeaderName = orgLeaderName;
    }

    public LocalDate getOrgLeaderApproveDate() {
        return orgLeaderApproveDate;
    }

    public void setOrgLeaderApproveDate(LocalDate orgLeaderApproveDate) {
        this.orgLeaderApproveDate = orgLeaderApproveDate;
    }

    public String getOrgLeaderOpinion() {
        return orgLeaderOpinion;
    }

    public void setOrgLeaderOpinion(String orgLeaderOpinion) {
        this.orgLeaderOpinion = orgLeaderOpinion;
    }

    public BigDecimal getPremiumAmt() {
        return premiumAmt;
    }

    public void setPremiumAmt(BigDecimal premiumAmt) {
        this.premiumAmt = premiumAmt;
    }

    public String getTechnicalSignId() {
        return technicalSignId;
    }

    public void setTechnicalSignId(String technicalSignId) {
        this.technicalSignId = technicalSignId;
    }

    public String getTechnicalSignName() {
        return technicalSignName;
    }

    public void setTechnicalSignName(String technicalSignName) {
        this.technicalSignName = technicalSignName;
    }

    public String getLawSignId() {
        return lawSignId;
    }

    public void setLawSignId(String lawSignId) {
        this.lawSignId = lawSignId;
    }

    public String getLawSignName() {
        return lawSignName;
    }

    public void setLawSignName(String lawSignName) {
        this.lawSignName = lawSignName;
    }

    public String getSectionLeaderId() {
        return sectionLeaderId;
    }

    public void setSectionLeaderId(String sectionLeaderId) {
        this.sectionLeaderId = sectionLeaderId;
    }

    public String getSectionLeaderName() {
        return sectionLeaderName;
    }

    public void setSectionLeaderName(String sectionLeaderName) {
        this.sectionLeaderName = sectionLeaderName;
    }

    public String getOrgGroupLeaderName() {
        return orgGroupLeaderName;
    }

    public void setOrgGroupLeaderName(String orgGroupLeaderName) {
        this.orgGroupLeaderName = orgGroupLeaderName;
    }

    public String getOrgGroupLeaderId() {
        return orgGroupLeaderId;
    }

    public void setOrgGroupLeaderId(String orgGroupLeaderId) {
        this.orgGroupLeaderId = orgGroupLeaderId;
    }

    public String getCroId() {
        return croId;
    }

    public void setCroId(String croId) {
        this.croId = croId;
    }

    public String getCroName() {
        return croName;
    }

    public void setCroName(String croName) {
        this.croName = croName;
    }

    public String getRiskCenterLeaderId() {
        return riskCenterLeaderId;
    }

    public void setRiskCenterLeaderId(String riskCenterLeaderId) {
        this.riskCenterLeaderId = riskCenterLeaderId;
    }

    public String getRiskCenterLeaderName() {
        return riskCenterLeaderName;
    }

    public void setRiskCenterLeaderName(String riskCenterLeaderName) {
        this.riskCenterLeaderName = riskCenterLeaderName;
    }

    @Override
    public String toString() {
        return "OlPurchPaymentApproval{" +
        "seqno=" + seqno +
        ", contractSeqno=" + contractSeqno +
        ", contractId=" + contractId +
        ", externalContractNbr=" + externalContractNbr +
        ", applySectionName=" + applySectionName +
        ", applyLoanDate=" + applyLoanDate +
        ", projectName=" + projectName +
        ", applyContractAmt=" + applyContractAmt +
        ", applyFeeAmt=" + applyFeeAmt +
        ", loanDesc=" + loanDesc +
        ", loanTotalNum=" + loanTotalNum +
        ", thisNum=" + thisNum +
        ", currencyCde=" + currencyCde +
        ", loanTotalAmt=" + loanTotalAmt +
        ", currencyCdeLater=" + currencyCdeLater +
        ", loanAmtLater=" + loanAmtLater +
        ", recvAcctName=" + recvAcctName +
        ", recvAcctBank=" + recvAcctBank +
        ", recvAcctNo=" + recvAcctNo +
        ", payWay=" + payWay +
        ", applyerId=" + applyerId +
        ", applyerName=" + applyerName +
        ", applyDate=" + applyDate +
        ", applyLeaderId=" + applyLeaderId +
        ", applyLeaderName=" + applyLeaderName +
        ", applyLeaderApproveDate=" + applyLeaderApproveDate +
        ", applySectionOpinion=" + applySectionOpinion +
        ", managerId=" + managerId +
        ", managerName=" + managerName +
        ", managerApproveDate=" + managerApproveDate +
        ", manageLeaderId=" + manageLeaderId +
        ", manageLeaderName=" + manageLeaderName +
        ", manageLeaderApproveDate=" + manageLeaderApproveDate +
        ", manageApproveOpinion=" + manageApproveOpinion +
        ", leaderId=" + leaderId +
        ", leaderName=" + leaderName +
        ", leaderApproveDate=" + leaderApproveDate +
        ", leaderOpinion=" + leaderOpinion +
        ", rightLeaderId=" + rightLeaderId +
        ", rightLeaderName=" + rightLeaderName +
        ", rightLeaderApproveDate=" + rightLeaderApproveDate +
        ", rightLeaderOpinion=" + rightLeaderOpinion +
        ", memo=" + memo +
        ", payAcctNo=" + payAcctNo +
        ", approveStatus=" + approveStatus +
        ", createrId=" + createrId +
        ", createrName=" + createrName +
        ", lastUpdateTime=" + lastUpdateTime +
        ", ver=" + ver +
        ", confirmId=" + confirmId +
        ", confirmName=" + confirmName +
        ", isAgentPay=" + isAgentPay +
        ", agentSpvId=" + agentSpvId +
        ", agentSpvName=" + agentSpvName +
        ", actPayDate=" + actPayDate +
        ", payAddInfo=" + payAddInfo +
        ", recvBankSwiftCode=" + recvBankSwiftCode +
        ", recvTransferBank=" + recvTransferBank +
        ", recvTransferBankSwiftCode=" + recvTransferBankSwiftCode +
        ", isDirectPay=" + isDirectPay +
        ", spvId=" + spvId +
        ", spvName=" + spvName +
        ", payType=" + payType +
        ", rentalContractSeqno=" + rentalContractSeqno +
        ", rentalTransDetailSeqno=" + rentalTransDetailSeqno +
        ", subleaseRentSeqno=" + subleaseRentSeqno +
        ", vatRate=" + vatRate +
        ", departmentCde=" + departmentCde +
        ", departmentName=" + departmentName +
        ", oaWorkflowId=" + oaWorkflowId +
        ", bankChargeCurrency=" + bankChargeCurrency +
        ", bankChargeAmt=" + bankChargeAmt +
        ", easExchRate=" + easExchRate +
        ", easAmt=" + easAmt +
        ", easCurrency=" + easCurrency +
        ", isDirectFixAsset=" + isDirectFixAsset +
        ", mainManagerId=" + mainManagerId +
        ", mainManagerName=" + mainManagerName +
        ", coManagerId=" + coManagerId +
        ", coManagerName=" + coManagerName +
        ", assetInfoAddSeqno=" + assetInfoAddSeqno +
        ", assetName=" + assetName +
        ", busiProjectName=" + busiProjectName +
        ", payStyle=" + payStyle +
        ", payAcctDesc=" + payAcctDesc +
        ", isPayed=" + isPayed +
        ", orgLeaderId=" + orgLeaderId +
        ", orgLeaderName=" + orgLeaderName +
        ", orgLeaderApproveDate=" + orgLeaderApproveDate +
        ", orgLeaderOpinion=" + orgLeaderOpinion +
        ", premiumAmt=" + premiumAmt +
        ", technicalSignId=" + technicalSignId +
        ", technicalSignName=" + technicalSignName +
        ", lawSignId=" + lawSignId +
        ", lawSignName=" + lawSignName +
        ", sectionLeaderId=" + sectionLeaderId +
        ", sectionLeaderName=" + sectionLeaderName +
        ", orgGroupLeaderName=" + orgGroupLeaderName +
        ", orgGroupLeaderId=" + orgGroupLeaderId +
        ", croId=" + croId +
        ", croName=" + croName +
        ", riskCenterLeaderId=" + riskCenterLeaderId +
        ", riskCenterLeaderName=" + riskCenterLeaderName +
        "}";
    }
}
