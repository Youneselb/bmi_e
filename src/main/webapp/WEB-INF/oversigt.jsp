<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Aliapoulsen
  Date: 05/03/2020
  Time: 09.34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt</title>

    <c:forEach var="element" items="${requestScope.UserList}">

        ${element}
        <br>





    </c:forEach>


</head>
<body>

</body>
</html>
