package pre_parcial_PT1;

import java.util.Collection;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double salario;
    private int numeroHojasTrabajo;
    private Collection<Tarea> listaTareasAsociadas;

    public Empleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHojasTrabajo,
                    Collection<Tarea> listaTareasAsociadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
        this.numeroHojasTrabajo = numeroHojasTrabajo;
        this.listaTareasAsociadas = listaTareasAsociadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroHojasTrabajo() {
        return numeroHojasTrabajo;
    }

    public void setNumeroHojasTrabajo(int numeroHojasTrabajo) {
        this.numeroHojasTrabajo = numeroHojasTrabajo;
    }

    public Collection<Tarea> getListaTareasAsociadas() {
        return listaTareasAsociadas;
    }

    public void setListaTareasAsociadas(Collection<Tarea> listaTareasAsociadas) {
        this.listaTareasAsociadas = listaTareasAsociadas;
    }
}
