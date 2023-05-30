package com.kappaapps.kappachat.Models;

public class Messages {
  private String messageId = "", message = "", senderId = "", imageUrl = "";
  private long timestamp = 0;
  private int feeling = -1;
  
  public Messages() {}

  public Messages(
      String message,
      String senderId,
      long timestamp) {
    this.message = message;
    this.senderId = senderId;
    this.timestamp = timestamp;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public void setMessageId(java.lang.String messageId) {
    this.messageId = messageId;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(java.lang.String message) {
    this.message = message;
  }

  public String getSenderId() {
    return this.senderId;
  }

  public void setSenderId(java.lang.String senderId) {
    this.senderId = senderId;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public void setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public int getFeeling() {
    return this.feeling;
  }

  public void setFeeling(int feeling) {
    this.feeling = feeling;
  }
}
