package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model;

import java.util.ArrayList;
import java.util.Collection;

//clase Compuesta (COMPOSITE)
public class ObjetoCompuesto extends ComponenteObjeto {

    private String nombre;
    private Collection<ComponenteObjeto> componentes = new ArrayList<>();

    public ObjetoCompuesto(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteObjeto componente) {
        componentes.add(componente);
    }

    @Override
    public void prestar() {
        System.out.println("Prestando el conjunto: " + nombre);
        for (ComponenteObjeto componente : componentes) {
            componente.prestar();
        }

    }


}