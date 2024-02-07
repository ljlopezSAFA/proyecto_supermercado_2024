package org.example.interfaces;

public class Bizum implements MetodoPado{


    @Override
    public void procesarPago(Double importe) {
        System.out.println("Se ha pasado a tu cuenta Bizum el siguiente importe: " + importe);
    }
}
