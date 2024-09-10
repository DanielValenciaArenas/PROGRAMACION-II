package pre_parcial_PT2.model.builder;

import pre_parcial_PT2.model.Vehiculo;
import pre_parcial_PT2.model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder<VehiculoCargaBuilder>{

    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCargaBuilder capacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
        return this;
    }

    public VehiculoCargaBuilder numeroEjes(int numeroEjes){
        this.numeroEjes = numeroEjes;
        return this;
    }

    @Override
    public VehiculoCarga build() {
        return new VehiculoCarga(placa, modelo, marca, color, null, null,
                capacidadCarga, numeroEjes);
    }

    @Override
    protected VehiculoCargaBuilder self() {
        return this;
    }
}
