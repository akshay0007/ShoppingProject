<%--
  Created by IntelliJ IDEA.
  User: ubuntu
  Date: 13/2/18
  Time: 9:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>login page ${name}</h1>

<form action="/login.do" method="post">
    name here <input type="text" name="name"><br/>
    password here <input type="password" name="pass"><br/>
    <input type="submit">
</form>


</body>
</html>
