package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.domain;

import jakarta.persistence.*;

@Entity
public class Fruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFruta;
    private String nombre;
    private double cantidadKg;


    public Fruta(String nombre, double cantidadKg) {
        this.nombre = nombre;
        this.cantidadKg = cantidadKg;
    }
    public Fruta() {
    }


    public int getIdFruta() {
        return idFruta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidadKg() {
        return cantidadKg;
    }

    public void setIdFruta(int idFruta) {
        this.idFruta = idFruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadKg(double cantidadKg) {
        this.cantidadKg = cantidadKg;
    }
}
