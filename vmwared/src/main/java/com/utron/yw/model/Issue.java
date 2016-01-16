package com.utron.yw.model;

import java.util.Date;

public class Issue
{
  private Integer id;
  private Integer submitterId;
  private String content;
  private Date submitTime;
  private Byte state;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getSubmitterId() {
    return this.submitterId;
  }

  public void setSubmitterId(Integer submitterId) {
    this.submitterId = submitterId;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getSubmitTime() {
    return this.submitTime;
  }

  public void setSubmitTime(Date submitTime) {
    this.submitTime = submitTime;
  }

  public Byte getState() {
    return this.state;
  }

  public void setState(Byte state) {
    this.state = state;
  }
}