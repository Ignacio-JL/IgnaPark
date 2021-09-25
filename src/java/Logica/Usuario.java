
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idUsuario;
    @Basic
    private String nombre;
    private String password;
    @OneToOne
    Empleado relEmpleado;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String password, Empleado relEmpleado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.password = password;
        this.relEmpleado = relEmpleado;
    }
    

    

    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado getRelEmpleado() {
        return relEmpleado;
    }

    public void setRelEmpleado(Empleado relEmpleado) {
        this.relEmpleado = relEmpleado;
    }

    
}
