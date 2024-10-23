package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.implementacionBridgePrestamo;

public class LogicaPrestamoLocal implements ILogicaPrestamo {


    @Override
    public void procesarEntrega() {
        System.out.println("Procesando entrega de un préstamo local.");
    }

    @Override
    public void calcularVencimiento() {
        System.out.println("Procesando reglas de vencimiento de préstamo local.");
    }

}
