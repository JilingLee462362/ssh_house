<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="scripts/fancybox/jquery.fancybox-1.3.4.js"></script>

<script language="javascript" type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
<script language="javascript" type="text/javascript" src="My97DatePicker/calendar.js"></script>

<script type="text/javascript" src="scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="style/authority/jquery.fancybox-1.3.4.css" media="screen"></link>
<script type="text/javascript" src="scripts/artDialog/artDialog.js?skin=default"></script>
<title>信息管理系统</title>
<script type="text/javascript">
	$(document).ready(function(){
		/** 新增   **/
	    $("#addBtn").fancybox({
	    	'href'  : 'xiaoqu/save.action',
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'xiaoqu_list.jsp';
	        }
	    });
		
		
	    /**编辑   **/
	    $("a.edit").fancybox({
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'house_list.html';
	        }
	    });
	});
	/** 用户角色   **/
	var userRole = '';

	/** 模糊查询来电用户  **/
	function search(){
		$("#submitForm").attr("action", "house/find.action?pageNo="+1).submit();
	}


	 
	
	
	/** 删除 **/
	function del(fyID){
		// 非空判断
		if(fyID == '') return;
		if(confirm("您确定要删除吗？"+fyID)){
			//$("#submitForm").attr("action", "house/del.action?id=" + fyID).submit();
			
				window.location.href="tyemployee/edit.action?employeeid="+fyID;
			}
	}
</script>
<style>
	.alt td{ background:black !important;}
</style>

  </head>
  
  <body>
    
    <form id="submitForm" name="submitForm" action="<%=basePath%>tyemployee/update.action?employeeid=${ty.employeeid}" method="post">
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th width="30"><input type="checkbox" id="all" onclick="selectOrClearAllCheckbox(this);" />
							</th>
							<th>员工姓名</th>
							<th>员工职位</th>
							<th>员工性别</th>
							<th>员工年龄</th>
							<th>员工生日</th>
							<th>员工电话</th>
							<th>操作</th>
						</tr>
						
						<tr>
								<td><input type="checkbox" name="id" value="${ty.employeeid}" class="acb" /></td>
								<td><input name="employeename" value="${ty.employeename}"></td>
								<td><input name="positionname" value="${ty.tyPosition.positionname}"></td>
								<td><input name="sex" value="${ty.sex}"></td>
								<td><input name="age" value="${ty.age}"></td>
								<td><input class="Wdate" type="text" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})" value="${ty.birth}"></td>
								<td><input name="phone" value="${ty.phone}"></td>
								<td>
									<a href="tyemployee/edit.action?employeeid=${ty.employeeid}" class="edit">编辑</a> 
									<a href="javascript:del('${ty.employeeid}');">删除</a>
								</td>
						</tr>

					
						
							
						
					</table>
				</div>
				</div>
			</div>
		</div>
	</form>
  </body>
</html>
