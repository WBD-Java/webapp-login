<%--
  Created by IntelliJ IDEA.
  User: colongchong
  Date: 8/17/18
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body {
        width: 500px;
        margin: auto;
    }
</style>
<head>
    <title>Login</title>
</head>
<body>
<h1>Home</h1>

<form:form action="login" method="post" modelAttribute="login">
<fieldset>
    <legend>Login</legend>
    <table>
        <tr>
            <td><form:label path="account">Account: </form:label></td>
            <td><form:input path="account"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password: </form:label></td>
            <td><form:input type="password" path="password"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Login</form:button></td>
        </tr>
    </table>
</fieldset>
</form:form>
</body>
</html>
