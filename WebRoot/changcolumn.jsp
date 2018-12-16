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
	<h2>改变DataGrid列</h2>
	
	<div style="margin:20px 0;"></div>
	
	<table id="dg" class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
			data-options="singleSelect:false,collapsible:true,url:'BasicAction',method:'get'">
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
      <a href="javascript:void(0)" class='all'>改变DataGrid列</a>
    </p>
</body>
</html>
<script type="text/javascript" src="<%=basePath %>js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.easyui.min.js"></script>
<script type="text/javascript">
		
		$(function(){
			$('.all').click(function(){
				  $('#dg').datagrid({
				    title:'Change Columns',
				    iconCls:'icon-save',
				    columns:[[
				        {field:'itemid',title:'Item ID',width:80},
				        {field:'productid',title:'Product',width:80},
				        {field:'listprice',title:'List Price',width:80,align:'right',
				            formatter:function(val,rec){
				                if (val < 20){
				                    return '<span style="color:red;">('+val+'--'+rec.itemid+')</span>';
				                } else {
				                    return val;
				                }
				            }
				        },
				        {field:'attr1',title:'Attribute',width:200,formatter:function(val,rec){
				            if(val == 'ok'){
				               return '<span style="color:red">通过</span>';
				            }else{
				               return val;
				            }
				        }},
				        {field:'status',title:'Status',width:80}
				    ]]
				  });    
		    });
		})
		
</script>
