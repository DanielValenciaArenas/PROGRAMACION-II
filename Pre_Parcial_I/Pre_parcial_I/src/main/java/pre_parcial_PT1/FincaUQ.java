package pre_parcial_PT1;

import java.util.Collection;

public class FincaUQ {

    private String nombre;
    private Collection<Tarea> listaTareas;
    private Collection<Empleado> listaEmpleados;

    public FincaUQ(String nombre, Collection<Tarea> listaTareas, Collection<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaTareas = listaTareas;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(Collection<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}
