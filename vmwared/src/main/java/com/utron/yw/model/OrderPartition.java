package com.utron.yw.model;

public class OrderPartition
{
  private Integer id;
  private Integer orderItemId;
  private Integer itemId;
  private String name;
  private Integer size;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getOrderItemId() {
    return this.orderItemId;
  }

  public void setOrderItemId(Integer orderItemId) {
    this.orderItemId = orderItemId;
  }

  public Integer getItemId() {
    return this.itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getSize() {
    return this.size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }
}