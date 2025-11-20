package ar.org.centro8.java.curso.test;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.Auto;
import ar.org.centro8.java.curso.entidades.relaciones.Moto;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;
import ar.org.centro8.java.curso.interfaces.implementaciones.ListaVehiculo;

public class TestConcesionaria{
    public static void main(String[] args) {
    Auto auto1 = new Auto("Peugeot", "206", "4", 200000);
    Moto moto1 = new Moto("Honda", "Titan", "125c", 60000);
    Auto auto2 = new Auto("Peugeot", "208", "5", 250000);
    Moto moto2 = new Moto("Yamaha", "YBR", "160c", 80500.50);
    
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    // Agregar objetos a la lista
    listaVehiculos.add(auto1);
    listaVehiculos.add(moto1);
    listaVehiculos.add(auto2);
    listaVehiculos.add(moto2);

    ListaVehiculo concesionaria = new ListaVehiculo();

    //Imprimir lista
    concesionaria.imprimirLista(listaVehiculos);
    concesionaria.separar();

    //Imprimir 
    concesionaria.buscarMasCaro(listaVehiculos);
    concesionaria.buscarMasBarato(listaVehiculos);
    concesionaria.buscarPorLetra(listaVehiculos, "Y");
    concesionaria.separar();

    //Imprimir vehículos por precio mayor a menor
    concesionaria.ordenarPorPrecio(listaVehiculos);
    concesionaria.separar();

    //Imprimir vehículos por orden natural 
    concesionaria.ordenAlfabetico(listaVehiculos);
    }


}
