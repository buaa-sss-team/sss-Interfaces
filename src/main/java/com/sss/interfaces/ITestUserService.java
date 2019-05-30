package com.sss.interfaces;

import com.sss.interfaces.model.TestUser;

import java.util.List;

public interface ITestUserService {
    TestUser getUser(int id);
    List<TestUser> getAllUser();
    boolean addUser(TestUser user);
}
