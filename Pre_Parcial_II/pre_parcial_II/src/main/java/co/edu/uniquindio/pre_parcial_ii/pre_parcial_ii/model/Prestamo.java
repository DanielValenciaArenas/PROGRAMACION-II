package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.implementacionBridgePrestamo.ILogicaPrestamo;

import java.time.LocalDate;
import java.util.Collection;

public abstract class Prestamo {

    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String descripcion;
    private Cliente clienteAsociado;
    private Empleado empleadoAsociado;
    private Collection<Objeto> listaObjetosAsociados;

    // Referencia a la implementación (Bridge)
    protected ILogicaPrestamo logicaPrestamo;

    public Prestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion,
                    Cliente clienteAsociado, Empleado empleadoAsociado, Collection<Objeto> listaObjetosAsociados, ILogicaPrestamo logicaPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = clienteAsociado;
        this.empleadoAsociado = empleadoAsociado;
        this.listaObjetosAsociados = listaObjetosAsociados;
        this.logicaPrestamo = logicaPrestamo;
    }


    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public Collection<Objeto> getListaObjetosAsociados() {
        return listaObjetosAsociados;
    }

    public void setListaObjetosAsociados(Collection<Objeto> listaObjetosAsociados) {
        this.listaObjetosAsociados = listaObjetosAsociados;
    }

    public ILogicaPrestamo getLogicaPrestamo() {
        return logicaPrestamo;
    }

    public void setLogicaPrestamo(ILogicaPrestamo logicaPrestamo) {
        this.logicaPrestamo = logicaPrestamo;
    }



    // Métodos abstractos de PRESTAMO

    public abstract void entregar();
    public abstract void definirVencimiento();


}
