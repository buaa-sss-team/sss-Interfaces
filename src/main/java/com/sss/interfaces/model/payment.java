package com.sss.interfaces.model;

import java.io.Serializable;

//现金业务
public class payment implements Serializable {
    private int auditID;
    private double money;
    private int type;

    public payment() {
    }

    public payment(int auditID) {
        this.auditID = auditID;
    }

    public payment(int auditID, double money, int type) {
        this.auditID = auditID;
        this.money = money;
        this.type = type;
    }

    public int getAuditID() {
        return auditID;
    }

    public double getMoney() {
        return money;
    }

    public int getType() {
        return type;
    }

    public void setAuditID(int auditID) {
        this.auditID = auditID;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setType(int type) {
        this.type = type;
    }
}
