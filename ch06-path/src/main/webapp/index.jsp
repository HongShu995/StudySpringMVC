<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>>" />
</head>
<body>
    <p>访问地址前不加“/”</p>
    <p>正常访问</p>
    <p><a href="user/some.do">发起some.do的get请求</a> </p>
    <br/>
    <p>访问地址前加“/”</p>
    <p>404</p>
    <p><a href="/user/some.do">发起some.do的get请求</a> </p>
    <br/>
    <p>访问地址前加“/”和pageContext.request.contextPath</p>
    <p>正常访问</p>
    <p><a href="${pageContext.request.contextPath}/user/some.do">发起some.do的get请求</a> </p>
    <br/>

</body>
</html>
