package org.example.herencia;

import java.util.Objects;

public class Coche extends Vehiculo {
    private Integer numPuertas;
    private Boolean tieneMaletero;
    private Integer numPlaza;



    public Integer getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Boolean getTieneMaletero() {
        return tieneMaletero;
    }

    public void setTieneMaletero(Boolean tieneMaletero) {
        this.tieneMaletero = tieneMaletero;
    }

    public Integer getNumPlaza() {
        return numPlaza;
    }

    public void setNumPlaza(Integer numPlaza) {
        this.numPlaza = numPlaza;
    }


    public Coche(String marca, String modelo, String cilindrada, String matricula){
        super(marca, modelo, cilindrada, matricula);

    }

    public Coche(String marca, String modelo, String cilindrada, String matricula, Integer numPuertas, Integer numPlaza, Boolean tieneMaletero ){
        super(marca, modelo, cilindrada, matricula);
        this.numPuertas = numPuertas;
        this.numPlaza = numPlaza;
        this.tieneMaletero = tieneMaletero;
    }


    public Coche( Integer numPuertas, Integer numPlaza, Boolean tieneMaletero ){
        this.numPuertas = numPuertas;
        this.numPlaza = numPlaza;
        this.tieneMaletero = tieneMaletero;
    }

    public Coche(){
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return Objects.equals(numPuertas, coche.numPuertas) && Objects.equals(tieneMaletero, coche.tieneMaletero) && Objects.equals(numPlaza, coche.numPlaza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPuertas, tieneMaletero, numPlaza);
    }

    @Override
    public String toString() {
        return
                "Coche{" +
                        "Marca = " + super.getMarca() +
                ", numPuertas=" + numPuertas +
                ", tieneMaletero=" + tieneMaletero +
                ", numPlaza=" + numPlaza +
                '}';
    }
}
