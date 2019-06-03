package com.sss.interfaces;
import com.sss.interfaces.hmodel.User;
public interface ITestUserService {
    User getUser(int id);
    boolean addUser(User user);
}
