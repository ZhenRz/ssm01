<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>易买网 - 首页</title>
<link type="text/css" rel="stylesheet" href="<%=path%>/static/css/style.css" />
<script type="text/javascript" src="<%=path%>/static/js/jquery-3.1.0.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/login.js"></script>
	<script type="text/javascript" src="<%=path%>/static/js/index_top.js"></script>

</head>
<body>
<%@ include file="index_top.jsp"  %>
<div id="register" class="wrap">
	<div class="shadow">
		<em class="corner lb"></em>
		<em class="corner rt"></em>
		<div class="box">
			<h1>欢迎回到易买网</h1>
			<form id="loginForm" method="post" action="#">
				<table>
					<tr>
						<td class="field">用户名：</td>
						<td><input class="text" type="text" id="username" name="userName" />
							<span id="span1" style="display: block "></span></td>
					</tr>
					<tr>
						<td class="field">登录密码：</td>
						<td><input class="text" type="password" id="passWord" name="passWord" /><%--<a href="retrieve_password.jsp">忘记密码</a>--%>
							<span id="span2" style="display: block "></span>
						</td>

					</tr>
					<tr>
						<td class="field">验证码：</td>
						<td><input class="text verycode" type="text" id="auth" name="veryCode" /><img id="veryCode" src="<%=path%>/authImg" />
							<span id="span3" style="display: block"></span></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-green"><input type="button" id="login" name="submit" value="立即登录" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2016  上海海文 All Rights Reserved
</div>
</body>
</html>
