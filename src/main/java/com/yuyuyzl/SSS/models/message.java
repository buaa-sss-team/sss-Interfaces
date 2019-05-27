package com.yuyuyzl.SSS.models;

import java.io.Serializable;
import java.sql.Time;

public class message implements Serializable {
    private int messageID;
    private int senderID;
    private int recipientID;
    private String message;
    private Time sendTime;

    public message(int messageID) {
        this.messageID = messageID;
    }

    public message() {
    }

    public message(int messageID, int senderID, int recipientID, String message, Time sendTime) {
        this.messageID = messageID;
        this.senderID = senderID;
        this.recipientID = recipientID;
        this.message = message;
        this.sendTime = sendTime;
    }

    public int getMessageID() {
        return messageID;
    }

    public int getSenderID() {
        return senderID;
    }

    public int getRecipientID() {
        return recipientID;
    }

    public String getMessage() {
        return message;
    }

    public Time getSendTime() {
        return sendTime;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public void setRecipientID(int recipientID) {
        this.recipientID = recipientID;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSendTime(Time sendTime) {
        this.sendTime = sendTime;
    }
}
