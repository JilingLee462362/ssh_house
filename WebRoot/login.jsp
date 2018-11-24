<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       <base href="<%=basePath%>">
	     <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>SCT-后台系统</title>
		<link href="style/authority/login_css.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
			
			
			/* $("#login_sub").click(function(){
				$("#submitForm").attr("action", "index.html").submit();
			}); */
			
			
		});
		
	/*回车事件*/
	function EnterPress(e){ //传入 event 
		var e = e || window.event; 
		if(e.keyCode == 13){ 
			$("#submitForm").attr("action", "index.html").submit();
		} 
	} 
</script>

  </head>
  
  <body>
  	<div id="login_center">
		<div id="login_area">
			<div id="login_box">
				<div id="login_form">
					<form id="submitForm" action="<%=basePath%>ui/login.action" method="post">
						<div id="login_tip">
							<span id="login_err" class="sty_txt2"></span>
						</div>
						<div>
							 用户名：<input type="text" name="username" class="username" id="name"  value="admin">
						</div>
						<div>
							密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="userpass" value="123123" class="pwd" id="pwd" onkeypress="EnterPress(event)" onkeydown="EnterPress()">
						</div>
						<div id="btn_area">
							<input type="submit" class="login_btn" id="login_sub"  value="登  录">
							<input type="reset" class="login_btn" id="login_ret" value="重 置">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
