package com.sss.interfaces.hmodel;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String personalInformationJson;
    private String boughtThings;
    private Integer credit;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "personalInformationJson")
    public String getPersonalInformationJson() {
        return personalInformationJson;
    }

    public void setPersonalInformationJson(String personalInformationJson) {
        this.personalInformationJson = personalInformationJson;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (personalInformationJson != null ? !personalInformationJson.equals(user.personalInformationJson) : user.personalInformationJson != null)
            return false;
        if (boughtThings != null ? !boughtThings.equals(user.boughtThings) : user.boughtThings != null) return false;
        if (credit != null ? !credit.equals(user.credit) : user.credit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (personalInformationJson != null ? personalInformationJson.hashCode() : 0);
        result = 31 * result + (boughtThings != null ? boughtThings.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }
}
