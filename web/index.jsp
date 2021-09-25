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
            if(request.getSession().getAttribute("usuario")==null)
                response.sendRedirect("errorLogin.jsp");


        %>    
        <h1>BIENVENIDO A IGNAPARK XDDDDD</h1>
    </body>
</html>
