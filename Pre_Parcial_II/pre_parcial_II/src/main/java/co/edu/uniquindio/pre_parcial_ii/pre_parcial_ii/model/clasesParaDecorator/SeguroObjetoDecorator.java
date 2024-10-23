package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.clasesParaDecorator;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Prestamo;

public class SeguroObjetoDecorator extends PrestamoDecorator {

    private double costoSeguro;

    public SeguroObjetoDecorator(Prestamo prestamoDecorado, double costoSeguro) {
        super(prestamoDecorado);
        this.costoSeguro = costoSeguro;
    }

    @Override
    public void entregar() {
        super.entregar();
        System.out.println("El préstamo incluye un seguro de objetos por un costo de: " + costoSeguro);
    }

    public double getCostoSeguro() {
        return costoSeguro;
    }
}

