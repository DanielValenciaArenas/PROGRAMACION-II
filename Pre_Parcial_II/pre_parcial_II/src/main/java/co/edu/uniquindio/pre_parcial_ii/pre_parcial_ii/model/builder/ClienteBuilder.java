package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Cliente;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Persona;

public class ClienteBuilder extends PersonaBuilder<ClienteBuilder> {


    @Override
    public Cliente build() {
        return new Cliente(nombre, apellido, cedula, edad, null);
    }

    @Override
    protected ClienteBuilder self() {
        return super.self();
    }

}
