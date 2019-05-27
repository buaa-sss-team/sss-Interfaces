package com.yuyuyzl.SSS.models;

import java.io.Serializable;

public class patent implements Serializable {
    private int resID;
    private int patentID;
    private String patentType;

    public patent(int patentID) {
        this.patentID = patentID;
    }

    public patent(int resID, int patentID, String patentType) {

        this.resID = resID;
        this.patentID = patentID;
        this.patentType = patentType;
    }

    public patent() {
    }

    public int getResID() {
        return resID;
    }

    public int getPatentID() {
        return patentID;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public void setPatentID(int patentID) {
        this.patentID = patentID;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }
}
