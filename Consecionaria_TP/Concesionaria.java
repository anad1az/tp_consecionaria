package ar.org.centro8.java.curso.entidades.relaciones;

import java.text.DecimalFormat;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Moto extends Vehiculo {
    private String cilindrada;

    // constructor
    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    private DecimalFormat df = new DecimalFormat("$#,##0.00");

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + cilindrada + " // Precio: "
                + df.format(getPrecio());
    }


}



    

