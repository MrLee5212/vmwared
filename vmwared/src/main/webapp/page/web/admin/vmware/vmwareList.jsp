<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="utf-8">
<title>虚拟机平台</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1  ,maximum-scale=1, user-scalable=no" /> 
	 
</head>

<body>
 <div class="con-rights" id="conRight">
		<div class="fl yw-lump">
			<div class="yw-lump-title">
				<i class="yw-icon icon-partner"></i><span>配置管理</span>
			</div>
		</div>
		<div class="fl yw-lump mt10">
			<form id="userCompanyForm" name="userCompanyForm"
				action="companyList.do" method="get">
				<div class="pd10-28">
					<div class="fl">
						<span class="yw-btn bg-blue cur">全部产品</span> 
						<span class="yw-btn bg-gray ml20 cur">满意度调查</span>
					</div>
					<div class="fr"> 
						<span class="yw-btn bg-green ml20 cur" >新建公司</span>
					</div>
					<div class="cl"></div>
				</div> 
			</form>
		</div>
		<div class="fl">
			<div class="fl yw-lump wid152 mt10">
				<div class="yw-cm-title">
					<span class="ml26">配置管理</span>
				</div>
				<div class="yw-tree-list"  style="height: 639px;">
					<ul id="treeList" >
						<li>  
							<span onclick="gotoChildMenu('/vmwared/admin/vmware/vmwareList.do','18')">
		                        	<i class="fl yw-icon icon-todayjob"></i>硬件配置</span>
						</li>
						<li> 
							<span onclick="gotoChildMenu('/vmwared/admin/vmware/vmwareList.do','18')">
		                        	<i class="fl yw-icon icon-todayjob"></i>软件配置</span>
						</li>
						<li>  
							<span onclick="gotoChildMenu('/vmwared/admin/vmware/vmwareList.do','18')">
		                        	<i class="fl yw-icon icon-todayjob"></i>约束条件设置</span>
						</li>
					</ul>
				</div>
			</div>
			<div class="yw-lump wid-atuo ml155 mt10">
				<div class="yw-cm-title">
					<span class="ml26">所有产品</span>
				</div>
				<table class="yw-cm-table yw-center yw-bg-hover" id="userinfoList">
					<tr style="background-color:#D6D3D3;font-weight: bold;">
						<th width="4%" style="display:none">&nbsp;</th>
						<th>公司名称</th>
						<th>所属公司</th>
						<th>所在区域</th>
						<th>联系地址</th>
						<th>联系人</th> 
					</tr> 
				</table> 
			</div>
		</div> 
</body>
</html>
