<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ALEX
  Date: 14.01.2018
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dialogs" method="post">
Write to:
<select>
    <c:forEach var="user" items="${userList}">
        <option name="writeTo" value="${user.id}">${user.firstName}</option>
    </c:forEach>
</select>
    <input type="submit"/>
</form>
</body>
</html>
