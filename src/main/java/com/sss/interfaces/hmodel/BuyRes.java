package com.sss.interfaces.hmodel;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BuyRes implements Serializable{
    private Integer auditId;
    private Integer type;
    private Integer costCredit;

    @Id
    @Column(name = "auditID")
    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "costCredit")
    public Integer getCostCredit() {
        return costCredit;
    }

    public void setCostCredit(Integer costCredit) {
        this.costCredit = costCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuyRes buyRes = (BuyRes) o;

        if (auditId != null ? !auditId.equals(buyRes.auditId) : buyRes.auditId != null) return false;
        if (type != null ? !type.equals(buyRes.type) : buyRes.type != null) return false;
        if (costCredit != null ? !costCredit.equals(buyRes.costCredit) : buyRes.costCredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = auditId != null ? auditId.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (costCredit != null ? costCredit.hashCode() : 0);
        return result;
    }
}
