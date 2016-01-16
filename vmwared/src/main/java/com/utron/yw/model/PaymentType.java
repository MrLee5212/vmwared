package com.utron.yw.model;

public class PaymentType
{
  private Integer id;
  private String name;
  private String key;
  private String description;
  private String photoUrl;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPhotoUrl() {
    return this.photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }
}