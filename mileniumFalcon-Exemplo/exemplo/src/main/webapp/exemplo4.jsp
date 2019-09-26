<%-- 
    Document   : exemplo4
    Created on : 13/09/2019, 21:55:20
    Author     : victor.salves5
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <h1>Data e hora de acesso </h1>
        <ul>
        <c:forEach begin="1" end="100" var="i">
        <li>
            <c:out value="${i}"/>        </li>
        </c:forEach>
        </ul>
    </body>
    </body>
</html>
