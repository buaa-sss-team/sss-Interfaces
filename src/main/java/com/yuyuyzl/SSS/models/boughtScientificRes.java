package com.yuyuyzl.SSS.models;

import java.io.Serializable;
//用户已购买科技资源
public class boughtScientificRes implements Serializable {
    private  int id;
    private String patentIDs;
    private String paperIDs;

    public boughtScientificRes(int id) {
        this.id = id;
    }

    public boughtScientificRes() {
    }

    public boughtScientificRes(int id, String patentIDs, String paperIDs) {
        this.id = id;
        this.patentIDs = patentIDs;
        this.paperIDs = paperIDs;
    }

    public int getId() {
        return id;
    }

    public String getPatentIDs() {
        return patentIDs;
    }

    public String getPaperIDs() {
        return paperIDs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatentIDs(String patentIDs) {
        this.patentIDs = patentIDs;
    }

    public void setPaperIDs(String paperIDs) {
        this.paperIDs = paperIDs;
    }
}
