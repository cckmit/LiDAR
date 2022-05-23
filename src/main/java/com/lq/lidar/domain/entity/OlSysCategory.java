package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 字典层级表
 * </p>
 *
 * @author LQ
 * @since 2022-05-06
 */
@TableName("ol_sys_category")
public class OlSysCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("\"SEQNO\"")
    private String seqno;

    /**
     *
     */
    @TableField("\"IDENTIFY\"")
    private String identify;

    /**
     *
     */
    @TableField("\"CATEGORY_CODE\"")
    private String categoryCode;

    /**
     *
     */
    @TableField("\"CATEGORY_NAME\"")
    private String categoryName;

    /**
     *
     */
    @TableField("\"PARENT_CODE\"")
    private String parentCode;

    /**
     *
     */
    @TableField("\"PARENT_CODE_NAME\"")
    private String parentCodeName;

    /**
     * 备注
     */
    @TableField("\"MEMO\"")
    private String memo;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentCodeName() {
        return parentCodeName;
    }

    public void setParentCodeName(String parentCodeName) {
        this.parentCodeName = parentCodeName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "OlSysCategory{" +
        "seqno=" + seqno +
        ", identify=" + identify +
        ", categoryCode=" + categoryCode +
        ", categoryName=" + categoryName +
        ", parentCode=" + parentCode +
        ", parentCodeName=" + parentCodeName +
        ", memo=" + memo +
        "}";
    }
}
