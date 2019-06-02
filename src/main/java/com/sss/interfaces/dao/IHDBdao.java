package com.sss.interfaces.dao;

import com.sss.interfaces.hmodel.User;

import java.lang.Class;
import java.util.List;

public interface IHDBdao {
    int insert(Object obj);
    int update(Object obj);
    int delete(Object obj);
    Object getByID(Class cls,int ID);

    User getUserByName(String name);
}
