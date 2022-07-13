package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@TableName("cbay_bp_biz_ptnr_base")
public class CbayBpBizPtnrBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("\"BP_ID\"")
    private String bpId;

    @TableField("\"CNTR_CD\"")
    private String cntrCd;

    @TableField("\"CITY_CD\"")
    private String cityCd;

    @TableField("\"STATE_CD\"")
    private String stateCd;

    @TableField("\"BP_CD\"")
    private String bpCd;

    @TableField("\"BP_NM\"")
    private String bpNm;

    @TableField("\"BP_EN_NM\"")
    private String bpEnNm;

    @TableField("\"BP_OPER_STAT\"")
    private String bpOperStat;

    /**
     * 合作伙伴类型
     */
    @TableField("\"BP_TYPE_CD\"")
    private String bpTypeCd;

    @TableField("\"BP_ROLE\"")
    private String bpRole;

    @TableField("\"BP_TEL\"")
    private String bpTel;

    @TableField("\"RCPT_NM\"")
    private String rcptNm;

    @TableField("\"ZIP\"")
    private String zip;

    @TableField("\"MAIL_ADDR\"")
    private String mailAddr;

    @TableField("\"ADDRESS\"")
    private String address;

    @TableField("\"SPNSR_ID\"")
    private String spnsrId;

    @TableField("\"SHRHOLD_IND\"")
    private String shrholdInd;

    @TableField("\"CO_AUTH_BP_IND\"")
    private String coAuthBpInd;

    @TableField("\"CO_REL_BP_IND\"")
    private String coRelBpInd;

    @TableField("\"BLK_BP_IND\"")
    private String blkBpInd;

    @TableField("\"VIP_BP_IND\"")
    private String vipBpInd;

    @TableField("\"SUED_BP_IND\"")
    private String suedBpInd;

    @TableField("\"BP_RISK_CAT_CD\"")
    private String bpRiskCatCd;

    @TableField("\"CO_ORG_ID\"")
    private String coOrgId;

    @TableField("\"ENVR_PNL_IND\"")
    private String envrPnlInd;

    @TableField("\"BAD_CR_RCD_IND\"")
    private String badCrRcdInd;

    @TableField("\"EXEC_LIST_IND\"")
    private String execListInd;

    @TableField("\"CITIC_RT\"")
    private String citicRt;

    @TableField("\"STD_POOR_RT\"")
    private String stdPoorRt;

    @TableField("\"CAPE_TOWN_ST_PTY\"")
    private String capeTownStPty;

    @TableField("\"OWNER_OFC\"")
    private String ownerOfc;

    @TableField("\"CREATE_BY\"")
    private String createBy;

    @TableField("\"CREATE_TIME\"")
    private LocalDateTime createTime;

    @TableField("\"UPDATE_BY\"")
    private String updateBy;

    @TableField("\"UPDATE_TIME\"")
    private LocalDateTime updateTime;

    @TableField("\"BP_STAT\"")
    private String bpStat;

    @TableField("\"CR_LVL\"")
    private String crLvl;

    @TableField("\"GREY_BP_IND\"")
    private String greyBpInd;

    @TableField("\"BLK_BP_TYPE\"")
    private String blkBpType;

    @TableField("\"NEW_IND\"")
    private String newInd;

    @TableField("\"RATING_TIME\"")
    private LocalDateTime ratingTime;

    @TableField("\"RATING_OFC\"")
    private String ratingOfc;

    @TableField("\"BP_NAME_INITIAL\"")
    private String bpNameInitial;

    /**
     * 证件是否过期
     */
    @TableField("\"CERTIFICAT_EWHETHER_PAS_TDUE\"")
    private String certificatEwhetherPasTdue;

    /**
     * 国家代码原值
     */
    @TableField("\"CNTR_CD_RPT\"")
    private String cntrCdRpt;

    /**
     * 城市代码原值
     */
    @TableField("\"CITY_CD_RPT\"")
    private String cityCdRpt;

    /**
     * 州省代码原值
     */
    @TableField("\"STATE_CD_RPT\"")
    private String stateCdRpt;

    /**
     * 固定报表值标识
     */
    @TableField("\"FIX_REPORT_IND\"")
    private String fixReportInd;

    /**
     * 是否击中
     */
    @TableField("\"HIT_IND\"")
    private String hitInd;

    /**
     * 击中类型
     */
    @TableField("\"HIT_TYPE\"")
    private String hitType;

    /**
     * 是否连续击中
     */
    @TableField("\"CONTINUE_HIT_IND\"")
    private String continueHitInd;

    /**
     * 反恐筛查审批状态
     */
    @TableField("\"SCRN_STATUS\"")
    private String scrnStatus;

    /**
     * 洗钱风险等级
     */
    @TableField("\"ML_RISK_LEVEL\"")
    private String mlRiskLevel;

    /**
     * 洗钱风险等级评定审批状态
     */
    @TableField("\"ML_RISK_EXAM_STATUS\"")
    private String mlRiskExamStatus;

    /**
     * 洗钱风险等级邮件提醒标记
     */
    @TableField("\"RISK_RMD_IND\"")
    private String riskRmdInd;

    /**
     * 区/县代码 国标值
     */
    @TableField("\"COUNTY_CODE\"")
    private String countyCode;

    /**
     * 客户编号
     */
    @TableField("\"PARTNER_CODE\"")
    private String partnerCode;


    public String getBpId() {
        return bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    public String getCntrCd() {
        return cntrCd;
    }

    public void setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd;
    }

    public String getCityCd() {
        return cityCd;
    }

    public void setCityCd(String cityCd) {
        this.cityCd = cityCd;
    }

    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    public String getBpCd() {
        return bpCd;
    }

    public void setBpCd(String bpCd) {
        this.bpCd = bpCd;
    }

    public String getBpNm() {
        return bpNm;
    }

    public void setBpNm(String bpNm) {
        this.bpNm = bpNm;
    }

    public String getBpEnNm() {
        return bpEnNm;
    }

    public void setBpEnNm(String bpEnNm) {
        this.bpEnNm = bpEnNm;
    }

    public String getBpOperStat() {
        return bpOperStat;
    }

    public void setBpOperStat(String bpOperStat) {
        this.bpOperStat = bpOperStat;
    }

    public String getBpTypeCd() {
        return bpTypeCd;
    }

    public void setBpTypeCd(String bpTypeCd) {
        this.bpTypeCd = bpTypeCd;
    }

    public String getBpRole() {
        return bpRole;
    }

    public void setBpRole(String bpRole) {
        this.bpRole = bpRole;
    }

    public String getBpTel() {
        return bpTel;
    }

    public void setBpTel(String bpTel) {
        this.bpTel = bpTel;
    }

    public String getRcptNm() {
        return rcptNm;
    }

    public void setRcptNm(String rcptNm) {
        this.rcptNm = rcptNm;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpnsrId() {
        return spnsrId;
    }

    public void setSpnsrId(String spnsrId) {
        this.spnsrId = spnsrId;
    }

    public String getShrholdInd() {
        return shrholdInd;
    }

    public void setShrholdInd(String shrholdInd) {
        this.shrholdInd = shrholdInd;
    }

    public String getCoAuthBpInd() {
        return coAuthBpInd;
    }

    public void setCoAuthBpInd(String coAuthBpInd) {
        this.coAuthBpInd = coAuthBpInd;
    }

    public String getCoRelBpInd() {
        return coRelBpInd;
    }

    public void setCoRelBpInd(String coRelBpInd) {
        this.coRelBpInd = coRelBpInd;
    }

    public String getBlkBpInd() {
        return blkBpInd;
    }

    public void setBlkBpInd(String blkBpInd) {
        this.blkBpInd = blkBpInd;
    }

    public String getVipBpInd() {
        return vipBpInd;
    }

    public void setVipBpInd(String vipBpInd) {
        this.vipBpInd = vipBpInd;
    }

    public String getSuedBpInd() {
        return suedBpInd;
    }

    public void setSuedBpInd(String suedBpInd) {
        this.suedBpInd = suedBpInd;
    }

    public String getBpRiskCatCd() {
        return bpRiskCatCd;
    }

    public void setBpRiskCatCd(String bpRiskCatCd) {
        this.bpRiskCatCd = bpRiskCatCd;
    }

    public String getCoOrgId() {
        return coOrgId;
    }

    public void setCoOrgId(String coOrgId) {
        this.coOrgId = coOrgId;
    }

    public String getEnvrPnlInd() {
        return envrPnlInd;
    }

    public void setEnvrPnlInd(String envrPnlInd) {
        this.envrPnlInd = envrPnlInd;
    }

    public String getBadCrRcdInd() {
        return badCrRcdInd;
    }

    public void setBadCrRcdInd(String badCrRcdInd) {
        this.badCrRcdInd = badCrRcdInd;
    }

    public String getExecListInd() {
        return execListInd;
    }

    public void setExecListInd(String execListInd) {
        this.execListInd = execListInd;
    }

    public String getCiticRt() {
        return citicRt;
    }

    public void setCiticRt(String citicRt) {
        this.citicRt = citicRt;
    }

    public String getStdPoorRt() {
        return stdPoorRt;
    }

    public void setStdPoorRt(String stdPoorRt) {
        this.stdPoorRt = stdPoorRt;
    }

    public String getCapeTownStPty() {
        return capeTownStPty;
    }

    public void setCapeTownStPty(String capeTownStPty) {
        this.capeTownStPty = capeTownStPty;
    }

    public String getOwnerOfc() {
        return ownerOfc;
    }

    public void setOwnerOfc(String ownerOfc) {
        this.ownerOfc = ownerOfc;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getBpStat() {
        return bpStat;
    }

    public void setBpStat(String bpStat) {
        this.bpStat = bpStat;
    }

    public String getCrLvl() {
        return crLvl;
    }

    public void setCrLvl(String crLvl) {
        this.crLvl = crLvl;
    }

    public String getGreyBpInd() {
        return greyBpInd;
    }

    public void setGreyBpInd(String greyBpInd) {
        this.greyBpInd = greyBpInd;
    }

    public String getBlkBpType() {
        return blkBpType;
    }

    public void setBlkBpType(String blkBpType) {
        this.blkBpType = blkBpType;
    }

    public String getNewInd() {
        return newInd;
    }

    public void setNewInd(String newInd) {
        this.newInd = newInd;
    }

    public LocalDateTime getRatingTime() {
        return ratingTime;
    }

    public void setRatingTime(LocalDateTime ratingTime) {
        this.ratingTime = ratingTime;
    }

    public String getRatingOfc() {
        return ratingOfc;
    }

    public void setRatingOfc(String ratingOfc) {
        this.ratingOfc = ratingOfc;
    }

    public String getBpNameInitial() {
        return bpNameInitial;
    }

    public void setBpNameInitial(String bpNameInitial) {
        this.bpNameInitial = bpNameInitial;
    }

    public String getCertificatEwhetherPasTdue() {
        return certificatEwhetherPasTdue;
    }

    public void setCertificatEwhetherPasTdue(String certificatEwhetherPasTdue) {
        this.certificatEwhetherPasTdue = certificatEwhetherPasTdue;
    }

    public String getCntrCdRpt() {
        return cntrCdRpt;
    }

    public void setCntrCdRpt(String cntrCdRpt) {
        this.cntrCdRpt = cntrCdRpt;
    }

    public String getCityCdRpt() {
        return cityCdRpt;
    }

    public void setCityCdRpt(String cityCdRpt) {
        this.cityCdRpt = cityCdRpt;
    }

    public String getStateCdRpt() {
        return stateCdRpt;
    }

    public void setStateCdRpt(String stateCdRpt) {
        this.stateCdRpt = stateCdRpt;
    }

    public String getFixReportInd() {
        return fixReportInd;
    }

    public void setFixReportInd(String fixReportInd) {
        this.fixReportInd = fixReportInd;
    }

    public String getHitInd() {
        return hitInd;
    }

    public void setHitInd(String hitInd) {
        this.hitInd = hitInd;
    }

    public String getHitType() {
        return hitType;
    }

    public void setHitType(String hitType) {
        this.hitType = hitType;
    }

    public String getContinueHitInd() {
        return continueHitInd;
    }

    public void setContinueHitInd(String continueHitInd) {
        this.continueHitInd = continueHitInd;
    }

    public String getScrnStatus() {
        return scrnStatus;
    }

    public void setScrnStatus(String scrnStatus) {
        this.scrnStatus = scrnStatus;
    }

    public String getMlRiskLevel() {
        return mlRiskLevel;
    }

    public void setMlRiskLevel(String mlRiskLevel) {
        this.mlRiskLevel = mlRiskLevel;
    }

    public String getMlRiskExamStatus() {
        return mlRiskExamStatus;
    }

    public void setMlRiskExamStatus(String mlRiskExamStatus) {
        this.mlRiskExamStatus = mlRiskExamStatus;
    }

    public String getRiskRmdInd() {
        return riskRmdInd;
    }

    public void setRiskRmdInd(String riskRmdInd) {
        this.riskRmdInd = riskRmdInd;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    @Override
    public String toString() {
        return "CbayBpBizPtnrBase{" +
                "bpId=" + bpId +
                ", cntrCd=" + cntrCd +
                ", cityCd=" + cityCd +
                ", stateCd=" + stateCd +
                ", bpCd=" + bpCd +
                ", bpNm=" + bpNm +
                ", bpEnNm=" + bpEnNm +
                ", bpOperStat=" + bpOperStat +
                ", bpTypeCd=" + bpTypeCd +
                ", bpRole=" + bpRole +
                ", bpTel=" + bpTel +
                ", rcptNm=" + rcptNm +
                ", zip=" + zip +
                ", mailAddr=" + mailAddr +
                ", address=" + address +
                ", spnsrId=" + spnsrId +
                ", shrholdInd=" + shrholdInd +
                ", coAuthBpInd=" + coAuthBpInd +
                ", coRelBpInd=" + coRelBpInd +
                ", blkBpInd=" + blkBpInd +
                ", vipBpInd=" + vipBpInd +
                ", suedBpInd=" + suedBpInd +
                ", bpRiskCatCd=" + bpRiskCatCd +
                ", coOrgId=" + coOrgId +
                ", envrPnlInd=" + envrPnlInd +
                ", badCrRcdInd=" + badCrRcdInd +
                ", execListInd=" + execListInd +
                ", citicRt=" + citicRt +
                ", stdPoorRt=" + stdPoorRt +
                ", capeTownStPty=" + capeTownStPty +
                ", ownerOfc=" + ownerOfc +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", updateBy=" + updateBy +
                ", updateTime=" + updateTime +
                ", bpStat=" + bpStat +
                ", crLvl=" + crLvl +
                ", greyBpInd=" + greyBpInd +
                ", blkBpType=" + blkBpType +
                ", newInd=" + newInd +
                ", ratingTime=" + ratingTime +
                ", ratingOfc=" + ratingOfc +
                ", bpNameInitial=" + bpNameInitial +
                ", certificatEwhetherPasTdue=" + certificatEwhetherPasTdue +
                ", cntrCdRpt=" + cntrCdRpt +
                ", cityCdRpt=" + cityCdRpt +
                ", stateCdRpt=" + stateCdRpt +
                ", fixReportInd=" + fixReportInd +
                ", hitInd=" + hitInd +
                ", hitType=" + hitType +
                ", continueHitInd=" + continueHitInd +
                ", scrnStatus=" + scrnStatus +
                ", mlRiskLevel=" + mlRiskLevel +
                ", mlRiskExamStatus=" + mlRiskExamStatus +
                ", riskRmdInd=" + riskRmdInd +
                ", countyCode=" + countyCode +
                ", partnerCode=" + partnerCode +
                "}";
    }
}
