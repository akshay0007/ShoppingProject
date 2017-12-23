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
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="home">
                    <a href="${contextRoot}/home">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%--nav finish--%>
<%--content data--%>

<div class="container">
    <c:if test="${not empty message}">
        <div class="row">
            <div class="col-md-offset-3 col-md-6">
                <div class="alert alert-danger">
                        ${message}
                </div>
            </div>
        </div>
    </c:if>
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>login pane/h4>
                </div>
            </div>
        </div>

        <div class="panel-body">
            <form action="${contextRoot}/csrfLogin" method="POST"
                  class="form-horizontal"
                  id="loginForm"
            >
                <div class="form-group">
                    <label for="username" class="col-md-4 control-label">Email: </label>
                    <div class="col-md-8">
                        <input type="text" name="username" id="username" class="form-control"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-md-4 control-label">Password: </label>
                    <div class="col-md-8">
                        <input type="password" name="password" id="password" class="form-control"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <input type="submit" value="Login" class="btn btn-primary"/>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>
<%--end of content--%>


<!-- Bootstrap core JavaScript -->
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.bundle.min.js"></script>
<script src="${js}/mainclass.js"></script>

</body>

</html>


