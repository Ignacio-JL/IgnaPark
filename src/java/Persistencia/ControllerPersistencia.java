package Persistencia;

import Logica.Empleado;
import Logica.Juego;
import Logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPersistencia {
    EmpleadoJpaController jpaEmpleado = new EmpleadoJpaController();
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();
    JuegoJpaController jpaJuego = new JuegoJpaController();
    
    public void crearEmpleado(Empleado empleado){
        jpaEmpleado.create(empleado);
    }
    public void crearUsuario(Usuario user) {
        jpaUsuario.create(user);
    }
    public void crearJuego(Juego juego){
        jpaJuego.create(juego);
    }
    
    public void addEmployee(Juego juego) {
        try {
            jpaJuego.edit(juego);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> getUsuarios() {
        
        return jpaUsuario.findUsuarioEntities();
    }
    public List<Empleado> getEmpleados(){
        return jpaEmpleado.findEmpleadoEntities();
    }

    public List<Juego> getJuegos() {
        return jpaJuego.findJuegoEntities();
    }

    
    
}
