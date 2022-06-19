package com.lq.lidar.common.utils;


import com.lq.lidar.common.constant.HttpStatus;
import com.lq.lidar.common.exception.ServiceException;
import com.lq.lidar.domain.dto.LoginUser;
import com.lq.lidar.domain.entity.CbaySysUser;

/**
 * 安全服务工具类
 * 
 * @author LQ
 */
public class SecurityUtils
{
    /**
     * 用户ID
     **/
    public static String getUserId()
    {
        try
        {
            return getLoginUser().getUserId();
        }
        catch (Exception e)
        {
            throw new ServiceException("获取用户ID异常", HttpStatus.UNAUTHORIZED);
        }
    }

    /**
     * 获取部门ID
     **/
    public static Long getDeptId()
    {
        try
        {
            return getLoginUser().getDeptId();
        }
        catch (Exception e)
        {
            throw new ServiceException("获取部门ID异常", HttpStatus.UNAUTHORIZED);
        }
    }
    
    /**
     * 获取用户账户
     **/
    public static String getUsername()
    {
        try
        {
            return getLoginUser().getUsername();
        }
        catch (Exception e)
        {
            throw new ServiceException("获取用户账户异常", HttpStatus.UNAUTHORIZED);
        }
    }

    /**
     * 获取用户
     **/
    public static LoginUser getLoginUser()
    {
        try
        {
//            return (LoginUser) getAuthentication().getPrincipal();
            LoginUser loginUser = new LoginUser();
            CbaySysUser cbaySysUser = new CbaySysUser();
            cbaySysUser.setUserId("admin");
            cbaySysUser.setUserNm("admin");
            loginUser.setUser(cbaySysUser);
            return loginUser;
        }
        catch (Exception e)
        {
            throw new ServiceException("获取用户信息异常", HttpStatus.UNAUTHORIZED);
        }
    }

    /**
     * 获取Authentication
     */
//    public static Authentication getAuthentication()
//    {
//        return SecurityContextHolder.getContext().getAuthentication();
//    }

    /**
     * 生成BCryptPasswordEncoder密码
     *
     * @param password 密码
     * @return 加密字符串
     */
//    public static String encryptPassword(String password)
//    {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        return passwordEncoder.encode(password);
//    }

    /**
     * 判断密码是否相同
     *
     * @param rawPassword 真实密码
     * @param encodedPassword 加密后字符
     * @return 结果
     */
//    public static boolean matchesPassword(String rawPassword, String encodedPassword)
//    {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        return passwordEncoder.matches(rawPassword, encodedPassword);
//    }

    /**
     * 是否为管理员
     * 
     * @param userId 用户ID
     * @return 结果
     */
    public static boolean isAdmin(Long userId)
    {
        return userId != null && 1L == userId;
    }
}
