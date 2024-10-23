package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Objeto;

public class ObjetoBuilder {

    protected String nombre;

    public Objeto build(){
        return new Objeto(nombre, null);
    }

    public ObjetoBuilder nombre(String nombre){
        this.nombre= nombre;
        return this;
    }

}
