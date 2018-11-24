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
	    	'href'  : 'tyPreferentialApply/toSavetyPreferentialApply.action',
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'tyPreferentialApply/find.action';
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
	        	window.location.href = 'tyPreferentialApply_list.html';
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
	        	window.location.href = 'tyPreferentialApply_list.html';
	        }
	    });
	});
	/** 用户角色   **/
	var userRole = '';

	/** 模糊查询来电用户  **/
	function search(){
		$("#submitForm").attr("action", "tyPreferentialApply/find.action?pageNo="+1).submit();
	}

	/** 新增   **/
	function add(){
		$("#submitForm").attr("action", "tyPreferentialApply/doSavetyPreferentialApply.action").submit();	
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
	function del(paApplyid){
		// 非空判断
		if(paApplyid == '') return;
		if(confirm("您确定要删除吗？"+paApplyid)){
			//$("#submitForm").attr("action", "tyPreferentialApply/del.action?paApplyid=" + paApplyid).submit();
			
				window.location.href= "tyPreferentialApply/del.action?paApplyid=" + paApplyid;
			}
	}
	
	/** 批量删除 **/
	function batchDel(){
		if($("input[name='paApplyid']:checked").size()<=0){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'至少选择一条', ok:true,});
			return;
		}
		// 1）取出用户选中的checkbox放入字符串传给后台,form提交
		var allIDCheck = "";
		$("input[name='paApplyid']:checked").each(function(index, domEle){
			bjText = $(domEle).parent("td").parent("tr").last().children("td").last().prev().text();
// 			alert(bjText);
			// 用户选择的checkbox, 过滤掉“已审核”的，记住哦
			if($.trim(bjText)=="已审核"){
// 				$(domEle).removeAttr("checked");
				$(domEle).parent("td").parent("tr").css({color:"red"});
				$("#resultInfo").html("已审核的是不允许您删除的，请联系管理员删除！！！");
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
				$("#submitForm").attr("action", "tyPreferentialApply/del.action").submit();
				
			
				
			}
		}
	}

	/** 普通跳转 **/
	function jumpNormalPage(page){
		//alert(page);
		$("#submitForm").attr("action", "tyPreferentialApply/find.action?pageNo="+page).submit();
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
			$("#submitForm").attr("action", "tyPreferentialApply/find.action?pageNo=" + pageNum).submit();
		}else{
			// “跳转页数”为空
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数，\n自动为您跳到首页', ok:true,});
			$("#submitForm").attr("action", "tyPreferentialApply/find.action?pageNo=" + 1).submit();
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
						<div id="box_top">搜索</div>
						
						<div id="box_bottom">
							<input type="button" value="查询" class="ui_input_btn01" onclick="search();" /> 
						<a href="tyPreferentialApply/toSavetyPreferentialApply.action"><input type="button" value="新增" class="ui_input_btn01" onclick="addBtn" /> </a>	
							<!-- <input type="button" value="删除" class="ui_input_btn01" onclick="batchDel();" /> 
							<input type="button" value="导入" class="ui_input_btn01" id="importBtn" />
							<input type="button" value="导出" class="ui_input_btn01" onclick="exportExcel();" /> -->
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
							<th>客户编号</th>
							<th>申请书名称</th>
							<th>代理申请人工号</th>							
							<th>房屋编号</th>
							<th>原价</th>
							<th>现在优惠点数</th>
							<th>申请优惠点数</th>
							<th>优惠后的价格</th>
							<th>申请日期</th>
							<th>状态（未审批，待审批，审批通过）</th>
							<th>申请事由</th>
							<th>审核意见</th>
						</tr>
						
						<c:forEach items="${pList}" var="p">
						
							<tr>
								<td><input  type="checkbox" name="paApplyid" value="${p.paApplyid}" class="id= domEle" onclick="batchDel();"/></td>
								
								<td>${p.paCustomerId}</td>
								<td>${p.paName}</td>
								<td>${p.paEmployeeid}</td>
								<td>${p.paBeforePrice}</td>
								<td>${p.paHouseid}</td>
								<td>${p.paNow}</td>
								<td>${p.paApply}</td>
								<td>${p.paAfterPrice}</td>
								<td>${p.paDate}</td>
								<td>${p.paStatus}</td>
								<td>${p.paContent}</td>
								<td>${p.paOpinion}</td>
								<td><a href="javascript:del('${p.paApplyid}')">删除</a></td>
								<td>
									<%-- <a href="tyPreferentialApply/update.action?id=${h.id}" class="edit">编辑</a> 
									<a href="javascript:del('${h.id}');">删除</a> --%>
								</td>
							</tr>
						</c:forEach>
					
						
							
						
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">${totalCount}</span>
						条记录，当前第<span class="ui_txt_bold04">${pageNo}
						/
						${pageCount}</span>
						页
					</div>
					<div class="ui_frt">
						<!--    如果是第一页，则只显示下一页、尾页 -->
						
							<input type="button" value="首页" class="ui_input_btn01"  onclick="jumpNormalPage(1);"/>
							<input type="button" value="上一页" class="ui_input_btn01" onclick="jumpNormalPage(${pageNo-1});"/>							
							<input type="button" value="下一页" class="ui_input_btn01" onclick="jumpNormalPage(${pageNo+1});" />
							<input type="button" value="尾页" class="ui_input_btn01" onclick="jumpNormalPage(${pageCount});" />
						
						
						
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
