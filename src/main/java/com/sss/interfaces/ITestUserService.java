package com.sss.interfaces;

import com.sss.interfaces.hmodel.User;

import java.util.List;

public interface ITestUserService {
    User getUser(int id);
    boolean addUser(User user);
}
