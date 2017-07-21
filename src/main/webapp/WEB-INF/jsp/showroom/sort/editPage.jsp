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
          <h2 class="sub-header">Section title</h2>
          
               <div class="col-md-10">
					  <div class="form-horizontal">
					  <div class="form-group">
					    <label class="col-sm-2 control-label">分类</label>
					    <input type="hidden" id="sortId">
					    <div id="fenlei" >
					    					    
					    </div>
					    <div  class="col-md-2" style="margin-left:-30px;margin-top:3px">
					    <div class="col-md-3">
					    <button class="btn-info" onclick="openChildren()">
					   			<span class="glyphicon glyphicon-plus"></span>
					    </button>
					    </div>
					   
					   
					     <div  class="col-md-3">
					    <button class="btn-danger" onclick="closeChildren()">
					   			<span class=" glyphicon glyphicon-minus"></span>
					    </button>
					    </div>
					    </div>
					  </div>
					  
					    <div class="form-group">
					    <label  class="col-sm-2 control-label">名称</label>
					    <div class="col-sm-2">
					      <input type="text" class="form-control" id="title" placeholder="名称">
					    </div>
					  </div>
					  
					 
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">是否显示在首页</label>
					     <div class="col-sm-3">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="showHome"  value="true" >是
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="showHome"  value="false">否
						  </label>
					    </div>
					  </div>
					 
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">状态</label>
					    <div class="col-sm-3">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="optionsRadiosinline"  value="true" >开启
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="optionsRadiosinline"  value="false">关闭
						  </label>
					    </div>
					  </div>
					  
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">备注</label>
					    <div class="col-sm-2">
					      <input type="text" class="form-control" id="remark"placeholder="备注">
					    </div>
					  </div>
					 
					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-5">
					      <button  class="btn btn-primary" onclick="submit()">提交</button>
					       <button  class="btn btn-default" onclick="goback()">返回</button>
					    </div>
					  </div>
					</div>
          </div>
 <script type="text/javascript">
    var submit=function(){
    	var flag=0;
 	   $(".form-horizontal").find("input[type=text]").each(function(){
 			 $(this).parent().find(".verify").remove("")
 			 if( $(this).val()=="")
 			 {	
 				 flag++;
 		      $(this).parent().append("<div class='verify' style='color:red;margin:-27px 0 0 50px '>不能为空</div>")
 		 }
 		 })
	   if(flag>0)
	   return; 	
      
       var parentId=$("#fenlei").children("div").last().children().val()
       if(parentId==null)
    	   parentId=0    	
    	var status=$("input[name='optionsRadiosinline']:checked").val()
    	var showHome=$("input[name='showHome']:checked").val()
      	var sortId=$("#sortId").val()
  // 	var code=$("#code").val();
    	var remark=$("#remark").val();
    	var attrFlag=$("input[name='attrFlag']:checked").val()
    	$.ajax({
    		   type: "post",
			   url: "<%=basePath%>/showroom/sort/editSort",
			   data: JSON.stringify({title:$("#title").val(),parentId:parentId,status:status,sortId:sortId,remark:remark,attrFlag:attrFlag,showHome:showHome}),
			   contentType: "application/json; charset=utf-8",
			   dataType:'json' ,
			   success: function(data){
        		 judge(data)
        		 goback()
      	  }    	
    	})
    	}
    var openChildren2=function(parentId,id){
    //	console.log(parentId,id)
    	//打开子分类
   //	var parentId=$("#fenlei").children("div").last().children().val()
		$.ajax({
			 type: "post",
			   url: "<%=basePath%>/showroom/sort/findByParentId",
			   data: {parentId:parentId},
			   dataType:'json',
			   async: false,
			   success: function(data){  
			  	   //拼接html
    	   	   if(data.length!=0)    	   	  
    	   	   {
    	   		
    	   		   joint2(data,id)    	   	   
    	   	   }
    	   	   else
    	   		   alert("当前分类无项目")
    	  }  
		})  	
   	
    }
  var joint2=function(data,id){
	  var str=""
	  str+="<div class='col-sm-2'>"
	  str+="<select class='form-control'>"
	  for(var i=0;i<data.length;i++)
		  {
  	  str+= "<option value="+data[i].sortId+"  code="+data[i].code+">"+data[i].title+"</option>"
		}
	  
		  str+="</select>"
			  str+="</div>" 
	  $("#fenlei").append(str)
	  $("#fenlei").find("option[value="+id+"]").attr("selected",true)   
  }  	
