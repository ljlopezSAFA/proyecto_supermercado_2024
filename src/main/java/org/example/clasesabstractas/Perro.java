package org.example.clasesabstractas;

public class Perro extends Animal{

    private String raza;
    private Boolean domestico;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public void hacerSonido() {

    }
}
