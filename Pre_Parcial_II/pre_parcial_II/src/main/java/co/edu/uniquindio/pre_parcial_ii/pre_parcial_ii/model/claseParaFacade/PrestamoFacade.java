package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.claseParaFacade;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.*;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.implementacionBridgePrestamo.ILogicaPrestamo;

import java.time.LocalDate;
import java.util.Collection;

public class PrestamoFacade {

    // Aquí puedes tener referencias a los subsistemas
    private Collection<Cliente> clientes;
    private Collection<Empleado> empleados;
    private Collection<Objeto> objetos;

    public PrestamoFacade(Collection<Cliente> clientes, Collection<Empleado> empleados, Collection<Objeto> objetos) {
        this.clientes = clientes;
        this.empleados = empleados;
        this.objetos = objetos;
    }

    public Prestamo realizarPrestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente cliente, Empleado empleado, Collection<Objeto> objetosAsociados, ILogicaPrestamo logicaPrestamo) {
        // Lógica para realizar un préstamo
        Prestamo prestamo = new PrestamoLocal(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, cliente, empleado, null, logicaPrestamo);
        // Aqui se puede agregar lógica adicional, como verificar la disponibilidad de objetos
        for (Objeto objeto : objetosAsociados) {
            objeto.prestar(); // Llama al método de prestar en cada objeto
        }
        return prestamo;
    }

    public void devolverPrestamo(Prestamo prestamo) {
        // Lógica para devolver un préstamo
        System.out.println("Devolviendo el préstamo: " + prestamo.getNumeroPrestamo());
        // Aquí puedes agregar lógica adicional para actualizar el estado del préstamo
    }

    public void consultarPrestamos() {
        // Lógica para consultar préstamos
        System.out.println("Consultando préstamos...");
        // Aquí puedes agregar lógica para mostrar los préstamos activos
    }
}