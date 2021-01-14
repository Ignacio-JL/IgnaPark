
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
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idEntrada;
    @Basic
    private int hora;
    @Temporal(TemporalType.DATE)
    private Date turno; 
    @OneToOne
    Juego juegoRelacion;

    public Entrada() {
    }

    public Entrada(int idEntrada, int hora, Date turno, Juego juegoRelacion) {
        this.idEntrada = idEntrada;
        this.hora = hora;
        this.turno = turno;
        this.juegoRelacion = juegoRelacion;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Date getTurno() {
        return turno;
    }

    public void setTurno(Date turno) {
        this.turno = turno;
    }

    public Juego getJuegoRelacion() {
        return juegoRelacion;
    }

    public void setJuegoRelacion(Juego juegoRelacion) {
        this.juegoRelacion = juegoRelacion;
    }

    
    
}
