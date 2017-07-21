<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    First name: <input type="text" id="address.name" /><br/>
    First name: <input type="text" id="address.pid" /><br/>
    First name: <input type="text" name="map.relatives" /><br/>
    First name: <input type="text" name="map['ownerFamily'].age" /><br/>
  <button onclick="submit()">提交</button>
  <script type="text/javascript">
      function submit(){
            map.push("a",1);
          alert(map.get('a'))
          return;
          $.ajax({
              url:'${pageContext.request.contextPath}/measure/measureOrder',
              type:'post',
              data:{}
          })
      }
  </script>
  </body>
</html>
