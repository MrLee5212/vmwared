package com.utron.yw.model;

import java.util.Date;

public class Message
{
  private Integer id;
  private Byte messageType;
  private String content;
  private Integer userId;
  private Date createTime;
  private Date readTime;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Byte getMessageType() {
    return this.messageType;
  }

  public void setMessageType(Byte messageType) {
    this.messageType = messageType;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Date getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getReadTime() {
    return this.readTime;
  }

  public void setReadTime(Date readTime) {
    this.readTime = readTime;
  }
}