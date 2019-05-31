package com.sss.interfaces.dao;

import com.sss.interfaces.hmodel.User;

public interface IHDBdao {
    void init();
    void insertUser(User who);
    void updateUser(User who);
    User getUserByID(int id);
    void deleteUserByID(int ID);

}
