<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String url = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<META http-equiv="X-UA-Compatible" content="IE=edge" />
<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
<title>虚拟机管理平台-登录</title>
<link type="text/css" href="<%=basePath%>source/css/base.css" rel="stylesheet"/>
<link type="text/css" href="<%=basePath%>source/css/global.css" rel="stylesheet"/>
<link type="text/css" href="<%=basePath%>source/js/easyUI/themes/default/easyui.css" rel="stylesheet"/>
<link type="text/css" href="<%=basePath%>source/js/easyUI/themes/icon.css" rel="stylesheet"/>
<script type="text/javascript" src="<%=basePath%>source/js/jquery-1.11.2.min.js"></script>
<script src="<%=basePath%>source/js/easyUI/jquery.easyui.min.js" type="text/javascript"></script>
<script src="<%=basePath%>source/js/easyUI/easyui-lang-zh_CN.js" type="text/javascript"></script>
<script src="<%=basePath%>source/js/common/validate.js"></script>
<script src="<%=basePath%>source/js/login/pw.js"></script>
<script type="text/javascript">
var baseurl = '<%=url%>';
$(document).ready(function() {
	//针对IE不支持placeholder的处理
	var p2 = document.getElementById("password").getAttribute("placeholder");
	if(p2!=""){
		$("#password").hide().after('<input type="text" class="login-input login-pwd easyui-validatebox" name="password2" id="password2" value="请输入密码" />');
	}
	$("#password2").focus(function(){
		$(this).hide();
		$("#password").show().focus();
	});
	$("#password").blur(function(){
		var v = $(this).val();
		if(v == ""){
			$(this).hide();
			$("#password2").show();
		}
	});
	
	var p1 = document.getElementById("loginName").getAttribute("placeholder");
	$("#loginName").val(p1).focus(function(){
		if($(this).val()==p1){
			$(this).val("");
		}
	}).blur(function(){
		var v = $(this).val();
		if(v == ""){
			$(this).val(p1);
		}
	});
	  // 在这里写你的代码...
	  $("#loginName").keypress(function(e){
		  $("#login-alert").hide();
			if(e.keyCode == 13){
				$("#password").focus();
			}
		});
		$("#password").keydown(function(e){
			$("#login-alert").hide();
			if(e.keyCode == 13){
				login();
			}
		});
}); 
function login(){
	if ($('#loginForm').form('validate')) {
	    $('#loginForm').form('submit', {
	        url:"adminLogin.do",
	        success:function(data){
	        	var item = eval("(" + data + ")");
	        	if(item.code == 0){
	        		//SetPwdAndChk();
	        		window.location.href =baseurl+item.gotoUrl;
	        		$("#login-alert").html("");
	        		$("#login-alert").hide();
	        	}
	        	else{
	        		$("#login-alert").html("<span style='color:red;'>"+item.message+"</span>");
	        		$("#login-alert").show();
	        	}
	        }
	    });
	}
}
</script>
</head>

<body class="login">
    	<div style="width:100%">
    		<ul class="head-ul mr300 mt123">
    			<li class="head-li"><a href="http://www.yunriwuri.com/index.html" target="view_window" class="head-li-a">官网首页</a></li>
    			<li class="head-li"><a href="http://www.yunriwuri.com/Gy/about.html" target="view_window" class="head-li-a">关于</a></li>
    			<!-- <li class="head-li"><a href="http://www.yunriwuri.com/zp/index.html"  target="view_window"  class="head-li-a">加入我们</a></li> -->
    		</ul>
    	</div>
    <div class="box">
        <div class="logo">
            <img src="<%=basePath%>source/images/inlogo_1.png"/>
        </div>
        <form method="post"  id="loginForm" >
        <div class="login-panel">
        
            <div class="fl login-left">
                <div class="fl login-title">管理员登录</div>
                <div class="fl panel">
                	<p class="login-rows mt30">
                    	<input type="text" name="account" id="loginName" class="login-input login-name easyui-validatebox" placeholder="用户名"  validType="Length[4,22]" data-options="required:true" value="<shiro:principal/>" onblur="GetPwdAndChk();"/>
                    </p>
                    <p class="login-rows mt30">
                    	<input type="password" name="password" id="password" class="login-input login-pwd easyui-validatebox" placeholder="密码"  validType="Length[4,22]" data-options="required:true"/>
                    	<input type="hidden" name="userType" value="1" /> 
                    </p>
                    <p class="login-rows mt30"> 
                    </p>
                   	<div id="login-alert" class="login-rows" style="display:none;"></div>
                    <p class="login-rows mt10">
                    	<span class="login-btn" onclick="javascript:login()">登 录</span>
                    </p>
                </div>
            </div>
           
            <div class="fl login-line"></div>
            <div class="fl login-right txt-center"> 
                <img src="<%=basePath%>source/images/gy_pic.jpg" class="twocode"/>   
            </div>
        </div>
         </form>
        <div class="cl"></div>
    </div>
    <div class="bottom">
    	<p>&copy;优创软件研发 2016. ALL rights reserved.</p>
    </div>
</body>
</html>