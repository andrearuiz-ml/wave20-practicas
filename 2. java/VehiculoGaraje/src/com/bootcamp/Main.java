package com.bootcamp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        vehiculos.add(new Vehiculo("Renault", "Logan", 950));
        Garaje garaje = new Garaje(1, vehiculos);
        System.out.println("Ordenar de acuerdo al precio: ");
        garaje.getVehiculos().stream()
                .sorted(Comparator.comparingInt(Vehiculo::getPrecio))
                .forEach(System.out::println);
        System.out.println("Filtrar precios menores a 1000: ");
        garaje.getVehiculos().stream()
                .filter((x) -> x.getPrecio() <1000)
                .forEach(System.out::println);
        System.out.println("Filtrar precios mayores a 1000: ");
        garaje.getVehiculos().stream()
                .filter((x) -> x.getPrecio() >=1000)
                .forEach(System.out::println);
        System.out.println("Promedio de precios: ");
        System.out.println(Math.round(garaje.getVehiculos().stream()
                .mapToInt(x -> x.getPrecio()).average().getAsDouble()));
        System.out.println("Ordenar por marca y precio: ");
        garaje.getVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getPrecio))
                .forEach(System.out::println);
    }
}