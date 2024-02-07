package org.example.interfaces;

public class Transferencia implements MetodoPado{

    @Override
    public void procesarPago(Double importe) {
        System.out.println("Se ha pasado a tu cuenta bancaria el siguiente importe:"  + importe);

    }
}
