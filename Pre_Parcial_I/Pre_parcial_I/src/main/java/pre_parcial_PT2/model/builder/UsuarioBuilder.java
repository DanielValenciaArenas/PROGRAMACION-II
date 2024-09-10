package pre_parcial_PT2.model.builder;

import pre_parcial_PT2.model.Usuario;
import pre_parcial_PT2.model.VehiculoTransporte;

public class UsuarioBuilder {

    protected String nombre;
    protected int edad;

    public Usuario build(){
        return new Usuario(nombre, edad, null);
    }

    public UsuarioBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder edad(int edad){
        this.edad= edad;
        return this;
    }
}
