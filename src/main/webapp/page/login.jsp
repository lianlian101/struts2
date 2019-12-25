<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>登录界面</h1>
    <form action="<%=path%>/user/login_go" method="post">
        name:<input type="text" name="username" value="张三"/>
        password<input type="password" name="password" value="123"/>
        <input type="submit" value="登录" />
    </form>
</body>
</html>