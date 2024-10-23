package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import java.util.Collection;

public class PrestamoUQ {

    private String nombre;
    private Collection<Cliente> listaClientes;
    private Collection<Prestamo> listaPrestamos;
    private Collection<Empleado> listaEmpleados;
    private Collection<Objeto> listaObjetos;

    public PrestamoUQ(String nombre, Collection<Cliente> listaClientes, Collection<Prestamo> listaPrestamos,
                      Collection<Empleado> listaEmpleados, Collection<Objeto> listaObjetos) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaPrestamos = listaPrestamos;
        this.listaEmpleados = listaEmpleados;
        this.listaObjetos = listaObjetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Collection<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(Collection<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
}
