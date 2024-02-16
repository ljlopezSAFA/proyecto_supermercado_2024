package org.example.modelos;

public class MaterialOficina {

    private String tipo;
    private Boolean esParaEscribir;
    private Double precio;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEsParaEscribir() {
        return esParaEscribir;
    }

    public void setEsParaEscribir(Boolean esParaEscribir) {
        this.esParaEscribir = esParaEscribir;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


}
