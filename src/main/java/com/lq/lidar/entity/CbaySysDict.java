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
@TableName("cbay_sys_dict")
public class CbaySysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String dictId;

    private String dictTypeCd;

    private String dictCd;

    private String dictEnDesc;

    private String dictCnDesc;

    private String validInd;


    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeCd() {
        return dictTypeCd;
    }

    public void setDictTypeCd(String dictTypeCd) {
        this.dictTypeCd = dictTypeCd;
    }

    public String getDictCd() {
        return dictCd;
    }

    public void setDictCd(String dictCd) {
        this.dictCd = dictCd;
    }

    public String getDictEnDesc() {
        return dictEnDesc;
    }

    public void setDictEnDesc(String dictEnDesc) {
        this.dictEnDesc = dictEnDesc;
    }

    public String getDictCnDesc() {
        return dictCnDesc;
    }

    public void setDictCnDesc(String dictCnDesc) {
        this.dictCnDesc = dictCnDesc;
    }

    public String getValidInd() {
        return validInd;
    }

    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    @Override
    public String toString() {
        return "CbaySysDict{" +
        "dictId=" + dictId +
        ", dictTypeCd=" + dictTypeCd +
        ", dictCd=" + dictCd +
        ", dictEnDesc=" + dictEnDesc +
        ", dictCnDesc=" + dictCnDesc +
        ", validInd=" + validInd +
        "}";
    }
}
