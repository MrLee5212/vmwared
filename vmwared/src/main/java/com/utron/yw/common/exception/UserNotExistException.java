package com.utron.yw.common.exception;

public class UserNotExistException extends Exception
{
  public UserNotExistException()
  {
  }

  public UserNotExistException(String message)
  {
    super(message);
  }

  public UserNotExistException(Throwable cause)
  {
    super(cause);
  }

  public UserNotExistException(String message, Throwable cause)
  {
    super(message, cause);
  }
}