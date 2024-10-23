package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.implementacionBridgePrestamo.ILogicaPrestamo;

import java.time.LocalDate;
import java.util.Collection;

public class PrestamoLocal extends Prestamo {


    public PrestamoLocal(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado, Collection<Objeto> listaObjetosAsociados, ILogicaPrestamo logicaPrestamo) {
        super(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, clienteAsociado, empleadoAsociado, listaObjetosAsociados, logicaPrestamo);
    }

    @Override
    public void entregar() {
        System.out.println("Entregando un préstamo local.");
        logicaPrestamo.procesarEntrega(); // Implementacion Concreta
    }

    @Override
    public void definirVencimiento() {
        System.out.println("Definiendo vencimiento para un préstamo local.");
        logicaPrestamo.calcularVencimiento(); // Implementación concreta
    }
}
