package com.utron.yw.model;

public class ItemConstraint
{
  private Integer id;
  private Byte type;
  private Integer itemId;
  private Integer targetId;
  private Integer min;
  private String description;

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

  public Integer getItemId() {
    return this.itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public Integer getTargetId() {
    return this.targetId;
  }

  public void setTargetId(Integer targetId) {
    this.targetId = targetId;
  }

  public Integer getMin() {
    return this.min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}