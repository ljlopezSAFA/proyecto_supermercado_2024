package org.example.utilidades;

import org.example.modelos.Cliente;

public class UtilidadesCliente {


    public static boolean esDniValido(Cliente cliente){

        String dni =  cliente.getDni();

        //12345678H

        if(cliente.getDni() == null){
            return false;
        }

        //TAMAÑO
        boolean tamanyovalido = dni.length() == 9;


        //PARTE NUMÉRICA
        String parteNumerica = dni.substring(0,8);
        boolean sonNumeros = parteNumerica.matches("\\d+");

        //PARTE LETRA
        String letra = dni.substring(8);
        boolean esLetra = letra.matches("[A-Z a-z]");

        return tamanyovalido && sonNumeros && esLetra;

    }


}
