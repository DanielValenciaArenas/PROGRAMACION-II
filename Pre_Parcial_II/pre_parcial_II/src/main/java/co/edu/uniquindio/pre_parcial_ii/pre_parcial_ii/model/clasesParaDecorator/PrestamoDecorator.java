package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.clasesParaDecorator;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Prestamo;

public abstract class PrestamoDecorator extends Prestamo {

    protected Prestamo prestamoDecorado;

    public PrestamoDecorator(Prestamo prestamoDecorado) {

        super(prestamoDecorado.getNumeroPrestamo(),
                prestamoDecorado.getFechaPrestamo(),
                prestamoDecorado.getFechaEntrega(),
                prestamoDecorado.getDescripcion(),
                prestamoDecorado.getClienteAsociado(),
                prestamoDecorado.getEmpleadoAsociado(),
                prestamoDecorado.getListaObjetosAsociados(),
                prestamoDecorado.getLogicaPrestamo());

        this.prestamoDecorado = prestamoDecorado;
    }

    @Override
    public void entregar() {
        prestamoDecorado.entregar();
    }

    @Override
    public void definirVencimiento() {
        prestamoDecorado.definirVencimiento();
    }
}
