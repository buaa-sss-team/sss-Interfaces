package com.sss.interfaces.hmodel;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Message implements Serializable {
    private Integer messageId;
    private Integer senderId;
    private Integer recipientId;
    private String message;
    private Time sendTime;
    private Byte isread;

    @Id
    @Column(name = "messageID")
    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "senderID")
    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    @Basic
    @Column(name = "recipientID")
    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
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
    @Column(name = "sendTime")
    public Time getSendTime() {
        return sendTime;
    }

    public void setSendTime(Time sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "isread")
    public Byte getIsread() {
        return isread;
    }

    public void setIsread(Byte isread) {
        this.isread = isread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (messageId != null ? !messageId.equals(message1.messageId) : message1.messageId != null) return false;
        if (senderId != null ? !senderId.equals(message1.senderId) : message1.senderId != null) return false;
        if (recipientId != null ? !recipientId.equals(message1.recipientId) : message1.recipientId != null)
            return false;
        if (message != null ? !message.equals(message1.message) : message1.message != null) return false;
        if (sendTime != null ? !sendTime.equals(message1.sendTime) : message1.sendTime != null) return false;
        if (isread != null ? !isread.equals(message1.isread) : message1.isread != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageId != null ? messageId.hashCode() : 0;
        result = 31 * result + (senderId != null ? senderId.hashCode() : 0);
        result = 31 * result + (recipientId != null ? recipientId.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (sendTime != null ? sendTime.hashCode() : 0);
        result = 31 * result + (isread != null ? isread.hashCode() : 0);
        return result;
    }
}
