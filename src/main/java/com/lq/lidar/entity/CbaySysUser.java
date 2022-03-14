package com.lq.lidar.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@TableName("cbay_sys_user")
public class CbaySysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;

    /**
     *
     */
    private String ofcId;

    /**
     * 部门id
     */
    private String depId;

    /**
     * 登录名
     */
    private String loginNm;

    /**
     * 密码
     */
    private String password;

    /**
     * 编号
     */
    private String userNbr;

    /**
     * 用户名
     */
    private String userNm;

    /**
     * 邮箱
     */
    private String userEmail;

    private String userTel;

    private String userMobile;

    private String userTypeCd;

    private String userPhotoUrl;

    private String loginIp;

    private LocalDateTime loginTime;

    private String loginInd;

    private String validInd;

    private String userOaNm;

    private String weakPwInd;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOfcId() {
        return ofcId;
    }

    public void setOfcId(String ofcId) {
        this.ofcId = ofcId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getLoginNm() {
        return loginNm;
    }

    public void setLoginNm(String loginNm) {
        this.loginNm = loginNm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNbr() {
        return userNbr;
    }

    public void setUserNbr(String userNbr) {
        this.userNbr = userNbr;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserTypeCd() {
        return userTypeCd;
    }

    public void setUserTypeCd(String userTypeCd) {
        this.userTypeCd = userTypeCd;
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginInd() {
        return loginInd;
    }

    public void setLoginInd(String loginInd) {
        this.loginInd = loginInd;
    }

    public String getValidInd() {
        return validInd;
    }

    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    public String getUserOaNm() {
        return userOaNm;
    }

    public void setUserOaNm(String userOaNm) {
        this.userOaNm = userOaNm;
    }

    public String getWeakPwInd() {
        return weakPwInd;
    }

    public void setWeakPwInd(String weakPwInd) {
        this.weakPwInd = weakPwInd;
    }

    @Override
    public String toString() {
        return "CbaySysUser{" +
        "userId=" + userId +
        ", ofcId=" + ofcId +
        ", depId=" + depId +
        ", loginNm=" + loginNm +
        ", password=" + password +
        ", userNbr=" + userNbr +
        ", userNm=" + userNm +
        ", userEmail=" + userEmail +
        ", userTel=" + userTel +
        ", userMobile=" + userMobile +
        ", userTypeCd=" + userTypeCd +
        ", userPhotoUrl=" + userPhotoUrl +
        ", loginIp=" + loginIp +
        ", loginTime=" + loginTime +
        ", loginInd=" + loginInd +
        ", validInd=" + validInd +
        ", userOaNm=" + userOaNm +
        ", weakPwInd=" + weakPwInd +
        "}";
    }
}
