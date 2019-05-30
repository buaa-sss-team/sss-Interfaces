package com.sss.interfaces.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Logs implements Serializable {
    private Timestamp time;
    private String info;

    public Logs() {
    }

    public Logs(Timestamp time) {
        this.time = time;
    }

    public Logs(Timestamp time, String info) {
        this.time = time;
        this.info = info;
    }

    public Timestamp getTime() {
        return time;
    }

    public String getInfo() {
        return info;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
