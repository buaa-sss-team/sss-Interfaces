package com.yuyuyzl.SSS.models;

import java.io.Serializable;

public class tags implements Serializable {
    private String tag;

    public tags(String tag) {
        this.tag = tag;
    }

    public tags() {
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
