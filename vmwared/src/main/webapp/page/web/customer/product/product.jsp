<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="utf-8">
<base href="<%=basePath%>">
<title>产品介绍</title>
</head>
<body>
<div class="yw-main-product" data-spm="1906226">
  <div class="yw-row">
    <div class="yw-main-head">
      <h1>安全、稳定的云计算基础服务</h1>        <span></span>
    </div>
  </div>
  <ul class="yw-clear yw-row yw-main-product-list" id="J-yw-main-product-list">
	    <li class="list-item ">
      <div class="border-left"></div>
      <div class="border-right"></div>
     <div class="inner">
        <div class="left">
          <h2>弹性计算</h2>
          <p class="desc">高可用，高性能，可弹性伸缩的计算服务</p>
          <p><img width="113" src="//img.alicdn.com/tps/i1/TB1EG7pIpXXXXbGXVXXuIF06XXX-226-270.png"></p>
        </div> 
      </div>
    </li> 
        <li class="list-item   ">
      <div class="border-left"></div>
      <div class="border-right"></div>
      <div class="inner">
        <div class="left">
          <h2>数据库</h2>
          <p class="desc">免去数据库安全和运维烦恼</p>
          <p><img width="113" src="//img.alicdn.com/tps/i2/TB1C_cuIpXXXXcvXFXXuIF06XXX-226-270.png"></p>
        </div> 
      </div>
    </li> 
        <li class="list-item   ">
      <div class="border-left"></div>
      <div class="border-right"></div>
      <div class="inner">
        <div class="left">
          <h2>存储与CDN</h2>
          <p class="desc">非结构化数据存储与网络加速</p>
          <p><img width="113" src="//img.alicdn.com/tps/i3/TB10gQKIpXXXXcyXXXXuIF06XXX-226-270.png"></p>
        </div>  
      </div>
    </li> 
        <li class="list-item   last">
      <div class="border-left"></div>
      <div class="border-right"></div>
      <div class="inner">
        <div class="left">
          <h2>&nbsp;&nbsp;云盾（安全）</h2>
          <p class="desc">十年攻防，一朝成盾</p>
          <p><img width="113" src="//img.alicdn.com/tps/i4/TB1rMojIpXXXXbaaXXXuIF06XXX-226-270.png"></p>
        </div> 
      </div>
    </li> 
      </ul>
</div>

	<div class="yw-main-market">
		<div class="yw-row">
			<div class="yw-main-head">
				<h1>海量的软件与服务助您上云更轻松</h1>
				<span></span>
			</div>
		</div>

		<div class="yw-row">
			<div class="yw-span9">
				<div class="yw-main-market-box">
					<div class="yw-main-market-cell">
						<a href="http://market.aliyun.com/software" target="_blank"> <img
							src="//img.alicdn.com/tps/i4/TB1pChaIFXXXXcgXVXXC0xUVpXX-308-250.png"
							class="grey"> <img
							src="//img.alicdn.com/tps/i1/TB1ht..IpXXXXcDXVXXC0xUVpXX-308-250.png"
							class="blue">
							<h4>软件市场</h4>
							<p>各行业精选软件及专业运行环境，一键安装部署，省心、放心</p>
						</a>
					</div>
					<div class="yw-main-market-cell">
						<a href="http://market.aliyun.com/enterprise" target="_blank">
							<img
							src="//img.alicdn.com/tps/i1/TB1KlM.IpXXXXcLXVXXC0xUVpXX-308-250.png"
							class="grey"> <img
							src="//img.alicdn.com/tps/i2/TB1nWxlIFXXXXasXFXXC0xUVpXX-308-250.png"
							class="blue">
							<h4>企业应用市场</h4>
							<p>专为企业用户提供精品软件，办公/财务/销售/人力轻松管理</p>
						</a>
					</div>
					<div class="yw-main-market-cell">
						<a href="http://market.aliyun.com/jianzhan" target="_blank"> <img
							src="//img.alicdn.com/tps/i2/TB14xReIFXXXXX0XVXXC0xUVpXX-308-250.png"
							class="grey"> <img
							src="//img.alicdn.com/tps/i3/TB197Q8IpXXXXbBaXXXC0xUVpXX-308-250.png"
							class="blue">
							<h4>建站市场</h4>
							<p>海量模板与定制需求响应，优质网站即刻上线</p></a>
					</div>
				</div>
			</div>

			<div class="yw-span3 yw-last">
				<div class="yw-main-market-box">
					<div class="yw-main-market-list">
						<h4>特别推荐</h4>
						<ul id="J_hot">
							<li><span>1.</span><a
								href="http://market.aliyun.com/templateList/ED-0.html?spm=0.0.0.0.1H7oAy"
								target="_blank" title="精美网站，1元限时抢">精美网站，1元限时抢</a></li>
							<li><span>2.</span><a
								href="http://market.aliyun.com/promotion/tyg" target="_blank"
								title="试用专区，1元封顶">试用专区，1元封顶</a></li>
							<li><span>3.</span><a
								href="http://market.aliyun.com/products/53448001/"
								target="_blank" title="免配置云服务器">免配置云服务器</a></li>
							<li><span>4.</span><a
								href="http://market.aliyun.com/enterprise" target="_blank"
								title="企业应用软件，全场1元起">企业应用软件，全场1元起</a></li>
							<li><span>5.</span><a
								href="http://market.aliyun.com/products/55514022/"
								target="_blank" title="移动营销工具，海量模板，极致体验">移动营销工具，海量模板，极致体验</a></li>
							<li><span>6.</span><a
								href="http://market.aliyun.com/products/53690006/?tag=&amp;filter=priceTag%3Aall%2CdeliveryMethod%3Aall%2CadaptSystem%3Aall%2CbaseYunProduct%3Aall%2CyunResourceManage%3A%E8%BF%90%E8%A1%8C%E7%9B%91%E6%8E%A7"
								target="_blank" title="给你的服务器做个健康体检">给你的服务器做个健康体检</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
