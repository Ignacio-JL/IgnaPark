<%-- 
    Document   : confirmacion
    Created on : 20/12/2020, 16:50:13
    Author     : Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONFIRMACION</title>
    </head>
    <body>
        <h1>Pagina de confirmacion! con datos ingresados:</h1>
        
        <p>Nombre:<%= session.getAttribute("nombre")%></p>
        <p>Password:<%= session.getAttribute("password")%></p>
    </body>
</html>
