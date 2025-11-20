package ar.org.centro8.java.curso.interfaces;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;

public interface IConcesionaria {
    public abstract void buscarMasCaro(ArrayList<Vehiculo> listaVehiculos); 
    public abstract void buscarMasBarato(ArrayList<Vehiculo> listaVehiculos); 
    public abstract void buscarPorLetra(ArrayList<Vehiculo> listaVehiculos, String letra);
    public abstract void ordenarPorPrecio(ArrayList<Vehiculo> listaVehiculos); 
    public abstract void ordenAlfabetico(ArrayList<Vehiculo> listaVehiculos); 

}

