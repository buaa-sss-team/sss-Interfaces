package com.sss.interfaces.dao;

import com.sss.interfaces.hmodel.Buyres;
import com.sss.interfaces.hmodel.Payment;
import com.sss.interfaces.hmodel.Tobeexpert;
import com.sss.interfaces.hmodel.User;

import java.lang.Class;
import java.util.List;

public interface IHDBdao {
    int insert(Object obj);
    int update(Object obj);
    int delete(Object obj);
    Object getByID(Class cls,int ID);

    List<Tobeexpert> getTobeexpertBystatus(int st);
    List<Buyres> getBuyresBystatus(int st);

    User getUserByName(String name);

}
