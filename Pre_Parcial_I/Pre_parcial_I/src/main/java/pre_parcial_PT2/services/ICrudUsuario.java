package pre_parcial_PT2.services;

import pre_parcial_PT2.model.Usuario;
import pre_parcial_PT2.model.Vehiculo;
import pre_parcial_PT2.model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.Collection;

public interface ICrudUsuario {

    boolean crearUsuario(String nombre, int edad, VehiculoTransporte vehiculoTransporte);
    Usuario getUsuario(String nombre);
    boolean modificarUsuario(String nombre, int edad, VehiculoTransporte vehiculoTransporte);

    boolean modificarUsuario(String nombre, int edad);

    boolean eliminarUsuario(String nombre);
    Collection<Usuario> getUsuarios();

}
