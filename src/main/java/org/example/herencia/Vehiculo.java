package org.example.herencia;

import java.util.Objects;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String cilindrada;
    private String matricula;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo) && Objects.equals(cilindrada, vehiculo.cilindrada) && Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cilindrada, matricula);
    }

    public Vehiculo(String marca, String modelo, String cilindrada, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.matricula = matricula;
    }

    public Vehiculo(){
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
