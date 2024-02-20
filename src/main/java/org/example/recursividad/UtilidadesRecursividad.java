package org.example.recursividad;

public class UtilidadesRecursividad {



    public static Integer factorial(Integer numero){

        int numeroAnterior = numero-1;
        int resultado = numero;
        while (numeroAnterior > 0){
            resultado = resultado*numeroAnterior;
            numeroAnterior -= 1;
        }
        return resultado;

    }



    public static Long factorialRecursivo(Integer numero){

        if(numero == 1){
            return 1L;
        }else{
            return numero * factorialRecursivo(numero-1);
        }
    }



    public static void main(String[] args) {
        System.out.println(factorialRecursivo(50));


    }



}
