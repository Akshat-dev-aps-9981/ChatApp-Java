package com.kappaapps.kappachat.Models;

import com.kappaapps.kappachat.Models.Status;
import com.kappaapps.kappachat.Models.UserStatus;
import java.util.ArrayList;

public class UserStatus {
  private String name, profileImage;
  private long lastUpdated;
  private ArrayList<Status> statuses;

  public UserStatus(String name, String profileImage, long lastUpdated, ArrayList<Status> statuses) {
    this.name = name;
    this.profileImage = profileImage;
    this.lastUpdated = lastUpdated;
    this.statuses = statuses;
  }

  public UserStatus() {}

  public String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getProfileImage() {
    return this.profileImage;
  }

  public void setProfileImage(java.lang.String profileImage) {
    this.profileImage = profileImage;
  }

  public long getLastUpdated() {
    return this.lastUpdated;
  }

  public void setLastUpdated(long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ArrayList<Status> getStatuses() {
    return this.statuses;
  }

  public void setStatuses(java.util.ArrayList<com.kappaapps.kappachat.Models.Status> statuses) {
    this.statuses = statuses;
  }
}
