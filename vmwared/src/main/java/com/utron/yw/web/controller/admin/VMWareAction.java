package com.utron.yw.web.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utron.yw.model.User;
import com.utron.yw.web.controller.BaseAction;

/**
 * 虚拟机管理逻辑控制器
 * 
 * @author liqiang
 * @update liqiang
 *
 */
@Scope("prototype")
@Controller
@RequestMapping("/admin/vmware")
public class VMWareAction extends BaseAction {
	// [start] 虚拟机及平台模块跳转
	/**
	 * 用户管理
	 *  
	 * @param request
	 * @param response
	 * @return 
	 */
	@RequestMapping(value = "/vmwareList.do")
	public String VMWareInit( HttpServletRequest request, HttpServletResponse response){ 
		User u = this.getLoginUser();
		request.setAttribute("user", u); 
		return "web/admin/vmware/vmwareList";
	}
	// [end]
}
