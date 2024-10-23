package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Empleado;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Persona;

public class EmpleadoBuilder extends PersonaBuilder<EmpleadoBuilder> {


    @Override
    public Empleado build() {
        return new Empleado(nombre, apellido, cedula, edad, null);
    }

    @Override
    protected EmpleadoBuilder self() {
        return super.self();
    }

}
