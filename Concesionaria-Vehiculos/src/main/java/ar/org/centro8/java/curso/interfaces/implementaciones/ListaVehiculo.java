package ar.org.centro8.java.curso.interfaces.implementaciones;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;
import ar.org.centro8.java.curso.interfaces.IConcesionaria;

public class ListaVehiculo implements IConcesionaria {

    private DecimalFormat df = new DecimalFormat("$#,##0.00");

    // MÉTODO IMPRIMIR LISTA
    public void imprimirLista(ArrayList<Vehiculo> listaVehiculos) {
        listaVehiculos.forEach(System.out::println);
    }

    public void separar(){
        System.out.println("\n"+ "=============================" + "\n");
    }

    // MÉTODO BUSCAR MAS BARATO
    @Override
    public void buscarMasBarato(ArrayList<Vehiculo> listaVehiculos) {
        double minPrecio = listaVehiculos
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        listaVehiculos
                .stream()
                .filter(v -> v.getPrecio() == minPrecio)
                .forEach(v -> System.out.println("Vehículo más barato: "
                        + v.getMarca() + " " + v.getModelo()));

    }

    // MÉTODO BUSCAR MÁS CARO
    @Override
    public void buscarMasCaro(ArrayList<Vehiculo> listaVehiculos) {
        double maxPrecio = listaVehiculos
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        listaVehiculos
                .stream()
                .filter(v -> v.getPrecio() == maxPrecio)
                .forEach(v -> System.out.println("Vehículo más caro: "
                        + v.getMarca() + " " + v.getModelo()));

    }

    // MÉTODO BUSCAR POR LETRA
    @Override
    public void buscarPorLetra(ArrayList<Vehiculo> listaVehiculos, String letra) {
        listaVehiculos
                .stream()
                .filter(v -> v.getMarca().toLowerCase().contains(letra.toLowerCase()))
                .forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra '" + letra + "': "
                        + v.getMarca() + " " + v.getModelo() + " " + df.format(v.getPrecio())));

    }

    // MÉTODO BUSCAR POR ORDEN ALFABÉTICO
    @Override
    public void ordenAlfabetico(ArrayList<Vehiculo> listaVehiculos) {
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio): ");
        listaVehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparing(Comparator.comparing(Vehiculo::getModelo)
                                .thenComparing(Comparator.comparing(Vehiculo::getPrecio))))
                .forEach(System.out::println);

    }

    // MÉTODO BUSCAR PRECIO MAYOR A MENOR
    @Override
    public void ordenarPorPrecio(ArrayList<Vehiculo> listaVehiculos) {
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        listaVehiculos
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio)
                        .reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

}
