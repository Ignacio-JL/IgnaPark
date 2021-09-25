
package Logica;

import Persistencia.ControllerPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class Controller {
    ControllerPersistencia controller = new ControllerPersistencia();
    
    public void crearEmpleado (String nombre, String apellido, String dni, int edad){
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setDni(dni);
        empleado.setEdad(edad);
        
        controller.crearEmpleado(empleado);
    }
    public void crearUsuario(String nombre, String password, Empleado empleado) {
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setPassword(password);
        user.setRelEmpleado(empleado);
        
        controller.crearUsuario(user);
    }
    public Empleado searchEmpleado(String dni){
        List<Empleado> listaEmpleado = new ArrayList<Empleado>();
        listaEmpleado = controller.getEmpleados();
        for (Empleado empleado : listaEmpleado) {
            if(empleado.getDni().equals(dni)){
                return empleado;
            }
            
        }
        return null;
    }

    public boolean comprobarLogin(String user, String password) {
        boolean isOk=false;
        List <Usuario> listaUsuario = new ArrayList<Usuario>();
        
        listaUsuario = controller.getUsuarios();
        
        for (Usuario usuario : listaUsuario) {
            if(usuario.getNombre().equals(user) && usuario.getPassword().equals(password)){
            isOk=true;
            return isOk;
        }
        }
        return isOk;
    }

    
}
