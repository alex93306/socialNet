<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div>
    <div>
        ${errorResult.errors}
        ${result}
    </div>
    <form action="/register" method="post">
        <div>
            <span>Email</span>
            <input name="email" type="text"/>
        </div>
        <div>
            <span>First Name</span>
            <input name="first_name" type="text"/>
        </div>
        <div>
            <span>Last Name</span>
            <input name="last_name" type="text"/>
        </div>
        <div>
            <span>Password</span>
            <input name="password" type="password"/>
        </div>
        <div>
            <input type="submit" value="Create"/>
        </div>
    </form>
</div>