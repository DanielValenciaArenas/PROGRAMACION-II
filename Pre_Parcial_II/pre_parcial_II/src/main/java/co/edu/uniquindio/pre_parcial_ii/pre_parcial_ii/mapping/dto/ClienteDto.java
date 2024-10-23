package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.mapping.dto;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Persona;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Prestamo;

import java.util.Collection;

public record ClienteDto(
        Persona persona,
        Collection<Prestamo> listaPrestamosAsociados
) {
}
