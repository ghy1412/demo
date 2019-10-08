<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="demo" method="post">
    姓名:<input type="text" name="name"><br/>
    密码:<input type="text" name="password"><br/>
    用户ID:<input type="text" name="user.userId"><br/>
    用户名:<input type="text" name="user.userName"><br/>
    map:<input type="text" name="map['1'].userId"><br/>
    map:<input type="text" name="map['1'].userName"><br/>
    list:<input type="text" name="list[0].userId"><br/>
    list: <input type="text" name="list[0].userName"><br/>
    date: <input type="text" name="date"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
