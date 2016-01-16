<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.utron.yw.model.User" %>
<%@ page import="com.utron.yw.common.utils.Constants" %> 
	
	<div class="head-tool-bar"> 
    </div>  
	<div class="fl head-logo yw-right">
        <img src="${pageContext.request.contextPath}/source/images/inlogo_1.png" class="ml26" />
    </div>
    <div class="head-menu">
    	<ul class="fl">
        	<li onclick="window.location.href='index.do'">产品</li>
        	<li onclick="window.location.href='case.do'">解决方案</li>
        	<li onclick="window.location.href='help.do'">服务与帮助</li> 
        </ul>
        <div class="fr head-menu-right ml40">
            <!-- <a href="#"><i class="fl yw-icon icon-dot"></i><span>你有新消息</span></a> -->
            <a href="${pageContext.request.contextPath}/gotologin.do"><i class="fl yw-icon icon-dot"></i><span  style="color:white;font-size:16px;">登陆</span></a>
            <a href="${pageContext.request.contextPath}/gotoregister.do"><i class="fl yw-icon icon-dot"></i><span  style="color:white;font-size:16px;">注册</span></a>
        </div>
    </div> 