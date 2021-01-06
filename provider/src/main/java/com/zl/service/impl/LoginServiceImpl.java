package com.zl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.entity.Login;
import com.zl.mapper.LoginMapper;
import com.zl.service.LoginService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login> implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public Login login(String name, String pwd) {

        return loginMapper.login(name, pwd);
    }
}
