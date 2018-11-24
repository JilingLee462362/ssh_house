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
<script language="javascript" type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
 	$(document).ready(function() {
		/*
		 * 提交
		 */
/* 		$("#submitbutton").click(function() {
			if(validateForm()){
				checkFyFhSubmit();
			}
		}); */
		
		/*
		 * 取消
		 */
		$("#cancelbutton").click(function() {
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		});
		
		var result = 'null';
		if(result =='success'){
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		}
	});
	
	/** 检测房源房号是否存在  **/
	function checkFyFh(){
		// 分别获取小区编号、栋号、层号、房号
		var fyID = $('#fyID').val();
		var fyXqCode = $("#fyXq").val();
		var fyDh = $("#fyDh").val();
		var fyCh = $("#fyCh").val();	
		var fyFh = $("#fyFh").val();
		if(fyXqCode!="" && fyDh!="" && fyCh!="" && fyFh!=""){
			// 给房屋坐落地址赋值
			$("#fyZldz").val($('#fyDh option:selected').text() + fyCh + "-" + fyFh);
			// 异步判断该房室是否存在，如果已存在，给用户已提示哦
			$.ajax({
				type:"POST",
				url:"checkFyFhIsExists.action",
				data:{"fangyuanEntity.fyID":fyID,"fangyuanEntity.fyXqCode":fyXqCode, "fangyuanEntity.fyDhCode":fyDh, "fangyuanEntity.fyCh":fyCh, "fangyuanEntity.fyFh":fyFh},
				dataType : "text",
				success:function(data){
// 					alert(data);
					// 如果返回数据不为空，更改“房源信息”
					if(data=="1"){
						 art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'该房室在系统中已经存在哦，\n请维护其他房室数据', ok:true,});
						 $("#fyFh").css("background", "#EEE");
						 $("#fyFh").focus();
						 return false;
					}
				}
			});
		}
	}
	
	/** 检测房源房号是否存在并提交form  **/
	function checkFyFhSubmit(){
		// 分别获取小区编号、栋号、层号、房号
		var fyID = $('#fyID').val();
		var fyXqCode = $("#fyXq").val();
		var fyDh = $("#fyDh").val();
		var fyCh = $("#fyCh").val();	
		var fyFh = $("#fyFh").val();
		if(fyXqCode!="" && fyDh!="" && fyCh!="" && fyFh!=""){
			// 给房屋坐落地址赋值
			$("#fyZldz").val($('#fyDh option:selected').text()  + fyCh + "-" + fyFh);
			// 异步判断该房室是否存在，如果已存在，给用户已提示哦
			$.ajax({
				type:"POST",
				url:"checkFyFhIsExists.action",
				data:{"fangyuanEntity.fyID":fyID,"fangyuanEntity.fyXqCode":fyXqCode, "fangyuanEntity.fyDhCode":fyDh, "fangyuanEntity.fyCh":fyCh, "fangyuanEntity.fyFh":fyFh},
				dataType : "text",
				success:function(data){
// 					alert(data);
					// 如果返回数据不为空，更改“房源信息”
					if(data=="1"){
						 art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'该房室在系统中已经存在哦，\n请维护其他房室数据', ok:true,});
						 $("#fyFh").css("background", "#EEE");
						 $("#fyFh").focus();
						 return false;
					}else{
						$("#submitForm").attr("action", "/xngzf/archives/saveOrUpdateFangyuan.action").submit();
					}
				}
			});
		}
		return true;
	}
	
	/** 表单验证  **/
	function validateForm(){
		if($("#fyXqName").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源小区', ok:true,});
			return false;
		}
		if($("#fyDh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源栋号', ok:true,});
			return false;
		}
		if($("#fyCh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源层号', ok:true,});
			return false;
		}
		if($("#fyFh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源房号', ok:true,});
			return false;
		}
		if($("#fyZongMj").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源面积', ok:true,});
			return false;
		}
		if($("#fyJizuMj").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写计租面积', ok:true,});
			return false;
		}
		if($("#fyZldz").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源座落地址', ok:true,});
			return false;
		}
		return true;
	}
</script> 
</head>
<body>
<form id="submitForm" name="submitForm" action="house/doSaveHouse.action" method="post">
	<input type="hidden" name="fyID" value="14458625716623" id="fyID"/>
	<div id="container">
		<div id="nav_links">
			当前位置：基础数据&nbsp;>&nbsp;<span style="color: #1A5CC6;">房源编辑</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0" style="border-collapse:separate; border-spacing:0px 10px;">>
				<tr>
					<td class="ui_text_rt">户型</td>
					<td class="ui_text_lt">
						<select name="type.id" id="submitForm_fangyuanEntity_fyHxCode" class="ui_select01">
                            <c:forEach items="${typeList}" var="tl">
                            <option value="${tl.id}">${tl.type}${tl.id}</option>
                            </c:forEach>
                        </select>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">标题</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="title" class="ui_input_txt02" value="好房子，大甩卖"/>
					</td>
				</tr>
			
				<tr>
					<td class="ui_text_rt">价格</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="price" value="6000" class="ui_input_txt02"/>元
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">更新日期</td>
					<td class="ui_text_lt">
						<!-- <input type="text" id="fyZldz" name="pubdate" value="2018-07-06" class="ui_input_txt02"/> -->
						<input class="Wdate" type="text" name="pubdate" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd'})">
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">面积</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="floorage" value="67" class="ui_input_txt02"/>㎡
					</td>
				</tr>
				
				
				<tr>
					<td class="ui_text_rt">contact</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="contact" value="清仓大甩卖" class="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt" width="80">街道111</td>
					<td class="ui_text_lt">
						<select name="streetnumber.id" id="fyXq" class="ui_select01">
							<c:forEach items="${streetList}" var="sl">
                            <option value="${sl.id}" selected="selected">${sl.name}${sl.id}</option>
                            </c:forEach>
                        </select>
					</td>
				</tr>
				
				
				<tr>
					<td class="ui_text_rt" >状态</td>
					<td class="ui_text_lt">
						<select name="flag" id="submitForm_fangyuanEntity_fyStatus" class="ui_select01">
                            <option>--请选择--</option>
                            <option value="在建">在建</option>
                            <option value="建成待租">建成待租</option>
                            <option value="已配租" selected="selected">已配租</option>
                            <option value="已租赁">已租赁</option>
                            <option value="腾退待租">腾退待租</option>
                            <option value="欠费">欠费</option>
                            <option value="其他">其他</option>
                        </select>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td class="ui_text_rt">房源描述</td>
					<td class="ui_text_lt">
						<input type="text" id="fyZldz" name="description" value="错过这次，再等十年" class="ui_input_txt02"/>
					</td>
				</tr>
				
				
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input id="submitbutton" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input id="cancelbutton" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
				
				
			</table>
		</div>
	</div>
</form>

</body>
  </body>
</html>
