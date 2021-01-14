
package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Juego;
import Logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    ClienteJpaController jpaCliente = new ClienteJpaController();
    EmpleadoJpaController jpaEmpleado = new EmpleadoJpaController();
    EntradaJpaController jpaEntrada = new EntradaJpaController();
    JuegoJpaController jpaJuego = new JuegoJpaController();
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();
    
    public void crearCliente(Cliente cliente){        
        jpaCliente.create(cliente);        
    }
    
    public void crearEmpleado(Empleado empleado){
        jpaEmpleado.create(empleado);
    }
    
    public void crearEntrada(Entrada entrada){
        jpaEntrada.create(entrada);
    }
    
    public void crearJuego(Juego juego){
        jpaJuego.create(juego);
    }
    
    public void crearUsuario(Usuario usuario){
        jpaUsuario.create(usuario);
    }

    public List<Usuario> getUsuarios() {
        
        return jpaUsuario.findUsuarioEntities();
        
    }
    
}
