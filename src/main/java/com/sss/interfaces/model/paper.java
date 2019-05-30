package com.sss.interfaces.model;

import java.io.Serializable;

public class paper implements Serializable {
    private int resID;
    private String source;
    private String keyWords;

    public void setResID(int resID) {
        this.resID = resID;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public int getResID() {
        return resID;
    }

    public String getSource() {
        return source;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public paper(int resID) {
        this.resID = resID;
    }

    public paper() {
    }

    public paper(int resID, String source, String keyWords) {
        this.resID = resID;
        this.source = source;
        this.keyWords = keyWords;
    }
}
