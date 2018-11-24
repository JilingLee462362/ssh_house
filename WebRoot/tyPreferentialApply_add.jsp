<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <form id="submitForm" name="submitForm" action="tyPreferentialApply/saveApply.action" method="post">
	<div id="container">
		<div id="nav_links">
			当前位置：签约入住&nbsp;>&nbsp;<span style="color: #1A5CC6;">优惠申请表</span>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt">客户编号 : </td>
					<td class="ui_text_lt">
						<input type="text" name="paCustomerId" class="ui_select01" value="1001">
					</td>
					
				</tr>
				<tr>
					<td class="ui_text_rt">雇员编号 : </td>
					<td class="ui_text_lt">
						<input type="text" name="paEmployeeid" class="ui_select01" value="1002">
					</td>
					
				</tr>
				<tr>
					<td class="ui_text_rt" width="80">申请书名称 : </td>
					<td class="ui_text_lt">
						
						<input type="text" name="paName" class="ui_select01" value="申请书名称">
					</td>
				</tr>				
				<tr>
					<td class="ui_text_rt">房屋编号: </td>
					<td class="ui_text_lt">
						<select name="paHouseid" >
						<c:forEach items="${hList}" var="h">
							<option  value="${h.id}">${h.id}-----${h.title}</option>							
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">原价 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="paBeforePrice"  value="5" style="width: 20px" />万元/m^2
					</td>
				</tr><tr>
					<td class="ui_text_rt">现在优惠点数 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="paNow"  value="3" style="width: 20px"   />%
					</td>
				</tr><tr>
					<td class="ui_text_rt">申请优惠点数 : </td>
					<td class="ui_text_lt">
						<input type="text" id="fyFh" name="paApply"   value="5" style="width: 20px"  />%
					</td>
				</tr><tr>
					<td class="ui_text_rt">优惠后的价格: </td>
					<td class="ui_text_lt">
					<input type="text" id="fyFh" name="paAfterPrice"  value="5" style="width: 20px" />万元/m^2
				</tr><tr>
					<td class="ui_text_rt">申请日期 : </td>
					<td class="ui_text_lt">
					<input class="Wdate" type="text" name="paDate" value="申请日期"  onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})"> 
					
						<%-- <input type="text" id="fyFh" name="Date"  value="${tyReportForms2.rfEnd}" class="ui_select01"  onkeyup="checkFyFh();"/> --%>
					</td>
				</tr><tr>
					<td class="ui_text_rt">状态:  </td>
					<td class="ui_text_lt">
					<input type="radio" id="fyFh"  name="paStatus"  value="审批" />审批
					<input type="radio" id="fyFh" name="paStatus"   value="待审批" />待审批
					<input type="radio" id="fyFh" name="paStatus"   value="审批通过"  />审批通过
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">申请事由: </td>
					<td class="ui_text_lt">
					<textarea name="paContent"  rows="10" cols="25" >申请事由</textarea>
				</tr>
				<tr>
					<td class="ui_text_rt">审核意见: </td>
					<td class="ui_text_lt">
					<input type="radio" id="fyFh" name="paOpinion"  value="同意" />同意
					<input type="radio" id="fyFh" name="paOpinion"  value="不同意" />不同意
				 </td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
					
						&nbsp;<input id="submitbutton" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<a href="tyPreferentialApply/find.action">
							<input type="button" value="取消" class="ui_input_btn01" onclick="window.location.href('tyPreferentialApply/find.action')">
						</a>
						
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>
  </body>
</html>
