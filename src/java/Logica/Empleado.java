
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empleado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idEmpleado;
    @Basic
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private String cargo;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @OneToOne
    Usuario usuarioRelacion;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellido, String dni, int edad, String cargo, Date fechaNac, Usuario usuarioRelacion) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaNac = fechaNac;
        this.usuarioRelacion = usuarioRelacion;
    }

    

    public Usuario getUsuarioRelacion() {
        return usuarioRelacion;
    }

    public void setUsuarioRelacion(Usuario usuarioRelacion) {
        this.usuarioRelacion = usuarioRelacion;
    }
    
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
