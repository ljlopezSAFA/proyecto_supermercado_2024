package org.example.modelos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"producto", "factura"})
@ToString(exclude = {"producto", "factura"})
public class LineaFactura {
    private Integer identificador;
    private Factura factura;
    private Producto producto;
    private Integer cantidad;
}
