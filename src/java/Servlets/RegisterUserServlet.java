
package Servlets;

import Logica.Controller;
import Logica.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterUserServlet", urlPatterns = {"/RegisterUserServlet"})
public class RegisterUserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controller controller = new Controller();
        Empleado empleado= controller.searchEmpleado(request.getParameter("dni"));
        if(empleado==null){ 
            response.sendRedirect("errorRegisterUser.jsp");
        }
        else{
            controller.crearUsuario(request.getParameter("nombre"), request.getParameter("pass"), empleado);
            response.sendRedirect("confirmed.jsp");    
        }
        
                
            }


    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
