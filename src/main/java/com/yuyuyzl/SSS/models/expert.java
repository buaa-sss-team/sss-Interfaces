package com.yuyuyzl.SSS.models;
import java.io.Serializable;
//专家类
public class expert implements Serializable {
    private int id;
    private String achievement;
    private String profession;
    private float searchPopularity;

    public int getId() {
        return id;
    }

    public String getAchievement() {
        return achievement;
    }

    public String getProfession() {
        return profession;
    }

    public float getSearchPopularity() {
        return searchPopularity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setSearchPopularity(float searchPopularity) {
        this.searchPopularity = searchPopularity;
    }

    public expert(int id) {
        this.id = id;
    }

    public expert(int id, String achievement, String profession, float searchPopularity) {
        this.id = id;
        this.achievement = achievement;
        this.profession = profession;
        this.searchPopularity = searchPopularity;
    }

    public expert() {
    }
}
