package pre_parcial_PT2.services;

import pre_parcial_PT2.model.Propietario;
import pre_parcial_PT2.model.Vehiculo;

import java.util.ArrayList;
import java.util.Collection;

public interface ICrudPropietario {

    boolean crearPropietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculoAsociado);
    Propietario getPropietario(String nombre, String cedula);
    boolean modificarPropietario(String nombre, String cedula, String nuevoEmail, String nuevoCelular);
    boolean eliminarPropietario(String cedula);
    Collection<Propietario> getPropietarios();

}
