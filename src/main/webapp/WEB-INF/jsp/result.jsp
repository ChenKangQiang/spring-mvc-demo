<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/7/4
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>spring-mvc-demo</title>
</head>
<body>
<h2>Submitted User Information</h2>
<table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Password</td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${email}</td>
    </tr>
    <tr>
        <td>RegData</td>
        <td>${regdata}</td>
    </tr>
</table>
</body>
</html>
