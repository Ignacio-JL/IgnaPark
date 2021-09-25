
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a confirmacion .jsp</h1>
        <h2>Datos ingresados!</h2>
        <div>
            <p>Nombre:<%=session.getAttribute("nombre") %></p>
            <p>Edad:<%=session.getAttribute("edad") %></p>
        </div>
            
        
    </body>
</html>
