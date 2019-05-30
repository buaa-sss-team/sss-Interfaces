package com.sss.interfaces.service;

import com.sss.interfaces.model.user;

public interface IAuthorization {
    int userLogin(user user);
    int userSignIn(String account, String pwd);
}
