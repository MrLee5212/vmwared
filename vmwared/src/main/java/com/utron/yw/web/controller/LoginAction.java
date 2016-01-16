package com.utron.yw.web.controller;

import com.utron.yw.common.JsonResult;
import com.utron.yw.common.ReturnResult;
import com.utron.yw.model.ResourceConfig;
import com.utron.yw.model.User;
import com.utron.yw.service.ResourceService;
import com.utron.yw.service.UserService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Scope("prototype")
@Controller
public class LoginAction extends BaseAction
{

  @Resource(name="userService")
  private UserService userService;

  @Resource(name="resourceService")
  private ResourceService resourceService;

  @RequestMapping({"/gotoregister.do"})
  public ModelAndView gotoregister()
  {
    ModelAndView mav = new ModelAndView("register");
    return mav;
  }

  @RequestMapping({"/admin.do"})
  public ModelAndView adminlogin() {
    ModelAndView mav = new ModelAndView("adminLogin");
    return mav;
  }

  @RequestMapping({"/gotologin.do"})
  public ModelAndView gotologin() {
    ModelAndView mav = new ModelAndView("login");
    return mav;
  }
  @ResponseBody
  @RequestMapping(value={"/adminLogin.do"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public JsonResult<User> adminLogin(User user, HttpServletRequest request, HttpServletResponse response) {
    JsonResult json = new JsonResult();
    json.setCode(new Integer(1));
    json.setMessage("登录失败!");
    try {
      ReturnResult res = this.userService.login(user.getAccount(), user.getPassword(), user.isRememberMe(), user.getUserType());
      if (res.getCode().intValue() == 1) {
        List lf = parseResourceList(this.resourceService.getResource(user.getUserType()));
        request.getSession().setAttribute("userResources", lf);

        ((User)res.getResultObject()).setSelectedMainMemu(((ResourceConfig)lf.get(0)).getId().intValue());
        ((User)res.getResultObject()).setSelectedChildMenu(((ResourceConfig)((ResourceConfig)lf.get(0)).getChildResourcelist().get(0)).getId().intValue());
        ((User)res.getResultObject()).setChildMenuList(((ResourceConfig)lf.get(0)).getChildResourcelist());
        setLoginUser((User)res.getResultObject());

        json.setCode(new Integer(0));
        json.setGotoUrl(((ResourceConfig)lf.get(0)).getUrl());
        json.setMessage("登录成功!");
      } else {
        json.setMessage(res.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return json;
  }
  @ResponseBody
  @RequestMapping(value={"/customerLogin.do"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public JsonResult<User> customerLogin(User user, HttpServletRequest request, HttpServletResponse response) { JsonResult json = new JsonResult();
    json.setCode(new Integer(1));
    json.setMessage("登录失败!");
    try {
      ReturnResult res = this.userService.login(user.getAccount(), user.getPassword(), user.isRememberMe(), user.getUserType());
      if (res.getCode().intValue() == 1) {
        setLoginUser((User)res.getResultObject());
        json.setCode(new Integer(0));
        json.setMessage("登录成功!");
      } else {
        json.setMessage(res.getMessage());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return json; }

  @ResponseBody
  @RequestMapping(value={"/register.do"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public JsonResult<User> register(User user, HttpServletRequest request, HttpServletResponse response) {
    JsonResult json = new JsonResult();
    json.setCode(new Integer(1));
    json.setMessage("注册失败!");
    try {
      json.setMessage("注册成功!");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return json;
  }
  @ResponseBody
  @RequestMapping({"/jsonLoadSession.do"})
  public JsonResult<User> jsonLoadSession(@RequestParam(value="selectedMainMemu", required=false) Integer selectedMainMemu, @RequestParam(value="selectedChildMenu", required=false) Integer selectedChildMenu, HttpServletRequest request, HttpServletResponse response) { JsonResult json = new JsonResult();
    if (selectedMainMemu != null) {
      getLoginUser().setSelectedMainMemu(selectedMainMemu.intValue()); 
	List<ResourceConfig> lf = (List)request.getSession().getAttribute("userResources");
      for (ResourceConfig resource : lf) {
        if (resource.getId().intValue() == selectedMainMemu.intValue()) {
          getLoginUser().setSelectedChildMenu(((ResourceConfig)resource.getChildResourcelist().get(0)).getId().intValue());
          break;
        }
      }
    }
    else if (selectedChildMenu != null) {
      getLoginUser().setSelectedChildMenu(selectedChildMenu.intValue());
    }

    json.setCode(new Integer(0));
    json.setMessage("更新成功!");

    return json; }

  private List<ResourceConfig> parseResourceList(List<ResourceConfig> src)
  {
    for (ResourceConfig f : src) {
      f.setChildResourcelist(this.resourceService.getResourceByParentId(f.getId()));
    }
    return src;
  }
}