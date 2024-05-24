<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del usuario</h1>
        <%!String edad,nombre,dni;%>
        <%edad = request.getParameter("edadusu");%>
        <%nombre = request.getParameter("nombreusu");%>
        <%dni = request.getParameter("dniusu");%>
        <h2><%=edad%></h2>
        <h2><%=nombre%></h2>
        <h2><%=dni%></h2>
        
        <p>Pulsa aqui para ver las tablas: <a href="datosTabla">TABLAS</a></p>
        <p>Pulsa aqui para ver las cajas: <a href="datosCaja">CAJAS</a></p>
        <p>Pulsa aqui para ver el Javascript: <a href="verbombilla.jsp">JavaScipt</a></p>
    </body>
</html>
