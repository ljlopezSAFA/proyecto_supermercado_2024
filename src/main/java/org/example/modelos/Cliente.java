package org.example.modelos;

import lombok.*;
import org.example.enumerados.TipoCliente;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Cliente extends Persona {
    private TipoCliente tipoCliente;

}
