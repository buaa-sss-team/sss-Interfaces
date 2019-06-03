package com.sss.interfaces.service;
import com.sss.interfaces.hmodel.User;
public interface AuthorizationService {
    /***
     * 用户登录方法
     * @param name 用户账号
     * @param pwd 用户密码
     * @return 成功返回0，失败返回1
     */
    int userLogin(String name, String pwd);
    /***
     * 用户注册方法
     * @param user 用户实例，不用填写id，
     * @return 成功返回0，失败返回1
     */
    int userSignIn(User user);
}
