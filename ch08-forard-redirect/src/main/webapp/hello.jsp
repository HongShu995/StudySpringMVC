<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>/WEB-INF/view/show.jsp</h3><br/>
    <h3>msg数据：${msg}</h3><br/>
    <h3>fun数据：${fun}</h3>
    <h3>name数据：${myname}</h3><br/>
    <h3>age数据：${myage}</h3>
    <h3>param.name数据：${param.myname}</h3><br/>
    <h3>param.age数据：${param.myage}</h3>
    <h3>取参数name数据：<%=request.getParameter("myname")%></h3>
    <h3>取参数age数据：<%=request.getParameter("myage")%></h3>
</body>
</html>
