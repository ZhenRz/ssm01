
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	double num = Math.random();
 %>
<script type="text/javascript" src="/ssm01/static/js/jquery-3.1.0.js"></script>
<div id="header" class="wrap">
	<div id="logo"><img src="<%=path%>/static/images/logo.gif" /></div>
	
	<div class="help">
        <a href="<%=path%>/jsp/shopping.jsp" class="shopping">购物车</a>
        <c:if test="${sessionScope.user_name==null}">
        <a href="<%=path%>/jsp/login.jsp">登录</a>
        <a href="<%=path%>/jsp/register.jsp">注册</a>
        </c:if>
        <c:if test="${sessionScope.user_name!=null}">
            欢迎您：<a  href="#">${sessionScope.user_name}</a>
            <a id="logout" href="<%=path%>/jsp/login.jsp">注销</a>
            <a href="<%=path%>/jsp/register.jsp">注册</a>
        </c:if>
        <a href="#">留言</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li><a href="<%=path%>/jsp/index.jsp">首页</a></li>
			
			<li><a href="#">商品名称</a></li>
			
		</ul>
	</div>
	


</div>
<div id="childNav">
	<div class="wrap">
		<ul id="BigType" class="clearfix">
		
			<li class="first"><a>商品分类:</a></li>


		
		</ul>
	</div>
	<!-- JiaThis Button BEGIN -->
<script type="text/javascript" src="http://v2.jiathis.com/code/jiathis_r.js?move=0" charset="utf-8"></script>
<!-- JiaThis Button END -->
</div>
