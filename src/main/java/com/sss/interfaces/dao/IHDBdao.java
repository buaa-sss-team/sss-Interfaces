package com.sss.interfaces.dao;

import java.lang.Class;
import java.util.List;
import com.sss.interfaces.hmodel.*;
public interface IHDBdao {
    int insert(Object obj);
    int update(Object obj);
    int delete(Object obj);
    Object getByID(Class cls,int ID);

    List<Tobeexpert> getTobeexpertBystatus(int st);
    List<Buyres> getBuyresBystatus(int st);

    User getUserByName(String name);

}
