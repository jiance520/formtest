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
	<h2>得到DataGrid选择行</h2>
	
	<div style="margin:20px 0;"></div>
	
	<table id="dg" class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
			data-options="singleSelect:true,collapsible:true,url:'BasicAction',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">Item ID</th>
				<th data-options="field:'productid',width:100">Product</th>
				<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
				<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
				<th data-options="field:'attr1',width:250">Attribute</th>
				<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
		</thead>
	</table>
    <p>
      <a href="javascript:void(0)" class='all'>all</a>
    </p>
</body>
</html>
<script type="text/javascript" src="<%=basePath %>js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.easyui.min.js"></script>
<script type="text/javascript">
		
		$('#dg').datagrid({
		    onSelect:function(index,row){
		       alert(index);
		       alert(row.itemid);
		       alert(row.listprice);
		    }
		});
		
		$(function(){
		
		    $('.all').click(function(){
		           //alert(0); 
		           var ids = [];
					var rows = $('#dg').datagrid('getSelections');
					for(var i=0; i<rows.length; i++){
					    ids.push(rows[i].itemid);
					}
					alert(ids.join('\n'));
		    });
		})
		
</script>
