<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<body style="background-color: #F3F3F3">
    <form action="<%=path %>/j_spring_security_check" method="post">  
        USERNAME:<input type="text" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" /><br/>  
        PASSWORD:<input type="password" name="j_password" value="" /><br/>  
        <input type="checkbox" name="_spring_security_remember_me" />两周之内不必登陆<br/>  
        <input type="submit">        
    </form>
</body>
</html>