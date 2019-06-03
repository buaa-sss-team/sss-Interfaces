package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static org.hibernate.annotations.GenerationTime.ALWAYS;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE )
public class Expert implements Serializable {
    private Integer id;
    private Integer hIndex;
    private Integer nCitation;
    private Integer nPubs;
    private String name;
    private String orgs;
    private String position;
    private String pubid;
    private String rank;
    private String tags;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer isdelete;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "h_index")
    public Integer gethIndex() {
        return hIndex;
    }

    public void sethIndex(Integer hIndex) {
        this.hIndex = hIndex;
    }

    @Basic
    @Column(name = "n_citation")
    public Integer getnCitation() {
        return nCitation;
    }

    public void setnCitation(Integer nCitation) {
        this.nCitation = nCitation;
    }

    @Basic
    @Column(name = "n_pubs")
    public Integer getnPubs() {
        return nPubs;
    }

    public void setnPubs(Integer nPubs) {
        this.nPubs = nPubs;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "orgs")
    public String getOrgs() {
        return orgs;
    }

    public void setOrgs(String orgs) {
        this.orgs = orgs;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "pubid")
    public String getPubid() {
        return pubid;
    }

    public void setPubid(String pubid) {
        this.pubid = pubid;
    }

    @Basic
    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Basic
    @org.hibernate.annotations.Generated(ALWAYS)
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @org.hibernate.annotations.Generated(ALWAYS)
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "isdelete")
    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expert expert = (Expert) o;

        if (id != null ? !id.equals(expert.id) : expert.id != null) return false;
        if (hIndex != null ? !hIndex.equals(expert.hIndex) : expert.hIndex != null) return false;
        if (nCitation != null ? !nCitation.equals(expert.nCitation) : expert.nCitation != null) return false;
        if (nPubs != null ? !nPubs.equals(expert.nPubs) : expert.nPubs != null) return false;
        if (name != null ? !name.equals(expert.name) : expert.name != null) return false;
        if (orgs != null ? !orgs.equals(expert.orgs) : expert.orgs != null) return false;
        if (position != null ? !position.equals(expert.position) : expert.position != null) return false;
        if (pubid != null ? !pubid.equals(expert.pubid) : expert.pubid != null) return false;
        if (rank != null ? !rank.equals(expert.rank) : expert.rank != null) return false;
        if (tags != null ? !tags.equals(expert.tags) : expert.tags != null) return false;
        if (createTime != null ? !createTime.equals(expert.createTime) : expert.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(expert.updateTime) : expert.updateTime != null) return false;
        if (isdelete != null ? !isdelete.equals(expert.isdelete) : expert.isdelete != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (hIndex != null ? hIndex.hashCode() : 0);
        result = 31 * result + (nCitation != null ? nCitation.hashCode() : 0);
        result = 31 * result + (nPubs != null ? nPubs.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (orgs != null ? orgs.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (pubid != null ? pubid.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (isdelete != null ? isdelete.hashCode() : 0);
        return result;
    }
}
