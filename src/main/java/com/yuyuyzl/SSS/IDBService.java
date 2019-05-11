package com.yuyuyzl.SSS;
import com.yuyuyzl.SSS.models.*;
import java.sql.*;
public interface IDBService {
    //user
    public Boolean addUser(user x);
    public Boolean delUser(int id);
    public Boolean updateUser(user x);
    public user queryUser(int id);


}
