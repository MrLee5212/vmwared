<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<div id="slider-container">
	<div class="box_skitter box_skitter_large">
		<ul class="yw-center">
			<li class="yw-center"> 
				<a href="javascript:void(0);"><img src="${pageContext.request.contextPath}/source/images/logo-bg.png" alt="" /></a>
				<div class="label_text">
					<h3 class="colortext uppercase"> 广告位1
					</h3>
					<span>产品推广1</span>
				</div>
			</li>
			<li class="yw-center">
				<a href="javascript:void(0);"><img src="${pageContext.request.contextPath}/source/images/logo-bg.png" alt="" /></a> 
				<div class="label_text">
					<h3 class="colortext uppercase">广告位2
					</h3>
					<span>产品推广2
					</span>
				</div> 
			</li>
			<li class="yw-center">
				<a href="javascript:void(0);"><img src="${pageContext.request.contextPath}/source/images/logo-bg.png" alt="" /></a>
				<div class="label_text">
					<h3 class="colortext uppercase">广告位3
					</h3>
					<span>产品推广3
					</span>
				</div>
			</li>
		</ul>
	</div>
	<div id="shadow-img-slider"></div>
</div>
