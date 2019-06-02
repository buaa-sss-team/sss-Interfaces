package com.sss.interfaces.service;

import com.sss.interfaces.model.user;

public interface IAuthorization {
    //登陆，成功返回1，错误返回0
    int userLogin(String name, String pwd);
    //注册，不检查用户名重合
    int userSignIn(String name, String pwd);
}
