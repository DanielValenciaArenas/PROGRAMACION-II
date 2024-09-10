package pre_parcial_PT1;

import java.util.Collection;
import java.util.Date;

public class Tarea {

    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private double duracionTarea;
    private String descripcion;
    private Collection<Empleado> listaEmpleadosAsociados;

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, double duracionTarea, String descripcion,
                 Collection<Empleado> listaEmpleadosAsociados) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
        this.listaEmpleadosAsociados = listaEmpleadosAsociados;
    }

    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(double duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<Empleado> getListaEmpleadosAsociados() {
        return listaEmpleadosAsociados;
    }

    public void setListaEmpleadosAsociados(Collection<Empleado> listaEmpleadosAsociados) {
        this.listaEmpleadosAsociados = listaEmpleadosAsociados;
    }
}
