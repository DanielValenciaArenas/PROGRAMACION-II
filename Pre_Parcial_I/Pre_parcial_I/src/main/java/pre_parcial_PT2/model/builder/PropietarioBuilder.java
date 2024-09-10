package pre_parcial_PT2.model.builder;

import pre_parcial_PT2.model.Propietario;
import pre_parcial_PT2.model.Vehiculo;

import java.util.Collection;

public class PropietarioBuilder {

    protected String nombre;
    protected String cedula;
    protected String email;
    protected String celular;

    public Propietario build(){
        return new Propietario(nombre,cedula,email,celular,null,null);
    }

    public PropietarioBuilder nombre(String nombre){
        this.nombre= nombre;
        return this;
    }

    public PropietarioBuilder cedula(String cedula){
        this.cedula= cedula;
        return this;
    }

    public PropietarioBuilder email(String email){
        this.email= email;
        return this;
    }

    public PropietarioBuilder celular(String celular){
        this.celular= celular;
        return this;
    }


}
