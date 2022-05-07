package com.lq.lidar.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *机构管理
 * </p>
 *
 * @author LQ
 * @since 2022-03-16
 */
@TableName("cbay_sys_office")
public class CbaySysOffice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构ID
     */
    @TableId("\"OFC_ID\"")
    private String ofcId;

    /**
     * 国家代码
     */
    @TableField("\"CNTR_CD\"")
    private String cntrCd;

    /**
     * 州省代码
     */
    @TableField("\"STATE_CD\"")
    private String stateCd;

    /**
     * 城市代码
     */
    @TableField("\"CITY_CD\"")
    private String cityCd;

    /**
     * 会计核算准则
     */
    @TableField("\"ACCT_STD_ID\"")
    private String acctStdId;

    /**
     *上级机构
     */
    @TableField("\"OFC_PRT_ID\"")
    private String ofcPrtId;

    @TableField("\"OFC_PRT_IDS\"")
    private String ofcPrtIds;

    /**
     * 机构编码
     */
    @TableField("\"OFC_CODE\"")
    private String ofcCode;

    /**
     * 机构名称
     */
    @TableField("\"OFC_NM\"")
    private String ofcNm;

    @TableField("\"SORT_LVL\"")
    private BigDecimal sortLvl;

    /**
     * 机构类型
     */
    @TableField("\"OFC_TYPE_CD\"")
    private String ofcTypeCd;

    /**
     * 机构级别
     */
    @TableField("\"OFC_GRD_CD\"")
    private String ofcGrdCd;

    /**
     * 联系地址
     */
    @TableField("\"OFC_ADDR\"")
    private String ofcAddr;

    /**
     * 邮政编码
     */
    @TableField("\"OFC_ZIP\"")
    private String ofcZip;

    /**
     * 负责人
     */
    @TableField("\"OFC_SPVS_ID\"")
    private String ofcSpvsId;

    /**
     * 电话
     */
    @TableField("\"OFC_TEL\"")
    private String ofcTel;

    /**
     * 传真
     */
    @TableField("\"OFC_FAX\"")
    private String ofcFax;

    /**
     * 邮箱
     */
    @TableField("\"OFC_EMAIL\"")
    private String ofcEmail;

    /**
     * 主负责人
     */
    @TableField("\"FST_CNTCT_PERS_ID\"")
    private String fstCntctPersId;

    /**
     * 副负责人
     */
    @TableField("\"SEC_CNTCT_PERS_ID\"")
    private String secCntctPersId;

    /**
     * 记账机构
     */
    @TableField("\"ACCT_OFC_ID\"")
    private String acctOfcId;

    @TableField("\"VALID_IND\"")
    private String validInd;

    @TableField("\"CMS_OFC_ID\"")
    private String cmsOfcId;

    @TableField("\"CRCY_CD\"")
    private String crcyCd;

    @TableField("\"DIVISION_ID\"")
    private String divisionId;

    /**
     * 部门中心负责人
     */
    @TableField("\"DEPT_CENTER_USERID\"")
    private String deptCenterUserid;

    /**
     * 事业部风险总监
     */
    @TableField("\"RISK_PRESIDENT\"")
    private String riskPresident;

    @TableField("\"OFC_OA_NM\"")
    private String ofcOaNm;

    /**
     * 境内标识
     */
    @TableField("\"IN_BORDER_IND\"")
    private String inBorderInd;

    /**
     * 事业部分管领导
     */
    @TableField("\"DEPT_BUSINESS_LEADER\"")
    private String deptBusinessLeader;

    /**
     * 是否零售
     */
    @TableField("\"WHETHER_RETAIL\"")
    private String whetherRetail;


    public String getOfcId() {
        return ofcId;
    }

    public void setOfcId(String ofcId) {
        this.ofcId = ofcId;
    }

    public String getCntrCd() {
        return cntrCd;
    }

    public void setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd;
    }

    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    public String getCityCd() {
        return cityCd;
    }

    public void setCityCd(String cityCd) {
        this.cityCd = cityCd;
    }

    public String getAcctStdId() {
        return acctStdId;
    }

    public void setAcctStdId(String acctStdId) {
        this.acctStdId = acctStdId;
    }

    public String getOfcPrtId() {
        return ofcPrtId;
    }

    public void setOfcPrtId(String ofcPrtId) {
        this.ofcPrtId = ofcPrtId;
    }

    public String getOfcPrtIds() {
        return ofcPrtIds;
    }

    public void setOfcPrtIds(String ofcPrtIds) {
        this.ofcPrtIds = ofcPrtIds;
    }

    public String getOfcCode() {
        return ofcCode;
    }

    public void setOfcCode(String ofcCode) {
        this.ofcCode = ofcCode;
    }

    public String getOfcNm() {
        return ofcNm;
    }

    public void setOfcNm(String ofcNm) {
        this.ofcNm = ofcNm;
    }

    public BigDecimal getSortLvl() {
        return sortLvl;
    }

    public void setSortLvl(BigDecimal sortLvl) {
        this.sortLvl = sortLvl;
    }

    public String getOfcTypeCd() {
        return ofcTypeCd;
    }

    public void setOfcTypeCd(String ofcTypeCd) {
        this.ofcTypeCd = ofcTypeCd;
    }

    public String getOfcGrdCd() {
        return ofcGrdCd;
    }

    public void setOfcGrdCd(String ofcGrdCd) {
        this.ofcGrdCd = ofcGrdCd;
    }

    public String getOfcAddr() {
        return ofcAddr;
    }

    public void setOfcAddr(String ofcAddr) {
        this.ofcAddr = ofcAddr;
    }

    public String getOfcZip() {
        return ofcZip;
    }

    public void setOfcZip(String ofcZip) {
        this.ofcZip = ofcZip;
    }

    public String getOfcSpvsId() {
        return ofcSpvsId;
    }

    public void setOfcSpvsId(String ofcSpvsId) {
        this.ofcSpvsId = ofcSpvsId;
    }

    public String getOfcTel() {
        return ofcTel;
    }

    public void setOfcTel(String ofcTel) {
        this.ofcTel = ofcTel;
    }

    public String getOfcFax() {
        return ofcFax;
    }

    public void setOfcFax(String ofcFax) {
        this.ofcFax = ofcFax;
    }

    public String getOfcEmail() {
        return ofcEmail;
    }

    public void setOfcEmail(String ofcEmail) {
        this.ofcEmail = ofcEmail;
    }

    public String getFstCntctPersId() {
        return fstCntctPersId;
    }

    public void setFstCntctPersId(String fstCntctPersId) {
        this.fstCntctPersId = fstCntctPersId;
    }

    public String getSecCntctPersId() {
        return secCntctPersId;
    }

    public void setSecCntctPersId(String secCntctPersId) {
        this.secCntctPersId = secCntctPersId;
    }

    public String getAcctOfcId() {
        return acctOfcId;
    }

    public void setAcctOfcId(String acctOfcId) {
        this.acctOfcId = acctOfcId;
    }

    public String getValidInd() {
        return validInd;
    }

    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    public String getCmsOfcId() {
        return cmsOfcId;
    }

    public void setCmsOfcId(String cmsOfcId) {
        this.cmsOfcId = cmsOfcId;
    }

    public String getCrcyCd() {
        return crcyCd;
    }

    public void setCrcyCd(String crcyCd) {
        this.crcyCd = crcyCd;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getDeptCenterUserid() {
        return deptCenterUserid;
    }

    public void setDeptCenterUserid(String deptCenterUserid) {
        this.deptCenterUserid = deptCenterUserid;
    }

    public String getRiskPresident() {
        return riskPresident;
    }

    public void setRiskPresident(String riskPresident) {
        this.riskPresident = riskPresident;
    }

    public String getOfcOaNm() {
        return ofcOaNm;
    }

    public void setOfcOaNm(String ofcOaNm) {
        this.ofcOaNm = ofcOaNm;
    }

    public String getInBorderInd() {
        return inBorderInd;
    }

    public void setInBorderInd(String inBorderInd) {
        this.inBorderInd = inBorderInd;
    }

    public String getDeptBusinessLeader() {
        return deptBusinessLeader;
    }

    public void setDeptBusinessLeader(String deptBusinessLeader) {
        this.deptBusinessLeader = deptBusinessLeader;
    }

    public String getWhetherRetail() {
        return whetherRetail;
    }

    public void setWhetherRetail(String whetherRetail) {
        this.whetherRetail = whetherRetail;
    }

    @Override
    public String toString() {
        return "CbaySysOffice{" + "ofcId=" + ofcId + ", cntrCd=" + cntrCd + ", stateCd=" + stateCd + ", cityCd=" + cityCd + ", acctStdId=" + acctStdId + ", ofcPrtId=" + ofcPrtId + ", ofcPrtIds=" + ofcPrtIds + ", ofcCode=" + ofcCode + ", ofcNm=" + ofcNm + ", sortLvl=" + sortLvl + ", ofcTypeCd=" + ofcTypeCd + ", ofcGrdCd=" + ofcGrdCd + ", ofcAddr=" + ofcAddr + ", ofcZip=" + ofcZip + ", ofcSpvsId=" + ofcSpvsId + ", ofcTel=" + ofcTel + ", ofcFax=" + ofcFax + ", ofcEmail=" + ofcEmail + ", fstCntctPersId=" + fstCntctPersId + ", secCntctPersId=" + secCntctPersId + ", acctOfcId=" + acctOfcId + ", validInd=" + validInd + ", cmsOfcId=" + cmsOfcId + ", crcyCd=" + crcyCd + ", divisionId=" + divisionId + ", deptCenterUserid=" + deptCenterUserid + ", riskPresident=" + riskPresident + ", ofcOaNm=" + ofcOaNm + ", inBorderInd=" + inBorderInd + ", deptBusinessLeader=" + deptBusinessLeader + ", whetherRetail=" + whetherRetail + "}";
    }
}
