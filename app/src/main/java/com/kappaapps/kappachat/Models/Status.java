package com.kappaapps.kappachat.Models;

import com.kappaapps.kappachat.Models.Status;

public class Status {
  private String imageUrl;
  private long timeStamp;

  public Status(String imageUrl, long timeStamp) {
    this.imageUrl = imageUrl;
    this.timeStamp = timeStamp;
  }

  public Status() {}

  public String getImageUrl() {
    return this.imageUrl;
  }

  public void setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public long getTimeStamp() {
    return this.timeStamp;
  }

  public void setTimeStamp(long timeStamp) {
    this.timeStamp = timeStamp;
  }
}
