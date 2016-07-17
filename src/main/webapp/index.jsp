<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; utf-8" language="java" %>
<%@ page import="entities.User" %>
<%@ page import="java.util.List" %>
<html>
<body>

<jsp:include page="menu.jsp"/>
<h2>page</h2>


<h1>${myName}</h1>


<c:forEach items="${r}" var="bv">
    ${bv}<br>
</c:forEach>


<c:forEach items="${list}" var="item">
    ${item.getLogin()}<br>
</c:forEach>


<c:forEach items="${q}" var="mn">
    ${mn}<br>
    </c:forEach>


</body>
</html>
