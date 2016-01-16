package com.utron.yw.model;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon
{
  private Integer id;
  private String name;
  private Date beginTime;
  private Date endTime;
  private String sn;
  private Integer qty;
  private Integer userId;
  private String condition;
  private BigDecimal amount;
  private String description;

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

  public String getSn() {
    return this.sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }

  public Integer getQty() {
    return this.qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getCondition() {
    return this.condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}