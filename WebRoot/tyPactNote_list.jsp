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
<script type="text/javascript" src="${pageContext.request.contextPath }scripts/jquery/jquery-1.7.1.js"></script>
<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript" src="scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="style/authority/jquery.fancybox-1.3.4.css" media="screen"></link>
<script type="text/javascript" src="scripts/artDialog/artDialog.js?skin=default"></script>
<title>信息管理系统</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery/jquery-1.4.4.min.js"></script>
<script type="text/javascript"src="/js/jquery-1.4.4.min.js"></script>
<SCRIPT language=javascript>
	function to_page(page) {
		if (page) {
			$("#page").val(page);
		}
		document.submitForm.submit();
	}
</SCRIPT>
<style>
	.alt td{ background:black !important;}
</style>
 <SCRIPT language=javascript>	
/* $(function() {
		
	<!--客户级别-->
		$.post("fingByhouse.action", {"" : ""},
			function(data) {
					
					$(data).each(function(i,n){
							$("#cust_level").append("<option value='"+n+"'>"+n+"</option>");
					});
					$("#cust_level option[value='${house.id}']").attr("selected","selected");
					
			},
		"json");
		});	 */
</SCRIPT>
  </head>
  
  <body>
    <form id="submitForm" name="submitForm" action="TyPactNote_findByPage.action" method="post">
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_top">搜索</div>
						<div id="box_center">
							合同签署客户编号
							<s:textfield name="pnCustomerId" cssClass="ui_input_txt02" />
							&nbsp;&nbsp;公司代表
							<s:textfield name="pnDeputy" cssClass="ui_input_txt02" />
						</div>
						<div id="box_bottom">
							<input type="button" value="查询" class="ui_input_btn01" onclick="to_page(<s:property value="currPage"/>)" /> 
							<a href="tyPactNote_add.jsp"><input type="button" value="新增" class="ui_input_btn01" id="addBtn" /> </a>
							<input type="button" value="删除" class="ui_input_btn01" onclick="batchDel();" /> 
							<input type="button" value="导入" class="ui_input_btn01" id="importBtn" />
							<input type="button" value="导出" class="ui_input_btn01" onclick="exportExcel();" />
						</div>
					</div>
				</div>
			</div>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th width="30"><input type="checkbox" id="all" onclick="" />
							</th>
							<th>记录表编号</th>
							<th>合同签署客户编号</th>
							<th>合同名称</th>
							<th>公司代表</th>
							<th> 签署日期</th>
							<th> 描述</th>
							<th>操作</th>
						</tr>
						
					
							<s:iterator value="list">
							<tr>
								<td><input type="checkbox" name="IDCheck" value="14458579642011" class="acb" /></td>
								<td>${pnId}</td>
								<td><s:property value="pnCustomerId"/></td>
								<td><s:property value="pnName"/></td>
								<td><s:property value="pnDeputy"/></td>
								<td><s:date name="pnDate" format="YYYY-MM-dd"/></td>
								<td><s:property value="pnDescription"/></td>
								<td>
									<a href="TyPactNote_findById.action?pnId=<s:property value='pnId'/>" class="edit">编辑</a> 
								<a href="TyPactNote_delete.action?pnId=<s:property value='pnId'/>">删除</a>
								</td>
							</tr>
							</s:iterator>			
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">${totalCount}</span>
						条记录，当前第
						<span class="ui_txt_bold04">${currPage}
						/
						${totalPage}</span>
						页
						&nbsp;&nbsp;
						每页显示 <select name="pageSize"
													onchange="to_page()">
													<option value="3"
														<s:if test="pageSize==3">selected="selected"</s:if>>3</option>
													<option value="6"
														<s:if test="pageSize==6">selected="selected"</s:if>>6</option>
													<option value="15"
														<s:if test="pageSize==15">selected="selected"</s:if>>15</option>
												</select> 条
						
					</div>
						<s:if test="currPage != 1">
							&nbsp;&nbsp;			[<a href="javascript:to_page(1)">首页</a>]
							&nbsp;&nbsp;[<a href="javascript:to_page(<s:property value="currPage-1"/>)">前一页</a>]
						</s:if>
						
						
						
						<s:if test="currPage != totalPage && totalPage != 0">
							&nbsp;&nbsp;[<a href="javascript:to_page(<s:property value="currPage+1"/>)">后一页</a>] 
							&nbsp;&nbsp;[<a href="javascript:to_page(<s:property value="totalPage"/>)">尾页</a>] 
						</s:if>
						
						&nbsp;&nbsp;到 <input type="text" size="3" id="page" name="currPage" />
						页 <input type="button" value="Go" onclick="to_page()" />
						
					</div>
				</div>
			</div>
		</div>
	</form>
  </body>
</html>
