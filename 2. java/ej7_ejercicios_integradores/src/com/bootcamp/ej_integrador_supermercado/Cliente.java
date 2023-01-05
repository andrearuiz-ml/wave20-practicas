package com.bootcamp.ej_integrador_supermercado;

public class Cliente {

    private String dni, nombre, apellido;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apelllido){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apelllido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}