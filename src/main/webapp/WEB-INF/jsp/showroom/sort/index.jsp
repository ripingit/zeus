<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="<%=basePath%>/static/favicon.ico">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="<%=basePath%>/static/assets/css/dashboard.css" rel="stylesheet">
  
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Settings</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="#">Help</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="<%=basePath%>/showroom/sort/index">产品的分类管理 <span class="sr-only">(current)</span></a></li>
            <li><a href="#" onclick="loadProduct(this)">产品管理</a></li>
            <li><a href="#" >Analytics</a></li>
            <li><a href="#">Export</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="">Nav item</a></li>
            <li><a href="">Nav item again</a></li>
            <li><a href="">One more nav</a></li>
            <li><a href="">Another nav item</a></li>
            <li><a href="">More navigation</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="">Nav item again</a></li>
            <li><a href="">One more nav</a></li>
            <li><a href="<%=basePath%>">返回主页</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Dashboard</h1>
          <h2 class="sub-header">产品分类管理</h2>
		
          <div id="nav" class="" role="group" aria-label="...">
			  <button type="button" class="btn btn-info" v-on:click="addSort">
			  <div>{{curr}}</div>
			 <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 
			  新增</button>
			  <button type="button" class="btn btn-warning" onclick="editSort()">
			  <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
			   修改</button>
			  <button type="button" class="btn btn-danger" onclick="delSort()">
			  <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 
			  删除</button>
			</div>
			
          <div id="app" class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th><input type='checkbox' v-on:click="selectAll"  v-model="selectAllFlag"></input></th>
                  <th>No.</th>
                  <th>名称</th>
                  <th>所属父类</th>
                  <th>编码</th>
                  <th>备注</th>
                </tr>
              </thead>
              <tbody >
    			<tr  v-for="(item,index) in data.list">
	     		<td><input type='checkbox' name='sort' v-bind:value="item.sortId" v-model="item.checked" v-on:click="select"></input></td>
	    		<td>{{index+1}}</td>
	    		<td>{{item.title}}</td>
	    		<td>{{item.parentTitle}}</td>
	    		<td>{{item.code}}</td>
	    		<td>{{item.remark}}</td>
	    		</tr>	    		
                </tbody>
            </table>
          </div>
          
         <div class="col-md-offset-4" id="test">
			 <div class="page-header">分页</div>
                <div class="pager" id="pager">
                    <span class="form-inline">
                        <select class="form-control" v-model="pagesize" v-on:change="showPage(pageCurrent,$event,true)" number>
                            <option value="10">10</option>
                            <option value="20">20</option>
                            <option value="30">30</option>
                            <option value="40">40</option>
                        </select>
                    </span>
                    <template v-for="item in pageCount+1">
                        <span v-if="item==1" class="btn btn-default" v-on:click="showPage(1,$event)">
                            首页
                        </span>
                        <span v-if="item==1" class="btn btn-default" v-on:click="showPage(pageCurrent-1,$event)">
                            上一页
                        </span>
                        <span v-if="item==1" class="btn btn-default" v-on:click="showPage(item,$event)">
                            {{item}}
                        </span>
                        <span v-if="item==1&&item<showPagesStart-1" class="btn btn-default disabled">
                            ...
                        </span>
                        <span v-if="item>1&&item<=pageCount-1&&item>=showPagesStart&&item<=showPageEnd&&item<=pageCount" class="btn btn-default" v-on:click="showPage(item,$event)">
                            {{item}}
                        </span>
                        <span v-if="item==pageCount&&item>showPageEnd+1" class="btn btn-default disabled">
                            ...
                        </span>
                        <span v-if="item==pageCount" class="btn btn-default" v-on:click="showPage(item,$event)">
                            {{item}}
                        </span>
                        <span v-if="item==pageCount" class="btn btn-default" v-on:click="showPage(pageCurrent+1,$event)">
                            下一页
                        </span>
                        <span v-if="item==pageCount" class="btn btn-default" v-on:click="showPage(pageCount,$event)">
                            尾页
                        </span>
                    </template>
                    <span class="form-inline">
                        <input class="pageIndex form-control" style="width:60px;text-align:center" type="text" v-model="pageCurrent | onlyNumeric" v-on:keyup.enter="showPage(pageCurrent,$event,true)" />
                    </span>
                    <span>{{pageCurrent}}/{{pageCount}}</span>
                </div>             
         </div>         
        </div>
      </div>
    </div>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/vue/lib/vue.js"></script>
<script type="text/javascript" src="<%=basePath%>static/vue/lib/vue-resource.js"></script>
<script type="text/javascript" src="<%=basePath%>static/vue/lib/vue-router.js"></script>
    <script type="text/javascript">
  var delSort=function(){
	  var obj=""
		  $('input[name="sort"]:checked').each(function(){ 
			  obj+=$(this).val()+","
			}); 
	//	 console.log(obj)
		    if(obj=="")
			  {alert('请选择一条记录')
			  return;}
		 
	  if(confirm('你确定要删除吗？')==true)
			  {
		  $.ajax(
		  			{ 
		  			   type: "post",
		  			   url: "<%=basePath%>/showroom/sort/delSort",
		  			   data: {ids:obj},
					   dataType:'json' ,
		  			   success: function(data){
		          	   judge(data)
		          	   getCount()
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
  var editSort=function(){
	 var n= $("#app").find('input[name="sort"]:checked').size()
	 if(n!=1)
		 {alert("请选择一条数据")
		 return;}
	 else{
		var id=$("#app").find('input[name="sort"]:checked').val()
		var curr=$(".layui-laypage-curr").children("em").eq(1).text();
		var url="<%=basePath%>/showroom/sort/editPage?id="+id+"&curr="+curr
	$(".main").load(url )
	
	 }
	  }
  var loadProduct=function(ele){
	  $(ele).parent("li").parent().children("li").removeAttr("class")
	  $(ele).parent("li").attr("class","active")
	  $(".main").load("<%=basePath%>/showroom/product/index")	  
  }
</script>
<script type="text/javascript">
new Vue({
	el:"#app",
	data:{
	    data:[],
	    selectAllFlag:false,
	    selectNum:0	    
	},
	filters:{

	},
	mounted:function(){
	 this.cartView();
	},
	methods:{
	    cartView: function(){
	    	var _this=this
	        this.$http.get("<%=basePath%>/showroom/sort/getCount?start=1").then(function(response){
	    	_this.data=response.data
	      })
	    },
	    selectAll:function(){
	    	this.$nextTick(function(){
	    		this.data.list.forEach(function(item,index){
		    		   if(typeof item.checked=='undefined')
		    			this.$set(item,"checked",this.selectAllFlag)  
		    			else
		    			  item.checked=this.selectAllFlag
		    		})	  
	    	})
	    	/* var _this=this	   
	    		this.data.list.forEach(function(item,index){
	    		   if(typeof item.checked=='undefined')
	    			 _this.$set(item,"checked",_this.selectAllFlag)  
	    			else
	    			  item.checked=_this.selectAllFlag
	    		})	    	 */
	    },	
	    select:function(){
	    	this.selectNum=0
	    	var _this=this	
	    	this.data.list.forEach(function(item,index){
	    		if(item.checked!='undefined'&&item.checked==true)
	    			_this.selectNum++;
	    	})
	    	if(this.selectNum==this.data.list.length)
	    		this.selectAllFlag=true
	    		else
	    			this.selectAllFlag=false    	
	    }
	}
	})
	
new Vue({
	el:"#nav",
	data:{
	   curr:1
	},
	methods:{
		 addSort:function(){		    	
		    	this.curr++
		    }
	}
})
</script>
</body>
</html>

