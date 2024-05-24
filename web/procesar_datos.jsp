<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edad del usuario</h1>
        <!--con la linea de abajo puedo recoger el dato que se consigue desde el servlet 
        y poder usarlo en cualquier lugar-->
        <!--El usuario tiene: <%=request.getAttribute("edadjsp")%> años-->

        <form action ="home.jsp">
            <label for="edadusu">El usuario tiene: </label>
            <input type="text" id="edadusu" name="edadusu" value="<%=request.getAttribute("edadjsp")%>" ><br>
            
            <label for="nombreusu">Se llama: </label>
            <input type="text" id="nombreusu" name="nombreusu" value="<%=request.getAttribute("nombreUsu")%>"><br>
            
            <label for="dniusu">Y su DNI es: </label>
            <input type="text" id="dniusu" name="dniusu" value="<%=request.getAttribute("dniUsu")%>"><br>
            
            <label for="submit">Volver al inicio: </label>
            <input type="submit" value="INICIO">
        </form>
        
    </body>
</html>
