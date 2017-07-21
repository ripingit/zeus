<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String basePath1="http://localhost:9991/";
%>
<!DOCTYPE html">
<html>
<body>
<div class="bg-success row"style="margin-left:-20px;margin-top:40px;height:290px">
</div>
<div class="bg-info row" style="margin-left:-20px;margin-top:20px;">

</div>
<div class="row">
<div class="form-horizontal col-md-6" style="margin-top:10px">
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">名称</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="title" placeholder="名称">
					        <input type="hidden" id="codes" >
					    </div>
					  </div>
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">型号</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="type" placeholder="型号">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">尺寸规格</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="size" placeholder="尺寸规格">
					    </div>
					  </div>
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">单位</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="unit" placeholder="单位">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">造价</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="cost" placeholder="造价">
					    </div>
					  </div>
		
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">产地</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="origin" placeholder="产地">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">供应商</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="supplier" placeholder="供应商">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">库存</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="stock" placeholder="库存">
					    </div>
					  </div>
					  
					  
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">备注</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control" id="remark" placeholder="备注">
					    </div>
					  </div>
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">支持核算</label>
					    <div class="col-sm-4">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="budgetFlag"  value="true" >开启
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="budgetFlag"  value="false">关闭
						  </label>
					    </div>
					  </div>	
					  
					  			  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">供货价</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control"  id="supplyPrice" placeholder="供货价">
					    </div>
					  </div>
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">供货方式</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control"  id="supplyWay" placeholder="供货方式">
					    </div>
					  </div>
					  
					    <div class="form-group">
					    <label  class="col-sm-2 control-label">预算</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control"  id="budget" placeholder="预算">
					    </div>
					  </div>
									  
									  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">支持一键生成</label>
					    <div class="col-sm-4">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="onekeyFlag"  value="true" >开启
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="onekeyFlag"  value="false">关闭
						  </label>
					    </div>
					  </div>	
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">支持平台销售</label>
					    <div class="col-sm-4">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="sellFlag"  value="true" >开启
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="sellFlag"  value="false">关闭
						  </label>
					    </div>
					  </div>	
					  
					 
					 
					 <div class="form-group">
					    <label  class="col-sm-2 control-label">是否为商城材</label>
					    <div class="col-sm-4">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="mallFlag"  value="true" >开启
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="mallFlag"  value="false">关闭
						  </label>
					    </div>
					  </div>	
					  
					  <div class="form-group">
					    <label  class="col-sm-2 control-label">是否显示在首页</label>
					    <div class="col-sm-4">
					       <label class="checkbox-inline" style="margin-left:-16px">
						    <input type="radio" name="showHome"  value="true" >开启
						  </label>
						  <label class="checkbox-inline">
						    <input type="radio" name="showHome"  value="false">关闭
						  </label>
					    </div>
					  </div>
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">商城价</label>
					    <div class="col-sm-4">
					      <input type="text" class="form-control"  id="sellPrice" placeholder="商城价">
					    </div>
					  </div>
					  
					   <div class="form-group">
					    <label  class="col-sm-2 control-label">城市</label>
					    <div class="col-sm-4">
					    	  <select class="form-control">
					    	  <option value="1" >北京</option>
					    	  <option value="2" >上海</option>
					    	  <option value="3" >广州</option>
					    	  <option value="4">深圳</option>					    	 
					    	  </select>
					    </div>
					  </div>
									  
										  
					</div>
					
					
		<div class="form-horizontal col-md-6" style="margin-top:10px">
							  
				<table style="width:100%;" border="0" > 
		
		 <tr>
					<th style="border:1px solid #e2e2e2">上传图片</th>					
					<td style="border:1px solid #e2e2e2;folat:left;">
					<img alt="暂无图片" id="preview_img0" name="preview_img" src="<%=basePath%>images/zanwu.png"/>
					<div name="errorid" id="errorid" style="width:100px;folat:left;">
						小于512k
					</div>					
					<input type="file" style="folat:left;" type="text" name="url0" id="url0" value="" />
					<input name="img" id="img0" type="text" value="">
					<input type="button" onclick=upload(this) class="btn btn-info" value="上传文件" style="width:100px;folat:left;"/>
					</td>
				</tr>
				
					 <tr>
					<th style="border:1px solid #e2e2e2">上传图片</th>					
					<td style="border:1px solid #e2e2e2;folat:left;">
					<img alt="暂无图片" id="preview_img1" name="preview_img" src="<%=basePath%>images/zanwu.png"/>
					<div name="errorid" id="errorid" style="width:100px;folat:left;">
						小于512k
					</div>					
					<input type="file" style="folat:left;" type="text" name="url1" id="url1" value="" />
					<input name="img" id="img1" type="text" value="">
					<input type="button" onclick=upload(this) class="btn btn-info" value="上传文件" style="width:100px;folat:left;"/>
					</td>
				</tr>
				
				 <tr>
					<th style="border:1px solid #e2e2e2">上传图片</th>					
					<td style="border:1px solid #e2e2e2;folat:left;">
					<img alt="暂无图片" id="preview_img2" name="preview_img" src="<%=basePath%>images/zanwu.png"/>
					<div name="errorid" id="errorid" style="width:100px;folat:left;">
						小于512k
					</div>					
					<input type="file" style="folat:left;" type="text" name="url2" id="url2" value="" />
					<input name="img" id="img2" type="text" value="">
					<input type="button" onclick=upload(this) class="btn btn-info" value="上传文件" style="width:100px;folat:left;"/>
					</td>
				</tr>
				
				 <tr>
					<th style="border:1px solid #e2e2e2">上传图片</th>					
					<td style="border:1px solid #e2e2e2;folat:left;">
					<img alt="暂无图片" id="preview_img3" name="preview_img" src="<%=basePath%>images/zanwu.png"/>
					<div name="errorid" id="errorid" style="width:100px;folat:left;">
						小于512k
					</div>					
					<input type="file" style="folat:left;" type="text" name="url3" id="url3" value="" />
					<input name="img" id="img3" type="text" value="">
					<input type="button" onclick=upload(this) class="btn btn-info" value="上传文件" style="width:100px;folat:left;"/>
					</td>
				</tr>
				
				 <tr>
					<th style="border:1px solid #e2e2e2">上传图片</th>					
					<td style="border:1px solid #e2e2e2;folat:left;">
					<img alt="暂无图片" id="preview_img4" name="preview_img" src="<%=basePath%>images/zanwu.png"/>
					<div name="errorid" id="errorid" style="width:100px;folat:left;">
						小于512k
					</div>					
					<input type="file" style="folat:left;" type="text" name="url4" id="url4" value="" />
					<input name="img" id="img4" type="text" value="">
					<input type="button" onclick=upload(this) class="btn btn-info" value="上传文件" style="width:100px;folat:left;"/>
					</td>
				</tr>
				
				 <tr>
					<th style="border:1px solid #e2e2e2">上传图片</th>					
					<td style="border:1px solid #e2e2e2;folat:left;">
					<img alt="暂无图片" id="preview_img5" name="preview_img" src="<%=basePath%>images/zanwu.png"/>
					<div name="errorid" id="errorid" style="width:100px;folat:left;">
						小于512k
					</div>					
					<input type="file" style="folat:left;" type="text" name="url5" id="url5" value="" />
					<input name="img" id="img5" type="text" value="">
					<input type="button" onclick=upload(this) class="btn btn-info" value="上传文件" style="width:100px;folat:left;"/>
					</td>
				</tr>	
			   
					   </table>
				
				
					   
					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-5">
					      <button  class="btn btn-primary" onclick="submit()">提交</button>
					       <button  class="btn btn-default" onclick="goback()">返回</button>
					    </div>
					  </div>
				
		</div>

