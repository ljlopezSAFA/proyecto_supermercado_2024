package org.example.faker;

import com.github.javafaker.Faker;
import org.example.enumerados.TipoContrato;
import org.example.enumerados.TipoEmpresa;
import org.example.modelos.Contrato;
import org.example.modelos.Empleado;
import org.example.modelos.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GeneraDatosPrueba {


    private static final Faker faker = new Faker(new Locale("es"));




    public static Contrato  generaContrato(){

        Contrato contrato = new Contrato();
        contrato.setIdentificador(faker.number().numberBetween(1,999));
        contrato.setSalario(faker.number().randomDouble(2,900,2500));
        contrato.setTipoContrato(TipoContrato.values()[faker.number().numberBetween(0,TipoContrato.values().length)]);

        return contrato;

    }

    public static Contrato  generaContrato(TipoContrato tipoContrato){

        Contrato contrato = new Contrato();
        contrato.setIdentificador(faker.number().numberBetween(1,999));
        contrato.setSalario(faker.number().randomDouble(2,900,2500));
        contrato.setTipoContrato(tipoContrato);

        return contrato;

    }


    public static List<Contrato> generaContratos(int numContratos){

        List<Contrato> contratos = new ArrayList<>();

        for(int i = 0 ; i <numContratos; i++) {
            Contrato contrato = generaContrato();
            contratos.add(contrato);
        }

        return contratos;

    }



    public static Empleado generaEmpleado(){

        Empleado empleado = new Empleado();
        empleado.setIdentificador(faker.number().numberBetween(1,999));
        empleado.setNombre(faker.name().firstName());
        empleado.setApellidos(faker.name().lastName());
        empleado.setDireccion(faker.address().fullAddress());
        empleado.setDni(faker.idNumber().valid());
        empleado.setContrato(generaContrato());
        empleado.setNumTelefono(faker.phoneNumber().cellPhone());
        return empleado;

    }



    public static List<Empleado> generaEmpleador(int numEmpleados, Empresa empresa){

        List<Empleado> empleados = new ArrayList<>();

        for(int i = 0 ; i <numEmpleados; i++) {
            Empleado empleado = generaEmpleado();
            empleado.setEmpresa(empresa);
            empleados.add(empleado);
        }

        return empleados;

    }

    public static Empresa generaEmppresa(int numEmpleados){

        Empresa empresa = new Empresa();
        empresa.setIdentificador(faker.number().numberBetween(1,999));
        empresa.setCodigoEmpresa(faker.company().name());
        empresa.setTipoEmpresa(TipoEmpresa.values()[faker.number().numberBetween(0, TipoEmpresa.values().length)]);
        empresa.setEmpleados(generaEmpleador(numEmpleados,empresa));
        return empresa;

    }






}
