package com.yuyuyzl.SSS.models;

import java.io.Serializable;

public class scientificResTag implements Serializable {

    private int resID;
    private String tag;

    public scientificResTag(int resID) {
        this.resID = resID;
    }

    public scientificResTag() {
    }

    public scientificResTag(int resID, String tag) {
        this.resID = resID;
        this.tag = tag;
    }

    public int getResID() {
        return resID;
    }

    public String getTag() {
        return tag;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
