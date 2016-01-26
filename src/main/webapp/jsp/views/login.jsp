<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<shiro:guest>
<form method="post">
    <input type="text" name="username"  /><br />
    <input type="password" name="password"  /><br />
    <input type="submit" value="点击登录" />
</form>
</shiro:guest>

<shiro:user>
    登录用户：<shiro:principal /><br />
    <a href="/io-yes-no/login/loginOut">退出</a>
</shiro:user>

</body>
</html>
