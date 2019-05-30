package com.yuyuyzl.SSS;

import com.yuyuyzl.SSS.models.TestUser;

import javax.xml.ws.ServiceMode;
import java.util.List;

public interface ITestUserService {
    TestUser getUser(int id);
    List<TestUser> getAllUser();
    boolean addUser(TestUser user);
}
