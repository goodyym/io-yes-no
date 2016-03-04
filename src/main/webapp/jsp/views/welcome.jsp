<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>试验分页</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/listPage.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
</head>
<body>
一共有${page.maxPage}页
<br />

<c:forEach items="${page.pageResult}" var="pageResult">
    ${pageResult.id}-----------${pageResult.name}<br />
</c:forEach>

<br />
<br />
<form action="/io-yes-no/login/welcome"  method="get" id="formId">
    <input id="pageSizeId" type="hidden" name="pageNo">
    <input type="text" name="username" />
    <input type="text" name="password" />

</form>

<c:forEach begin="1" end="${page.maxPage}" step="1" varStatus="index">
    <a href="javascript:void(0);" onclick="submitOk('${index.index}')">${index.index}</a>&nbsp;&nbsp;
</c:forEach>

${aa}
</body>

</html>
