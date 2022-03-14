package com.lq.lidar.common.exception;

/**
 * @author LQ
 */
public class UserPasswordNotMatchException extends BaseException {

    public UserPasswordNotMatchException() {
        super(500, "用户名或密码不正确!");
    }
}
