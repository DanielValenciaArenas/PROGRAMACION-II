package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.factory;

import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.mapping.mappers.PrestamoUQMappingImpl;
import co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class ModelFactory {

    private static ModelFactory instance;
    PrestamoUQ prestamoUQ;
    PrestamoUQMappingImpl mapper;

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        mapper = new PrestamoUQMappingImpl();
        prestamoUQ = inicializarDatos();
    }

    public PrestamoUQ getPrestamoUQ() {
        return prestamoUQ;
    }

    public void setPrestamoUQ(PrestamoUQ prestamoUQ) {
        this.prestamoUQ = prestamoUQ;
    }


    public static PrestamoUQ inicializarDatos() {

        Collection<Cliente> listaClientes = new ArrayList<>();
        Collection<Prestamo> listaPrestamos = new ArrayList<>();
        Collection<Empleado> listaEmpleados = new ArrayList<>();
        Collection<Objeto> listaObjetos = new ArrayList<>();

        PrestamoUQ prestamoUQ = new PrestamoUQ(null, listaClientes, listaPrestamos, listaEmpleados, listaObjetos);
        prestamoUQ.setNombre("PrestamosUQForever");

        //CLIENTES
        Cliente cliente1 = Cliente.builder()
                .nombre("Luis")
                .apellido("Botero")
                .cedula("1234567")
                .edad("22")
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("Juana")
                .apellido("Echeverry")
                .cedula("8907654")
                .edad("26")
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Marco")
                .apellido("Polo")
                .cedula("3247569")
                .edad("36")
                .build();

        //EMPLEADOS
        Empleado empleado1 = Empleado.builder()
                .nombre("José")
                .apellido("Alzate")
                .cedula("3269120")
                .edad("45")
                .build();

        Empleado empleado2 = Empleado.builder()
                .nombre("Minerba")
                .apellido("Arzuita")
                .cedula("9053218")
                .edad("54")
                .build();

        Empleado empleado3 = Empleado.builder()
                .nombre("Bayron")
                .apellido("Nuñez")
                .cedula("1740823")
                .edad("39")
                .build();

        //OBJETOS
        Objeto objeto1 = Objeto.builder()
                .nombre("Soga")
                .build();

        Objeto objeto2 = Objeto.builder()
                .nombre("Mancuernas")
                .build();

        Objeto objeto3 = Objeto.builder()
                .nombre("Cable USB")
                .build();

        Objeto objeto4 = Objeto.builder()
                .nombre("Balon Futbol")
                .build();

        Objeto objeto5 = Objeto.builder()
                .nombre("Tablet")
                .build();

        Objeto objeto6 = Objeto.builder()
                .nombre("PC portatil")
                .build();

        //PRESTAMOS
        Prestamo prestamo1 = Prestamo.builder()
                .numeroPrestamo("1")
                .fechaPrestamo(LocalDate.of(2024, 1, 20))
                .fechaEntrega(LocalDate.of(2024, 12, 15))
                .descripcion("Prestamo realizado con limite de tiempo")
                .build();

        Prestamo prestamo2 = Prestamo.builder()
                .numeroPrestamo("2")
                .fechaPrestamo(LocalDate.of(2024, 5, 12))
                .fechaEntrega(LocalDate.of(2024, 6, 12))
                .descripcion("Prestamo realizado con limite de tiempo")
                .build();

        Prestamo prestamo3 = Prestamo.builder()
                .numeroPrestamo("3")
                .fechaPrestamo(LocalDate.of(2024, 2, 14))
                .fechaEntrega(LocalDate.of(2024, 2, 14))
                .descripcion("Prestamo realizado con limite de tiempo")
                .build();

        Prestamo prestamo4 = Prestamo.builder()
                .numeroPrestamo("4")
                .fechaPrestamo(LocalDate.of(2024, 8, 15))
                .fechaEntrega(LocalDate.of(2024, 10, 3))
                .descripcion("Prestamo realizado con limite de tiempo")
                .build();

        Prestamo prestamo5 = Prestamo.builder()
                .numeroPrestamo("5")
                .fechaPrestamo(LocalDate.of(2024, 7, 1))
                .fechaEntrega(LocalDate.of(2024, 11, 10))
                .descripcion("Prestamo realizado con limite de tiempo")
                .build();

        Prestamo prestamo6 = Prestamo.builder()
                .numeroPrestamo("6")
                .fechaPrestamo(LocalDate.of(2024, 9, 11))
                .fechaEntrega(LocalDate.of(2024, 9, 11))
                .descripcion("Prestamo realizado con limite de tiempo")
                .build();

        //ASIGNACION DE LOS PRESTAMOS DE LOS CLIENTES
        cliente1.getListaPrestamosAsociados().add(prestamo1);
        cliente2.getListaPrestamosAsociados().add(prestamo2);
        cliente3.getListaPrestamosAsociados().add(prestamo3);

        //ASIGNACION DE LOS PRESTAMOS DE LOS EMPLEADOS
        empleado1.getListaPrestamosAsociados().add(prestamo4);
        empleado1.getListaPrestamosAsociados().add(prestamo5);
        empleado3.getListaPrestamosAsociados().add(prestamo6);

        //Datos en PrestamosUQ
        prestamoUQ.getListaClientes().add(cliente1);
        prestamoUQ.getListaClientes().add(cliente2);
        prestamoUQ.getListaClientes().add(cliente3);

        prestamoUQ.getListaEmpleados().add(empleado1);
        prestamoUQ.getListaEmpleados().add(empleado2);
        prestamoUQ.getListaEmpleados().add(empleado3);

        prestamoUQ.getListaPrestamos().add(prestamo1);
        prestamoUQ.getListaPrestamos().add(prestamo2);
        prestamoUQ.getListaPrestamos().add(prestamo3);
        prestamoUQ.getListaPrestamos().add(prestamo4);
        prestamoUQ.getListaPrestamos().add(prestamo5);
        prestamoUQ.getListaPrestamos().add(prestamo6);

        prestamoUQ.getListaObjetos().add(objeto1);
        prestamoUQ.getListaObjetos().add(objeto2);
        prestamoUQ.getListaObjetos().add(objeto3);
        prestamoUQ.getListaObjetos().add(objeto4);
        prestamoUQ.getListaObjetos().add(objeto5);
        prestamoUQ.getListaObjetos().add(objeto6);




        return prestamoUQ;
    }
}
