package org.example.interfaces;

public class Pago {

    private Double importe;
    private MetodoPado metodoPado;

    public Pago(){

    }

    public Pago(Double importe, MetodoPado metodoPado){
        this.importe = importe;
        this.metodoPado = metodoPado;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public MetodoPado getMetodoPado() {
        return metodoPado;
    }

    public void setMetodoPado(MetodoPado metodoPado) {
        this.metodoPado = metodoPado;
    }
}
