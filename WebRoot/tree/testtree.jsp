<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Basic Tree - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/themes/icon.css">
	<script type="text/javascript" src="<%=basePath %>/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="<%=basePath %>/js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>树测试</h2>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" style="padding:5px">
		<ul id="tt" class="easyui-tree" data-options="url:'<%=basePath %>TreeAction',method:'post',animate:true">
		</ul>
	</div>

</body>
</html>
<script type="text/javascript">

    $("#tt").tree({
        lines:true,
        checkbox:true
    });
</script>