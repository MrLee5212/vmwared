package com.utron.yw.model;

import java.util.Date;

public class Log
{
  private Integer id;
  private Date logTime;
  private Byte logType;
  private Byte actorType;
  private Integer actorId;
  private String ip;
  private String message;

  public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getLogTime() {
    return this.logTime;
  }

  public void setLogTime(Date logTime) {
    this.logTime = logTime;
  }

  public Byte getLogType() {
    return this.logType;
  }

  public void setLogType(Byte logType) {
    this.logType = logType;
  }

  public Byte getActorType() {
    return this.actorType;
  }

  public void setActorType(Byte actorType) {
    this.actorType = actorType;
  }

  public Integer getActorId() {
    return this.actorId;
  }

  public void setActorId(Integer actorId) {
    this.actorId = actorId;
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}