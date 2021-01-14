
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
public class Juego extends Horario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idJuego;
    @Basic
    private String nombre;
    private int capacidad;
    private int edadMin;
    private int alturaMin;
    @OneToMany
    List <Empleado> listaEmpleados;

    public Juego() {
    }

    public Juego(int idJuego, String nombre, int capacidad, int edadMin, int alturaMin, List<Empleado> listaEmpleados) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edadMin = edadMin;
        this.alturaMin = alturaMin;
        this.listaEmpleados = listaEmpleados;
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

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(int alturaMin) {
        this.alturaMin = alturaMin;
    }

    @Override
    public int getHoraInicio() {
        return horaInicio;
    }
    
    @Override
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    @Override
    public int getHoraFin() {
        return horaFin;
    }
    
    @Override
    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    
    
}
