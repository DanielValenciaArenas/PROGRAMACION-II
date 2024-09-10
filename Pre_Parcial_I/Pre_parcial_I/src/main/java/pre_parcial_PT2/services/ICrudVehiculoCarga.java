package pre_parcial_PT2.services;

import pre_parcial_PT2.model.VehiculoCarga;

import java.util.ArrayList;
import java.util.Collection;

public interface ICrudVehiculoCarga {

    boolean crearVehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes);
    VehiculoCarga getVehiculoCarga(String placa);
    boolean modificarVehiculoCarga(String placa, String nuevoModelo, String nuevaMarca, String nuevoColor, double nuevaCapacidadCarga, int nuevoNumeroEjes);
    boolean eliminarVehiculoCarga(String placa);
    Collection<VehiculoCarga> getVehiculosCarga();

}
