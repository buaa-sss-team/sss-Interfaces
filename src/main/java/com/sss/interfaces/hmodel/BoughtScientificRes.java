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
public class BoughtScientificRes implements Serializable{
    private Integer id;
    private String patentIDs;
    private String paperIDs;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "patentIDs")
    public String getPatentIDs() {
        return patentIDs;
    }

    public void setPatentIDs(String patentIDs) {
        this.patentIDs = patentIDs;
    }

    @Basic
    @Column(name = "paperIDs")
    public String getPaperIDs() {
        return paperIDs;
    }

    public void setPaperIDs(String paperIDs) {
        this.paperIDs = paperIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoughtScientificRes that = (BoughtScientificRes) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (patentIDs != null ? !patentIDs.equals(that.patentIDs) : that.patentIDs != null) return false;
        if (paperIDs != null ? !paperIDs.equals(that.paperIDs) : that.paperIDs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (patentIDs != null ? patentIDs.hashCode() : 0);
        result = 31 * result + (paperIDs != null ? paperIDs.hashCode() : 0);
        return result;
    }
}
