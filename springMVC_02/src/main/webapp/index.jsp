<%--
  Created by IntelliJ IDEA.
  User: someonexmh
  Date: 2019/10/10
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>index</title>
    <script src="js/jquery-1.11.0.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {

                var username = $("#uid").val();
                var password = $("#pid").val();
                            $.ajax({
                                url : "testPage",
                                contentType: "application/json;charset=UTF-8",
                                data : '{"username":"'+username+'","password":"123"}',
                                dataType:"json",
                                type : "post",
                                success:function (data) {
                                    location.href = "jsp/success.jsp";
                                }
                            });

            });
        });

    </script>
</head>


<body>
<h2>你好</h2>
<form  method="post" >
    姓名:<input type="text" id="uid" name="username"/><br/>
    密码:<input type="password" id="pid" name="password"/><br/>
    <input type="submit" id="btn"  value="提交"/>
</form>
</body>
</html>
