<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ALEX
  Date: 12.01.2018
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="message" items="${messages}">
    <div>
        <span>
            ${message.text}
        </span>
        <span>
            ${message.created}
        </span>
    </div>
</c:forEach>
</body>
</html>
