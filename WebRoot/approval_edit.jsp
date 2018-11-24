<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <base href="<%=basePath%>">
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="scripts/jquery/jquery-1.4.4.min.js"></script>
<script src="scripts/My97DatePicker/WdatePicker.js" type="text/javascript" defer="defer"></script>
<script type="text/javascript" src="scripts/artDialog/artDialog.js?skin=default"></script>
<script type="text/javascript">

	function myclose(){
    	parent.$.fancybox.close();
	}


</script>
</head>
<body>
<form id="submitForm" name="submitForm" action="insapp/doUpdate.action" method="post">
	<input type="hidden" name="fyID" value="14458625716623" id="fyID"/>
	<div id="container">
		<div id="nav_links">
			当前位置：基础数据&nbsp;>&nbsp;<span style="color: #1A5CC6;">分期审核</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0" style="border-collapse:separate; border-spacing:0px 10px;">
				<c:forEach items="${instalmentApply}" var="i">
				<tr>
					<td class="ui_text_rt" width="80">申请编号:&emsp;</td>
					<input type="hidden" name="iaId" value="${i.iaId}" />
					<input type="hidden" name="userid" value="${userid}" />
					<td class="ui_text_lt">${i.iaId}</td>
				</tr>
				<tr>
					<td class="ui_text_rt">客户编号:&emsp;</td>
					<input type="hidden" name="iaCustomerId" value="${i.iaCustomerId}" />
					<td class="ui_text_lt">${i.iaCustomerId}</td>
				</tr>
				<tr>
					<td class="ui_text_rt">房屋编号:&emsp;</td>
					<input type="hidden" name="iaHouseId" value="${i.iaHouseId}" />
					<td class="ui_text_lt">${i.iaHouseId}</td>
				</tr>
				<tr>
					<td class="ui_text_rt">申请书名称:&emsp;</td>
					<input type="hidden" name="iaName" value="${i.iaName}" />
					<td class="ui_text_lt">${i.iaName}</td>
				</tr>
				<tr>
					<td class="ui_text_rt">付款日期:&emsp;</td>
					<input type="hidden" name="iaDate" value="${i.iaDate}" />
					<td class="ui_text_lt">${i.iaDate}</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">申请事由:&emsp;</td>
					<input type="hidden" name="iaContent" value="${i.iaContent}" />
					<td class="ui_text_lt">${i.iaContent}</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">代理人编号:&emsp;</td>
					<input type="hidden" name="iaEmpId" value="${i.iaEmpId}" />
					<td class="ui_text_lt">${i.iaEmpId}</td>
				</tr>
				<tr>
					<td class="ui_text_rt">审核意见:&emsp;</td>
					<td class="ui_text_lt">
						<select name="iaApprovalState" id="submitForm_fangyuanEntity_fyHxCode" class="ui_select01">
                            <option value="">--请选择--</option>
                            <option value="1">审核通过</option>
                            <option value="2">审核未通过</option>
                        </select>
					</td>
				</tr>
				</c:forEach>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input id="submitbutton"  type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input id="cancelbutton" type="button" onclick="myclose()" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
  </body>
</html>
