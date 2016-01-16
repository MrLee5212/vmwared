package com.utron.yw.model;

public class Organ
{
  private Integer id;
  private Integer parentId;
  private Integer level;
  private Boolean leaf;
  private String path;
  private String name;
  private String description;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getParentId() {
    return this.parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Integer getLevel() {
    return this.level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Boolean getLeaf() {
    return this.leaf;
  }

  public void setLeaf(Boolean leaf) {
    this.leaf = leaf;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}