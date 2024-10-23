package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder;


import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Persona;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Prestamo;

import java.time.LocalDate;

public abstract class PrestamoBuilder <T extends PrestamoBuilder<T>>{

    protected String numeroPrestamo;
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaEntrega;
    protected String descripcion;

    public T numeroPrestamo(String numeroPrestamo){
        this.numeroPrestamo= numeroPrestamo;
        return self();
    }

    public T fechaPrestamo(LocalDate fechaPrestamo){
        this.fechaPrestamo= fechaPrestamo;
        return self();
    }

    public T fechaEntrega(LocalDate fechaEntrega){
        this.fechaEntrega= fechaEntrega;
        return self();
    }

    public T descripcion(String descripcion){
        this.descripcion= descripcion;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Prestamo build();



}
