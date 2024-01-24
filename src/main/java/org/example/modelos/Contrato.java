package org.example.modelos;

import lombok.*;
import org.example.enumerados.TipoContrato;


@Getter @Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Contrato {
    private Integer identificador;
    private Double salario;
    private TipoContrato tipoContrato;

}
