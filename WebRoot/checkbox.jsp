<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Basic DataGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/themes/icon.css">
	<style type="text/css">
		
	</style>
	
</head>
<body>
	<h2>在DataGrid上的复选框 </h2>
	
	<div style="margin:20px 0;"></div>
	
	<table id="dg" class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
			data-options="singleSelect:false,collapsible:true,url:'BasicAction',method:'get'">
		
	</table>

</body>
</html>
<script type="text/javascript" src="<%=basePath %>js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.easyui.min.js"></script>
<script type="text/javascript">
		
		$('#dg').datagrid({
		    columns:[[
		        {field:'ck',checkbox:true},
		        {field:'itemid',title:'Item ID',width:80},
		        {field:'productid',title:'Product ID',width:80},
		        {field:'listprice',title:'List Price',width:80,align:'right'},
		        {field:'unitcost',title:'Unit Cost',width:80,align:'right'},
		        {field:'attr1',title:'Attribute',width:100},
		        {field:'status',title:'Status',width:60}
		    ]],
		    pagination:true,
		    pageList:[10,20,30]
		});
		
</script>
