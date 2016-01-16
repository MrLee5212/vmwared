package com.utron.yw.model;

import java.util.Date;

public class SchemePrice
{
  private Integer id;
  private String name;
  private Byte catalog;
  private Byte schemeType;
  private Date createTime;
  private Integer creatorId;
  private Date beginTime;
  private Date endTime;

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

  public Byte getCatalog() {
    return this.catalog;
  }

  public void setCatalog(Byte catalog) {
    this.catalog = catalog;
  }

  public Byte getSchemeType() {
    return this.schemeType;
  }

  public void setSchemeType(Byte schemeType) {
    this.schemeType = schemeType;
  }

  public Date getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Integer getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public Date getBeginTime() {
    return this.beginTime;
  }

  public void setBeginTime(Date beginTime) {
    this.beginTime = beginTime;
  }

  public Date getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
}