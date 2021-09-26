
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


@WebServlet(name = "AddGameServlet", urlPatterns = {"/AddGameServlet"})
public class AddGameServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.getSession().setAttribute("capacidad", request.getParameter("capacidad"));
  //      request.getSession().setAttribute("altMin", request.getParameter("altMin"));        
        
        Controller controller = new Controller();
        Empleado empleado= controller.searchEmpleadoByDni(request.getParameter("dni"));
        if(empleado==null){ 
            response.sendRedirect("errorAddGame.jsp");
        }
        else{
            controller.crearJuego(request.getParameter("nombre"), Integer.parseInt(request.getParameter("capacidad")), Integer.parseInt(request.getParameter("altMin")), empleado);
            System.out.println("bieeeeen");
            response.sendRedirect("index.jsp");    
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
