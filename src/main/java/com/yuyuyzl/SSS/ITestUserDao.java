package com.yuyuyzl.SSS;

import com.yuyuyzl.SSS.models.TestUser;

import java.util.List;

public interface ITestUserDao {
    TestUser getUser(int id);
    List<TestUser> getAllUser();
    boolean addUser(TestUser user);
}
