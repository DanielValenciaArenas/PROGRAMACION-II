package pre_parcial_PT2.model.builder;

import pre_parcial_PT2.model.Propietario;
import pre_parcial_PT2.model.Vehiculo;

import java.util.Collection;

public abstract class VehiculoBuilder <T extends VehiculoBuilder<T>>{

    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;

    public T placa(String placa) {
        this.placa = placa;
        return self();
    }

    public T modelo(String modelo){
        this.modelo = modelo;
        return self();
    }

    public T marca(String marca){
        this.marca = marca;
        return self();
    }

    public T color(String color){
        this.color = color;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Vehiculo build();

}
