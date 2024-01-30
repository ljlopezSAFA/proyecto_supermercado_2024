package org.example.modelos;

import lombok.*;
import org.example.enumerados.TipoEmpresa;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"empleados"})
@ToString(exclude = {"empleados"})
public class Empresa {
    private Integer identificador;
    private String codigoEmpresa;
    private List<Empleado> empleados;
    private TipoEmpresa tipoEmpresa;

}
