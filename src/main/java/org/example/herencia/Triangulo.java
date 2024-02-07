package org.example.herencia;

import org.example.interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {

    private Integer numLadosIguales;
    private Double b;
    private Double h;


    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Integer getNumLadosIguales() {
        return numLadosIguales;
    }

    public void setNumLadosIguales(Integer numLadosIguales) {
        this.numLadosIguales = numLadosIguales;
    }

    @Override
    public Double calcularArea() {
        return b*h /2;
    }

    @Override
    public Double calcularPerimetro() {
        return null;
    }
}
