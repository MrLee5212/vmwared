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
<title>解决方案</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1  ,maximum-scale=1, user-scalable=no" /> 
</head>

<body>
<div class="plan-cell yw-row plan-2016">
    <div class="plan-title">
        全套建站服务，满足您各种建站需求
        <a class="yw-right more" href=""></a>
    </div>
    <p class="info">阿里云为您提供包括域名注册、解析、备案，和云服务器托管的一站式服务；如您没有网站程序，还可选择阿里云服务商为您提供的建站服务，让您建站无忧。 （<a href="http://help.aliyun.com/knowledge_detail/6555843.html " target="_blank">不知如何建网站？简单4步，轻松学会</a>）</p>
    <div class="yw-clear"> 
        <div style="width: 20%;" class="cell yw-left">
            <a href="http://wanwang.aliyun.com/domain/" target="_blank">
                <div class="box">
                    <h1>域名注册</h1>
                    <p class="dotdotdot" style="height: 40px; word-wrap: break-word;">国内域名市场NO.1，19年专业域名服务，超30种域名供您选择。</p>
                    <img id="img1" onmouseover="$('#img1').addClass('action');$('#img2').removeClass('action');" src="//img.alicdn.com/tps/i2/TB1F5UFKXXXXXa6XXXX5rDaIVXX-80-80.png">
                    <img id="img2" onmouseleave="$('#img2').addClass('action');$('#img1').removeClass('action');"  class="action" src="//img.alicdn.com/tps/i3/TB1K1MDKXXXXXcrXXXX5rDaIVXX-80-80.png">
                    <p class="btn">了解详情</p>
                </div>
            </a>
        </div> 
        <div style="width: 20%;" class="cell yw-left">
            <a href="http://www.aliyun.com/product/ecs/" target="_blank">
                <div class="box">
                    <h1>云服务器托管</h1>
                    <p class="dotdotdot" style="height: 40px; word-wrap: break-word;">可弹性伸缩、安全稳定、简单易用。28.8元/月起</p>
                    <img id="img3" onmouseover="$('#img3').addClass('action');$('#img4').removeClass('action');"  src="//img.alicdn.com/tps/i4/TB1YmkHKXXXXXamXXXXknENJpXX-90-80.png">
                    <img id="img4" onmouseleave="$('#img4').addClass('action');$('#img3').removeClass('action');"  class="action" src="//img.alicdn.com/tps/i1/TB1ed7mKXXXXXbnXFXXknENJpXX-90-80.png">
                    <p class="btn">了解详情</p>
                </div>
            </a>
        </div> 
        <div style="width: 20%;" class="cell yw-left">
            <a href="http://market.aliyun.com/jianzhan" target="_blank">
                <div class="box">
                    <h1>建站服务</h1>
                    <p class="dotdotdot" style="height: 40px; word-wrap: break-word;">服务全程监管，不满意全额退款。</p>
                    <img id="img5" onmouseover="$('#img5').addClass('action');$('#img6').removeClass('action');"  src="//img.alicdn.com/tps/i2/TB1ss.sKXXXXXcRXpXXknENJpXX-90-80.png">
                    <img id="img6" onmouseleave="$('#img6').addClass('action');$('#img5').removeClass('action');"  class="action" src="//img.alicdn.com/tps/i3/TB1I6.uKXXXXXa.XpXXknENJpXX-90-80.png">
                    <p class="btn">了解详情</p>
                </div>
            </a>
        </div> 
        <div style="width: 20%;" class="cell yw-left">
            <a href="http://wanwang.aliyun.com/domain/dns/" target="_blank">
                <div class="box">
                    <h1>云解析</h1>
                    <p class="dotdotdot" style="height: 40px; word-wrap: break-word;">提供安全、稳定、极速的域名解析服务，每天超百亿次解析响应</p>
                    <img id="img7" onmouseover="$('#img7').addClass('action');$('#img8').removeClass('action');"  src="//img.alicdn.com/tps/i4/TB1OMIbKXXXXXa5aXXX5rDaIVXX-80-80.png">
                    <img id="img8" onmouseleave="$('#img8').addClass('action');$('#img7').removeClass('action');"  class="action" src="//img.alicdn.com/tps/i1/TB1ZtcjKXXXXXX8XVXX5rDaIVXX-80-80.png">
                    <p class="btn">了解详情</p>
                </div>
            </a>
        </div> 
        <div style="width: 20%;" class="cell yw-left">
            <a href="http://beian.aliyun.com/" target="_blank">
                <div class="box">
                    <h1>备案</h1>
                    <p class="dotdotdot" style="height: 40px; word-wrap: break-word;">备案0担忧，备多久云服务器免费送多久</p>
                    <img id="img9" onmouseover="$('#img9').addClass('action');$('#img0').removeClass('action');"  src="//img.alicdn.com/tps/i2/TB1Zi7jKXXXXXX6XVXX5rDaIVXX-80-80.png">
                    <img id="img0" onmouseleave="$('#img0').addClass('action');$('#img9').removeClass('action');"  class="action" src="//img.alicdn.com/tps/i1/TB1H7geKXXXXXczXVXX5rDaIVXX-80-80.png">
                    <p class="btn">了解详情</p>
                </div>
            </a>
        </div>
    </div>
