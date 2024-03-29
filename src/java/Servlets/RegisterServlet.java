
package Servlets;

import Logica.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().setAttribute("nombre", request.getParameter("nombre"));
        request.getSession().setAttribute("apellido", request.getParameter("apellido"));
        request.getSession().setAttribute("dni", request.getParameter("dni"));
        request.getSession().setAttribute("edad", request.getParameter("edad"));
              
        Controller controller = new Controller();
        controller.crearEmpleado(request.getParameter("nombre"), request.getParameter("apellido"), request.getParameter("dni"),Integer.parseInt(request.getParameter("edad")));
        response.sendRedirect("confirmed.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
