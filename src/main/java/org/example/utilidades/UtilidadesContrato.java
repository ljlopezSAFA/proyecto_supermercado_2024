package org.example.utilidades;

import org.example.enumerados.TipoContrato;
import org.example.modelos.Contrato;
import org.example.modelos.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesContrato {


    public static Map<TipoContrato, Double> getSalarioMedioTipoContrato(List<Contrato> contratos){


        Map<TipoContrato, Double> mediaContratoTIpo = new HashMap<>();

        for(TipoContrato tipoContrato : TipoContrato.values()){

            Double salarioTotal = 0.0;
            List<Contrato>  contratosTipo = new ArrayList<>();

            for(Contrato c : contratos){
                if(c.getTipoContrato().equals(tipoContrato)){
                    contratosTipo.add(c);
                    salarioTotal += c.getSalario();
                }
            }

            mediaContratoTIpo.put(tipoContrato, salarioTotal/ contratosTipo.size());
        }
        return mediaContratoTIpo;
    }


    public static Map<TipoContrato, Double> getSalarioMedioTipoContrato8(List<Contrato> contratos){

        //Map<TipoContrato, List<Contrato>>
        Map<TipoContrato, List<Contrato>> mapa = contratos.stream().collect(Collectors.groupingBy(Contrato::getTipoContrato));

        //Crear mapa donde vamos a obtener los resultados finales
        Map<TipoContrato, Double> mapaFinal = new HashMap<>();

        //A partir del primer mapa relleno el segundo
        mapa.keySet().forEach(c-> mapaFinal.put(c, mapa.get(c).stream().mapToDouble(Contrato::getSalario).average().orElse(0.0)) );

        return mapaFinal;

    }

    public static Map<TipoContrato, Double> getSalarioMedioTipoContrato8VR(List<Contrato> contratos){
        return contratos
                .stream()
                .collect(Collectors.groupingBy(Contrato::getTipoContrato, Collectors.averagingDouble(Contrato::getSalario)));
    }



    public Map<TipoContrato, Integer> getNumContratosPorTipo(List<Contrato> contratos){

        Map<TipoContrato, Integer> mapa = new HashMap<>();

        for(Contrato c: contratos){
            if(mapa.containsKey(c.getTipoContrato())){
                mapa.put(c.getTipoContrato(), mapa.get(c.getTipoContrato()) + 1);
            }else{
                mapa.put(c.getTipoContrato(), 1);
            }
        }
        return mapa;
    }


    public Map<TipoContrato, Integer> getNumContratosPorTipo8(List<Contrato> contratos){

        //Map<TipoContrato, List<Contrato>>
        Map<TipoContrato, List<Contrato>> mapa = contratos.stream().collect(Collectors.groupingBy(Contrato::getTipoContrato));

        //Crear mapa donde vamos a obtener los resultados finales
        Map<TipoContrato, Integer> mapaFinal = new HashMap<>();

        //A partir del primer mapa relleno el segundo
        mapa.keySet().forEach(c-> mapaFinal.put(c, mapa.get(c).size()));

        return mapaFinal;
    }

    public Map<TipoContrato, Integer> getNumContratosPorTipo8VR(List<Contrato> contratos){
        return contratos
                .stream()
                .collect(Collectors.groupingBy(Contrato::getTipoContrato, Collectors.summingInt(c-> 1)));
    }


    public Map<TipoContrato, List<Contrato>> getListContratosPorTipo(List<Contrato> contratos){
        Map<TipoContrato, List<Contrato>> mapa = new HashMap<>();

        for(Contrato c: contratos){

            if(mapa.containsKey(c.getTipoContrato())){
                List<Contrato> lista = mapa.get(c);
                lista.add(c);
                mapa.put(c.getTipoContrato(), lista);
            }else{
                mapa.put(c.getTipoContrato(), new ArrayList<>(List.of(c)));
            }
        }

        return mapa;

    }

    public Map<TipoContrato, List<Contrato>> getListContratosPorTipo8(List<Contrato> contratos){
        return contratos.stream().collect(Collectors.groupingBy(Contrato::getTipoContrato));
    }



    public Map<String, List<Empleado>> getEmpleadosPorLetraDNI(List<Empleado> empleados){

        Map<String, List<Empleado>> mapa = new HashMap<>();

        for(Empleado e: empleados){
            String letra = e.getDni().substring(8);

            if(mapa.containsKey(letra)){
                List<Empleado> lista = mapa.get(letra);
                lista.add(e);
                mapa.put(letra, lista);
            }else{
                mapa.put(letra, new ArrayList<>(List.of(e)));
            }
        }
        return mapa;
    }

    public Map<String, List<Empleado>> getEmpleadosPorLetraDNI8(List<Empleado> empleados){
        return empleados
                .stream()
                .collect(Collectors.groupingBy(e-> e.getDni().substring(8)));
    }






}
