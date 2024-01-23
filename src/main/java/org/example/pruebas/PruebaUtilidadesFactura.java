package org.example.pruebas;

import org.example.enumerados.TipoProducto;
import org.example.modelos.Almacen;
import org.example.modelos.Factura;
import org.example.modelos.LineaFactura;
import org.example.modelos.Producto;
import org.example.utilidades.UtilidadesFactura;
import org.example.utilidades.UtilidadesProducto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PruebaUtilidadesFactura {

    public static void main(String[] args) {


        Factura factura = new Factura(1, "F01", 1.8, 0D, 1.1, 0D, LocalDate.now(), LocalDate.now().plusDays(15),true, new ArrayList<>(),null);


        Almacen almacen1 = new Almacen(1, "Almacen Supermercado SAFA", 100);


        Producto producto1 = new Producto(1, "PR1", "COCA COLA ZERO 1L", LocalDate.now(), TipoProducto.BEBIDA, almacen1, 1.5);
        Producto producto2 = new Producto(2, "PR2", "LEJIA 5L", LocalDate.now(), TipoProducto.DROGUERIA, almacen1, 0.9);
        Producto producto3 = new Producto(1, "PR3", "FANTA NARANJA 1L", LocalDate.now(), TipoProducto.BEBIDA, almacen1, 1.5);



        LineaFactura linea1 = new LineaFactura(1, factura, producto1, 10);
        LineaFactura linea2 = new LineaFactura(1, factura, producto2, 2);

        factura.setLineaFacturas(List.of(linea1, linea2));


//        System.out.println(UtilidadesFactura.esFacturaVencida(factura));
//        System.out.println("El importe base de la factura es :" + UtilidadesFactura.calcularBaseFactura(factura));
//        System.out.println("El importe total de la factura :" + UtilidadesFactura.calcularTotalAPagar(factura));


        List<Producto> listaProductos = List.of(producto1, producto2, producto3);

        List<Producto> listaPrueba = UtilidadesProducto.getPorTipo(listaProductos,TipoProducto.ALIMENTACION);


        for(Producto p : listaPrueba){
            System.out.println(p.getDescripcion());
        }





    }
}
