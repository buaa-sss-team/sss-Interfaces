package com.yuyuyzl.SSS.models;

import java.io.Serializable;
import java.sql.Time;

public class auditapplication implements Serializable {
    private int auditID;
    private int customID;
    private int adminID;
    private Time createtime;
    private int status;//状态

    public auditapplication(int auditID) {
        this.auditID = auditID;
    }

    public auditapplication() {
    }

    public auditapplication(int auditID, int customID, int adminID, Time createtime, int status) {
        this.auditID = auditID;
        this.customID = customID;
        this.adminID = adminID;
        this.createtime = createtime;
        this.status = status;
    }

    public int getAuditID() {
        return auditID;
    }

    public int getCustomID() {
        return customID;
    }

    public int getAdminID() {
        return adminID;
    }

    public Time getCreatetime() {
        return createtime;
    }

    public int getStatus() {
        return status;
    }

    public void setAuditID(int auditID) {
        this.auditID = auditID;
    }

    public void setCustomID(int customID) {
        this.customID = customID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public void setCreatetime(Time createtime) {
        this.createtime = createtime;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
