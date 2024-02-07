package org.example.interfaces;

public class Tarjeta implements  MetodoPado{
    @Override
    public void procesarPago(Double importe) {
        System.out.println("Se ha pagado con tu tarje VISA el siguiente importe" + importe);

    }
}
