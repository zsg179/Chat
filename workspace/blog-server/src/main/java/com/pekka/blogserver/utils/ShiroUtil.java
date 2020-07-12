package com.pekka.blogserver.utils;

import com.pekka.blogserver.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @Auther :朱树广
 * @Date :2020/6/19
 * @Description :com.pekka.blogserver.utils
 * @Version :1.0
 */
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
