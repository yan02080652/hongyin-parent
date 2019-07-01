package com.hy.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.hy.pojo.Result;
import com.hy.pojo.StatusCode;
import com.hy.pojo.User;
import com.hy.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/login")
    public Result login(String phone){
        if (phone != null && !phone.equals("")){
            System.out.println(phone);
        }else{
            System.out.println("phone 为 null");
        }
        return new Result(true, StatusCode.OK,"登录成功",userService.login());
    }

}
