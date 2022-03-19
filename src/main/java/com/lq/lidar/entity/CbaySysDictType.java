package com.lq.lidar.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LQ
 * @since 2022-03-15
 */
@TableName("cbay_sys_dict_type")
public class CbaySysDictType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("\"DICT_TYPE_CD\"")
    @NotBlank(message = "字典类型不能为空")
    private String dictTypeCd;

    @TableField("\"DICT_TYPE_EN_DESC\"")
    private String dictTypeEnDesc;

    @TableField("\"DICT_TYPE_CN_DESC\"")
    private String dictTypeCnDesc;

    @TableField("\"APP_CD\"")
    private String appCd;

    @TableField("\"DEF_VAL\"")
    private String defVal;

    @TableField("\"VALID_IND\"")
    private String validInd;


    public String getDictTypeCd() {
        return dictTypeCd;
    }

    public void setDictTypeCd(String dictTypeCd) {
        this.dictTypeCd = dictTypeCd;
    }

    public String getDictTypeEnDesc() {
        return dictTypeEnDesc;
    }

    public void setDictTypeEnDesc(String dictTypeEnDesc) {
        this.dictTypeEnDesc = dictTypeEnDesc;
    }

    public String getDictTypeCnDesc() {
        return dictTypeCnDesc;
    }

    public void setDictTypeCnDesc(String dictTypeCnDesc) {
        this.dictTypeCnDesc = dictTypeCnDesc;
    }

    public String getAppCd() {
        return appCd;
    }

    public void setAppCd(String appCd) {
        this.appCd = appCd;
    }

    public String getDefVal() {
        return defVal;
    }

    public void setDefVal(String defVal) {
        this.defVal = defVal;
    }

    public String getValidInd() {
        return validInd;
    }

    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    @Override
    public String toString() {
        return "CbaySysDictType{" +
        "dictTypeCd=" + dictTypeCd +
        ", dictTypeEnDesc=" + dictTypeEnDesc +
        ", dictTypeCnDesc=" + dictTypeCnDesc +
        ", appCd=" + appCd +
        ", defVal=" + defVal +
        ", validInd=" + validInd +
        "}";
    }
}
