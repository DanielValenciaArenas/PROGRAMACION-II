package pre_parcial_PT2.model;

import pre_parcial_PT2.model.builder.VehiculoTransporteBuilder;

import java.util.Collection;

public class VehiculoTransporte extends Vehiculo {

    private int maxPasajeros;
    private Collection<Usuario> listaUsuariosAsociados;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, Collection<Propietario> listaPropietariosAsociados, int maxPasajeros,
                              Collection<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados);
        this.maxPasajeros = maxPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public static VehiculoTransporteBuilder builder(){
        return new VehiculoTransporteBuilder();
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public Collection<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(Collection<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public void agregarUsuario(Usuario usuario) {
        this.listaUsuariosAsociados.add(usuario);
    }


}
