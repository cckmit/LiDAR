package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 租赁物信息
 * </p>
 *
 * @author LQ
 * @since 2022-05-21
 */
@TableName("ol_asset_info_add")
public class OlAssetInfoAdd implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("\"SEQNO\"")
    private String seqno;

    /**
     * 租赁物信息主键
     */
    @TableField("\"ASSET_SEQNO\"")
    private String assetSeqno;

    /**
     * 租赁物编号
     */
    @TableField("\"ASSET_NO\"")
    private String assetNo;

    /**
     * 租赁物名称
     */
    @TableField("\"ASSET_NAME\"")
    private String assetName;

    /**
     * 资产原值-原币
     */
    @TableField("\"CURRENCY\"")
    private String currency;

    /**
     * 资产原值-人民币
     */
    @TableField("\"ORIG_PRICE\"")
    private BigDecimal origPrice;

    @TableField("\"ORIG_PRICE_RMB\"")
    private BigDecimal origPriceRmb;

    /**
     * 累计折旧-原币
     */
    @TableField("\"DEPRECIATION_AMT\"")
    private BigDecimal depreciationAmt;

    /**
     * 累计折旧-人民币
     */
    @TableField("\"DEPRECIATION_AMT_RMB\"")
    private BigDecimal depreciationAmtRmb;

    /**
     * 预计净残值-原币
     */
    @TableField("\"ESTIMATE_SALVAGE_AMT\"")
    private BigDecimal estimateSalvageAmt;

    /**
     * 折旧算法
     */
    @TableField("\"DEPRECIATION_METHOD\"")
    private String depreciationMethod;

    /**
     * 净残值率
     */
    @TableField("\"ESTIMATE_SALVAGE_RATIO\"")
    private BigDecimal estimateSalvageRatio;

    /**
     * 资产所属部门ID
     */
    @TableField("\"OWNER_DEPARTMENT_CDE\"")
    private String ownerDepartmentCde;

    /**
     * 资产所属部门名称
     */
    @TableField("\"OWNER_DEPARTMENT_NAME\"")
    private String ownerDepartmentName;

    /**
     * 减值准备-原币
     */
    @TableField("\"ALLOWANCE_AMT\"")
    private BigDecimal allowanceAmt;

    /**
     * 减值准备-人民币
     */
    @TableField("\"ALLOWANCE_AMT_RMB\"")
    private BigDecimal allowanceAmtRmb;

    /**
     * 租赁物状态
     */
    @TableField("\"ASSET_STATUS_DESC\"")
    private String assetStatusDesc;

    /**
     * 是否已转固
     */
    @TableField("\"IS_FIXED_ASSET\"")
    private String isFixedAsset;

    /**
     * 转固日期
     */
    @TableField("\"FIX_ASSET_DATE\"")
    private LocalDateTime fixAssetDate;

    /**
     * 上次从EAS资产卡片同步日期
     */
    @TableField("\"LAST_EAS_SYCH_DATE\"")
    private LocalDateTime lastEasSychDate;

    /**
     * EAS同步是否成功
     */
    @TableField("\"IS_EAS_SYCH_SUCCESS\"")
    private String isEasSychSuccess;

    /**
     * EAS同步异常信息
     */
    @TableField("\"EAS_SYCH_EXCEPTION\"")
    private String easSychException;

    /**
     * 是否需要EAS同步
     */
    @TableField("\"IS_NEED_EAS_SYCH\"")
    private String isNeedEasSych;

    /**
     * 上次同步成功日期
     */
    @TableField("\"LAST_SYCH_SUCCESS_DATE\"")
    private LocalDateTime lastSychSuccessDate;

    /**
     * EAS资产卡片原值-原币
     */
    @TableField("\"CARD_ORIG_PRICE\"")
    private BigDecimal cardOrigPrice;

    /**
     * EAS资产卡片原值-人民币
     */
    @TableField("\"CARD_ORIG_PRICE_RMB\"")
    private BigDecimal cardOrigPriceRmb;

    /**
     * EAS资产卡片累计折旧-原币
     */
    @TableField("\"CARD_DEPRECIATION_AMT\"")
    private BigDecimal cardDepreciationAmt;

    /**
     * EAS资产卡片累计折旧-人民币
     */
    @TableField("\"CARD_DEPRECIATION_AMT_RMB\"")
    private BigDecimal cardDepreciationAmtRmb;

    /**
     * EAS资产卡片减值准备-原币
     */
    @TableField("\"CARD_ALLOWANCE_AMT\"")
    private BigDecimal cardAllowanceAmt;

    /**
     * EAS资产卡片减值准备-人民币
     */
    @TableField("\"CARD_ALLOWANCE_AMT_RMB\"")
    private BigDecimal cardAllowanceAmtRmb;

    /**
     * EAS资产卡片租赁物编号
     */
    @TableField("\"CARD_ASSET_NO\"")
    private String cardAssetNo;

    /**
     * 资产所属SPV_ID
     */
    @TableField("\"OWNER_SPV_ID\"")
    private String ownerSpvId;

    /**
     * 资产所属SPV名称
     */
    @TableField("\"OWNER_SPV_NAME\"")
    private String ownerSpvName;

    @TableField("\"DISPOSAL_AMT\"")
    private BigDecimal disposalAmt;

    @TableField("\"IS_DISPOSAL\"")
    private String isDisposal;

    /**
     * EAS资产卡片租赁物名称
     */
    @TableField("\"CARD_ASSET_NAME\"")
    private String cardAssetName;

    /**
     * 资产是否已处置
     */
    @TableField("\"CARD_NEAT_VALUE\"")
    private BigDecimal cardNeatValue;

    /**
     * EAS��������FNumber
     */
    @TableField("\"CARD_FNUMBER\"")
    private String cardFnumber;

    @TableField("\"ASSET_CREATE_DATE\"")
    private LocalDateTime assetCreateDate;

    /**
     * 资产差异
     */
    @TableField("\"ORIG_PRICE_DIFF\"")
    private BigDecimal origPriceDiff;

    /**
     * 资产减值差异
     */
    @TableField("\"ALLOWANCE_DIFF_AMT\"")
    private BigDecimal allowanceDiffAmt;

    /**
     * 资产折旧差异
     */
    @TableField("\"DEPRECIATION_DIFF_AMT\"")
    private BigDecimal depreciationDiffAmt;

    /**
     * 船舶-船名
     */
    @TableField("\"SHIP_NAME\"")
    private String shipName;

    /**
     * 船舶-船型
     */
    @TableField("\"SHIP_TYPE\"")
    private String shipType;

    /**
     *  船舶-IMO编号
     */
    @TableField("\"SHIP_IMO\"")
    private String shipImo;

    /**
     * 船舶-呼号
     */
    @TableField("\"SHIP_CALL_SIGN\"")
    private String shipCallSign;

    /**
     * 船舶-船籍
     */
    @TableField("\"SHIP_NATIVE\"")
    private String shipNative;

    /**
     * 船舶-船级社
     */
    @TableField("\"SHIP_CLASS_SOCIETY\"")
    private String shipClassSociety;

    /**
     * 船舶-船号
     */
    @TableField("\"SHIP_NO\"")
    private String shipNo;

    /**
     * 船舶-吨位(总吨/净吨)
     */
    @TableField("\"SHIP_TON\"")
    private String shipTon;

    /**
     * 船舶-主尺度
     */
    @TableField("\"SHIP_DIMENSION\"")
    private String shipDimension;

    /**
     * 船舶- 制造商
     */
    @TableField("\"MANUFACTURER\"")
    private String manufacturer;

    /**
     * 飞机-MSN号
     */
    @TableField("\"PLANE_MSN\"")
    private String planeMsn;

    /**
     * 飞机-型号
     */
    @TableField("\"PLANE_TYPE\"")
    private String planeType;

    /**
     * 产品大类
     */
    @TableField("\"PRODUCT_CATEGORY\"")
    private String productCategory;

    /**
     * 产品子类
     */
    @TableField("\"PRODUCT_SUB_CATEGORY\"")
    private String productSubCategory;

    /**
     * 产品大类描述
     */
    @TableField("\"PRODUCT_CATEGORY_DESC\"")
    private String productCategoryDesc;

    /**
     * 产品子类描述
     */
    @TableField("\"PRODUCT_SUB_CATEGORY_DESC\"")
    private String productSubCategoryDesc;

    @TableField("\"TAX_RATE\"")
    private String taxRate;

    @TableField("\"CLEAN_AMT\"")
    private BigDecimal cleanAmt;

    @TableField("\"IS_CLEANED\"")
    private String isCleaned;

    @TableField("\"MAIN_MANAGER_ID\"")
    private String mainManagerId;

    @TableField("\"MAIN_MANAGER_NAME\"")
    private String mainManagerName;

    @TableField("\"CO_MANAGER_ID\"")
    private String coManagerId;

    @TableField("\"CO_MANAGER_NAME\"")
    private String coManagerName;

    @TableField("\"PROJECT_NAME\"")
    private String projectName;

    @TableField("\"PROJECT_NAME2\"")
    private String projectName2;

    @TableField("\"PROJECT_NAME3\"")
    private String projectName3;

    @TableField("\"UNIT_NAME\"")
    private String unitName;

    @TableField("\"MONTH_DEPRECIATION_AMT\"")
    private BigDecimal monthDepreciationAmt;

    @TableField("\"PLANE_REGNO\"")
    private String planeRegno;

    @TableField("\"REG_ADDRESS\"")
    private String regAddress;

    @TableField("\"CARD_CURRENCY\"")
    private String cardCurrency;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getAssetSeqno() {
        return assetSeqno;
    }

    public void setAssetSeqno(String assetSeqno) {
        this.assetSeqno = assetSeqno;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(BigDecimal origPrice) {
        this.origPrice = origPrice;
    }

    public BigDecimal getOrigPriceRmb() {
        return origPriceRmb;
    }

    public void setOrigPriceRmb(BigDecimal origPriceRmb) {
        this.origPriceRmb = origPriceRmb;
    }

    public BigDecimal getDepreciationAmt() {
        return depreciationAmt;
    }

    public void setDepreciationAmt(BigDecimal depreciationAmt) {
        this.depreciationAmt = depreciationAmt;
    }

    public BigDecimal getDepreciationAmtRmb() {
        return depreciationAmtRmb;
    }

    public void setDepreciationAmtRmb(BigDecimal depreciationAmtRmb) {
        this.depreciationAmtRmb = depreciationAmtRmb;
    }

    public BigDecimal getEstimateSalvageAmt() {
        return estimateSalvageAmt;
    }

    public void setEstimateSalvageAmt(BigDecimal estimateSalvageAmt) {
        this.estimateSalvageAmt = estimateSalvageAmt;
    }

    public String getDepreciationMethod() {
        return depreciationMethod;
    }

    public void setDepreciationMethod(String depreciationMethod) {
        this.depreciationMethod = depreciationMethod;
    }

    public BigDecimal getEstimateSalvageRatio() {
        return estimateSalvageRatio;
    }

    public void setEstimateSalvageRatio(BigDecimal estimateSalvageRatio) {
        this.estimateSalvageRatio = estimateSalvageRatio;
    }

    public String getOwnerDepartmentCde() {
        return ownerDepartmentCde;
    }

    public void setOwnerDepartmentCde(String ownerDepartmentCde) {
        this.ownerDepartmentCde = ownerDepartmentCde;
    }

    public String getOwnerDepartmentName() {
        return ownerDepartmentName;
    }

    public void setOwnerDepartmentName(String ownerDepartmentName) {
        this.ownerDepartmentName = ownerDepartmentName;
    }

    public BigDecimal getAllowanceAmt() {
        return allowanceAmt;
    }

    public void setAllowanceAmt(BigDecimal allowanceAmt) {
        this.allowanceAmt = allowanceAmt;
    }

    public BigDecimal getAllowanceAmtRmb() {
        return allowanceAmtRmb;
    }

    public void setAllowanceAmtRmb(BigDecimal allowanceAmtRmb) {
        this.allowanceAmtRmb = allowanceAmtRmb;
    }

    public String getAssetStatusDesc() {
        return assetStatusDesc;
    }

    public void setAssetStatusDesc(String assetStatusDesc) {
        this.assetStatusDesc = assetStatusDesc;
    }

    public String getIsFixedAsset() {
        return isFixedAsset;
    }

    public void setIsFixedAsset(String isFixedAsset) {
        this.isFixedAsset = isFixedAsset;
    }

    public LocalDateTime getFixAssetDate() {
        return fixAssetDate;
    }

    public void setFixAssetDate(LocalDateTime fixAssetDate) {
        this.fixAssetDate = fixAssetDate;
    }

    public LocalDateTime getLastEasSychDate() {
        return lastEasSychDate;
    }

    public void setLastEasSychDate(LocalDateTime lastEasSychDate) {
        this.lastEasSychDate = lastEasSychDate;
    }

    public String getIsEasSychSuccess() {
        return isEasSychSuccess;
    }

    public void setIsEasSychSuccess(String isEasSychSuccess) {
        this.isEasSychSuccess = isEasSychSuccess;
    }

    public String getEasSychException() {
        return easSychException;
    }

    public void setEasSychException(String easSychException) {
        this.easSychException = easSychException;
    }

    public String getIsNeedEasSych() {
        return isNeedEasSych;
    }

    public void setIsNeedEasSych(String isNeedEasSych) {
        this.isNeedEasSych = isNeedEasSych;
    }

    public LocalDateTime getLastSychSuccessDate() {
        return lastSychSuccessDate;
    }

    public void setLastSychSuccessDate(LocalDateTime lastSychSuccessDate) {
        this.lastSychSuccessDate = lastSychSuccessDate;
    }

    public BigDecimal getCardOrigPrice() {
        return cardOrigPrice;
    }

    public void setCardOrigPrice(BigDecimal cardOrigPrice) {
        this.cardOrigPrice = cardOrigPrice;
    }

    public BigDecimal getCardOrigPriceRmb() {
        return cardOrigPriceRmb;
    }

    public void setCardOrigPriceRmb(BigDecimal cardOrigPriceRmb) {
        this.cardOrigPriceRmb = cardOrigPriceRmb;
    }

    public BigDecimal getCardDepreciationAmt() {
        return cardDepreciationAmt;
    }

    public void setCardDepreciationAmt(BigDecimal cardDepreciationAmt) {
        this.cardDepreciationAmt = cardDepreciationAmt;
    }

    public BigDecimal getCardDepreciationAmtRmb() {
        return cardDepreciationAmtRmb;
    }

    public void setCardDepreciationAmtRmb(BigDecimal cardDepreciationAmtRmb) {
        this.cardDepreciationAmtRmb = cardDepreciationAmtRmb;
    }

    public BigDecimal getCardAllowanceAmt() {
        return cardAllowanceAmt;
    }

    public void setCardAllowanceAmt(BigDecimal cardAllowanceAmt) {
        this.cardAllowanceAmt = cardAllowanceAmt;
    }

    public BigDecimal getCardAllowanceAmtRmb() {
        return cardAllowanceAmtRmb;
    }

    public void setCardAllowanceAmtRmb(BigDecimal cardAllowanceAmtRmb) {
        this.cardAllowanceAmtRmb = cardAllowanceAmtRmb;
    }

    public String getCardAssetNo() {
        return cardAssetNo;
    }

    public void setCardAssetNo(String cardAssetNo) {
        this.cardAssetNo = cardAssetNo;
    }

    public String getOwnerSpvId() {
        return ownerSpvId;
    }

    public void setOwnerSpvId(String ownerSpvId) {
        this.ownerSpvId = ownerSpvId;
    }

    public String getOwnerSpvName() {
        return ownerSpvName;
    }

    public void setOwnerSpvName(String ownerSpvName) {
        this.ownerSpvName = ownerSpvName;
    }

    public BigDecimal getDisposalAmt() {
        return disposalAmt;
    }

    public void setDisposalAmt(BigDecimal disposalAmt) {
        this.disposalAmt = disposalAmt;
    }

    public String getIsDisposal() {
        return isDisposal;
    }

    public void setIsDisposal(String isDisposal) {
        this.isDisposal = isDisposal;
    }

    public String getCardAssetName() {
        return cardAssetName;
    }

    public void setCardAssetName(String cardAssetName) {
        this.cardAssetName = cardAssetName;
    }

    public BigDecimal getCardNeatValue() {
        return cardNeatValue;
    }

    public void setCardNeatValue(BigDecimal cardNeatValue) {
        this.cardNeatValue = cardNeatValue;
    }

    public String getCardFnumber() {
        return cardFnumber;
    }

    public void setCardFnumber(String cardFnumber) {
        this.cardFnumber = cardFnumber;
    }

    public LocalDateTime getAssetCreateDate() {
        return assetCreateDate;
    }

    public void setAssetCreateDate(LocalDateTime assetCreateDate) {
        this.assetCreateDate = assetCreateDate;
    }

    public BigDecimal getOrigPriceDiff() {
        return origPriceDiff;
    }

    public void setOrigPriceDiff(BigDecimal origPriceDiff) {
        this.origPriceDiff = origPriceDiff;
    }

    public BigDecimal getAllowanceDiffAmt() {
        return allowanceDiffAmt;
    }

    public void setAllowanceDiffAmt(BigDecimal allowanceDiffAmt) {
        this.allowanceDiffAmt = allowanceDiffAmt;
    }

    public BigDecimal getDepreciationDiffAmt() {
        return depreciationDiffAmt;
    }

    public void setDepreciationDiffAmt(BigDecimal depreciationDiffAmt) {
        this.depreciationDiffAmt = depreciationDiffAmt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipImo() {
        return shipImo;
    }

    public void setShipImo(String shipImo) {
        this.shipImo = shipImo;
    }

    public String getShipCallSign() {
        return shipCallSign;
    }

    public void setShipCallSign(String shipCallSign) {
        this.shipCallSign = shipCallSign;
    }

    public String getShipNative() {
        return shipNative;
    }

    public void setShipNative(String shipNative) {
        this.shipNative = shipNative;
    }

    public String getShipClassSociety() {
        return shipClassSociety;
    }

    public void setShipClassSociety(String shipClassSociety) {
        this.shipClassSociety = shipClassSociety;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getShipTon() {
        return shipTon;
    }

    public void setShipTon(String shipTon) {
        this.shipTon = shipTon;
    }

    public String getShipDimension() {
        return shipDimension;
    }

    public void setShipDimension(String shipDimension) {
        this.shipDimension = shipDimension;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlaneMsn() {
        return planeMsn;
    }

    public void setPlaneMsn(String planeMsn) {
        this.planeMsn = planeMsn;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubCategory() {
        return productSubCategory;
    }

    public void setProductSubCategory(String productSubCategory) {
        this.productSubCategory = productSubCategory;
    }

    public String getProductCategoryDesc() {
        return productCategoryDesc;
    }

    public void setProductCategoryDesc(String productCategoryDesc) {
        this.productCategoryDesc = productCategoryDesc;
    }

    public String getProductSubCategoryDesc() {
        return productSubCategoryDesc;
    }

    public void setProductSubCategoryDesc(String productSubCategoryDesc) {
        this.productSubCategoryDesc = productSubCategoryDesc;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getCleanAmt() {
        return cleanAmt;
    }

    public void setCleanAmt(BigDecimal cleanAmt) {
        this.cleanAmt = cleanAmt;
    }

    public String getIsCleaned() {
        return isCleaned;
    }

    public void setIsCleaned(String isCleaned) {
        this.isCleaned = isCleaned;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName2() {
        return projectName2;
    }

    public void setProjectName2(String projectName2) {
        this.projectName2 = projectName2;
    }

    public String getProjectName3() {
        return projectName3;
    }

    public void setProjectName3(String projectName3) {
        this.projectName3 = projectName3;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public BigDecimal getMonthDepreciationAmt() {
        return monthDepreciationAmt;
    }

    public void setMonthDepreciationAmt(BigDecimal monthDepreciationAmt) {
        this.monthDepreciationAmt = monthDepreciationAmt;
    }

    public String getPlaneRegno() {
        return planeRegno;
    }

    public void setPlaneRegno(String planeRegno) {
        this.planeRegno = planeRegno;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public String getCardCurrency() {
        return cardCurrency;
    }

    public void setCardCurrency(String cardCurrency) {
        this.cardCurrency = cardCurrency;
    }

    @Override
    public String toString() {
        return "OlAssetInfoAdd{" +
        "seqno=" + seqno +
        ", assetSeqno=" + assetSeqno +
        ", assetNo=" + assetNo +
        ", assetName=" + assetName +
        ", currency=" + currency +
        ", origPrice=" + origPrice +
        ", origPriceRmb=" + origPriceRmb +
        ", depreciationAmt=" + depreciationAmt +
        ", depreciationAmtRmb=" + depreciationAmtRmb +
        ", estimateSalvageAmt=" + estimateSalvageAmt +
        ", depreciationMethod=" + depreciationMethod +
        ", estimateSalvageRatio=" + estimateSalvageRatio +
        ", ownerDepartmentCde=" + ownerDepartmentCde +
        ", ownerDepartmentName=" + ownerDepartmentName +
        ", allowanceAmt=" + allowanceAmt +
        ", allowanceAmtRmb=" + allowanceAmtRmb +
        ", assetStatusDesc=" + assetStatusDesc +
        ", isFixedAsset=" + isFixedAsset +
        ", fixAssetDate=" + fixAssetDate +
        ", lastEasSychDate=" + lastEasSychDate +
        ", isEasSychSuccess=" + isEasSychSuccess +
        ", easSychException=" + easSychException +
        ", isNeedEasSych=" + isNeedEasSych +
        ", lastSychSuccessDate=" + lastSychSuccessDate +
        ", cardOrigPrice=" + cardOrigPrice +
        ", cardOrigPriceRmb=" + cardOrigPriceRmb +
        ", cardDepreciationAmt=" + cardDepreciationAmt +
        ", cardDepreciationAmtRmb=" + cardDepreciationAmtRmb +
        ", cardAllowanceAmt=" + cardAllowanceAmt +
        ", cardAllowanceAmtRmb=" + cardAllowanceAmtRmb +
        ", cardAssetNo=" + cardAssetNo +
        ", ownerSpvId=" + ownerSpvId +
        ", ownerSpvName=" + ownerSpvName +
        ", disposalAmt=" + disposalAmt +
        ", isDisposal=" + isDisposal +
        ", cardAssetName=" + cardAssetName +
        ", cardNeatValue=" + cardNeatValue +
        ", cardFnumber=" + cardFnumber +
        ", assetCreateDate=" + assetCreateDate +
        ", origPriceDiff=" + origPriceDiff +
        ", allowanceDiffAmt=" + allowanceDiffAmt +
        ", depreciationDiffAmt=" + depreciationDiffAmt +
        ", shipName=" + shipName +
        ", shipType=" + shipType +
        ", shipImo=" + shipImo +
        ", shipCallSign=" + shipCallSign +
        ", shipNative=" + shipNative +
        ", shipClassSociety=" + shipClassSociety +
        ", shipNo=" + shipNo +
        ", shipTon=" + shipTon +
        ", shipDimension=" + shipDimension +
        ", manufacturer=" + manufacturer +
        ", planeMsn=" + planeMsn +
        ", planeType=" + planeType +
        ", productCategory=" + productCategory +
        ", productSubCategory=" + productSubCategory +
        ", productCategoryDesc=" + productCategoryDesc +
        ", productSubCategoryDesc=" + productSubCategoryDesc +
        ", taxRate=" + taxRate +
        ", cleanAmt=" + cleanAmt +
        ", isCleaned=" + isCleaned +
        ", mainManagerId=" + mainManagerId +
        ", mainManagerName=" + mainManagerName +
        ", coManagerId=" + coManagerId +
        ", coManagerName=" + coManagerName +
        ", projectName=" + projectName +
        ", projectName2=" + projectName2 +
        ", projectName3=" + projectName3 +
        ", unitName=" + unitName +
        ", monthDepreciationAmt=" + monthDepreciationAmt +
        ", planeRegno=" + planeRegno +
        ", regAddress=" + regAddress +
        ", cardCurrency=" + cardCurrency +
        "}";
    }
}
