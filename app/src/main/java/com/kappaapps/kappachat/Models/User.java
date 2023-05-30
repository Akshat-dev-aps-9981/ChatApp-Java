package com.kappaapps.kappachat.Models;

public class User {
  private String uid="", name="", phoneNumber="", profileImage="", token="";

  public User(String uid, String name, String phoneNumber, String profileImage) {
    this.uid = uid;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.profileImage = profileImage;
  }

  public User() {}

  public String getUid() {
    return this.uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getProfileImage() {
    return this.profileImage;
  }

  public void setProfileImage(java.lang.String profileImage) {
    this.profileImage = profileImage;
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(java.lang.String token) {
    this.token = token;
  }
}
