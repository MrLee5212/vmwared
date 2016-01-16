package com.utron.yw.common.utils.app;

import java.util.Locale;
import java.util.Map;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class MixedViewResolver
  implements ViewResolver
{
  private Map<String, ViewResolver> resolvers;

  public void setResolvers(Map<String, ViewResolver> resolvers)
  {
    this.resolvers = resolvers;
  }

  public View resolveViewName(String viewName, Locale locale) throws Exception
  {
    String fields = "";
    if (viewName.indexOf('?') != -1) {
      fields = viewName.substring(viewName.lastIndexOf('?'));
      viewName = viewName.substring(0, viewName.lastIndexOf('?'));
    }
    int n = viewName.lastIndexOf(".");
    if (n != -1)
    {
      String suffix = viewName.substring(n + 1);
      if (suffix.equalsIgnoreCase("do"))
      {
        suffix = "jsp";
      }

      ViewResolver resolver = (ViewResolver)this.resolvers.get(suffix);
      if (resolver == null) {
        throw new RuntimeException("No ViewResolver for " + suffix);
      }
      return resolver.resolveViewName(viewName + fields, locale);
    }
    ViewResolver resolver = (ViewResolver)this.resolvers.get("jsp");
    return resolver.resolveViewName(viewName + fields, locale);
  }
}