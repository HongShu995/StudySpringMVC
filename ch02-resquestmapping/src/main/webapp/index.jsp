<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>第一个springmvc项目</p>
    <p><a href="user/some.do">发起some.do的get请求</a> </p>
    <br/>
    <form action="user/other.do" method="post">
        <input type="submit" value="post请求other.do">
    </form>
    <p><a href="user/other.do">发起other.do的请求</a> </p>

    <p><a href="user/first.do">发起first.do的请求</a> </p>
    <br/>
    <form action="user/first.do" method="post">
        <input type="submit" value="post请求first.do">
    </form>
</body>
</html>
