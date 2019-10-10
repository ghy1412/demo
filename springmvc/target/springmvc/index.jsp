<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.11.0.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {

              $.ajax({
                    url:"testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data: '{"name":"dasd","password":"dasda"}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        alert(data.name);
                        alert(data.password);
                    }
                });
            });
        });
    </script>
</head>
<body>
<%--
<form id="form_id" method="post">
    姓名:<input type="text" id="name" name="name"><br/>
    密码:<input type="text" id="password" name="password"><br/>
    &lt;%&ndash;     用户ID:<input type="text" name="user.userId"><br/>
       用户名:<input type="text" name="user.userName"><br/>
       map:<input type="text" name="map['1'].userId"><br/>
       map:<input type="text" name="map['1'].userName"><br/>
       list:<input type="text" name="list[0].userId"><br/>
       list: <input type="text" name="list[0].userName"><br/>
       date: <input type="text" name="date"><br/>&ndash;%&gt;
    <input type="submit"  id="btn" value="提交">
</form>--%>

<%--<form action="uploadfile2" method="post" enctype="multipart/form-data">
    文件上传:<input type="file" name="upload"/>
    <input type="submit"/>
</form>--%>

<form action="testMode" method="post" enctype="multipart/form-data">
    <input type="text" name="name">
    <input type="submit" id="btn"/>
</form>
</body>
</html>
