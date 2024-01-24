package org.example.utilidades;

import org.example.enumerados.TipoContrato;
import org.example.modelos.Contrato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


}
