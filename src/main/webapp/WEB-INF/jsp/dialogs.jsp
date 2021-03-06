<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ALEX
  Date: 14.01.2018
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"><![endif]-->
<!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"><![endif]-->
<!--[if IE 8]><html class="no-js lt-ie9"><![endif]-->
<!--[if gt IE 8]><!--><html class="no-js"><!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Selectize.js Demo</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <link rel="stylesheet" href="/assets/css/normalize.css">
    <link rel="stylesheet" href="/assets/css/stylesheet.css">
    <!--[if IE 8]><script src="/assets/js/es5.js"></script><![endif]-->
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/js/jqueryui.js"></script>
    <script src="/assets/js/selectize.min.js"></script> 
    <!--todo: change relative path above-->
    <script src="/assets/js/index.js"></script>
    <link rel="stylesheet" href="/assets/css/selectize.default.css"/>
</head>
<body>
<div id="wrapper">
    <div class="demo">
    <form action="/dialogs" method="post">
        <div class="control-group">
            <label for="input-tags">Tags:</label>
            <input type="text" id="input-tags" class="input-tags demo-default" value="">
        </div>
        <script>
				$('.input-tags').selectize({
					plugins: ['remove_button'],
					persist: false,
					create: true,
					options: [
					    <c:forEach var="user" items="${userList}">
                            {'text': '${user.email}', 'value': '${user.id}'}
                        </c:forEach>
					]
					<!--render: {-->
						<!--item: function(data, escape) {	-->
						<!--&lt;!&ndash;item: function(data, escape) {&ndash;&gt;-->
							<!--return '<div>"' + escape(data.text) + '"</div>';-->
						<!--}-->
					<!--},-->
					<!--onDelete: function(values) {-->
						<!--return confirm(values.length > 1 ? 'Are you sure you want to remove these ' + values.length + ' items?' : 'Are you sure you want to remove "' + values[0] + '"?');-->
					<!--}-->
				});
				</script>
				    <input type="submit"/>
				</form>
    </div>
</div>
</body>
</html>


