package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.clasesParaProxy;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.Objeto;

public class ObjetoProxy implements IObjeto {
    private Objeto objetoReal;
    private boolean accesoPermitido;

    public ObjetoProxy(Objeto objetoReal) {
        this.objetoReal = objetoReal;
        this.accesoPermitido = false; // Por defecto, el acceso no está permitido
    }

    @Override
    public void prestar() {
        if (accesoPermitido) {
            objetoReal.prestar();
            // Aquí puedes agregar lógica para registrar el acceso
            System.out.println("Acceso permitido al objeto: " + objetoReal.getNombre());
        } else {
            System.out.println("Acceso denegado al objeto: " + objetoReal.getNombre());
        }
    }

    public void setAccesoPermitido(boolean accesoPermitido) {
        this.accesoPermitido = accesoPermitido;
    }
}