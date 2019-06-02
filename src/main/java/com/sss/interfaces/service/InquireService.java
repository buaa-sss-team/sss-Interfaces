package com.sss.interfaces.service;

import com.sss.interfaces.hmodel.User;

public interface InquireService {
    User getUserInfo(int id);
    User getUserInfo(String name);
}
