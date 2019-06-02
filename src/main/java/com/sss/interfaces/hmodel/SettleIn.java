package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class SettleIn implements Serializable {
    private Integer auditId;
    private String content;

    @Id
    @Column(name = "auditID")
    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettleIn settleIn = (SettleIn) o;

        if (auditId != null ? !auditId.equals(settleIn.auditId) : settleIn.auditId != null) return false;
        if (content != null ? !content.equals(settleIn.content) : settleIn.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = auditId != null ? auditId.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
