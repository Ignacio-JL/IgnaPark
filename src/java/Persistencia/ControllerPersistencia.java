package Persistencia;

import Logica.Empleado;
import Logica.Usuario;
import java.util.List;

public class ControllerPersistencia {
    EmpleadoJpaController jpaEmpleado = new EmpleadoJpaController();
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();
    
    public void crearEmpleado(Empleado empleado){
        jpaEmpleado.create(empleado);
    }
    public void crearUsuario(Usuario user) {
        jpaUsuario.create(user);
    }

    public List<Usuario> getUsuarios() {
        
        return jpaUsuario.findUsuarioEntities();
    }
    public List<Empleado> getEmpleados(){
        return jpaEmpleado.findEmpleadoEntities();
    }

    
    
}
