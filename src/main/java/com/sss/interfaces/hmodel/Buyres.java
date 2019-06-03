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
public class Buyres implements Serializable {
    private Integer id;
    private Integer userid;
    private Integer staus;
    private String message;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "staus")
    public Integer getStaus() {
        return staus;
    }

    public void setStaus(Integer staus) {
        this.staus = staus;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buyres buyres = (Buyres) o;

        if (id != null ? !id.equals(buyres.id) : buyres.id != null) return false;
        if (userid != null ? !userid.equals(buyres.userid) : buyres.userid != null) return false;
        if (staus != null ? !staus.equals(buyres.staus) : buyres.staus != null) return false;
        if (message != null ? !message.equals(buyres.message) : buyres.message != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (staus != null ? staus.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }
}
