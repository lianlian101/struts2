<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
        function ol(){
        	$.ajax({
                url: "<%=path%>/ajax/getUserForJson",
                data: {},
                type: "post",
                dataType : 'json',  
                success: function (data) {
                    console.log(data);
                },
                error : function(xhr) {
                    console.log(xhr);
                }
            })
        }
        
        function olJson(){
            $.ajax({
                url: "<%=path%>/ajax/postJson",
                data: JSON.stringify({"id": 1, "username": "lisi"}),
                type: "post",
                dataType : 'json',
                contentType: 'application/json',
                success: function (data) {
                    console.log(data);
                },
                error : function(xhr) {
                    console.log(xhr);
                }
            })
        }
</script>
</head>
<body>
    <button type="button" onclick="ol()">获取json数据</button>
    
    <button type="button" onclick="olJson()">post json</button>        
</body>
</html>