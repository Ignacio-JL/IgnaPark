

<%@page import="Logica.Juego"%>
<%@page import="Logica.Usuario"%>
<%@page import="Logica.Empleado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Persistencia.ControllerPersistencia"%>
<%@page import="Logica.Controller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos empleados</title>
    </head>
    <body>
        <h1>LISTA EMPLEADOS</h1>
        <table>
            <thead>
                <tr>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>DNI</th>
                    <th>USUARIO</th>
                    <th>JUEGO ASIGNADO</th>
                </tr>
            </thead>
            <tbody>

                <tr>
                    <%
                        ControllerPersistencia controller = new ControllerPersistencia();
                        List<Usuario> usuarios = new ArrayList<Usuario>();
                        usuarios = controller.getUsuarios();
                        List<Juego> juegos = new ArrayList<Juego>();
                        juegos = controller.getJuegos();
                        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
                        listaEmpleados = controller.getEmpleados();
                        
                        for(Empleado list : listaEmpleados){

                    %>
                    <td><%=list.getNombre() %></td>
                    <td><%=list.getApellido() %></td>
                    <td><%=list.getDni() %></td>
                    <td><%=controller.searchUserToList(list.getIdEmpleado()) %></td>
                    <td><%=controller.searchGameToList(list.getIdEmpleado()) %></td>

                </tr>
            <% } %>
            </tbody>
    </table>
    
    
    
    
    </body>
</html>