</div>
<script type="text/javascript">
var upload=function(ele){
	url= $(ele).parent().children("input[type=file]").attr("id")
	$.ajaxFileUpload({  
	    type: "POST",  //提交方式   
	    url:'<%=basePath%>/showroom/product/upload',    
	    secureuri:false,    
	    fileElementId:url,  
	    dataType: 'text',  
	    success:function(data,status){	    	  
	    	var json1 = data.indexOf(">");
	    	var json2 = data.lastIndexOf("</pre>");	    	
	    	data = data.substring(json1+1,json2);
	          var msg = data.substring(2);
	        if(data.substring(0, 1) == "0"){         //0表示上传成功(后跟上传后的文件路径),1表示失败(后跟失败描述)
	            $(ele).parent().children("input[name=img]").val(msg)
	            $(ele).parent().children("div[name=errorid]").append("<font color=green>上传成功</font>");
	            $(ele).parent().children("img[name=preview_img]").attr('src','<%=basePath1%>'+msg);
	        }else{
	        	alert(msg);
	        	 $(ele).parent().children("div[name=errorid]").append("<font color=red>"+msg+"</font>");
	        }
	    },  
	    error : function(data, status, e) {    
	      alert("系统报错，稍后重试！");    
	    }  
		});    
}
</script>
<script type="text/javascript">
var openChildren=function(pid,ele){
	$(".bg-info").html("")
	$(ele).parent("li").parent("ul").children("li").removeClass("active")
	//把下一级子节点都清除
	$(ele).parent().parent().parent().nextAll().remove()
	//设置选中
	$(ele).parent().attr("class","active")
	$.ajax({
	   type: "post",
	   url: "<%=basePath%>/showroom/sort/findByParentId2",
	   data: {parentId:pid},
	   dataType:'json',
	   success: function(data){    	 
   	   //拼接html
   	   if(data.length!=0)  
   		   {   	
   		   if(data[0].key!=null)
   		     bread(data)
   		     else
   		      	 joint(data,pid)	  		    	
   		    	}	 	   		     		   
	  }  
	})  	
}
var bread=function(data){
// console.log(data)
	var str=""
	for(var i=0;i<data.length;i++)
		{
		str+="<ul class='nav nav-pills'><li><a>"
		str+=data[i].key+": </a></li>"		
		var data2=data[i].value
		for(var j=0;j<data2.length;j++)
			{
			str+="<li role='attr' code="+data2[j].code+" sortid="+data2[j].sortId+"><a href='javascript:void(0)'>"
			str+=data2[j].title		
			str+="</a></li>"
			}
	
		str+="</ul>"
		}
		$(".bg-info").append(str)	
		//点击效果
		$(".bg-info").children("ul").children("li[role='attr']").click(function(){
			$(this).parent().children("li").removeAttr("class")
			$(this).attr("class","active")
		})
		
}
var joint=function(data,pid){	
	  var str=""
	str+="<div class='dropdown open col-md-2'"
	if(pid==0)
		str+="style='margin-left:30px'"
		else
			str+="style='margin-left:20px'"	
	str+=">"	  
	str+="<ul class='dropdown-menu' aria-labelledby='dropdownMenu1' style='width:180px;height:250px;overflow-y:scroll;margin-top:20px'>"
		 for(var i=0;i<data.length;i++)
		{
 	  str+= "<li sortId="+data[i].sortId+"><a href='#' onclick=openChildren("+data[i].sortId+",this)>"+data[i].title+"</a></li>"
		}	
	str+="</ul></div>"
	$(".bg-success").append(str)	
}  	
var joint2=function(data,pid,id){	
	  var str=""
	str+="<div class='dropdown open col-md-2'"
	if(pid==0)
		str+="style='margin-left:30px'"
		else
			str+="style='margin-left:20px'"	
	str+=">"	  
	str+="<ul class='dropdown-menu' aria-labelledby='dropdownMenu1' style='width:180px;height:250px;overflow-y:scroll;margin-top:20px'>"
		 for(var i=0;i<data.length;i++)
		{
	  str+= "<li sortId="+data[i].sortId+"  code="+data[i].code+"><a href='#' onclick=openChildren("+data[i].sortId+",this)>"+data[i].title+"</a></li>"
		}	
	str+="</ul></div>"
	$(".bg-success").append(str)	
	$(".dropdown-menu").children("[sortId="+id+"]").attr("class","active")
} 
var submit=function(){
	var codes2=""
	 var sortId=$(".bg-success").children().last().children("ul").children("li[class='active']").attr("sortId")
	    $(".bg-info").children("ul").children("li[class='active']").each(function(){
	  var code= $(this).attr("code")
	   codes2+=code+","  
   })
	if(sortId==null)
	{		alert("请选择具体分类")
			return;
	}
	var param=
	{
			
	codes:codes2,
	productId:id,
	sortId:sortId,
	title:$("#title").val(),
	type:$("#type").val(),
	size:$("#size").val(),
	unit:$("#unit").val(),
	costPrice:$("#costPrice").val(),
	brand:$("#brand").val(),
	material:$("#material").val(),
	prop:$("#prop").val(),
	origin:$("#origin").val(),
	supplier:$("#supplier").val(),
	stock:$("#stock").val(),
	remark:$("#remark").val(),
	checkFlag:$("input[name='checkFlag']:checked").val(),
	supplyPrice:$("#supplyPrice").val(),
	supplyWay:$("#supplyWay").val(),
	budgetFlag:$("input[name='budgetFlag']:checked").val(),
	budget:$("#budget").val(),
	styleId:$("#style").val(),
	colorId:$("#color").val(),
	spaceId:$("#space").val(),
	onekeyFlag:$("input[name='onekeyFlag']:checked").val(),
	sellFlag:$("input[name='sellFlag']:checked").val(),
	sellPrice:$("#sellPrice").val(),
	mallFlag:$("input[name='mallFlag']:checked").val(),
	showHome:$("input[name='showHome']:checked").val(),
	city:$("#city").val(),
	pic0:$("#img0").val(),
	pic1:$("#img1").val(),
	pic2:$("#img2").val(),
	pic3:$("#img3").val(),
	pic4:$("#img4").val(),
	pic5:$("#img5").val(),
	}
	$.ajax({
		   type: "post",
		   url: "<%=basePath%>/showroom/product/editProduct",
		   data: JSON.stringify(param),
		   contentType: "application/json; charset=utf-8",
		   dataType:'json' ,
		   success: function(data){
    	   judge(data)
    	   //页面重新加载
    	goback()
  	  }    	
	})
	
}
var openChildren2=function(parentId,id){
    //	console.log(parentId,id)
    	//打开子分类
		$.ajax({
			 type: "post",
			   url: "<%=basePath%>/showroom/sort/findByParentId",
			   data: {parentId:parentId},
			   dataType:'json',
			   async: false,
			   success: function(data){  
			  	   //拼接html
    	   	   if(data.length!=0)    	   	  
    	   	   joint2(data,parentId,id)
    	   	   else
    	   		   alert("当前分类无项目")
    	  }  
		})  	
   	
    }
