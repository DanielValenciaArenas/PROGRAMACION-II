package pre_parcial_PT2.services;

import pre_parcial_PT2.model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.Collection;

public interface ICrudVehiculoTransporte {

    boolean crearVehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros);
    VehiculoTransporte getVehiculoTransporte(String placa);
    boolean modificarVehiculoTransporte(String placa, String nuevoModelo, String nuevaMarca, String nuevoColor, int nuevoMaxPasajeros);
    boolean eliminarVehiculoTransporte(String placa);
    Collection<VehiculoTransporte> getVehiculosTransporte();

}
