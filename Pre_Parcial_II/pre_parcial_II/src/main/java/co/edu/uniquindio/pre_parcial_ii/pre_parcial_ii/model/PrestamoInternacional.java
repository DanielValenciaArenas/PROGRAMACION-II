package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.implementacionBridgePrestamo.ILogicaPrestamo;

import java.time.LocalDate;
import java.util.Collection;

public class PrestamoInternacional extends Prestamo {


    public PrestamoInternacional(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, Collection<Objeto> listaObjetosAsociados, ILogicaPrestamo logicaPrestamo) {
        super(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado, listaObjetosAsociados, logicaPrestamo);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando préstamo internacional.");
        logicaPrestamo.procesarEntrega(); // Implementación concreta
    }

    @Override
    public void definirVencimiento() {
        System.out.println("Definiendo vencimiento para un préstamo internacional.");
        logicaPrestamo.calcularVencimiento(); // Implementación concreta
    }
}
