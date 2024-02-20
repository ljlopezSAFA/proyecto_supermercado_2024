package org.example.clasesabstractas;

public abstract class Animal {

    private String nombre;
    private String especie;
    private String tipo;
    private Boolean puedeVivirBajoElAgua;


    public abstract void hacerSonido();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPuedeVivirBajoElAgua() {
        return puedeVivirBajoElAgua;
    }

    public void setPuedeVivirBajoElAgua(boolean puedeVivirBajoElAgua) {
        this.puedeVivirBajoElAgua = puedeVivirBajoElAgua;
    }
}
