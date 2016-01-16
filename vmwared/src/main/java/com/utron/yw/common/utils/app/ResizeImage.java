package com.utron.yw.common.utils.app;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;

public class ResizeImage
{
  public static BufferedImage resize(BufferedImage source, int targetW, int targetH)
  {
    int type = source.getType();
    BufferedImage target = null;
    double sx = targetW / source.getWidth();
    double sy = targetH / source.getHeight();

    if (sx > sy) {
      sx = sy;
      targetW = (int)(sx * source.getWidth());
    } else {
      sy = sx;
      targetH = (int)(sy * source.getHeight());
    }
    if (type == 0) {
      ColorModel cm = source.getColorModel();
      WritableRaster raster = cm.createCompatibleWritableRaster(targetW, 
        targetH);
      boolean alphaPremultiplied = cm.isAlphaPremultiplied();
      target = new BufferedImage(cm, raster, alphaPremultiplied, null);
    } else {
      target = new BufferedImage(targetW, targetH, type);
    }Graphics2D g = target.createGraphics();

    g.setRenderingHint(RenderingHints.KEY_RENDERING, 
      RenderingHints.VALUE_RENDER_QUALITY);
    g.drawRenderedImage(source, AffineTransform.getScaleInstance(sx, sy));
    g.dispose();
    return target;
  }

  public static void saveImageAsJpg(String fromFileStr, String saveToFileStr, int width, int hight)
    throws Exception
  {
    String imgType = "JPEG";
    if (fromFileStr.toLowerCase().endsWith(".png")) {
      imgType = "PNG";
    }

    File saveFile = new File(saveToFileStr);
    File fromFile = new File(fromFileStr);
    BufferedImage srcImage = ImageIO.read(fromFile);
    if ((width > 0) || (hight > 0)) {
      srcImage = resize(srcImage, width, hight);
    }
    ImageIO.write(srcImage, imgType, saveFile);
  }

  public static void saveImageAsFile(File fromFile, String imgType, String saveToFileStr, int width, int hight)
    throws Exception
  {
    if (imgType.equalsIgnoreCase("png"))
      imgType = "PNG";
    else if (imgType.equalsIgnoreCase("bmp"))
      imgType = "BMP";
    else {
      imgType = "JPEG";
    }
    File saveFile = new File(saveToFileStr);
    BufferedImage srcImage = ImageIO.read(fromFile);
    if ((width > 0) || (hight > 0)) {
      srcImage = resize(srcImage, width, hight);
    }
    ImageIO.write(srcImage, imgType, saveFile);
  }

  public static void main(String[] argv)
  {
    try
    {
      saveImageAsJpg("G:\\images\\201209\\20120914\\sdfgghhhhhhhhhhhh_1347588312406.jpg", 
        "G:\\images\\201209\\20120914\\sdfgghhhhhhhhhhhh_1347588312406_small.jpg", 100, 100);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}