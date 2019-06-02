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
public class Patent implements Serializable {
    private Integer resId;
    private Integer patentId;
    private String patentType;

    @Id
    @Column(name = "resID")
    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @Basic
    @Column(name = "patentID")
    public Integer getPatentId() {
        return patentId;
    }

    public void setPatentId(Integer patentId) {
        this.patentId = patentId;
    }

    @Basic
    @Column(name = "patentType")
    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patent patent = (Patent) o;

        if (resId != null ? !resId.equals(patent.resId) : patent.resId != null) return false;
        if (patentId != null ? !patentId.equals(patent.patentId) : patent.patentId != null) return false;
        if (patentType != null ? !patentType.equals(patent.patentType) : patent.patentType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resId != null ? resId.hashCode() : 0;
        result = 31 * result + (patentId != null ? patentId.hashCode() : 0);
        result = 31 * result + (patentType != null ? patentType.hashCode() : 0);
        return result;
    }
}
