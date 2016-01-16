package com.utron.yw.web.controller.admin;

import com.utron.yw.model.User;
import com.utron.yw.web.controller.BaseAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Scope("prototype")
@Controller
@RequestMapping({"/admin/order"})
public class OrderAction extends BaseAction
{
  @RequestMapping({"/orderList.do"})
  public String OrderInit(HttpServletRequest request, HttpServletResponse response)
  {
    User u = getLoginUser();
    request.setAttribute("user", u);
    return "web/admin/order/orderList";
  }
}