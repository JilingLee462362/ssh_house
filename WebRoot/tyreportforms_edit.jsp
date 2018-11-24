<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />



    

<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>

<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="scripts/jquery/jquery-1.4.4.min.js"></script>
<script src="scripts/My97DatePicker/WdatePicker.js" type="text/javascript" defer="defer"></script>
<script type="text/javascript" src="scripts/artDialog/artDialog.js?skin=default"></script>

  </head>
  
  <body>
  <form id="submitForm" name="submitForm" action="t/update.action" method="post">
	<div id="container">
		<div id="nav_links">
			当前位置：基础数据&nbsp;>&nbsp;<span style="color: #1A5CC6;">财务业绩编辑</span>
			<div id="page_close">
				<!-- <a href="javascript:parent.$.fancybox.close();">
					<img src="images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a> -->
				<input type="hidden" name="rfId" value="${tyReportForms2.rfId}">
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">报表名称 : </td>
					<td class="ui_text_lt">
						
						<input type="text" name="rfName" class="ui_select01" value="${tyReportForms2.rfName}">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">制作人工号 : </td>
					<td class="ui_text_lt">
						<select name="tyEmployee.employeeid">
							<option value="${tyReportForms2.tyEmployee.employeeid}"  selected="selected">${tyReportForms2.tyEmployee.employeeid}</option>
							
						</select>
					</td>
					
				</tr>
				<tr>
					<td class="ui_text_rt">表创建日期 : </td>
					<td class="ui_text_lt">
					<input class="Wdate" type="text" name="rfCreatdate" value="${tyReportForms2.rfCreatdate}" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})">
						<%-- <input type="text" id="fyCh" name="rfCreatdate" value="${tyReportForms2.rfCreatdate}" /> --%>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">实际成交数量 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="rfFact"  value="${tyReportForms2.rfFact}" class="ui_select01"  onkeyup="checkFyFh();"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">计划成交数量 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="rfPlan"  value="${tyReportForms2.rfPlan}" class="ui_select01"  onkeyup="checkFyFh();"/>
					</td>
				</tr><tr>
					<td class="ui_text_rt">成交总金额 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="rfCount"  value="${tyReportForms2.rfCount}" class="ui_select01"  onkeyup="checkFyFh();"/>
					</td>
				</tr><tr>
					<td class="ui_text_rt">成交平均价格 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="rfAverage"  value="${tyReportForms2.rfAverage}" class="ui_select01"  onkeyup="checkFyFh();"/>
					</td>
				</tr><tr>
					<td class="ui_text_rt">起始日期 : </td>
					<td class="ui_text_lt">
					<input class="Wdate" type="text" name="rfBegin" value="${tyReportForms2.rfBegin}" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})"> 
					
						<%-- <input type="text" id="fyFh" name="rfBegin"  value="${tyReportForms2.rfBegin}" class="ui_select01"  onkeyup="checkFyFh();"/> --%>
					</td>
				</tr><tr>
					<td class="ui_text_rt">截止日期 : </td>
					<td class="ui_text_lt">
					<input class="Wdate" type="text" name="rfEnd" value="${tyReportForms2.rfEnd}" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})"> 
					
						<%-- <input type="text" id="fyFh" name="rfEnd"  value="${tyReportForms2.rfEnd}" class="ui_select01"  onkeyup="checkFyFh();"/> --%>
					</td>
				</tr><tr>
					<td class="ui_text_rt">详细描述 : </td>
					<td class="ui_text_lt">
					<textarea name="rfDescription"  rows="10" cols="15" >${tyReportForms2.rfDescription}</textarea>
						<%-- <input type="text" id="fyFh" name="rfDescription"  value="${tyReportForms2.rfDescription}" class="ui_select01"  onkeyup="checkFyFh();"/>
				 --%>	</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
					
						&nbsp;<input id="submitbutton" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<a href="t/pageFind.action?pageNum=${pageNum}">
							<input type="button" value="取消" class="ui_input_btn01" onclick="window.location.href('t/pageFind?pageNum=${pageNum}')">
						</a>
						
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
  </body>
</html>
