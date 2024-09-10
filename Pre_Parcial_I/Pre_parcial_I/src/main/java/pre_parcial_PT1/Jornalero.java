package pre_parcial_PT1;

import java.util.Collection;

public class Jornalero extends Empleado {

    public Jornalero(String nombre, String apellido, String cedula, int edad, double salario, int numeroHojasTrabajo,
                     Collection<Tarea> listaTareasAsociadas) {
        super(nombre, apellido, cedula, edad, salario, numeroHojasTrabajo, listaTareasAsociadas);
    }
}
