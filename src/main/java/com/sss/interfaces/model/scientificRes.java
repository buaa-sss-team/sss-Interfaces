package com.sss.interfaces.model;

import java.io.Serializable;

public class scientificRes implements Serializable {
    private String authorsID;
    private int resID;
    private String resTitle;
    private float searchPopularity;
    private float downloadPopularity;
    private String organization;
    private String abstracts;
    private String url;

    public String getAuthorsID() {
        return authorsID;
    }

    public int getResID() {
        return resID;
    }

    public String getResTitle() {
        return resTitle;
    }

    public float getSearchPopularity() {
        return searchPopularity;
    }

    public float getDownloadPopularity() {
        return downloadPopularity;
    }

    public String getOrganization() {
        return organization;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public String getUrl() {
        return url;
    }

    public void setAuthorsID(String authorsID) {
        this.authorsID = authorsID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public void setResTitle(String resTitle) {
        this.resTitle = resTitle;
    }

    public void setSearchPopularity(float searchPopularity) {
        this.searchPopularity = searchPopularity;
    }

    public void setDownloadPopularity(float downloadPopularity) {
        this.downloadPopularity = downloadPopularity;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public scientificRes(int resID) {
        this.resID = resID;
    }

    public scientificRes(String authorsID, int resID, String resTitle, float searchPopularity, float downloadPopularity, String organization, String abstracts, String url) {
        this.authorsID = authorsID;
        this.resID = resID;
        this.resTitle = resTitle;
        this.searchPopularity = searchPopularity;
        this.downloadPopularity = downloadPopularity;
        this.organization = organization;
        this.abstracts = abstracts;
        this.url = url;
    }

    public scientificRes() {
    }
}