var goback=function(){
	var url="<%=basePath%>/showroom/product/index?curr="+curr	
	 $(".main").load(url)
}
</script>
<script type="text/javascript" src="<%=basePath%>js/ajaxfileupload.js" charset="utf-8"></script>
<script type="text/javascript">
var curr='${curr}'
var model=""
var pic=new Array(6)
$(function(){

	var sortId='${sortId}'
//	
	//获取父分类数组
	$.ajax({
	   type: "post",
	   url: "<%=basePath%>/showroom/product/getParents",
	   data: {sortId:sortId},
	 //  dataType:'json',
	   success: function(data){ 
		   strs=data.split(","); 
	//	  console.log(strs)
		   for(var i=strs.length-1;i>0;i--)
			   {
			   if(strs[i]!="")
			   openChildren2(strs[i],strs[i-1]);					   
			   } 	
	  }  
	})  	
})
//获取此分类信息
var id='${id}'
		$.ajax({	
			 type: "post",
			   url: "<%=basePath%>/showroom/product/getById",
			   data: {id:id},
			   dataType:'json',
			   success: function(data){  
	//	 console.log(data)
		   $("#codes").val(data.codes)
			$("#title").val(data.title)
		    $("#type").val(data.type)
			$("#size").val(data.size)
			$("#unit").val(data.unit)
			$("#costPrice").val(data.costPrice)
			$("#brand").val(data.brand)
			$("#material").val(data.material)
			$("#prop").val(data.prop)
			$("#origin").val(data.origin)
			$("#supplier").val(data.supplier)
			$("#stock").val(data.stock)
			$("#remark").val(data.remark)
			$("#supplyPrice").val(data.supplyPrice)
			$("#supplyWay").val(data.supplyWay)
			$("#budget").val(data.budget)
			$("#style").val(data.styleId)
			$("#color").val(data.colorId)
			$("#space").val(data.spaceId)
			$("#sellPrice").val(data.sellPrice)
			$("#city").val(data.city)
			  pic[0]=data.pic0
			  pic[1]=data.pic1
			  pic[2]=data.pic2
			  pic[3]=data.pic3
			  pic[4]=data.pic4
			  pic[5]=data.pic5
			  model=data.model	
			  	if(data.checkFlag=="true")			  		
			  		$("input[name=checkFlag]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=checkFlag]:eq(1)").attr("checked",true);	
	
				if(data.budgetFlag=="true")			  		
			  		$("input[name=budgetFlag]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=budgetFlag]:eq(1)").attr("checked",true);	
			   	 
			   
			   if(data.onekeyFlag=="true")			  		
			  		$("input[name=onekeyFlag]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=onekeyFlag]:eq(1)").attr("checked",true);	
			   
			   
			   if(data.sellFlag=="true")			  		
			  		$("input[name=sellFlag]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=sellFlag]:eq(1)").attr("checked",true);
			   
			   if(data.mallFlag=="true")			  		
			  		$("input[name=mallFlag]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=mallFlag]:eq(1)").attr("checked",true);
			   
			   if(data.showHome=="true")			  		
			  		$("input[name=showHome]:eq(0)").attr("checked",true);	
			  		else
			  		$("input[name=showHome]:eq(1)").attr("checked",true);
				  //载入图片
			$("#city").val()
$("#img0").val(data.pic0)
$("#img1").val(data.pic1)
$("#img2").val(data.pic2)
$("#img3").val(data.pic3)
$("#img4").val(data.pic4)
$("#img5").val(data.pic5)
				  
				  
if(data.pic0=="null") 
	$("#preview_img0").attr("src","<%=basePath1%>none.gif") 
else 
	$("#preview_img0").attr("src","<%=basePath1%>"+data.pic0);
if(data.pic1=="null") $("#preview_img1").attr("src","<%=basePath1%>none.gif") 
else $("#preview_img1").attr("src","<%=basePath1%>"+data.pic1);
if(data.pic2=="null")  
	$("#preview_img2").attr("src","<%=basePath1%>none.gif") 
	else $("#preview_img2").attr("src","<%=basePath1%>"+data.pic2)	;		    	
if(data.pic3=="null")  
	$("#preview_img3").attr("src","<%=basePath1%>none.gif") 
	else $("#preview_img3").attr("src","<%=basePath1%>"+data.pic3);
if(data.pic4=="null") 
	$("#preview_img4").attr("src","<%=basePath1%>none.gif") 
	else $("#preview_img4").attr("src","<%=basePath1%>"+data.pic4);
if(data.pic5=="null")  
	$("#preview_img5").attr("src","<%=basePath1%>none.gif") 
	else $("#preview_img5").attr("src","<%=basePath1%>"+data.pic5);
		//载入属性信息
 var pid=data.sortId;
		$.ajax({
	   type: "post",
	   url: "<%=basePath%>/showroom/sort/findByParentId2",
	   data: {parentId:pid},
	   dataType:'json',
	   success: function(data){    	 
   	   //拼接html
   	   		     bread(data)
   	   //属性信息显示
 	 var codes = $("#codes").val()
 	 code=codes.split(",")
   	   	$(".bg-info").children("ul").children("li[role='attr']").each(function(){
   		var a=$(this).attr("code")
            for(var i=0;i<code.length;i++)
            	{
            	if(a==code[i])
            		$(this).attr("class","active")
            	}
   	})
   	   
   	 }  
	})  	
} 
})  
</script>
</body>
</html>