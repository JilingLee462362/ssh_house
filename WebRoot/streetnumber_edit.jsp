<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<base href="<%=basePath%>">
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
	
	function myupdate() {
            $.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "JSON",//预期服务器返回的数据类型
                url: "streetnumber/update.action" ,//url
                data: $('#submitForm').serialize(),         
                async: false,
                success: function () {
                	alert("更新成功");
                },
                error: function() {
                    alert("异常！");
                }
            });
        }
        
        function mysave() {
            $.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "JSON",//预期服务器返回的数据类型
                url: "streetnumber/save.action" ,//url
                data: $('#submitForm').serialize(),
                async: false,
                success: function () {
                	alert("更新成功");
                },
                error: function() {
                    alert("异常！");
                }
            });
        }
        
        function mysave() {
            $.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "JSON",//预期服务器返回的数据类型
                url: "streetnumber/save.action" ,//url
                data: $('#submitForm').serialize(),
                async: false,
                success: function () {
                	alert("创建成功");
                },
                error:function() {
                    //alert("异常！");
	}               
            });
        }

</script>
</head>
<body>
<form id="submitForm" name="submitForm" action="" method="post">
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
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">小区</td>
					<td class="ui_text_lt">
					 
						<select name="xiaoqu.id" id="fyXq" class="ui_select01">
                            <option value="">--请选择--</option>
                            <c:forEach items="${XiaoquList}" var="x">
                            	<c:choose>
                            		<c:when test="${x.id eq StreetnumberOne[0].xiaoqu.id}">
                            			<option value="${x.id}" selected="selected">${StreetnumberOne[0].xiaoqu.name}</option>
                            		</c:when>
                            		<c:otherwise>
                            			<option value="${x.id}">${x.name}</option>
                            		</c:otherwise>
                            	</c:choose>
                            </c:forEach>  
                        </select>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt">街道名</td>
					<td class="ui_text_lt">
						<input type="text" size="300px" id="fyCh" name="name" value="${StreetnumberOne[0].name}"  class="ui_input_txt01"/>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						<input type="hidden" name="id" value="${StreetnumberOne[0].id}"/>
						<c:choose>
                            <c:when test="${not empty StreetnumberOne[0].id }">
                            	&nbsp;<input id="submitbutton" type="button" onclick="myupdate()" value="提交" class="ui_input_btn01"/>
                            </c:when>
                            <c:otherwise>
                            	&nbsp;<input id="submitbutton" type="button" onclick="mysave()" value="提交" class="ui_input_btn01"/>
                            </c:otherwise>
                        </c:choose>
						
						&nbsp;<input id="cancelbutton" type="button" onclick="myclose()" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>

</body>
</html>