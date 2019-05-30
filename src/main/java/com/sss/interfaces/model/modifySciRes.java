package com.sss.interfaces.model;

import java.io.Serializable;

public class modifySciRes implements Serializable{
    private  int auditID;
    private  int type;
    private int itemID;

    public modifySciRes(int auditID) {
        this.auditID = auditID;
    }

    public modifySciRes() {
    }

    public modifySciRes(int auditID, int type, int itemID) {
        this.auditID = auditID;
        this.type = type;
        this.itemID = itemID;
    }

    public int getAuditID() {
        return auditID;
    }

    public int getType() {
        return type;
    }

    public int getItemID() {
        return itemID;
    }

    public void setAuditID(int auditID) {
        this.auditID = auditID;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
