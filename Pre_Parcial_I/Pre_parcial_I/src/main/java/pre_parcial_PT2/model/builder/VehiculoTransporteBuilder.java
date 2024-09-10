package pre_parcial_PT2.model.builder;

import pre_parcial_PT2.model.Vehiculo;
import pre_parcial_PT2.model.VehiculoTransporte;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder> {

    protected int maxPasajeros;

    public VehiculoTransporteBuilder maxPasajeros(int maxPasajeros){
        this.maxPasajeros = maxPasajeros;
        return this;
    }

    @Override
    public VehiculoTransporte build() {
        return new VehiculoTransporte(placa, modelo, marca, color, null, null,
                maxPasajeros, null);
    }

    @Override
    protected VehiculoTransporteBuilder self() {
        return super.self();
    }
}
