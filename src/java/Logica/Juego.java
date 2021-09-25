
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Juego implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idJuego;
    @Basic
    private String nombre;
    private int capacidad;
    private int alturaMin;
    @OneToMany
    List <Empleado> relEmpleado;

    public Juego() {
    }

    public Juego(int idJuego, String nombre, int capacidad, int alturaMin, List<Empleado> relEmpleado) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.alturaMin = alturaMin;
        this.relEmpleado = relEmpleado;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(int alturaMin) {
        this.alturaMin = alturaMin;
    }

    public List<Empleado> getRelEmpleado() {
        return relEmpleado;
    }

    public void setRelEmpleado(List<Empleado> relEmpleado) {
        this.relEmpleado = relEmpleado;
    }

    
    
}
