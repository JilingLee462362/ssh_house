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
<form id="submitForm" name="submitForm" action="insapp/save.action" method="post">
	<input type="hidden" name="fyID" value="14458625716623" id="fyID"/>
	<div id="container">
		<div id="nav_links">
			当前位置：基础数据&nbsp;>&nbsp;<span style="color: #1A5CC6;">申请提交</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0" style="border-collapse:separate; border-spacing:0px 10px;">
				<tr>
					<td class="ui_text_rt">客户编号:</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="iaCustomerId" class="ui_input_txt02" value="10000"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">合同名称:</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="iaName" class="ui_input_txt02" value="10000"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">付款日期:</td>
					<td class="ui_text_lt">
						<!-- <input type="text" id="fyZldz" name="pubdate" value="2018-07-06" class="ui_input_txt02"/> -->
						<input class="Wdate" type="text" name="iaDate" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd'})">
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">申请事由:</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="iaContent" class="ui_input_txt02" value="10000"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">房屋编号:</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="iaHouseId" class="ui_input_txt02" value="56"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">代理人工号:</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="iaEmpId" class="ui_input_txt02" value="1004"/>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input id="submitbutton"  onclick="save()" type="submit" value="提交" class="ui_input_btn01"/>
						
						&nbsp;<input id="cancelbutton" type="button" onclick="myclose()" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
  </body>
</html>
