package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder.ClienteBuilder;

import java.util.Collection;

public class Cliente extends Persona {

    private Collection<Prestamo> listaPrestamosAsociados;

    public Cliente(String nombre, String apellido, String cedula, String edad, Collection<Prestamo> listaPrestamosAsociados) {
        super(nombre, apellido, cedula, edad);
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

    public Collection<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public void setListaPrestamosAsociados(Collection<Prestamo> listaPrestamosAsociados) {
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }
}
