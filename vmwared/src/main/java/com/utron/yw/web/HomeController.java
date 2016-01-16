package com.utron.yw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.utron.yw.web.controller.BaseAction;

@Controller
public class HomeController extends BaseAction{

	/*** 
     * 首页 返回至/page/login.jsp页面 
     * @return 
     */  
	@RequestMapping("index")  
    public ModelAndView index(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为login页面  
        ModelAndView mav = new ModelAndView("masterPage");  
        return mav;
    }   	
	/*** 
     * 页面跳转
     * @return 
     */  
	@RequestMapping("case")  
    public ModelAndView caseInfo(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为login页面  
        ModelAndView mav = new ModelAndView("caseMasterPage");  
        return mav;
    }  
	/*** 
     * 页面跳转
     * @return 
     */  
	@RequestMapping("help")  
    public ModelAndView helpInfo(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为login页面  
        ModelAndView mav = new ModelAndView("helpMasterPage");  
        return mav;
    }  
}
