package org.example.utilidades;

import org.example.modelos.Factura;
import org.example.modelos.LineaFactura;

import java.time.LocalDate;

public class UtilidadesFactura {

    /**
     * EJERCICIO 4 -> A
     *
     * @param factura
     * @return
     */
    public static boolean esFacturaVencida(Factura factura){

        LocalDate fechaVencimiento = factura.getFechaVencimiento();
        LocalDate fechaActual = LocalDate.now();
        return fechaVencimiento.isAfter(fechaActual) || fechaVencimiento.equals(fechaActual);

    }

    /**
     * EJERCICIO 4 -> B
     *
     *
     * @param factura
     * @return
     */
    public static Double calcularBaseFactura(Factura factura){

        double baseFactura = 0D;

        for(LineaFactura lineaFactura : factura.getLineaFacturas()){
            Double importeProducto = lineaFactura.getProducto().getPrecio();
            Integer cantidad = lineaFactura.getCantidad();
            baseFactura += importeProducto * cantidad;
        }

        return baseFactura;
    }


    /**
     * EJERCICIO 4 -> C
     *
     *
     * @param factura
     * @return
     */
    public static Double calcularTotalAPagar(Factura factura){
        return (calcularBaseFactura(factura) - factura.getDescuento()) * factura.getIva();
    }












}
