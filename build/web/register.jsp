<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        
        <form action="RegisterServlet" method="POST">
            <div>
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre">
            </div>
            <div>
                <label for="apellido">Apellido</label>
                <input type="text" name="apellido">
            </div>
            <div>
                <label for="dni">Dni</label>
                <input type="text" name="dni">
            </div>
            <div>
                <label for="edad">Edad</label>
                <input type="number" name="edad">
            </div>
            <div>
                <input type="submit" value="Añadir Empleado">
            </div>
                
        </form>
    </body>
</html>
