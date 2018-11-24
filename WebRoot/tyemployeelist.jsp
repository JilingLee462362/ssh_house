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
	    	'width' : 1200,
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

	/** 新增   **/
	function add(){
		$("#submitForm").attr("action", "/xngzf/archives/luruFangyuan.action").submit();	
	}
	 
	
	
	/** 删除 **/
	function del(fyID){
		// 非空判断
		if(fyID == '') return;
		if(confirm("您确定要删除吗？"+fyID)){
			//$("#submitForm").attr("action", "house/del.action?id=" + fyID).submit();
			
				window.location.href="xiaoqu/del.action?id="+fyID;
			}
	}
	

	/** 普通跳转 **/
	function jumpNormalPage(page){
		//alert(page);
		$("#submitForm").attr("action", "tyemployee/find.action?pageNum="+page).submit();
	}
	
	/** 输入页跳转 **/
	function jumpInputPage(totalPage){
		// 如果“跳转页数”不为空
		if($("#jumpNumTxt").val() != ''){
			var pageNum = parseInt($("#jumpNumTxt").val());
			// 如果跳转页数在不合理范围内，则置为1
			if(pageNum<1 | pageNum>totalPage){
				art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数，\n自动为您跳到首页', ok:true,});
				pageNum = 1;
			}
			$("#submitForm").attr("action", "house_list.html?page=" + pageNum).submit();
		}else{
			// “跳转页数”为空
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数，\n自动为您跳到首页', ok:true,});
			$("#submitForm").attr("action", "house_list.html?pageNo=" + 1).submit();
		}
	}
</script>
<style>
	.alt td{ background:black !important;}
</style>

  </head>
  
  <body>
    
    <form id="submitForm" name="submitForm" action="" method="post">
		 
	 
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_top">功能</div>
						
						<div id="box_bottom">
							<input type="button" value="查询" class="ui_input_btn01" onclick="search();" /> 
							<a href="tyemployee_edit.jsp"><input type="button"  class="ui_input_btn01" value="新增" /></a>
							<input type="button" value="删除" class="ui_input_btn01" onclick="batchDel();" /> 
						</div>
					</div>
				</div>
			</div>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th width="30"><input type="checkbox" id="all" onclick="selectOrClearAllCheckbox(this);" />
							</th>
							<th>员工编号</th>
							<th>员工姓名</th>
							<th>员工职位</th>
							<th>员工性别</th>
							<th>员工年龄</th>
							<th>员工生日</th>
							<th>员工电话</th>
							<th>操作</th>
						</tr>
						
						<c:forEach items="${tylist}" var="ty">
						
							<tr>
								<td><input type="checkbox" name="id" value="${ty.employeeid}" class="acb" /></td>
								<td>${ty.employeeid}</td>
								<td>${ty.employeename}</td>
								<td>${ty.tyPosition.positionname}</td>
								<td>${ty.sex}</td>
								<td>${ty.age}</td>
								<td>${ty.birth}</td>
								<td>${ty.phone}</td>
								<td>
									<a href="tyemployee/edit.action?employeeid=${ty.employeeid}" class="edit">编辑</a> 
									<a href="javascript:del('${ty.employeeid}');">删除</a>
								</td>
							</tr>
						</c:forEach>
					
						
							
						
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">${count}</span>
						条记录，当前第<span class="ui_txt_bold04">${pageNum}/${page}</span>页
					</div>
					<div class="ui_frt">
						<!--    如果是第一页，则只显示下一页、尾页 -->
						
							<input type="button" value="首页" class="ui_input_btn01"  onclick="jumpNormalPage(1);"/>
							<input type="button" value="上一页${pageNum-1}" class="ui_input_btn01" onclick="jumpNormalPage(${pageNum-1});"/>
							<input type="button" value="下一页${pageNum+1}" class="ui_input_btn01" onclick="jumpNormalPage(${pageNum+1});" />
							<input type="button" value="尾页${page}" class="ui_input_btn01" onclick="jumpNormalPage(${page});" />
						
						
						
						<!--     如果是最后一页，则只显示首页、上一页 -->
						
						转到第<input type="text" id="jumpNumTxt" class="ui_input_txt01" />页
							 <input type="button" class="ui_input_btn01" value="跳转" onclick="jumpInputPage(9);" />
					</div>
				</div>
			</div>
		</div>
	</form>
  </body>
</html>
