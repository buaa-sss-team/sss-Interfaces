package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.mapping.UniqueKey;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE )
public class User implements Serializable {
    private Integer id;
    private String account;
    private String password;
    private String info;
    private String boughtThings;
    private Integer credit;
    private Integer type;

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
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "boughtThings")
    public String getBoughtThings() {
        return boughtThings;
    }

    public void setBoughtThings(String boughtThings) {
        this.boughtThings = boughtThings;
    }

    @Basic
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (account != null ? !account.equals(user.account) : user.account != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (info != null ? !info.equals(user.info) : user.info != null) return false;
        if (boughtThings != null ? !boughtThings.equals(user.boughtThings) : user.boughtThings != null) return false;
        if (credit != null ? !credit.equals(user.credit) : user.credit != null) return false;
        if (type != null ? !type.equals(user.type) : user.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (boughtThings != null ? boughtThings.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
