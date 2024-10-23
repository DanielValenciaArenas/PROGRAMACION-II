package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.mapping.dto;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Prestamo;

public record ObjetoDto(
        String nombre,
        Prestamo prestamoAsociado
) {
}
