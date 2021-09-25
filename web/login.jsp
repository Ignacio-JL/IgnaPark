<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login IgnaPark</title>
    </head>
    <body>
        <h1>LOGIN IgnaPark!!!!!!!!!</h1>
        <form action="LoginServlet" method="POST">
            <div>
                <label for="usuario">Usuario</label>
                <input type="text" name="usuario" required="true">
            </div>
            <div>
                <label for="pass">Contraseña</label>
                <input type="password" name="pass" required="true">
            </div>
            <div>
                <input type="submit" value="Iniciar Sesión">
            </div>
        </form>
        <a href="register.jsp" >Quiero registrarme</a>
    </body>
</html>
