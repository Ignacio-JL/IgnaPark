
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idEntrada;
    @Basic
    private int hora;
    private String juego;
    @OneToOne
    Juego relJuego;

    public Entrada() {
    }

    public Entrada(int idEntrada, int hora, String juego, Juego relJuego) {
        this.idEntrada = idEntrada;
        this.hora = hora;
        this.juego = juego;
        this.relJuego = relJuego;
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

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public Juego getRelJuego() {
        return relJuego;
    }

    public void setRelJuego(Juego relJuego) {
        this.relJuego = relJuego;
    }
    
    
}
