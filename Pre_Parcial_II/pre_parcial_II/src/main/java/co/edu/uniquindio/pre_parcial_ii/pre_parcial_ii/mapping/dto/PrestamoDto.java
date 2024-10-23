package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.mapping.dto;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Cliente;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Empleado;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Objeto;

import java.util.Collection;
import java.util.Date;

public record PrestamoDto(
        String numeroPrestamo,
        Date fechaPrestamo,
        Date fechaEntrega,
        String descripcion,
        Cliente clienteAsociado,
        Empleado empleadoAsociado,
        Collection<Objeto>listaObjetosAsociados
) {
}
