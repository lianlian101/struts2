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
    <h1>欢迎</h1>
    <form action="<%=path %>/company/getCompany" method="post">
            公司ID：<input type="text" name="companyId" value="1">
            公司名称：<input type="text" name="companyName" value="测试公司">
       <input type="submit" value="提交">
    </form>
</body>
</html>