<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@  taglib uri="/struts-tags"  prefix="s" %>
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
	
<!-- 日期插件，使用jquery -->
		<link rel="stylesheet" href="jquery/jquery.datepick.css" type="text/css">
		<script type="text/javascript" src="jquery/jquery.datepick.js"></script>
		<script type="text/javascript" src="jquery/jquery.datepick-zh-CN.js"></script>
<style>
.alt td {
	background: black !important;
}
</style>
<SCRIPT language=javascript>	
$(function() {
/* 	<!--客户级别-->
		$.post("fingByhouse.action", {"" : ""},
			function(data) {
					$(data).each(function(i,n){
							$("#cust_level").append("<option value='"+n+"'>"+n+"</option>");
					});
					
			},
		"json"); */
		
		//使用class属性处理  'yy-mm-dd' 设置格式"yyyy/mm/dd"
			$('#birthday').datepick({dateFormat: 'yy-mm-dd'}); 
		
		});	
</SCRIPT>


</head>

<body>
	<form id="submitForm" name="submitForm" action="TyPactNote_save.action"
		method="post">
		<div id="container">
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%"
						align="center" border="0">
					<tr>
							<th width="30"><input type="checkbox" id="all" onclick="" />
							</th>
							<th>合同签署客户编号</th>
							<th>合同名称</th>
							<th>公司代表</th>
							<th> 签署日期</th>
							<th> 描述</th>
							<th>操作</th>
						</tr>
						
							<tr>
								<td><input type="checkbox" name="IDCheck" value="14458579642011" class="acb" /></td>
								<td><input type="text" name="pnCustomerId" value="" /></td>
								<td><input type="text"  name="pnName" value=""/><s:fielderror fieldName="pnName" cssStyle="color: red;" /></td>
								<td><input type="text"   name="pnDeputy" value=""/><s:fielderror fieldName="pnDeputy" cssStyle="color: red;" /></td>
								<td><input type="text"   name="pnDate"  id="birthday"  value=""/></td>
								<td><input type="text"   name="pnDescription"  value="" /></td>
								<td>
									<input type="submit" >
								</td>			
							</tr>
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript" src="/js/jquery-1.4.4.min.js"></script>
</html>
