package com.zl.controller;


import com.zl.entity.Login;
import com.zl.service.LoginService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */

@RestController
public class LoginController {

    @Reference(url = "localhost:20880")
    LoginService loginService;

    @RequestMapping("/login")
    public Login login(@RequestParam(defaultValue = "")String name,@RequestParam(defaultValue = "")String pwd){

        return loginService.login(name, pwd);
    }
}
