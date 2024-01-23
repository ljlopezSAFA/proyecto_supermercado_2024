package org.example.modelos;

import lombok.*;
import org.example.enumerados.TipoCliente;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Cliente {
    private Integer identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private TipoCliente tipoCliente;

}
