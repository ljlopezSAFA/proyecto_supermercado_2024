package org.example.utilidades;

import org.example.enumerados.TipoProducto;
import org.example.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {


    public static List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){

        List<Producto> productosConTipo = new ArrayList<>();


        for(Producto producto : productos){
            if(producto.getTipoProducto().equals(tipo)){
                productosConTipo.add(producto);
            }
        }

        return productosConTipo;


    }

}
