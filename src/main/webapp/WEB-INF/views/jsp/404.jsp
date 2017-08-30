<%--
  Created by IntelliJ IDEA.
  User: fadlymunandar
  Date: 8/30/17
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Page not found</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/style404.css"/>
    <link href='http://fonts.googleapis.com/css?family=Strait' rel='stylesheet' type='text/css'>
</head>
<body>
    <div class="wrap">
        <h1>Yearbook</h1>
        <div class="banner"><img src="<c:url value="/resources/assets/img/fuel-404-logo.png"/>" alt="#" /></div>
        <div class="txt-center" style="margin-top: 50px">
            <p><a href="<c:url value="/"/>">Back to home</a></p>
        </div>
    </div>
</body>
</html>
