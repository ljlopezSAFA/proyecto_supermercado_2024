package org.example.modelos;

import lombok.*;
import org.example.enumerados.TipoProducto;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"almacen"})
@ToString(exclude = {"almacen"})
public class Producto {
    private Integer identificador;
    private String codigo;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private TipoProducto tipoProducto;
    private Almacen almacen;
    private Double precio;

}
