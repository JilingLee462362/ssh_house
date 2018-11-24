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
	    	'href'  : 'tyforumtitle_add.jsp',
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'tyforumtitle/find.action';
	        }
	    });
		
	    /** 导入  **/
	    $("#importBtn").fancybox({
	    	'href'  : '/xngzf/archives/importFangyuan.action',
	    	'width' : 633,
	        'height' : 260,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'tyforumtitle_list.jsp';
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
	        	window.location.href = 'tyforumtitle/find.action';
	        }
	    });
	});
	/** 用户角色   **/
	var userRole = '';

	/** 模糊查询来电用户  **/
	function search(){
		$("#submitForm").attr("action", "tyforumtitle_list.jsp?page=" + 1).submit();
	}

	/** 新增   **/
	function add(){
		$("#submitForm").attr("action", "/xngzf/archives/luruFangyuan.action").submit();	
	}
	 
	/** Excel导出  **/
	function exportExcel(){
		if( confirm('您确定要导出吗？') ){
			var fyXqCode = $("#fyXq").val();
			var fyXqName = $('#fyXq option:selected').text();
//	 		alert(fyXqCode);
			if(fyXqCode=="" || fyXqCode==null){
				$("#fyXqName").val("");
			}else{
//	 			alert(fyXqCode);
				$("#fyXqName").val(fyXqName);
			}
			$("#submitForm").attr("action", "/xngzf/archives/exportExcelFangyuan.action").submit();	
		}
	}
	
	/** 删除 **/
	function del(ftId){
		// 非空判断
		if(ftId == '') return;
		if(confirm("您确定要删除吗？")){
			 $.ajax({
            //几个参数需要注意一下   4   200
                type: "POST",//方法类型
                dataType: "JSON",//预期服务器返回的数据类型
                url: "tyforumtitle/delete.action?ftId="+ftId ,//url
                data: $('#submitForm').serialize(),
                async: false,
                success: function () {
                	alert("删除成功");
                	window.location.href = 'tyforumtitle/find.action';
                },
                error: function() {
                    alert("删除异常！");
                }
            });		
		}
	}
	
	/** 批量删除 **/
	function batchDel(){
		if($("input[name='IDCheck']:checked").size()<=0){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'至少选择一条', ok:true,});
			return;
		}
		// 1）取出用户选中的checkbox放入字符串传给后台,form提交
		var allIDCheck = "";
		$("input[name='IDCheck']:checked").each(function(index, domEle){
			bjText = $(domEle).parent("td").parent("tr").last().children("td").last().prev().text();
// 			alert(bjText);
			// 用户选择的checkbox, 过滤掉“已审核”的，记住哦
			if($.trim(bjText)=="已审核"){
// 				$(domEle).removeAttr("checked");
				$(domEle).parent("td").parent("tr").css({color:"red"});
				$("#resultInfo").jsp("已审核的是不允许您删除的，请联系管理员删除！！！");
// 				return;
			}else{
				allIDCheck += $(domEle).val() + ",";
			}
		});
		// 截掉最后一个","
		if(allIDCheck.length>0) {
			allIDCheck = allIDCheck.substring(0, allIDCheck.length-1);
			// 赋给隐藏域
			$("#allIDCheck").val(allIDCheck);
			if(confirm("您确定要批量删除这些记录吗？")){
				// 提交form
				$("#submitForm").attr("action", "tyforumtitle/delete.action").submit();
			}
		}
	}

	/** 普通跳转 **/
	function jumpNormalPage(page){
		$("#submitForm").attr("action", "tyforumtitle/find.action?pageNum=" + page).submit();
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
			$("#submitForm").attr("action", "tyforumtitle_list.jsp?page=" + pageNum).submit();
		}else{
			// “跳转页数”为空
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数，\n自动为您跳到首页', ok:true,});
			$("#submitForm").attr("action", "tyforumtitle_list.jsp?page=" + 1).submit();
		}
	}
</script>
<style>
	.alt td{ background:black !important;}
	.ellipsis { overflow: hidden; /*自动隐藏文字*/ text-overflow: ellipsis;/*文字隐藏后添加省略号*/ white-space: nowrap;/*强制不换行*/ width: 30em;/*不允许出现半汉字截断*/ }
</style>

  </head>
  
  <body>
    <form id="submitForm" name="submitForm" action="" method="post">
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						
						<div id="box_bottom">
						<input type="button" value="新增" class="ui_input_btn01" id="addBtn" /> 
							<!-- <input type="button" value="查询" class="ui_input_btn01" onclick="search();" /> 
							
							<input type="button" value="删除" class="ui_input_btn01" onclick="batchDel();" />  -->							
						</div>
					</div>
				</div>
			</div>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<!-- <th width="30"><input type="checkbox" id="all" onclick="selectOrClearAllCheckbox(this);" />
							</th> -->
							<th>帖子ID</th>
							<th>帖子标题</th>
							<th>帖子内容</th>
							<th>发布者ID</th>
							<th></th>
						</tr>
						
						<c:forEach items="${TyForumTitleList}" var="t">
						
							<tr>
								<!-- <td><input type="checkbox" name="IDCheck" value="14458579642011" class="acb" /></td> -->
								<td><a href="tyforumback/find.action?tft.ftId=${t.ftId}">${t.ftId}</a></td>
								<td><a href="tyforumback/find.action?tft.ftId=${t.ftId}">${t.ftTitle}</a></td>
								<td>
									<div class="ellipsis"><a href="tyforumback/find.action?tft.ftId=${t.ftId}">${t.forumContent}</a></div>
								</td>
								<td>${t.tyEmployee.employeeid}</td>
								<td>
									<a href="tyforumtitle/findOne.action?ftId=${t.ftId}" class="edit">编辑</a> 
									<a href="javascript:del('${t.ftId}');">删除</a>
								</td>
							</tr>
						</c:forEach>

		
						
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">90</span>
						条记录，当前第
						<span class="ui_txt_bold04">1
						/
						9</span>
						页
					</div>
					<div class="ui_frt">
						<!--    如果是第一页，则只显示下一页、尾页 -->
						
							<input type="button" value="首页" class="ui_input_btn01" 
								onclick="jumpNormalPage(1);"/>
							<input type="button" value="上一页" class="ui_input_btn01" 
								onclick="jumpNormalPage(${page-1});"/>
							<input type="button" value="下一页" class="ui_input_btn01"
								onclick="jumpNormalPage(${page+1});" />
							<input type="button" value="尾页" class="ui_input_btn01"
								onclick="jumpNormalPage(9);" />
						
						
						
						<!--     如果是最后一页，则只显示首页、上一页 -->
						
						转到第<input type="text" id="jumpNumTxt" class="ui_input_txt01" />页
							 <input type="button" class="ui_input_btn01" value="跳转" onclick="jumpInputPage(9);" />
					</div>
				</div>
			</div>
		</div>
	</form>
  </body>
</jsp>