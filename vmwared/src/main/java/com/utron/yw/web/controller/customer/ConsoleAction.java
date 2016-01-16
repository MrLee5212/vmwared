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
@RequestMapping({"/customer/console"})
public class ConsoleAction extends BaseAction
{
  @RequestMapping({"/consoleInfo.do"})
  public String consoleInit(HttpServletRequest request, HttpServletResponse response)
  {
    User u = getLoginUser();
    request.setAttribute("user", u);
    return "web/customer/console/console";
  }
}