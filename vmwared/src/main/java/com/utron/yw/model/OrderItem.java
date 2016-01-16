package com.utron.yw.model;

import java.math.BigDecimal;

public class OrderItem
{
  private Integer id;
  private Integer orderId;
  private Integer itemLevel1Id;
  private Integer itemLevel2Id;
  private Integer itemId;
  private Integer qty;
  private BigDecimal amount;
  private Boolean freebie;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getOrderId() {
    return this.orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Integer getItemLevel1Id() {
    return this.itemLevel1Id;
  }

  public void setItemLevel1Id(Integer itemLevel1Id) {
    this.itemLevel1Id = itemLevel1Id;
  }

  public Integer getItemLevel2Id() {
    return this.itemLevel2Id;
  }

  public void setItemLevel2Id(Integer itemLevel2Id) {
    this.itemLevel2Id = itemLevel2Id;
  }

  public Integer getItemId() {
    return this.itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public Integer getQty() {
    return this.qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Boolean getFreebie() {
    return this.freebie;
  }

  public void setFreebie(Boolean freebie) {
    this.freebie = freebie;
  }
}