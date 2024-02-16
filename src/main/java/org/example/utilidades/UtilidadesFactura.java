package org.example.utilidades;

import org.example.modelos.Cliente;
import org.example.modelos.Factura;
import org.example.modelos.LineaFactura;

import java.time.LocalDate;
import java.util.List;

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





    public static Double gastoTotalCliente(List<Factura> facturas, Cliente cliente){

        Double importe = 0.0;

        for(Factura f : facturas){
            if(f.getCliente().equals(cliente)){
                importe += f.getTotalAPagar();
            }
        }

        return importe;

    }


    public static Double gastoTotalClienteJ8(List<Factura> facturas, Cliente cliente){

        return facturas
                .stream()
                .filter(f-> f.getCliente().equals(cliente))
                .mapToDouble(Factura::getTotalAPagar).sum();


    }


    public static Double totalFacturadoPeriodo(List<Factura> facturas, LocalDate fechaInicio, LocalDate fechaFin){

        Double importe = 0.0;

        for(Factura f : facturas){

            if( (f.getFechaEmision().isAfter(fechaInicio) || f.getFechaEmision().equals(fechaInicio))  &&
                    (f.getFechaEmision().isBefore(fechaFin) || f.getFechaEmision().equals(fechaFin))
            ){
                importe += f.getTotalAPagar();
            }
        }

        return importe;

    }

    public static Double totalFacturadoPeriodoj8(List<Factura> facturas, LocalDate fechaInicio, LocalDate fechaFin){


        return facturas
                .stream()
                .filter(f-> (f.getFechaEmision().isAfter(fechaInicio) || f.getFechaEmision().equals(fechaInicio))  &&
                (f.getFechaEmision().isBefore(fechaFin) || f.getFechaEmision().equals(fechaFin)))
                .mapToDouble(Factura::getTotalAPagar)
                .sum();

    }









}
