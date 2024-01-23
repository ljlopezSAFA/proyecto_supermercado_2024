package org.example.modelos;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"cliente", "lineaFacturas"})
@ToString(exclude = {"cliente", "lineaFacturas"})
public class Factura {
    private Integer identificador;
    private String codigoFactura;
    private Double descuento;
    private Double importeBase;
    private Double iva;
    private Double totalAPagar;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private Boolean pagada;
    private List<LineaFactura> lineaFacturas;
    private Cliente cliente;
}
