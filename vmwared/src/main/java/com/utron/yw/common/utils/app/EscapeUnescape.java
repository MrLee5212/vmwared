package com.utron.yw.common.utils.app;

import java.io.PrintStream;

public class EscapeUnescape
{
  public static String escape(String src)
  {
    StringBuffer tmp = new StringBuffer();
    tmp.ensureCapacity(src.length() * 6);
    for (int i = 0; i < src.length(); i++) {
      char j = src.charAt(i);
      if ((Character.isDigit(j)) || (Character.isLowerCase(j)) || 
        (Character.isUpperCase(j))) {
        tmp.append(j);
      } else if (j < 'Ā') {
        tmp.append("%");
        if (j < '\020')
          tmp.append("0");
        tmp.append(Integer.toString(j, 16));
      } else {
        tmp.append("%u");
        tmp.append(Integer.toString(j, 16));
      }
    }
    return tmp.toString();
  }

  public static String unescape(String src) {
    StringBuffer tmp = new StringBuffer();
    tmp.ensureCapacity(src.length());
    int lastPos = 0; int pos = 0;

    while (lastPos < src.length()) {
      pos = src.indexOf("%", lastPos);
      if (pos == lastPos) {
        if (src.charAt(pos + 1) == 'u') {
          char ch = (char)Integer.parseInt(src
            .substring(pos + 2, pos + 6), 16);
          tmp.append(ch);
          lastPos = pos + 6;
        } else {
          char ch = (char)Integer.parseInt(src
            .substring(pos + 1, pos + 3), 16);
          tmp.append(ch);
          lastPos = pos + 3;
        }
      }
      else if (pos == -1) {
        tmp.append(src.substring(lastPos));
        lastPos = src.length();
      } else {
        tmp.append(src.substring(lastPos, pos));
        lastPos = pos;
      }
    }

    return tmp.toString();
  }

  public static String isoToGB(String src)
  {
    String strRet = null;
    try {
      strRet = new String(src.getBytes("ISO_8859_1"), "GB2312");
    }
    catch (Exception localException) {
    }
    return strRet;
  }

  public static String isoToUTF(String src)
  {
    String strRet = null;
    try {
      strRet = new String(src.getBytes("ISO_8859_1"), "UTF-8");
    }
    catch (Exception localException) {
    }
    return strRet;
  }

  public static void main(String[] args) {
    String tmp = "管理1";
    System.out.println("testing escape : " + tmp);
    tmp = escape(tmp);
    System.out.println(tmp);
    System.out.println("testing unescape :" + unescape(tmp));
    System.out.println(unescape("%u6211%u4eec"));
  }
}