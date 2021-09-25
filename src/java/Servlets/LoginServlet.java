
package Servlets;

import Logica.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        boolean isOk=false;
        Controller controller = new Controller();
        
        isOk=controller.comprobarLogin(request.getParameter("usuario"), request.getParameter("pass"));
        
        if(isOk==true){
            
            //Verificar que exista una sesion
            HttpSession miSession = request.getSession(true);
            miSession.setAttribute("usuario", request.getParameter("usuario"));
            miSession.setAttribute("password", request.getParameter("pass"));
            
            response.sendRedirect("index.jsp");
        }
        else{
            response.sendRedirect("errorLogin.jsp");
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
