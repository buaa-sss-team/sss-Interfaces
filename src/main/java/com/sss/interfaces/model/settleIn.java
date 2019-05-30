package com.sss.interfaces.model;

import java.io.Serializable;

public class settleIn implements Serializable {
    private int auditID;
    private String content;

    public settleIn(int auditID) {
        this.auditID = auditID;
    }

    public settleIn(int auditID, String content) {
        this.auditID = auditID;
        this.content = content;
    }

    public settleIn() {
    }

    public int getAuditID() {
        return auditID;
    }

    public String getContent() {
        return content;
    }

    public void setAuditID(int auditID) {
        this.auditID = auditID;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
