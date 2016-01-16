package com.utron.yw.model;

public class OrderItemPrice
{
  private Integer id;
  private Integer orderItemId;
  private Integer priceSchemeId;
  private Integer priceItemId;

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

  public Integer getPriceSchemeId() {
    return this.priceSchemeId;
  }

  public void setPriceSchemeId(Integer priceSchemeId) {
    this.priceSchemeId = priceSchemeId;
  }

  public Integer getPriceItemId() {
    return this.priceItemId;
  }

  public void setPriceItemId(Integer priceItemId) {
    this.priceItemId = priceItemId;
  }
}