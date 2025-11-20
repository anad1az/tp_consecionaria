package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor

public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca; 
    private String modelo; 
    private double precio; 

 @Override
    public int compareTo(Vehiculo vehiculo2) {
        String vehiculoOriginal = this.getMarca() + ", " + this.getModelo() + ", " + this.getPrecio();
        String vehiculoParametro = vehiculo2.getMarca() + ", " + vehiculo2.getModelo() + ", " + vehiculo2.getPrecio();
        return vehiculoOriginal.compareTo(vehiculoParametro);
    }

}
 



