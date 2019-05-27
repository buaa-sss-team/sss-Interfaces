package com.yuyuyzl.SSS.models;

import java.io.Serializable;

public class expertTag implements Serializable{
    private int id;
    private  String tag;

    public expertTag(int id) {
        this.id = id;
    }

    public expertTag() {
    }

    public expertTag(int id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
