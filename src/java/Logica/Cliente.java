
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idCliente;
    @Basic
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    @OneToOne
    Entrada entradaRelacion;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String apellido, int edad, int altura, Entrada entradaRelacion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.entradaRelacion = entradaRelacion;
    }

    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Entrada getEntradaRelacion() {
        return entradaRelacion;
    }

    public void setEntradaRelacion(Entrada entradaRelacion) {
        this.entradaRelacion = entradaRelacion;
    }
    
    
    
}
