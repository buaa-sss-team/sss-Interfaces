package com.sss.interfaces.dao;

import com.sss.interfaces.hmodel.User;

import java.util.List;

public interface IHDBdao {
    void insertUser(User who);
    void updateUser(User who);
    User getUserByID(int id);
    void deleteUserByID(int ID);
    List<User>getUserByName(String name);

}
