package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Expert {
    private Integer id;
    private String achievements;
    private String profession;
    private Double searchPopularity;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "achievements")
    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "searchPopularity")
    public Double getSearchPopularity() {
        return searchPopularity;
    }

    public void setSearchPopularity(Double searchPopularity) {
        this.searchPopularity = searchPopularity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expert expert = (Expert) o;

        if (id != null ? !id.equals(expert.id) : expert.id != null) return false;
        if (achievements != null ? !achievements.equals(expert.achievements) : expert.achievements != null)
            return false;
        if (profession != null ? !profession.equals(expert.profession) : expert.profession != null) return false;
        if (searchPopularity != null ? !searchPopularity.equals(expert.searchPopularity) : expert.searchPopularity != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (achievements != null ? achievements.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (searchPopularity != null ? searchPopularity.hashCode() : 0);
        return result;
    }
}
