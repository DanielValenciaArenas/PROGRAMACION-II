package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;


import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.service.ICliente;

//Clase que HACE QUE EMPLEADO SE comoporte como uncliente (ADAPTER)
public class EmpleadoAdapter implements ICliente {

    private Empleado empleado;

    public EmpleadoAdapter(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public void realizarPrestamo(Prestamo prestamo) {
        System.out.println("El Empleado" +empleado.getNombre()+ "esta realizando el prestamo:" +prestamo.getNumeroPrestamo());
    }

}
