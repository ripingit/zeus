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

          <div class="row placeholders" style="display:none">
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
          </div>

          <h2 class="sub-header">Section title</h2>
          
               <div class="col-md-10">
					  <div class="form-horizontal">
					  <div class="form-group">
					    <label class="col-sm-2 control-label">分类</label>
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
					    <label  class="col-sm-2 control-label">是否为属性</label>
					     <div class="col-sm-3">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="attrFlag"  value="true" >是
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="attrFlag"  value="false">否
						  </label>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">是否在导航菜单显示</label>
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
					      <input type="text" class="form-control"  id="remark" placeholder="备注">
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
    	//先验证
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
    		parentId=-1
    	var status=$("input[name='optionsRadiosinline']:checked").val()
    	var attrFlag=$("input[name='attrFlag']:checked").val()
    	var showHome=$("input[name='showHome']:checked").val()
    	var remark=$("#remark").val();
    	var pcode=""
    	//如果是属性则记录所有编码
    	if(attrFlag=="true")
    		{
    		var code=$("#fenlei").children("div").children().last().find('option:selected').attr("code")
    		if(code.length>2)
    		pcode=code
    		else
    			{
    			  var codeList=""
    			    	$("#fenlei").children("div").children().find('option:selected').each(function(){
    			    		codeList+=$(this).attr("code")      		
    			    	})
    			pcode=codeList
    			}
    		}    	
    	else{
    		pcode=""    		
    	}
    	      $.ajax({
    		   type: "post",
			   url: "<%=basePath%>/showroom/sort/addSort",
			   data: JSON.stringify({title:$("#title").val(),parentId:parentId,status:status,attrFlag:attrFlag,remark:remark,code:pcode,showHome:showHome}),
			   contentType: "application/json; charset=utf-8",
			   dataType:'json' ,
			   success: function(data){
        	   judge(data)
        	   //页面重新加载
        	goback()
      	  }    	
    	})
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
var closeChildren=function(){
	if($("#fenlei").children().size()>=1)
	 $("#fenlei").children().last().remove();
	 $("#fenlei").children().last().children().removeAttr("disabled")
}
var judge=function(data){
 if(data==1)
	 alert("添加成功")
	 else
		 alert("添加失败")
	
}
var goback=function(){
	window.location.href="<%=basePath%>/showroom/sort/index"	
}
    </script>
    <script type="text/javascript">
    //页面加载时运行
    $(function(){
    	$.ajax({
		   type: "post",
		   url: "<%=basePath%>/showroom/sort/findByParentId",
		   data: {parentId:-1},
		   dataType:'json',
		   success: function(data){   	  		   	  
   	   	   joint(data)   
   	   	 //  $("#fenlei").children().children().attr("disabled","disabled")
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