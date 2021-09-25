<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro usuario</title>
    </head>
    <body>
        <h1>Vamos a registrar un usuario!</h1>

        <form action="RegisterUserServlet" method="POST">
            <div>
                <label for="dni">Dni de empleado</label>
                <input type="text" name="dni">
            </div>
            <div>
                <label for="nombre">Usuario</label>
                <input type="text" name="nombre">
            </div>
            <div>
                <label for="pass">Contraseña</label>
                <input type="password" name="pass">
            </div>
        </form>
        
        <p>¿Aun no te registraste como empleado? Registrate<a href="register.jsp">Aca</a></p>
    </body>
</html>