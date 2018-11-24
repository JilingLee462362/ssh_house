<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>customerlogin</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
    	<form style="background-image: url(images/aa.jpg); height: 100%;width: 100%;background-repeat: no-repeat;" action="<%=basePath%>tycustomerback/login.action" method="post">
    		<div>
				 用户名：<input type="text" name="cusname" value="李一">
			</div>
			<div>
				密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="cuspwd" value="123123">
			</div>
			<div>
				<input type="submit" value="登  录">
				<input type="reset"  value="重 置">
			</div>
    	</form>
  </body>
</html>
