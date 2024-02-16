package org.example.modelos;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"empresa","contrato"}, callSuper = false)
@ToString(exclude = {"empresa","contrato"})
public class Empleado extends Persona {
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;
}
