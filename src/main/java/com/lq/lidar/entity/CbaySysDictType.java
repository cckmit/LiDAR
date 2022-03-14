package com.lq.lidar.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@TableName("cbay_sys_dict_type")
public class CbaySysDictType implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dictTypeCd;

    private String dictTypeEnDesc;

    private String dictTypeCnDesc;

    private String appCd;

    private String defVal;

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
