package com.zl.service;

import com.zl.entity.Login;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
public interface LoginService  {

    public Login login(String name,String pwd);
}
