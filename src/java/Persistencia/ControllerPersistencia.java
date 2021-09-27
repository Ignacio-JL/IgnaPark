package Persistencia;

import Logica.Empleado;
import Logica.Juego;
import Logica.Usuario;
import java.util.ArrayList;
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
    public String searchUserToList(int id){
        List<Usuario> list = new ArrayList<Usuario>();
        list= getUsuarios();
        for (Usuario usuario : list) {
            
            if( usuario.getRelEmpleado().getIdEmpleado()==id ){
                return usuario.getNombre();
            }
        }
        return "";
    }
   public String searchGameToList(int id){
       List<Juego> list = new ArrayList<Juego>();
       list = getJuegos();
       for (Juego juego : list) {
           
           for(Empleado _juego : juego.getRelEmpleado()){
               if(_juego.getIdEmpleado() == id)
               {
                   return juego.getNombre();
               }
           }
       }
       return "N/A";
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
