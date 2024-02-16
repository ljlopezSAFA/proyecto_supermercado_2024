package org.example.utilidades;

import org.example.enumerados.TipoContrato;
import org.example.enumerados.TipoEmpresa;
import org.example.modelos.Empleado;
import org.example.modelos.Empresa;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesEmpresa {


    public static List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato) {

        List<Empleado> empleados = new ArrayList<>();

        for (Empleado empleado : empresa.getEmpleados()) {

            if (empleado.getContrato().getTipoContrato().equals(tipoContrato)) {
                empleados.add(empleado);
            }
        }
        return empleados;
    }

    public static List<Empleado> getEmpleadosPorContratoStream(Empresa empresa, TipoContrato tipoContrato) {

        return empresa.getEmpleados()
                .stream()
                .filter(e -> e.getContrato().getTipoContrato().equals(tipoContrato))
                .collect(Collectors.toList());
    }


    public static List<Empleado> getMileuristasOrdenadosPorSalarioStream(Empresa empresa) {

        return empresa.getEmpleados()
                .stream()
                .filter(e -> e.getContrato().getSalario() >= 1000)
                .sorted(Comparator.comparingDouble(e -> e.getContrato().getSalario()))
                .collect(Collectors.toList())
                .reversed();
    }


    public static List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa) {

        List<Empleado> empleados = new ArrayList<>();

        for (Empleado emp : empresa.getEmpleados()) {

            if (emp.getContrato().getSalario() >= 1000) {
                empleados.add(emp);
            }

        }

        //Orden Natural
        empleados.sort(Comparator.comparing(e -> e.getContrato().getSalario()));

        //Revertir el orden
        empleados = empleados.reversed();

        return empleados;
    }


    public double fondoSalarialEmpresa(Empresa empresa) {

        Double salarioTotal = 0D;

        for (Empleado e : empresa.getEmpleados()) {
            Double salario = e.getContrato().getSalario();
            salarioTotal += salario;

        }

        return salarioTotal;

    }

    public Empleado getMejorPagado(List<Empresa> empresas) {

        //Juntar los empleados de todas las empresas en la misma lista
        List<Empleado> empleados = new ArrayList<>();

        for (Empresa e : empresas) {
            empleados.addAll(e.getEmpleados());
        }

        //ordenarlos por salario
        empleados.sort(Comparator.comparing(e -> e.getContrato().getSalario()));


        //Tomar el ultimo elemento
        Empleado empleadoMejorPagado = empleados.get(empleados.size() - 1);

        return empleadoMejorPagado;


    }


    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas) {

        List<Empleado> lista = new ArrayList<>();

        for (Empresa e : empresas) {
            if (e.getTipoEmpresa().equals(TipoEmpresa.PYME)) {
                for (Empleado empleado : e.getEmpleados()) {
                    if (empleado.getContrato().getTipoContrato().equals(TipoContrato.PRACTICAS)) {
                        lista.add(empleado);
                    }
                }
            }
        }

        return lista;
    }

    public List<Empleado> getEmpleadosPymePracticasJ8(List<Empresa> empresas) {
        return empresas
                .stream()
                .filter(e-> e.getTipoEmpresa().equals(TipoEmpresa.PYME))
                .flatMap(e-> e.getEmpleados().stream())
                .filter(emp-> emp.getContrato().getTipoContrato().equals(TipoContrato.PRACTICAS))
                .toList();
    }


    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa(List<Empresa> empresas){

        Map<Empresa, Empleado> mapaFinal = new HashMap<>();

        for(Empresa e: empresas){
            Empleado elqMasCobra = null;
            for(Empleado empleado : e.getEmpleados()){
                if(elqMasCobra == null || empleado.getContrato().getSalario() > elqMasCobra.getContrato().getSalario()){
                    elqMasCobra = empleado;
                }
                //1 -> NOOOO AQUI SACARÍA EL PRIMERO
            }
            //2->SIII
            mapaFinal.put(e,elqMasCobra);
        }
        return mapaFinal;
    }


    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresaJ8(List<Empresa> empresas){

        return empresas
                .stream()
                .collect(
                        Collectors.toMap(
                        empresa -> empresa,
                        empresa -> empresa.getEmpleados().stream().max(Comparator.comparingDouble(e-> e.getContrato().getSalario())).orElse(null)
                ));
    }



    public Map<TipoEmpresa, Integer>  getNumEmpleadosPorTipoEmpresa(List<Empresa> empresas){

        Map<TipoEmpresa, Integer> map = new HashMap<>();

        for(TipoEmpresa t : TipoEmpresa.values()){
            map.put(t, 0);
        }

        for(Empresa e: empresas){
            map.put(e.getTipoEmpresa(), map.get(e.getTipoEmpresa()) + e.getEmpleados().size());
        }

        return map;
    }

    public Map<TipoEmpresa, Integer>  getNumEmpleadosPorTipoEmpresaJ8(List<Empresa> empresas){


//        Map<TipoEmpresa, Integer> map = new HashMap<>();
//        Arrays.stream(TipoEmpresa.values()).forEach(t-> map.put(t,0));
//        empresas.forEach(e-> map.put(e.getTipoEmpresa(), map.get(e.getTipoEmpresa())+ e.getEmpleados().size()));

//        return empresas
//                .stream()
//                .collect(Collectors.toMap(
//                        Empresa::getTipoEmpresa,
//                        empresa -> empresa.getEmpleados().size()
//                ));


        return empresas
                .stream()
                .flatMap(e-> e.getEmpleados().stream())
                .collect(Collectors.groupingBy(e-> e.getEmpresa().getTipoEmpresa(), Collectors.summingInt(e-> 1)));


    }


}
