package com.utron.yw.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order
{
  private Integer id;
  private Byte type;
  private String sn;
  private String vmSn;
  private String vmPsd;
  private Integer userId;
  private Date orderTime;
  private Byte periodType;
  private Byte period;
  private Date endTime;
  private Byte state;
  private BigDecimal amount;
  private Integer paymentTypeId;
  private String transactionSn;
  private String transactionName;
  private Boolean current;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Byte getType() {
    return this.type;
  }

  public void setType(Byte type) {
    this.type = type;
  }

  public String getSn() {
    return this.sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }

  public String getVmSn() {
    return this.vmSn;
  }

  public void setVmSn(String vmSn) {
    this.vmSn = vmSn;
  }

  public String getVmPsd() {
    return this.vmPsd;
  }

  public void setVmPsd(String vmPsd) {
    this.vmPsd = vmPsd;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Date getOrderTime() {
    return this.orderTime;
  }

  public void setOrderTime(Date orderTime) {
    this.orderTime = orderTime;
  }

  public Byte getPeriodType() {
    return this.periodType;
  }

  public void setPeriodType(Byte periodType) {
    this.periodType = periodType;
  }

  public Byte getPeriod() {
    return this.period;
  }

  public void setPeriod(Byte period) {
    this.period = period;
  }

  public Date getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public Byte getState() {
    return this.state;
  }

  public void setState(Byte state) {
    this.state = state;
  }

  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Integer getPaymentTypeId() {
    return this.paymentTypeId;
  }

  public void setPaymentTypeId(Integer paymentTypeId) {
    this.paymentTypeId = paymentTypeId;
  }

  public String getTransactionSn() {
    return this.transactionSn;
  }

  public void setTransactionSn(String transactionSn) {
    this.transactionSn = transactionSn;
  }

  public String getTransactionName() {
    return this.transactionName;
  }

  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }

  public Boolean getCurrent() {
    return this.current;
  }

  public void setCurrent(Boolean current) {
    this.current = current;
  }
}