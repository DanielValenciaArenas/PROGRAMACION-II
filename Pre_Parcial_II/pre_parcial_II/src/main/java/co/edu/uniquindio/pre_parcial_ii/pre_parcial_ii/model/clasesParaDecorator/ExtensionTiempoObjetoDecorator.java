package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.clasesParaDecorator;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Prestamo;

import java.time.LocalDate;

public class ExtensionTiempoObjetoDecorator extends PrestamoDecorator {

    private int diasExtension;

    public ExtensionTiempoObjetoDecorator(Prestamo prestamoDecorado, int diasExtension) {
        super(prestamoDecorado);
        this.diasExtension = diasExtension;
    }

    @Override
    public void definirVencimiento() {
        super.definirVencimiento();
        LocalDate nuevaFechaEntrega = super.getFechaEntrega().plusDays(diasExtension);
        super.setFechaEntrega(nuevaFechaEntrega);
        System.out.println("El tiempo del préstamo ha sido extendido en " + diasExtension + " días. Nueva fecha de entrega: " + nuevaFechaEntrega);
    }

    public int getDiasExtension() {
        return diasExtension;
    }

}