var closeChildren=function(){
	if($("#fenlei").children().size()>=1)
	$("#fenlei").children().last().remove();
	$("#fenlei").children().last().children().removeAttr("disabled")
}
var judge=function(data){
 if(data==1)
	 alert("操作成功")
	 else
		 alert("操作失败")
	
}
var openChildren=function(){
	
	//打开子分类
	var parentId=$("#fenlei").children("div").last().children().val()
	    	var code=$("#fenlei").children("div").last().children().find('option:selected').attr("code")
       if(code!=null&&code.length>2)
    	   {
    	   alert("属性不能再分类")
    	   return;    	   
    	   }
		if(parentId==null)
		parentId=-1
		$.ajax({
		 type: "post",
		   url: "<%=basePath%>/showroom/sort/findByParentId",
		   data: {parentId:parentId},
		   dataType:'json',
		   success: function(data){    	 
	   	   //拼接html
	   	   if(data.length!=0)   	   
	   		   {
	   		   $("#fenlei").children().last().children().attr("disabled","disabled")
	   		   joint(data)	   		   
	   		   }
	   	   else
	   		   alert("当前分类无项目")
	  }  
	})  	
	
}
var joint=function(data){
  var str=""
  str+="<div class='col-sm-2'>"
  str+="<select class='form-control'>"
  for(var i=0;i<data.length;i++)
	  {
	  str+= "<option value="+data[i].sortId+" code="+data[i].code+">"+data[i].title+"</option>"
		 }
  
	  str+="</select>"
		  str+="</div>" 
  $("#fenlei").append(str)
}    
var goback=function(){	
	var url="<%=basePath%>/showroom/sort/index?curr="+curr	
	window.location.href=url
}
    </script>
<script type="text/javascript">
    //页面加载时运行
  	  var curr='${curr}'
  	  var id='${id}'
      $(function(){     	
    //	openChildren2(0);	
		//获取父分类数组
		$.ajax({
		   type: "post",
		   url: "<%=basePath%>/showroom/sort/getParents",
		   data: {id:id},
		 //  dataType:'json',
		   success: function(data){ 
			   strs=data.split(","); 
			 //  console.log(strs)
			   for(var i=strs.length-2;i>0;i--)
				   {
				   if(strs[i]!="")
				   openChildren2(strs[i],strs[i-1]);					   
				   }
			   $("#fenlei").children().children().attr("disabled","disabled")
   	   	 	   $("#fenlei").children().last().children().attr("disabled",false)
   	  }  
		})  
//获取此分类信息
		$.ajax({
			 type: "post",
			   url: "<%=basePath%>/showroom/sort/getById",
			   data: {id:id},
			   dataType:'json',
			   success: function(data){  
			  // console.log(data)
			$("#sortId").val(data.sortId)
			  	 $("#title").val(data.title)   	 
			  	$("#code").val(data.code)
			  	$("#remark").val(data.remark)  
			  	if(data.status==true)			  		
			  		$("input[name=optionsRadiosinline]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=optionsRadiosinline]:eq(1)").attr("checked",true);
				if(data.showHome==true)	
					{
			  		$("input[name=showHome]:eq(0)").attr("checked",true);	}
			  		else
			  		$("input[name=showHome]:eq(1)").attr("checked",true);	
   	  }  
		})  
	
		
		//失焦验证
	 $("input[type=text]").blur(function() {
		 $(this).parent().find(".verify").remove("")
		 if( $(this).val()=="")
		 $(this).parent().append("<div class='verify' style='color:red;margin:-27px 0 0 50px '>不能为空</div>")
		 
	 })
		
		
    })    
 
    

    </script>
    </body>
    
    </html>