package com.yuyuyzl.SSS.models;
import java.io.Serializable;
//用户类
public class user implements Serializable{
    private int id;
    private String name;
    private String password;
    private String personalInformationJson;
    private String boughtThings;
    private int credit;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonalInformationJson(String personalInformationJson) {
        this.personalInformationJson = personalInformationJson;
    }

    public void setBoughtThings(String boughtThings) {
        this.boughtThings = boughtThings;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonalInformationJson() {
        return personalInformationJson;
    }

    public String getBoughtThings() {
        return boughtThings;
    }

    public int getCredit() {
        return credit;
    }

    public user(int id) {
        this.id = id;
    }
    public user(int id, String name, String password, String personalInformationJson, String boughtThings, int credit) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.personalInformationJson = personalInformationJson;
        this.boughtThings = boughtThings;
        this.credit = credit;
    }
    public user(){

    }
}
