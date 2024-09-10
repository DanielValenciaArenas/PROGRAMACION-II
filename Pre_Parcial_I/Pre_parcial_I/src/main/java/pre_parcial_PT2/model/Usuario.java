package pre_parcial_PT2.model;

import pre_parcial_PT2.model.builder.UsuarioBuilder;

public class Usuario {

    private String nombre;
    private int edad;
    private VehiculoTransporte vehiculoTransporte;

    public Usuario(String nombre, int edad, VehiculoTransporte vehiculoTransporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.vehiculoTransporte = vehiculoTransporte;
    }

    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public VehiculoTransporte getVehiculoTransporte() {
        return vehiculoTransporte;
    }

    public void setVehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        this.vehiculoTransporte = vehiculoTransporte;
    }

}
