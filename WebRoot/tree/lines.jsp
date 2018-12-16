<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tree Lines - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/icon.css">
	<script type="text/javascript" src="<%=basePath %>/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="<%=basePath %>/js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>显示虚线</h2>
	<div style="margin:10px 0;"></div>
	<div class="easyui-panel" style="padding:5px">
		<ul class="easyui-tree" data-options="url:'tree_data1.json',method:'get',animate:true,lines:true"></ul>
	</div>
</body>
</html>