<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${sessionScope.user.email}
<div>
    <form action="/login" method="post">
        <div>
            Email
            <input name="email" type="text"/>
        </div>
        <div>
            Password
            <input name="password" type="password"/>
        </div>
        <input type="submit"/>
    </form>
</div>

<jsp:include page="register.jsp" />

</body>
</html>
