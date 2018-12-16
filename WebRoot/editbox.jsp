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
	<h2>使DataGrid能编辑 </h2>
	
	<div style="margin:20px 0;"></div>
	
	<table id="dg" class="easyui-datagrid" title="Basic DataGrid" style="width:750px;height:250px"
			data-options="singleSelect:false,collapsible:true,url:'DataAction',method:'post'">
		
	</table>

</body>
</html>
<script type="text/javascript" src="<%=basePath %>js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.easyui.min.js"></script>
<script type="text/javascript">
       
		$('#dg').datagrid({
		    columns:[[
		        {field:'ck',checkbox:true},
		        {field:'itemid',title:'Item ID',width:60},
		        {field:'productid',title:'Product',width:100,editor:'text'},
		        {field:'listprice',title:'List Price',width:80,align:'right',editor:'numberbox'},
		        {field:'unitcost',title:'Unit Cost',width:80,align:'right',editor:'numberbox'},
		        {field:'attr1',title:'Attribute',width:150,editor:'text'},
		        {field:'status',title:'Status',width:50,align:'center',
		            editor:{
		                type:'checkbox',
		                options:{
		                    on: 'P',
		                    off: ''
		                }
		            }
		        },
		        {field:'language',title:'language',width:100,editor:{
		        	  type:'combobox',
		        	  options:{
		        		  url: 'combobox_data1.json',
						  method: 'get',
						  valueField: 'id',
						  textField: 'text',
						  onLoadSuccess: function (data) {
					            if (data == 0) {
					                $.messager.alert("系统提示", "数据库异常，请联系管理员！", "warning");
					            } else {
					                var data1 = $(this).combobox('getData');  //赋默认值
					                if (data1.length > 0) {
					                    $(this).combobox('select', data1[0].id);//默认选择第1个
					                    //$(this).combobox('setValue', data1[0]['id']);
		                                //$(this).combobox('setText', data1[0]['text']);
					                }
					            }
					      },
						  onSelect: function(data){    
						      alert(data.id);   
						  }
		        	  }
		        	}
		        },
		        {field:'action',title:'Action',width:70,align:'center',
		            formatter:function(value,row,index){ // value ：当前值，row:行对象，index:行下标
		                if (row.editing){ // row.editing 是否被编辑
		                    var s = '<a href="javascript:void(0)" onclick="saverow('+index+')">Save</a> ';
		                    var c = '<a href="javascript:void(0)" onclick="cancelrow('+index+')">Cancel</a>';
		                    return s+c;
		                } else {
		                    var e = '<a href="javascript:void(0)" onclick="editrow('+index+')">Edit</a> ';
		                    var d = '<a href="javascript:void(0)" onclick="deleterow('+index+')">Delete</a>';
		                    return e+d;
		                }
		            }
		        }
		    ]],
		    onBeforeEdit:function(index,row){
		        row.editing = true;
		        //重新刷新行
		        $('#dg').datagrid('refreshRow', index);
		    },
		    onAfterEdit:function(index,row){
		        row.editing = false;
		        //alert(row.productid);
		        //alert(row);
		        var jstr = JSON.stringify(row);//对象转 json string
		        alert(jstr);
		        var sobj = JSON.parse(jstr); //json string 转 对象 
		        //alert(sobj);
		        // 可以发 ajax
		        /*
		         $.post('UpdateAction',sobj,function(data){
		        	 if(data == 'true'){
		        	   $('#dg').datagrid('refreshRow', index);
		        	 }
		         });
		        */
		        //重新刷新行
		        $('#dg').datagrid('refreshRow', index);
		    },
		    onCancelEdit:function(index,row){
		        row.editing = false;
		        $('#dg').datagrid('refreshRow', index);
		    },
		    pagination:true,
		    pageSize:10,
		    pageList:[10,20,30]
		});
		
		function editrow(index){
		    // 开始编辑，发送命令
		    $('#dg').datagrid('beginEdit', index);
		}
		function deleterow(index){
		    $.messager.confirm('Confirm','Are you sure?',function(r){
		        if (r){
		           // 得到所有行
		           var rows = $('#dg').datagrid('getRows');
		           //alert(rows.length);
		           // 根据下标拿当前行的数据
		           //alert(rows[index].productid);
		           var productid = rows[index].productid ;
		           // 发送ajax
		           $.post('DelAction',{pid:productid},function(data){
		           
		                alert(data);
		               
		                // 删除1行，发命令 
		                $('#dg').datagrid('deleteRow', index);
		                $('#dg').datagrid('refreshRow', index);
		           });
		           
		        }
		    });
		}
		function saverow(index){
		   // 结束编辑 
		    $('#dg').datagrid('endEdit', index);
		}
		function cancelrow(index){
		    $('#dg').datagrid('cancelEdit', index);
		}
		
		$(function(){
	        var pager = $('#dg').datagrid().datagrid('getPager');	// get the pager of datagrid
	        pager.pagination({
	            displayMsg:'显示第 {from} 到 {to} 条记录，共 {total} 条记录'
	        });
	    })
</script>
