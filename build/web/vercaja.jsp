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
        <div class="container">
            <c:forEach items="${listaciudad}" var="ciudad">
                <div class="box">
                    <p>${ciudad.nombre}</p>
                    <a href="datosDetalle">
                        <img src="${ciudad.foto}">
                    </a>
                </div>
        </c:forEach>
        </div>
        
        <p>Pulsa aqui para volver atrás: <a href="home.jsp">← ATRÁS</a></p>
        
    </body>
</html>
