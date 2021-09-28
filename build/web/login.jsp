<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/login.css">
</head>

<body>
    <div class="mobile-screen">
        <div class="header">
            <h1>Log in</h1>
        </div>
        
        <div class="logo">
            <img src="img/parqueicon.jpg" style="height: 150px;">
        </div>
    


        <form id="login-form" action="LoginServlet" method="POST">
            <input type="text" name="usuario" placeholder="Usuario">
            <input type="password" name="pass" placeholder="Contraseña">
            
            <input class="login-btn" type="submit" value="Iniciar Sesión">
        </form>
        
        
        <div class="other-options">
            <div class="option" id="newUser"><p class="option-text"><a href="registerUser.jsp" style="color: #fff;">Registrar usuario</a></p></div>
            <div class="option" id="fPass"><p class="option-text"><a href="register.jsp" style="color: #fff;">Registrar empleado</a></p></div>
        </div>
        
    </div>
    <script src="js/login.js"></script>
</body>
</html>