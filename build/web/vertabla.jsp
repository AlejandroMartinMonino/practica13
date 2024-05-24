<%@page import="modelo.Ciudad"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Capital</th>
            <th>Continente</th>
            <th>Nº Habitantes</th>
        </tr>
        <c:forEach items="${listaciudad}" var="ciudad">
            <tr>
                <td>${ciudad.nombre}</td>
                <td>${ciudad.capital}</td>
                <td>${ciudad.continente}</td>
                <td>${ciudad.habitantes}</td>
            </tr>
        </c:forEach>
        
    <p>Pulsa aqui para volver atrás: <a href="home.jsp">← ATRÁS</a></p>
    </body>
</html>
