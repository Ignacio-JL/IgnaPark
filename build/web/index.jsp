<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home | IgnaPark</title>
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
    <%//Busca una session, si no hay alguna retorna null y significa que no hay sesion iniciada
            HttpSession miSession = request.getSession();
            if(request.getSession().getAttribute("usuario")==null)//Aca usamos los valores del session 'conservado' desde el servlet
                response.sendRedirect("errorLogin.jsp");

        %>

    <h1 style="text-align: center; color: #fff; text-transform: uppercase;">Welcome To IgnaPark 7w7</h1>
    
    <div class="cuadro">
        <h2>Añadir atracción</h2>
        
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
        
    </div>
    <div class="cuadro">
        <h2>Añadir empleado a un juego</h2>
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
    </div>
    <div class="cuadro">
        <a href="listEmployee.jsp"><h4 style="padding-top: 10px; height: 0px; text-align: center;">Ver Lista de empleados</h4></a>
    </div>
    <div class="cuad">
        <form method="POST" action="exitLoginServlet">
            <div style="text-align: center;">
                <input type="submit" value="Cerrar sesion" style="background-color: red; color: #fff; font-size: 25px; border-radius: 24px;margin-top: 10px;">
            </div>
        </form>
    </div>
    
</body>
</html>