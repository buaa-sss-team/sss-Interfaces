package com.yuyuyzl.SSS.models;

import java.io.Serializable;

public class administrator implements Serializable {
    private int id;
    private String name;
    private String password;
    private String personalInformationJson;

    public administrator(int id) {
        this.id = id;
    }

    public administrator(int id, String name, String password, String personalInformationJson) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.personalInformationJson = personalInformationJson;
    }

    public administrator() {
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
}
