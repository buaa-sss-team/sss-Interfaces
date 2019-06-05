package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Timestamp;

import static org.hibernate.annotations.GenerationTime.ALWAYS;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE )
public class Paper implements Serializable {
    private Integer id;
    private String authorId;
    private Integer searchvalue;
    private String title;
    private Integer downvalue;
    private String org;
    private String abs;
    private Integer year;
    private String keywords;
    private Integer cNumber;
    private String docType;
    private String lang;
    private String sid;
    private String volume;
    private String issue;
    private String issn;
    private String isbn;
    private String url;
    private Integer cost;
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
    @Column(name = "authorID")
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "searchvalue")
    public Integer getSearchvalue() {
        return searchvalue;
    }

    public void setSearchvalue(Integer searchvalue) {
        this.searchvalue = searchvalue;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "downvalue")
    public Integer getDownvalue() {
        return downvalue;
    }

    public void setDownvalue(Integer downvalue) {
        this.downvalue = downvalue;
    }

    @Basic
    @Column(name = "org")
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Basic
    @Column(name = "abstract")
    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    @Basic
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "c_number")
    public Integer getcNumber() {
        return cNumber;
    }

    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }

    @Basic
    @Column(name = "doc_type")
    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    @Basic
    @Column(name = "lang")
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Basic
    @Column(name = "sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "volume")
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "issue")
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Basic
    @Column(name = "issn")
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Basic
    @Column(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Basic
    @org.hibernate.annotations.Generated(ALWAYS)
    @Column(name = "create_time",columnDefinition = "timestamp default CURRENT_TIMESTAMP ON INSERT CURRENT_TIMESTAMP")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @org.hibernate.annotations.Generated(ALWAYS)
    @Column(name = "update_time",updatable = true,columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
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

        Paper paper = (Paper) o;

        if (id != null ? !id.equals(paper.id) : paper.id != null) return false;
        if (authorId != null ? !authorId.equals(paper.authorId) : paper.authorId != null) return false;
        if (searchvalue != null ? !searchvalue.equals(paper.searchvalue) : paper.searchvalue != null) return false;
        if (title != null ? !title.equals(paper.title) : paper.title != null) return false;
        if (downvalue != null ? !downvalue.equals(paper.downvalue) : paper.downvalue != null) return false;
        if (org != null ? !org.equals(paper.org) : paper.org != null) return false;
        if (abs != null ? !abs.equals(paper.abs) : paper.abs != null) return false;
        if (year != null ? !year.equals(paper.year) : paper.year != null) return false;
        if (keywords != null ? !keywords.equals(paper.keywords) : paper.keywords != null) return false;
        if (cNumber != null ? !cNumber.equals(paper.cNumber) : paper.cNumber != null) return false;
        if (docType != null ? !docType.equals(paper.docType) : paper.docType != null) return false;
        if (lang != null ? !lang.equals(paper.lang) : paper.lang != null) return false;
        if (sid != null ? !sid.equals(paper.sid) : paper.sid != null) return false;
        if (volume != null ? !volume.equals(paper.volume) : paper.volume != null) return false;
        if (issue != null ? !issue.equals(paper.issue) : paper.issue != null) return false;
        if (issn != null ? !issn.equals(paper.issn) : paper.issn != null) return false;
        if (isbn != null ? !isbn.equals(paper.isbn) : paper.isbn != null) return false;
        if (url != null ? !url.equals(paper.url) : paper.url != null) return false;
        if (cost != null ? !cost.equals(paper.cost) : paper.cost != null) return false;
        if (createTime != null ? !createTime.equals(paper.createTime) : paper.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(paper.updateTime) : paper.updateTime != null) return false;
        if (isdelete != null ? !isdelete.equals(paper.isdelete) : paper.isdelete != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (authorId != null ? authorId.hashCode() : 0);
        result = 31 * result + (searchvalue != null ? searchvalue.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (downvalue != null ? downvalue.hashCode() : 0);
        result = 31 * result + (org != null ? org.hashCode() : 0);
        result = 31 * result + (abs != null ? abs.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (cNumber != null ? cNumber.hashCode() : 0);
        result = 31 * result + (docType != null ? docType.hashCode() : 0);
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (issue != null ? issue.hashCode() : 0);
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (isdelete != null ? isdelete.hashCode() : 0);
        return result;
    }
}
