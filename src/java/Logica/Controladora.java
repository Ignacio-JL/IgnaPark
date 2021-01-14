
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis  = new ControladoraPersistencia();
    
    
    
    public void crearUsuario (String nombre, String password){
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setPassword(password);
        
        controlPersis.crearUsuario(user);
    }
    
    public void crearEmpleado (String nombre, String apellido, String dni, int edad, String cargo, Date fechaNac, Usuario usu){
        Empleado emple = new Empleado();
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setDni(dni);
        emple.setEdad(edad);
        emple.setCargo(cargo);
        emple.setFechaNac(fechaNac);
        emple.setUsuarioRelacion(usu);
        
        controlPersis.crearEmpleado(emple);
    }
    

    public boolean comprobarIngreso(String usuario, String contrasena) {
        
       boolean siONo = false;
       List <Usuario> listaUsuarios = new ArrayList <Usuario>();
       
       listaUsuarios = controlPersis.getUsuarios();
       
       for (Usuario usu:listaUsuarios) {
           
           if(usu.getNombre().equals(usuario) && usu.getPassword().equals(contrasena)){
               
               siONo = true;
               return siONo;
           }
           
       }
       return siONo;
        
    }
        
}
