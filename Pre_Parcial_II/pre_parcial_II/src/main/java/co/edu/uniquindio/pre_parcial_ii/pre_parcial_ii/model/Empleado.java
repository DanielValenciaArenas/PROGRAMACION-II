package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder.EmpleadoBuilder;

import java.util.Collection;

public class Empleado extends Persona{

    private Collection<Prestamo> listaPrestamosAsociados;

    public Empleado(String nombre, String apellido, String cedula, String edad, Collection<Prestamo> listaPrestamosAsociados) {
        super(nombre, apellido, cedula, edad);
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }

    public static EmpleadoBuilder builder() {
        return new EmpleadoBuilder();
    }

    public Collection<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public void setListaPrestamosAsociados(Collection<Prestamo> listaPrestamosAsociados) {
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }
}
