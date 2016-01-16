package com.utron.yw.web.controller.customer;

import com.utron.yw.model.User;
import com.utron.yw.web.controller.BaseAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("prototype")
@Controller
@RequestMapping({"/customer/product"})
public class ProductAction extends BaseAction
{
  @RequestMapping({"/productInfo.do"})
  public String productInit(HttpServletRequest request, HttpServletResponse response)
  {
    User u = getLoginUser();
    request.setAttribute("user", u);
    return "web/customer/product/product";
  }

  @RequestMapping({"/caseInfo.do"})
  public String caseInit(HttpServletRequest request, HttpServletResponse response)
  {
    User u = getLoginUser();
    request.setAttribute("user", u);
    return "web/customer/case/case";
  }

  @RequestMapping({"/helpInfo.do"})
  public String helpInit(HttpServletRequest request, HttpServletResponse response)
  {
    User u = getLoginUser();
    request.setAttribute("user", u);
    return "web/customer/help/help";
  }
}