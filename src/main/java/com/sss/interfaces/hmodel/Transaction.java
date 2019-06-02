package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Transaction {
    private Integer tradeId;
    private Integer type;
    private Integer buyerId;
    private Integer itemId;
    private Time tradeTime;

    @Id
    @Column(name = "tradeID")
    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
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
    @Column(name = "buyerID")
    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "itemID")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "tradeTime")
    public Time getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Time tradeTime) {
        this.tradeTime = tradeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (tradeId != null ? !tradeId.equals(that.tradeId) : that.tradeId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (buyerId != null ? !buyerId.equals(that.buyerId) : that.buyerId != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (tradeTime != null ? !tradeTime.equals(that.tradeTime) : that.tradeTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tradeId != null ? tradeId.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (buyerId != null ? buyerId.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (tradeTime != null ? tradeTime.hashCode() : 0);
        return result;
    }
}
