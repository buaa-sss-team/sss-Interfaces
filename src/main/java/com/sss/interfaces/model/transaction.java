package com.sss.interfaces.model;

import java.io.Serializable;
import java.sql.Time;

//交易记录
public class transaction implements Serializable {
    private int tradeID;
    private int type;
    private int buyerID;
    private int itemID;
    private Time tradeTime;

    public transaction(int tradeID) {
        this.tradeID = tradeID;
    }

    public transaction() {
    }

    public transaction(int tradeID, int type, int buyerID, int itemID, Time tradeTime) {
        this.tradeID = tradeID;
        this.type = type;
        this.buyerID = buyerID;
        this.itemID = itemID;
        this.tradeTime = tradeTime;
    }

    public int getTradeID() {
        return tradeID;
    }

    public int getType() {
        return type;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public int getItemID() {
        return itemID;
    }

    public Time getTradeTime() {
        return tradeTime;
    }

    public void setTradeID(int tradeID) {
        this.tradeID = tradeID;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setTradeTime(Time tradeTime) {
        this.tradeTime = tradeTime;
    }
}
