<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
<script language="javascript" type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<title>信息管理系统</title>
<script type="text/javascript">
	$(document).ready(function(){
		/** 新增   **/
	    $("#addBtn").fancybox({
	    	'href'  : 'instalmentapply_edit.jsp',
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'insapp/find.action';
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
	        	window.location.href = 'house_list.html';
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
	        	window.location.href = 'insapp/find.action';
	        }
	    });
	});
	/** 用户角色   **/
	var userRole = '';

	/** 模糊查询来电用户  **/
	function search(){
		$("#submitForm").attr("action", "insapp/find.action?pageNum=" + 1).submit();
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
	function del(fyID){
		// 非空判断
		if(fyID == '') return;
		if(confirm("您确定要删除吗？")){
			$("#submitForm").attr("action", "/xngzf/archives/delFangyuan.action?fyID=" + fyID).submit();			
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
				$("#submitForm").attr("action", "/xngzf/archives/batchDelFangyuan.action").submit();
			}
		}
	}

	/** 普通跳转 **/
	function jumpNormalPage(page){
		$("#submitForm").attr("action", "insapp/find.action?pageNum=" + page).submit();
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
			$("#submitForm").attr("action", "insapp/find.action?pageNum=" + pageNum).submit();
		}else{
			// “跳转页数”为空
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数，\n自动为您跳到首页', ok:true,});
			$("#submitForm").attr("action", "insapp/find.action?pageNum=" + 1).submit();
		}
	}
</script>
<style>
	.alt td{ background:black !important;}
</style>
</head>
<body>
	<form id="submitForm" name="submitForm" action="" method="post">
<!-- 		<input type="hidden" name="" value="" id="allIDCheck"/>
		<input type="hidden" name="" value="" id="fyXqName"/> -->
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_top">搜索</div>
						<div id="box_center">
							选择查询条件：
							<select name="query" id="fyXq" class="ui_select01" ">
                                <option value="">--请选择--</option>
                                <option value="1" <c:if test="${query eq 1}">selected="selected"</c:if>>客户编号</option>
                                <option value="2" <c:if test="${query  eq 2}">selected="selected"</c:if>>代理人工号</option>
                                <option value="3" <c:if test="${query eq 3}">selected="selected"</c:if>>审批人工号</option>
                            </select>
                            <input type="text" id="fyZldz" name="queryId" class="ui_input_txt02"
                            <c:if test="${queryId != null}">value="${queryId}"</c:if>
                             />
                            &emsp;&emsp;&emsp;&emsp;&emsp;
								
							审批状态
							<%-- <c:if test="${iAlist.iaApprovalState eq 0}">selected="selected"</c:if> --%>
							<%-- iAlist.iaApprovalState:${iAlist.iaApprovalState} --%>
							<select name="iaApprovalState" id="fyHx" class="ui_select01">
                                <option value="">--请选择--</option>
                                <option value="0" >未审批<option>
                                <option value="1" >审批通过</option>
                                <option value="2" >审批未通过</option>
                            </select>
						</div>
						<div id="box_bottom">
							<input type="button" value="查询" class="ui_input_btn01" onclick="search();" /> 
							<input type="button" value="新增" class="ui_input_btn01" id="addBtn" /> 
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
							<th>申请编号</th>
							<th>客户编号</th>
							<th>房屋编号</th>
							<th>申请书名称</th>
							<th>付款日期</th>
							<th>申请事由</th>
							<th>申请代理人编号</th>
							<th>审批人工号</th>
							<th>审批状态</th>
							<th>审核意见</th>
							<th>操作</th>
						</tr>
						
						<c:forEach items="${iAlist}" var="ia">	
							<tr>
								<td><input type="checkbox" name="id" value="" class="acb" /></td>
								<td>${ia.iaId}</td>
								<td>${ia.iaCustomerId}</td>
								<td>${ia.iaHouseId}</td>
								<td>${ia.iaName}</td>
								<td>${ia.iaDate}</td>
								<td>${ia.iaContent}</td>
								<td>${ia.iaEmpId}</td>
								<td>${ia.iaApproverId}</td>
								<td>${ia.iaStatus}</td>
								<c:choose>
								<c:when test="${ia.iaApprovalState == 0}">
								<td>未审批</td>
								</c:when>
								<c:when test="${ia.iaApprovalState == 1}">
								<td>审批通过</td>
								</c:when>
								<c:when test="${ia.iaApprovalState == 2}">
								<td>审批不通过</td>
								</c:when>
								</c:choose>
								<td>
									<c:choose>
									<c:when test="${ia.iaApprovalState == 0}">
									<a href="insapp/toUpdate.action?iaId=${ia.iaId}&&userid=${userinfoLogin.userid}" class="edit">审批</a>
									</c:when>
									</c:choose>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">${totalCount}</span>
						条记录，当前第
						<span class="ui_txt_bold04">${pageNum}
						/
						${pageCount }</span>
						页
					</div>
					<div class="ui_frt">
						<!--    如果是第一页，则只显示下一页、尾页 -->
						
							<input type="button" value="首页" class="ui_input_btn01"  onclick="jumpNormalPage(1);"/>
							<input type="button" value="上一页" class="ui_input_btn01" onclick="jumpNormalPage(${pageNnum-1});"/>
							<input type="button" value="下一页" class="ui_input_btn01" onclick="jumpNormalPage(${pageNum+1});" />
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
  </body>
</html>
