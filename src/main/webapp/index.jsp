<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; utf-8" language="java" %>
<%@ page import="entities.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>page</h2>


<c:forEach items="${list}" var="item">
    ${item.getLogin()}<br>
</c:forEach>

</body>
</html>
