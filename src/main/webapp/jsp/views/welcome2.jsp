<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>试验分页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/listPageAjax.js"></script>
</head>
<body>
<br />
<input type="hidden" id="ctx" value="${pageContext.request.contextPath}" />

<div id="showId">

</div>
<br />
<div id="showPageId">

</div>

</body>

</html>
