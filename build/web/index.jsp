<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IgnaPark | Home</title>
    </head>
    <body>
        <%//Busca una session, si no hay alguna retorna null y significa que no hay sesion iniciada
            HttpSession miSession = request.getSession();
            if(request.getSession().getAttribute("usuario")==null)//Aca usamos los valores del session 'conservado' desde el servlet
                response.sendRedirect("errorLogin.jsp");

        %>    
        <h1>BIENVENIDO A IGNAPARK XDDDDD</h1>
        <h3>Añadir Atraccion al parque</h3>
        <form action="AddGameServlet" method="GET">
            <div>
                <label for="dni">Dni de empleado a cargo</label>
                <input type="text" name="dni">
            </div>
            
            <div>
                <label for="nombre">Nombre de atraccion</label>
                <input type="text" name="nombre">
            </div>
            
            <div>
                <label for="capacidad">Capacidad</label>
                <input type="number" name="capacidad">
            </div>
            
            <div>
                <label for="altMin">Alt min</label>
                <input type="number" name="altMin">
            </div>
            <div>
                <input type="submit" value="Añadir Juego">
            </div>
        </form>
        <h3>Añadir Empleado a un juego</h3>
        <form action="AddEmployeeServlet" method="GET">
            <div>
                <label for="dni">Dni del empleado</label>
                <input type="text" name="dni">
            </div>
            <div>
                <label for="nombre">Nombre del juego</label>
                <input type="text" name="nombre">
            </div>
            <input type="submit" value="Agregar Empleado">
        </form>
        
        
        
        <form method="POST" action="exitLoginServlet">
            <input type="submit" value="Cerrar sesion" style="background-color: red; margin-top: 15px">
        </form>
    </body>
</html>