</div> 
<div class="plan-cell yw-row plan-2017">

    <div class="plan-title">
        一站式解决网站问题
        <a class="yw-right more" href=""></a>
    </div> 
    <div class="yw-clear"> 
        <div class="yw-span6 ">
            <div class="cell">
                <h1>服务器选配和环境配置</h1>
                <p class="dotdotdot" style="word-wrap: break-word;width:526px;">如果您已有网站程序，那么就需要根据您的业务情况选购适合的服务器，并在服务器上部署程序运行所需要的语言环境（如 Java、PHP、.NET 等）。</p>
                <a href="http://www.aliyun.com/solution/web/server.html">了解如何选购服务器和进行环境配置&nbsp;&gt;</a>
            </div>
        </div> 
        <div class="yw-span6 yw-last">
            <div class="cell">
                <h1>网站数据备份</h1>
                <p class="dotdotdot" style="word-wrap: break-word;width:526px;">随着网站的发展，积累的数据会越来越多，如静态的文件（代码，图片等）和数据库的数据。对数据进行定期备份，可以用于特殊情况下的数据还原。</p>
                <a href="http://www.aliyun.com/solution/web/backup.html">了解网站数据备份更多信息&nbsp;&gt;</a>
            </div>
        </div> 
        <div class="yw-span4 ">
            <div class="cell">
                <h1>网站加速服务</h1>
                <p class="dotdotdot" style="word-wrap: break-word;width:322px;">随着网站访问的用户群体增大，地域越来越广，不同地区的用户访问网站的延时问题就会明显起来，尤其是图片和视频类网站，这就需要进行网站内容加速来解决。</p>
                <a href="http://www.aliyun.com/solution/web/acceleration.html">了解视频/图片类网站加速更多信息&nbsp;&gt;</a>
            </div>
        </div> 
        <div class="yw-span4 ">
            <div class="cell">
                <h1>网站防攻击</h1>
                <p class="dotdotdot" style="word-wrap: break-word;width:322px;">如何保障网站安全运行，是所有网站管理者都关心的问题，但自建安全体系往往昂贵而复杂，阿里云安全服务，能让您轻松应对DDos攻击、病毒木马、暴力破解等安全问题。</p>
                <a href="http://www.aliyun.com/solution/web/defense.html">了解网站防攻击的更多信息&nbsp;&gt;</a>
            </div>
        </div> 
        <div class="yw-span4 yw-last">
            <div class="cell">
                <h1>轻松应对高并发大流量</h1>
                <p class="dotdotdot" style="word-wrap: break-word;width:322px;">千万级别流量的网站架构，已经不能单纯的依靠单点优化，需要一套系统的工程来解决所面临的各类问题。</p>
                <a href="http://www.aliyun.com/solution/web/highpv.html">高并发大流量网站方案详情&nbsp;&gt;</a>
            </div>
        </div> 
	</div>
</div>  
<div class="plan-cell plan-easy yw-row yw-clear">
 <div class="plan-title">
     丰富的软件与服务
     <a class="yw-right more" href=""></a>
 </div> 
    <div class="yw-span4 ">
        <div class="cell">
            <h1>一键配置web环境</h1>
            <h2>提供Windows和Linux服务器网站环境配置服务，安全稳定，一次完美安装多种主流环境。</h2>
            <p><a href="http://market.aliyun.com/products/?jYiPCY&amp;tag=web环境一键安装" target="_blank">了解详情&nbsp;&gt;</a></p>
            <img src="//img.alicdn.com/tps/i2/TB1oJb3KXXXXXX3XFXXezUPJpXX-90-90.jpg">
        </div>
    </div>


    <div class="yw-span4 ">
        <div class="cell">
            <h1>环境迁移和配置</h1>
            <h2>快速实现站点迁移、环境站点配置，让您轻松上云，省时。</h2>
            <p><a href="http://market.aliyun.com/products/52746001/" target="_blank">了解详情&nbsp;&gt;</a></p>
            <img src="//img.alicdn.com/tps/i4/TB1k7HQKXXXXXcbXVXXezUPJpXX-90-90.jpg">
        </div>
    </div>

    <div class="yw-span4   yw-last">
        <div class="cell">
            <h1>故障排查及清除</h1>
            <h2>快速响应，帮您排查原因，协助您解决故障问题。</h2>
            <p><a href="http://market.aliyun.com/products/52740002/" target="_blank">了解详情&nbsp;&gt;</a></p>
            <img src="//img.alicdn.com/tps/i3/TB1hSIbKXXXXXcqXXXXezUPJpXX-90-90.jpg">
        </div>
    </div>


    <div class="yw-span4 ">
        <div class="cell">
            <h1>移动营销</h1>
            <h2>移动APP专业定制开发，帮您占领移动互联网市场。</h2>
            <p><a href="http://market.aliyun.com/products/55514022/" target="_blank">了解详情&nbsp;&gt;</a></p>
            <img src="//img.alicdn.com/tps/i1/TB17o.gKXXXXXXYXXXXezUPJpXX-90-90.jpg">
        </div>
    </div>


    <div class="yw-span4 ">
        <div class="cell">
            <h1>服务器安全代维</h1>
            <h2>7x24监控、7x24故障排除、7x24小时电话对应，任你用。</h2>
            <p><a href="http://market.aliyun.com/products/52732002" target="_blank">了解详情&nbsp;&gt;</a></p>
            <img src="//img.alicdn.com/tps/i2/TB1ZnbUKXXXXXaNXFXX5qTAJFXX-92-92.jpg">
        </div>
    </div>


    <div class="yw-span4  yw-last ">
        <div class="cell">
            <h1>安全管理</h1>
            <h2>有效抵御漏洞攻击和恶意代码。</h2>
            <p><a href="http://market.aliyun.com/products/53366009/?A6xhly&amp;tag=安全" target="_blank">了解详情&nbsp;&gt;</a></p>
            <img src="//img.alicdn.com/tps/i1/TB1ztEgKXXXXXX5XXXXezUPJpXX-90-90.jpg">
        </div>
    </div>
    
</div> 
</body>
</html>
