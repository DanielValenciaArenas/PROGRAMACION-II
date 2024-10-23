package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.builder.ObjetoBuilder;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.clasesParaProxy.IObjeto;

//Clase hoja (COMPOSITE)
public class Objeto extends ComponenteObjeto implements IObjeto {

    private String nombre;
    private Prestamo prestamoAsociado;

    public Objeto(String nombre, Prestamo prestamoAsociado) {
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
    }

    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }



    @Override
    public void prestar() {
        System.out.println("Prestando el objeto: " + nombre);
        // Lógica para asociar el préstamo si es necesario
    }

}
