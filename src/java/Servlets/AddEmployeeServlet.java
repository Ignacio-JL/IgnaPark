
package Servlets;

import Logica.Controller;
import Logica.Empleado;
import Logica.Juego;
import Persistencia.ControllerPersistencia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddEmployeeServlet", urlPatterns = {"/AddEmployeeServlet"})
public class AddEmployeeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Controller controller = new Controller();
        Empleado empleado= controller.searchEmpleadoByDni(request.getParameter("dni"));
        if(empleado != null){ 
            Juego juego = controller.searchGameByName(request.getParameter("nombre"));
            if(juego != null){
                ControllerPersistencia per = new ControllerPersistencia();
                juego.getRelEmpleado().add(empleado);
                per.addEmployee(juego);
                response.sendRedirect("index.jsp");
            }
            else{
                response.sendRedirect("errorAddEmployee.jsp");
            }
            
        }
        else{
            response.sendRedirect("errorAddEmployee.jsp");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
