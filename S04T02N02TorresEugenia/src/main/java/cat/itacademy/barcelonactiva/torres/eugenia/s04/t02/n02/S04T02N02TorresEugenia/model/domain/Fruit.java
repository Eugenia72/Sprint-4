package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n02.S04T02N02TorresEugenia.model.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@Entity
@Table(name = "Fruit")
@JsonPropertyOrder({"id", "name", "quantityKg"})
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFruit;
    private String name;
    private double quantityKg;

    public Fruit() {
    }

    public Fruit(String name, double quantityKg) {
        this.name = name;
        this.quantityKg = quantityKg;
    }

    public int getId() {
        return idFruit;
    }

    public void setId(int idFruit) {
        this.idFruit = idFruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(double quantityKg) {
        this.quantityKg = quantityKg;
    }
}