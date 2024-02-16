package org.example.modelos;


import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Persona {
    private Integer identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
}
