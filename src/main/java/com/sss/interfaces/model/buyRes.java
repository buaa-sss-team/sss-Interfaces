package com.sss.interfaces.model;

import java.io.Serializable;
//科技成果购买
public class buyRes implements Serializable {
    private int auditID;
    private int type;
    private int costCredit;

    public buyRes(int auditID) {
        this.auditID = auditID;
    }

    public buyRes() {
    }

    public buyRes(int auditID, int type, int costCredit) {
        this.auditID = auditID;
        this.type = type;
        this.costCredit = costCredit;
    }

    public int getAuditID() {
        return auditID;
    }

    public int getType() {
        return type;
    }

    public int getCostCredit() {
        return costCredit;
    }

    public void setAuditID(int auditID) {
        this.auditID = auditID;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCostCredit(int costCredit) {
        this.costCredit = costCredit;
    }
}
