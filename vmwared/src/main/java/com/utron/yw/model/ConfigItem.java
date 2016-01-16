package com.utron.yw.model;

public class ConfigItem
{
  private Integer id;
  private Integer parentId;
  private Integer level;
  private String path;
  private Boolean leaf;
  private String name;
  private String key;
  private String measure;
  private Integer min;
  private Integer max;
  private Integer interval;
  private Boolean hdPartition;
  private String description;
  private Boolean flag;

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

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Boolean getLeaf() {
    return this.leaf;
  }

  public void setLeaf(Boolean leaf) {
    this.leaf = leaf;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getMeasure() {
    return this.measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public Integer getMin() {
    return this.min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public Integer getMax() {
    return this.max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public Integer getInterval() {
    return this.interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public Boolean getHdPartition() {
    return this.hdPartition;
  }

  public void setHdPartition(Boolean hdPartition) {
    this.hdPartition = hdPartition;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getFlag() {
    return this.flag;
  }

  public void setFlag(Boolean flag) {
    this.flag = flag;
  }
}