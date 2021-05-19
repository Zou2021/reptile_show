<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>数据展示页面</title>
</head>
<style>
    body {
        text-align: center;
    }
    table {
        margin: auto;
        border-collapse: collapse;
    }
    table tr td {
        border: solid 1px #222;
        padding: 15px 15px 15px 15px;
        text-align: center;
    }
</style>
<body>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>url</td>
        <td>type</td>
        <td>author</td>
    </tr>
    <c:forEach items="${comic}" var="u" varStatus="st">
        <tr>
            <td>${u.did}</td>
            <td>${u.name}</td>
            <td>${u.url}</td>
            <td>${u.type}</td>
            <td>${u.author}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>