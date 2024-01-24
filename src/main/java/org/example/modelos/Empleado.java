package org.example.modelos;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"empresa","contrato"})
@ToString(exclude = {"empresa","contrato"})
public class Empleado {
    private Integer identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;
}
