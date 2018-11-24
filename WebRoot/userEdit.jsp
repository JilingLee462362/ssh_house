<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }scripts/jquery/jquery-1.7.1.js"></script>
<link href="style/authority/basic_layout.css" rel="stylesheet"
	type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }scripts/authority/commonAll.js"></script>
<script type="text/javascript"
	src="scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript"
	src="scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css"
	href="style/authority/jquery.fancybox-1.3.4.css" media="screen"></link>
<script type="text/javascript"
	src="scripts/artDialog/artDialog.js?skin=default"></script>
<title>信息管理系统</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/scripts/jquery/jquery-1.4.4.min.js"></script>
<style>
.alt td {
	background: black !important;
}
</style>

</head>

<body>
	<form id="submitForm" name="submitForm" action="userManage_update.action"
		method="post">
		<div id="container">
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%"
						align="center" border="0">
						<tr>
							<th>ID</th>
							<th>名字</th>
							<th>密码</th>
							<th>家庭</th>
							<th>电话</th>
							<th>邮箱</th>
							<th>保存修改</th>
						</tr>
							<tr>
								
								<td><s:textfield name="model.userid" theme="simple"/></td>
								<td><s:textfield name="model.username" theme="simple"/></td>
								<td><s:textfield name="model.userpass" theme="simple"/></td>
								<td><s:textfield name="model.userfamily" theme="simple"/></td>
								<td><s:textfield name="model.userphone" theme="simple"/></td>
								<td><s:textfield name="model.usermail" theme="simple"/></td>
								<td>
								<input type="submit">
								</td>
							</tr>
					</table>
				</div>
			</div>
		</div>
		</div>
	</form>
</body>
<script type="text/javascript" src="/js/jquery-1.4.4.min.js"></script>
<SCRIPT language=javascript>
	function to_page(page) {
		if (page) {
			$("#page").val(page);
		}
		document.submitForm.submit();
	}
</SCRIPT>
</html>
