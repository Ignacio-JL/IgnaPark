
package Servlets;

import Logica.Controladora;
import Persistencia.ControladoraPersistencia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("username");
        String contrasena = request.getParameter("pass");
        
        boolean estaONo = false;
        
        Controladora control = new Controladora();//quitar
        estaONo = control.comprobarIngreso(usuario,contrasena);
        
        if(estaONo == true){
            
            response.sendRedirect("index.jsp");
        }
        else{
            response.sendRedirect("LoginError.jsp");
        }
        


    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
