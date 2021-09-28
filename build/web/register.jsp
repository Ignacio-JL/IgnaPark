<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro Usuario</title>
    <link rel="stylesheet" href="css/registroUser.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
</head>
<body>
    <div class="testbox">
        <h1>Registro de Empleado</h1>
    
        <form action="RegisterServlet" method="POST">
            <hr>
        <div class="accounttype">
            <input type="radio" value="None" id="radioOne" name="account" checked/>
            <label for="radioOne" class="radio" chec>Sector B1</label>
            <input type="radio" value="None" id="radioTwo" name="account" />
            <label for="radioTwo" class="radio">Sector B2</label>
        </div>
        <hr>
        <label id="icon" for="nombre"><i class="icon-user"></i></label>
        <input type="text" name="nombre" id="name" placeholder="Nombre" required/>

        <label id="icon" for="apellido"><i class="icon-user"></i></label>
        <input type="text" name="apellido" id="name" placeholder="Apellido" required/>

        <label id="icon" for="dni"><i class="icon-user"></i></label>
        <input type="text" name="dni" id="name" placeholder="Dni usuario" required/>

        <label id="icon" for="edad"><i class="icon-user"></i></label>
        <input type="number" name="edad" id="name" placeholder="Edad" required/>
        
        
        <div class="gender">
        <input type="radio" value="None" id="male" name="gender" checked/>
        <label for="male" class="radio" chec>Male</label>
        <input type="radio" value="None" id="female" name="gender" />
        <label for="female" class="radio">Female</label>
        <input type="submit" value="crear empleado">
        </div> 
        <p>By clicking Register, you agree on our <a href="#">terms and condition</a>.</p>
        

        </form>
        </div>
</body>
</html>