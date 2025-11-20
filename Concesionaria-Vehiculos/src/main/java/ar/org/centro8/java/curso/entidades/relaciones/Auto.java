package ar.org.centro8.java.curso.entidades.relaciones;

import java.text.DecimalFormat;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Auto extends Vehiculo {
    private String puertas;

    // constructor
    public Auto(String marca, String modelo, String puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    private DecimalFormat df = new DecimalFormat("$#,##0.00");

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + puertas + " // Precio: "
                + df.format(getPrecio());
    }
}

