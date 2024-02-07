package org.example.herencia;

import org.example.interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica {

    private Integer numDiagonales;
    private Double longLado;


    public Double getLongLado() {
        return longLado;
    }

    public void setLongLado(Double longLado) {
        this.longLado = longLado;
    }

    public Integer getNumDiagonales() {
        return numDiagonales;
    }

    public void setNumDiagonales(Integer numDiagonales) {
        this.numDiagonales = numDiagonales;
    }

    @Override
    public Double calcularArea() {
        return longLado*longLado;
    }

    @Override
    public Double calcularPerimetro() {
        return null;
    }
}
