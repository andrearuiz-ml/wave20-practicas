package com.example.sintomas.entities;

import com.example.sintomas.enums.NivelGravedadEnum;

public class Sintoma {
    private int codigo;
    private String nombre;
    private NivelGravedadEnum nivel_de_gravedad;

    public Sintoma(int codigo, String nombre, NivelGravedadEnum nivel_de_gravedad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nivel_de_gravedad = nivel_de_gravedad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NivelGravedadEnum getNivel_de_gravedad() {
        return nivel_de_gravedad;
    }

    public void setNivel_de_gravedad(NivelGravedadEnum nivel_de_gravedad) {
        this.nivel_de_gravedad = nivel_de_gravedad;
    }
}
