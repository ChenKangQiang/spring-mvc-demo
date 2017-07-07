<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2017/7/4
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>spring-mvc-demo</title>
</head>
<body>

<h2>Student Information</h2>
<%--action中为绝对路径--%>
<form:form method="POST" action="/spring-mvc-demo/addUser">
    <table>
        <tr>
            <td><form:label path="username">Name</form:label></td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="regdata">RegData</form:label></td>
            <td><form:input path="regdata" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
