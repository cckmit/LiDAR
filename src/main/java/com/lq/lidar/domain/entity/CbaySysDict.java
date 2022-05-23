package com.lq.lidar.domain.entity;

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
@TableName("cbay_sys_dict")
public class CbaySysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键同字典值
     */
    @TableId("\"DICT_ID\"")
//    @NotBlank(message = "字典值不能为空")
    private String dictId;

    /**
     * 字典类型id
     */
    @TableField("\"DICT_TYPE_CD\"")
    @NotBlank(message = "字典类型ID不能为空")
    private String dictTypeCd;

    /**
     * 字典值
     */
    @TableField("\"DICT_CD\"")
    private String dictCd;

    /**
     *字典值英文描述
     */
    @TableField("\"DICT_EN_DESC\"")
    @NotBlank(message = "字典值英文描述不能为空")
    private String dictEnDesc;

    /**
     *字典值中文描述
     */
    @TableField("\"DICT_CN_DESC\"")
    @NotBlank(message = "字典值中文描述不能为空")
    private String dictCnDesc;

    /**
     *是否启用标志位（预留）
     */
    @TableField("\"VALID_IND\"")
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
