package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Tradeinfo implements Serializable {
    private Integer id;
    private Integer userid;
    private Integer type;
    private Integer resid;
    private Timestamp tradetime;

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
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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
    @Column(name = "resid")
    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    @Basic
    @Column(name = "tradetime")
    public Timestamp getTradetime() {
        return tradetime;
    }

    public void setTradetime(Timestamp tradetime) {
        this.tradetime = tradetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tradeinfo tradeinfo = (Tradeinfo) o;

        if (id != null ? !id.equals(tradeinfo.id) : tradeinfo.id != null) return false;
        if (userid != null ? !userid.equals(tradeinfo.userid) : tradeinfo.userid != null) return false;
        if (type != null ? !type.equals(tradeinfo.type) : tradeinfo.type != null) return false;
        if (resid != null ? !resid.equals(tradeinfo.resid) : tradeinfo.resid != null) return false;
        if (tradetime != null ? !tradetime.equals(tradeinfo.tradetime) : tradeinfo.tradetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (resid != null ? resid.hashCode() : 0);
        result = 31 * result + (tradetime != null ? tradetime.hashCode() : 0);
        return result;
    }
}
