package org.example.utilidades;

import org.example.enumerados.TipoContrato;
import org.example.modelos.Empleado;
import org.example.modelos.Empresa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UtilidadesEmpresa {


    public static List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){

        List<Empleado> empleados = new ArrayList<>();

        for(Empleado empleado: empresa.getEmpleados()){

            if(empleado.getContrato().getTipoContrato().equals(tipoContrato)){
                empleados.add(empleado);
            }
        }
        return empleados;
    }

    public static List<Empleado> getEmpleadosPorContratoStream(Empresa empresa, TipoContrato tipoContrato){

        return empresa.getEmpleados()
                .stream()
                .filter(e -> e.getContrato().getTipoContrato().equals(tipoContrato))
                .collect(Collectors.toList());
    }


    public static List<Empleado> getMileuristasOrdenadosPorSalarioStream(Empresa empresa){

        return empresa.getEmpleados()
                .stream()
                .filter(e-> e.getContrato().getSalario() >= 1000)
                .sorted(Comparator.comparingDouble(e->  e.getContrato().getSalario()))
                .collect(Collectors.toList())
                .reversed();
    }



    public static List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa){

        List<Empleado> empleados = new ArrayList<>();

        for(Empleado emp : empresa.getEmpleados()){

            if(emp.getContrato().getSalario() >= 1000){
                empleados.add(emp);
            }

        }

        //Orden Natural
        empleados.sort( Comparator.comparing(e->e.getContrato().getSalario()));

        //Revertir el orden
        empleados = empleados.reversed();

        return empleados;
    }


    public double fondoSalarialEmpresa(Empresa empresa){

        Double salarioTotal = 0D;

        for(Empleado e : empresa.getEmpleados()){
            Double salario = e.getContrato().getSalario();
            salarioTotal += salario;

        }

        return salarioTotal;

    }

    public Empleado getMejorPagado(List<Empresa> empresas){

        //Juntar los empleados de todas las empresas en la misma lista
        List<Empleado> empleados = new ArrayList<>();

        for(Empresa e: empresas){
            empleados.addAll(e.getEmpleados());
        }

        //ordenarlos por salario
        empleados.sort(Comparator.comparing(e-> e.getContrato().getSalario()));


        //Tomar el ultimo elemento
        Empleado empleadoMejorPagado = empleados.get(empleados.size()-1);

        return empleadoMejorPagado;



    }


    public Integer sumaSiEsParStream(List<Integer> numeros){

        return numeros.stream().filter(n-> n % 2 == 0).mapToInt(Integer::intValue).sum();

    }


    public List<Integer> elevaCuadrado(List<Integer> numeros){

        return numeros.stream().map(n-> n^2).toList();

    }


    public Integer sumaSiEsPar(List<Integer> numeros){

        Integer suma = 0;

        for(Integer num : numeros){
            if(num % 2 == 0 ){
                suma+= num;
            }
        }

        return suma;


    }






}
