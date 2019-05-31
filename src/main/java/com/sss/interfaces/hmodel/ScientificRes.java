package com.sss.interfaces.hmodel;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ScientificRes {
    private String authorsId;
    private Integer resId;
    private String resTitle;
    private Double searchPopularity;
    private Double downloadPopularity;
    private String organization;
    private String abs;
    private String url;

    @Basic
    @Column(name = "authorsID")
    public String getAuthorsId() {
        return authorsId;
    }

    public void setAuthorsId(String authorsId) {
        this.authorsId = authorsId;
    }

    @Id
    @Column(name = "resID")
    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @Basic
    @Column(name = "resTitle")
    public String getResTitle() {
        return resTitle;
    }

    public void setResTitle(String resTitle) {
        this.resTitle = resTitle;
    }

    @Basic
    @Column(name = "searchPopularity")
    public Double getSearchPopularity() {
        return searchPopularity;
    }

    public void setSearchPopularity(Double searchPopularity) {
        this.searchPopularity = searchPopularity;
    }

    @Basic
    @Column(name = "downloadPopularity")
    public Double getDownloadPopularity() {
        return downloadPopularity;
    }

    public void setDownloadPopularity(Double downloadPopularity) {
        this.downloadPopularity = downloadPopularity;
    }

    @Basic
    @Column(name = "organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScientificRes that = (ScientificRes) o;

        if (authorsId != null ? !authorsId.equals(that.authorsId) : that.authorsId != null) return false;
        if (resId != null ? !resId.equals(that.resId) : that.resId != null) return false;
        if (resTitle != null ? !resTitle.equals(that.resTitle) : that.resTitle != null) return false;
        if (searchPopularity != null ? !searchPopularity.equals(that.searchPopularity) : that.searchPopularity != null)
            return false;
        if (downloadPopularity != null ? !downloadPopularity.equals(that.downloadPopularity) : that.downloadPopularity != null)
            return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (abs != null ? !abs.equals(that.abs) : that.abs != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorsId != null ? authorsId.hashCode() : 0;
        result = 31 * result + (resId != null ? resId.hashCode() : 0);
        result = 31 * result + (resTitle != null ? resTitle.hashCode() : 0);
        result = 31 * result + (searchPopularity != null ? searchPopularity.hashCode() : 0);
        result = 31 * result + (downloadPopularity != null ? downloadPopularity.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (abs != null ? abs.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
