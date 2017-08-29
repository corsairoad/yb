<%--
  Created by IntelliJ IDEA.
  User: fadlymunandar
  Date: 8/28/17
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>

<%@ page session="false" %>
<html>
<head>
    <title>Yearbook</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home</title>
    <!-- Bootstrap Styles-->
    <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.css" type="text/css" rel="stylesheet"/>
    <!-- FontAwesome Styles-->
    <link href="${pageContext.request.contextPath}/resources/assets/css/font-awesome.css" type="text/css" rel="stylesheet"/>
    <!-- Custom Styles-->
    <link href="${pageContext.request.contextPath}/resources/assets/css/custom-styles.css" type="text/css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>

    <div id="wrapper">
        <div id="header">
            <t:insertAttribute name="header"/>
        </div>

        <div id="left-nav">
            <t:insertAttribute name="left-nav"/>
        </div>

        <div id="content">
            <t:insertAttribute name="body"/>
        </div>
    </div>
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script type="text/javascript" src="webjars/jquery/2.2.3/jquery.min.js"></script>
    <!-- Bootstrap Js -->
    <script type="tex/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.metisMenu.js"></script>
    <!-- Custom Js -->
    <script src="${pageContext.request.contextPath}/resources/assets/js/custom.js"></script>
</body>
</html>
