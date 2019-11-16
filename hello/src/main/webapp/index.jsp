<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>hellow</title>
</head>
<body>
<form action="/print" id="user_id" >
    <table border="1px" cellpadding="0px" >
        <tr>
            <td>
                <input id="name"/>
            </td>
            <td>
                <input id="age"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="submit">
</form>
</body>
</html>
