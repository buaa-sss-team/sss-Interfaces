package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Action implements Serializable {
    private Integer id;
    private Integer userid;
    private String message;
    private Timestamp sendtime;

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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "sendtime")
    public Timestamp getSendtime() {
        return sendtime;
    }

    public void setSendtime(Timestamp sendtime) {
        this.sendtime = sendtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Action action = (Action) o;

        if (id != null ? !id.equals(action.id) : action.id != null) return false;
        if (userid != null ? !userid.equals(action.userid) : action.userid != null) return false;
        if (message != null ? !message.equals(action.message) : action.message != null) return false;
        if (sendtime != null ? !sendtime.equals(action.sendtime) : action.sendtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (sendtime != null ? sendtime.hashCode() : 0);
        return result;
    }
}
