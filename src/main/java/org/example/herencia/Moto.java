package org.example.herencia;


import java.util.Objects;

public class Moto extends Vehiculo {
    private Boolean tieneCajetin;
    private Integer numRuedas;

    public Boolean getTieneCajetin() {
        return tieneCajetin;
    }

    public void setTieneCajetin(Boolean tieneCajetin) {
        this.tieneCajetin = tieneCajetin;
    }

    public Integer getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(Integer numRuedas) {
        this.numRuedas = numRuedas;
    }

    public Moto(String marca, String modelo, String cilindrada, String matricula){
        super(marca, modelo, cilindrada, matricula);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(tieneCajetin, moto.tieneCajetin) && Objects.equals(numRuedas, moto.numRuedas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieneCajetin, numRuedas);
    }


    @Override
    public String toString() {
        return "Moto{" +
                "tieneCajetin=" + tieneCajetin +
                ", numRuedas=" + numRuedas +
                '}';
    }
}
