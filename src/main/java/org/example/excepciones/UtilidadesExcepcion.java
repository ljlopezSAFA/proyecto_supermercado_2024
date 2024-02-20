package org.example.excepciones;

import org.example.modelos.Empleado;

public class UtilidadesExcepcion {


    public static void forzarNullPointef(Empleado empleado){
        try {
            System.out.println(empleado.getEmpresa().getCodigoEmpresa());
            System.out.println(empleado.getEmpresa().getCodigoEmpresa());
            System.out.println(empleado.getEmpresa().getCodigoEmpresa());
        }catch (Exception e){
            System.out.println("No tiene empresa");
        }


    }


    public static void main(String[] args) {


        Empleado emp1 = new Empleado();

        forzarNullPointef(emp1);


    }


}
