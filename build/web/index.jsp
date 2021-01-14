<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Bienvenido a Parque IGNACIO!</h1>
        <h2>Venta de Entradas</h2>
        
        <%--DESPUES BORRAR ESTE FORMULARIO DE PRACTICA --%>
        
        <form action="ParqueServlet" method="POST">
            
            Nombre: <input type="text" name="nombre"> <br><br>
            Password: <input type="text" name="password">
            
            <input type="submit" value="Enviar">
            
        </form>
        <h2>Consultas</h2>
        
    </body>
</html>
