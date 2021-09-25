package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ignacio
 */
@WebServlet(name = "PruebaServlet", urlPatterns = {"/PruebaServlet"})
public class PruebaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        //seteamos los atributos para poder utilizarlos ahora y mas adelante
        request.getSession().setAttribute("nombre", nombre);
        request.getSession().setAttribute("edad", edad);
        //enviamos los atributos a confirmacion.jsp
        response.sendRedirect("confirmacion.jsp");
        
        
        
        //esto hacia referencia al form de registro anteriormente
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
