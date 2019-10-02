<%--
  Created by IntelliJ IDEA.
  User: someonexmh
  Date: 2019/10/2
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" cellspacing="0px" width="100%">
    <tr>
        <th>id</th>
        <th>itemsId</th>
        <th>price</th>
    </tr>
    <c:forEach items="${list}" var="items">
        <tr>
            <td>${items.id}</td>
            <td>${items.name}</td>
            <td>${items.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
