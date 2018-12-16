<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Formatting Tree Nodes - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/icon.css">
	<script type="text/javascript" src="<%=basePath %>/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="<%=basePath %>/js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>节点格式化</h2>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" style="padding:5px">
		<ul class="easyui-tree" data-options="
					url:'tree_data1.json',
					method:'get',
					animate:true,
					formatter:function(node){
						var s = node.text;
						if (node.children){
							s += '&nbsp;<span style=\'color:blue\'>(' + node.children.length + ')</span>';
						}
						return s;
					}
				">
		</ul>
	</div>
</body>
</html>