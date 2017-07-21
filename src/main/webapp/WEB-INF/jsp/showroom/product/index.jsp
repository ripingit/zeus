<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <body>
          <h1 class="page-header">Dashboard</h1>
          <h2 class="sub-header">产品管理</h2>          
          <div class="" role="group" aria-label="...">
			  <button type="button" class="btn btn-info" onclick="addPage()">
			 <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 
			  新增</button>
			  <button type="button" class="btn btn-warning" onclick="editPage()">
			  <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
			   修改</button>
			  <button type="button" class="btn btn-danger" onclick="del()">
			  <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 
			  删除</button>
			</div>
			
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th><input type='checkbox' id="check"></input></th>
                  <th>No.</th>
                  <th>名称</th>
                  <th>产品类型</th>
                  <th>型号</th>
                  <th>规格尺寸</th>
                  <th>单位</th>
                  <th>造价</th>
                  <th width="30%">属性</th>
                  <th>产地</th>
                  <th>供应商</th>
                  <th>库存</th>
                </tr>
              </thead>
              <tbody id="showarea">
              </tbody>
            </table>
          </div>
          
         <div class="col-md-offset-4">
		<div id="pagination"></div>              
         </div>
<script type="text/javascript">
    var joint=function(data){
    	var str=""
    	for(var i=0;i<data.length;i++)
    		{
      			str+="<tr>"
     			str+="<td><input type='checkbox' value="+data[i].productId+"></input></td>"
    			str+="<td>"+(i+1)+"</td>"
    			str+="<td>"+data[i].title+"</td>"
    			str+="<td value="+data[i].sortId+">"+data[i].parentTitle+"</td>"
    			str+="<td>"+data[i].type+"</td>"
    			str+="<td>"+data[i].size+"</td>"
    			str+= "<td>"+data[i].unit+"</td>"
    			str+= "<td>"+data[i].costPrice+"</td>"
    			str+= "<td>"+data[i].codes+"</td>"
    			str+= "<td>"+data[i].origin+"</td>"
    			str+= "<td>"+data[i].supplier+"</td>"
    			str+= "<td>"+data[i].stock+"</td>"
    			str+= "</tr>"    		
    		}
    	//console.log(str)
    	show(str)
    }
    var show=function(data){
    	$("#showarea").html(data)
    	 $("input[type='checkbox']").click(function(){		 
		 //检测size
		 var totalSize= $("input[type='checkbox']").size()-1
		 var checkSize=$("tbody").children("tr").children("td").children("input[type='checkbox']:checked").size()
		 if(totalSize==checkSize)
			 $("#check").prop("checked",true)
		if(totalSize>checkSize)
			$("#check").prop("checked",false)
	     
	 })
    }
    </script>
    <script type="text/javascript">

  var del=function(){
	  var obj=""
		  $('input[type="checkbox"]:checked').each(function(){
			  if($(this).val()!='on')
			  obj+=$(this).val()+","
			}); 
		// console.log(obj)
		    if(obj=="")
			  {alert('请选择一条记录')
			  return;}
		 
	  if(confirm('你确定要删除吗？')==true)
			  {
		  $.ajax(
		  			{ 
		  			   type: "post",
		  			   url: "<%=basePath%>/showroom/product/del",
		  			   data: {ids:obj},
					   dataType:'json' ,
		  			   success: function(data){
		          	   judge(data)
		          	   getPage(1)
		          	 	$("#check").removeAttr("checked")
		          	  }	 
		  
			  }
	 
	
  	);
	  
  }}
  var judge=function(data){
	  if(data>0)
	 	 alert("操作成功")
	 	 else
	 	alert("操作失败")
	 	
	 }
  //全选功能
  $("#check").click(function(){
	 if($(this).prop("checked"))
		 $('input[type="checkbox"]').prop("checked","true")
	else
		$('input[type="checkbox"]').removeAttr("checked")
  })
  var editPage=function(){
	 var n= $("#showarea").find('input[type="checkbox"]:checked').size()
	 if(n!=1)
		 {alert("请选择一条数据")
		 return;}
	 else{
		var id=$("#showarea").find('input[type="checkbox"]:checked').val()
		var sortId=$('input[type="checkbox"]:checked').parent("td").parent("tr").children("td").eq(3).attr("value")
		var curr=$(".layui-laypage-curr").children("em").eq(1).text();		
		if(curr=="")
			curr=1
		var url="<%=basePath%>/showroom/product/editPage?id="+id+"&sortId="+sortId+"&curr="+curr
	$(".main").load(url)
 }
	  }
   var addPage=function(){
	  $(".main").load("<%=basePath%>/showroom/product/addPage")	  
  }
   </script>
  <script type="text/javascript">
  var page=function(obj){
  	 layui.use(['laypage', 'layer'], function(){
	  var laypage = layui.laypage
	  ,layer = layui.layer;  
	  var nums = 10; //每页出现的数据量	
	  var data=obj.list
	  //翻页函数
	  var render = function(curr){
	    //此处写后台查询
	   var param= {start:curr}
	     $.ajax(
			{ 
			   type: "post",
			   url: "<%=basePath%>/showroom/product/getPage",
			   dataType:'json' ,
			   data: param,
	     	   success: function(obj){
	     		     joint(obj.list)			  
        	  }})		   
	  };	  
	  laypage({
		  	 cont: 'pagination'
		    ,pages: Math.ceil(obj.count/nums) //总页数
		    ,groups: 5 //连续显示分页数
		    ,curr:'${curr}'
		    ,jump: function(obj,first){
		      		render(obj.curr);
		     }
		  });	 
	  
	});
  }
  var getPage=function(start){
	  $.ajax(
			{ 
			   type: "post",
			   url: "<%=basePath%>/showroom/product/getPage",
			   dataType:'json' ,
			   data: {start:start},
			   success: function(data){				   
			//	  console.log(data) 
				    page(data)
        	  }})		  
  }

	</script>
	  <script type="text/javascript">
  //页面加载时即运行
 $(function(){
	getPage(1);	
    })
  </script>  
  </body>
</html>

