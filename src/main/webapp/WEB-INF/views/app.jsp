<%@ page language="java" contentType="text/html; ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="_csrf" content="${_csrf.token}">
    <meta name="_csrf_header" content="${_csrf.headerName}">
    <script>
        window.menu = '${title}';
    </script>

    <title>1 Col Portfolio - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/1-col-portfolio.css" rel="stylesheet">

</head>

<body>

<!--nav include-->
<%@include file="appnav.jsp" %>
<%--nav finish--%>


<!-- Page Content -->
<c:if test="${userclickHome==true}">
    <%@include file="appcontent.jsp" %>
</c:if>

<c:if test="${userclickAbout==true}">
    <%@include file="loginpage.jsp" %>
</c:if>


<c:if test="${userclickContact==true}">
    <%@include file="loginpage.jsp" %>
</c:if>

<c:if test="${userclickService==true}">
    <%@include file="loginpage.jsp" %>
</c:if>

<!-- /.container -->

<!-- Footer -->
<%@include file="appfooter.jsp" %>
<%--footerfinish--%>


<!-- Bootstrap core JavaScript -->
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.bundle.min.js"></script>

</body>

</html>

