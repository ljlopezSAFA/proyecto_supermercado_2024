package org.example.interfaces;

import org.example.herencia.Cuadrado;
import org.example.herencia.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class PruebaInterfaces {

    public static void main(String[] args) {


        Triangulo triangulo = new Triangulo();
        triangulo.setB(10.0);
        triangulo.setH(5.0);

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLongLado(4.0);


        FiguraGeometrica figura1 =triangulo;
        FiguraGeometrica figura2 =  cuadrado;

        System.out.println(figura1.calcularArea());
        System.out.println(figura2.calcularArea());


        List<Pago> pagosBancaria = new ArrayList<>();


        pagosBancaria.add(new Pago(15.0, new Bizum()));
        pagosBancaria.add(new Pago(150.0, new Transferencia()));
        pagosBancaria.add(new Pago(25.0, new Tarjeta()));


        for (Pago pago : pagosBancaria){
            pago.getMetodoPado().procesarPago(pago.getImporte());
        }





    }






}
