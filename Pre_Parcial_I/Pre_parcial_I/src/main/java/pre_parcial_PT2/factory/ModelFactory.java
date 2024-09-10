package pre_parcial_PT2.factory;

import pre_parcial_PT2.model.*;
import pre_parcial_PT2.services.ICrudPropietario;
import pre_parcial_PT2.services.ICrudUsuario;
import pre_parcial_PT2.services.ICrudVehiculoCarga;
import pre_parcial_PT2.services.ICrudVehiculoTransporte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModelFactory implements ICrudPropietario, ICrudUsuario, ICrudVehiculoCarga, ICrudVehiculoTransporte {

    private static ModelFactory instance;
    private static EmpresaTransporte empresaTransporte;

    private ModelFactory(){
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    //Implementación de ICrudPropietario

    @Override
    public boolean crearPropietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculoAsociado) {
        return empresaTransporte.crearPropietario(nombre, cedula, email, celular, vehiculoAsociado);
    }

    @Override
    public Propietario getPropietario(String nombre, String cedula) {
        return empresaTransporte.getPropietario(cedula);
    }

    @Override
    public boolean modificarPropietario(String nombre, String cedula, String nuevoEmail, String nuevoCelular) {
        return empresaTransporte.modificarPropietario(nombre, cedula, nuevoEmail, nuevoCelular);
    }

    @Override
    public boolean eliminarPropietario(String cedula) {
        return empresaTransporte.eliminarPropietario(cedula);
    }

    @Override
    public Collection<Propietario> getPropietarios() {
        return empresaTransporte.getPropietarios();
    }


    //Implementación de ICrudUsuario

    @Override
    public boolean crearUsuario(String nombre, int edad, VehiculoTransporte vehiculoTransporte){
        return empresaTransporte.crearUsuario(nombre,edad, vehiculoTransporte);
    }

    @Override
    public Usuario getUsuario(String nombre) {
        return empresaTransporte.getUsuario(nombre);
    }

    @Override
    public boolean modificarUsuario(String nombre, int edad, VehiculoTransporte vehiculoTransporte) {
        return false;
    }

    @Override
    public boolean modificarUsuario(String nombre, int edad) {
        return empresaTransporte.modificarUsuario(nombre, edad);
    }

    @Override
    public boolean eliminarUsuario(String nombre) {
        return empresaTransporte.eliminarUsuario(nombre);
    }

    @Override
    public Collection<Usuario> getUsuarios() {
        return empresaTransporte.getUsuarios();
    }

    //Implementación de ICrudVehiculoCarga

    @Override
    public boolean crearVehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes) {
        return empresaTransporte.crearVehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);
    }

    @Override
    public VehiculoCarga getVehiculoCarga(String placa) {
        return empresaTransporte.getVehiculoCarga(placa);
    }

    @Override
    public boolean modificarVehiculoCarga(String placa, String nuevoModelo, String nuevaMarca, String nuevoColor, double nuevaCapacidadCarga, int nuevoNumeroEjes) {
        return empresaTransporte.modificarVehiculoCarga(placa, nuevoModelo, nuevaMarca, nuevoColor, nuevaCapacidadCarga, nuevoNumeroEjes);
    }

    @Override
    public boolean eliminarVehiculoCarga(String placa) {
        return empresaTransporte.eliminarVehiculoCarga(placa);
    }

    @Override
    public Collection<VehiculoCarga> getVehiculosCarga() {
        return empresaTransporte.getVehiculosCarga();
    }


    //Implementación de IcrudVehiculoTransporte

    @Override
    public boolean crearVehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros) {
        return empresaTransporte.crearVehiculoTransporte(placa, modelo, marca, color, maxPasajeros);
    }

    @Override
    public VehiculoTransporte getVehiculoTransporte(String placa) {
        return empresaTransporte.getVehiculoTransporte(placa);
    }

    @Override
    public boolean modificarVehiculoTransporte(String placa, String nuevoModelo, String nuevaMarca, String nuevoColor, int nuevoMaxPasajeros) {
        return empresaTransporte.modificarVehiculoTransporte(placa, nuevoModelo, nuevaMarca, nuevoColor, nuevoMaxPasajeros);
    }

    @Override
    public boolean eliminarVehiculoTransporte(String placa) {
        return empresaTransporte.eliminarVehiculoTransporte(placa);
    }

    @Override
    public Collection<VehiculoTransporte> getVehiculosTransporte() {
        return empresaTransporte.getVehiculosTransporte();
    }

    private static void inicializarDatos(){
        Collection<Propietario> listaPropietarios = new ArrayList<>();
        Collection<Usuario> listaUsuarios = new ArrayList<>();
        Collection<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
        Collection<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();

        empresaTransporte = new EmpresaTransporte(null, listaPropietarios, listaUsuarios, listaVehiculosCarga, listaVehiculosTransporte);
        empresaTransporte.setNombre("TRANSPORTES ASA");

        //PROPIETARIOS
        Propietario propietario1 = Propietario.builder()
                .nombre("Oscar")
                .cedula("123456")
                .email("Oscar@gmail.com")
                .celular("311410678")
                .build();

        Propietario propietario2 = Propietario.builder()
                .nombre("Monica")
                .cedula("678901")
                .email("Monica@gmail.com")
                .celular("31456712")
                .build();

        Propietario propietario3 = Propietario.builder()
                .nombre("Arnold")
                .cedula("234567")
                .email("Arnold@gmail.com")
                .celular("328123098")
                .build();

        Propietario propietario4 = Propietario.builder()
                .nombre("Karoll")
                .cedula("4591235")
                .email("Karoll@gmail.com")
                .celular("30921386")
                .build();

        //VEHICULOS DE CARGA
        VehiculoCarga vehiculoCarga1 = VehiculoCarga.builder()
                .placa("QWE123")
                .modelo("A")
                .marca("Chevrolet")
                .color("Azul")
                .capacidadCarga(54000.02)
                .numeroEjes(4)
                .build();

        VehiculoCarga vehiculoCarga2 = VehiculoCarga.builder()
                .placa("RTY456")
                .modelo("B")
                .marca("Audi")
                .color("Vainilla")
                .capacidadCarga(120000)
                .numeroEjes(5)
                .build();

        VehiculoCarga vehiculoCarga3 = VehiculoCarga.builder()
                .placa("UIO789")
                .modelo("C")
                .marca("Toyota")
                .color("Blanco")
                .capacidadCarga(321000.07)
                .numeroEjes(4)
                .build();

        VehiculoCarga vehiculoCarga4 = VehiculoCarga.builder()
                .placa("PAS0143")
                .modelo("D")
                .marca("BMW")
                .color("Rojo")
                .capacidadCarga(512000)
                .numeroEjes(3)
                .build();

        //VEHICULOS TRANSPORTE
        VehiculoTransporte vehiculoTransporte1 = VehiculoTransporte.builder()
                .placa("ZXC098")
                .modelo("E")
                .marca("Luxius")
                .color("Amarillo")
                .maxPasajeros(20)
                .build();

        VehiculoTransporte vehiculoTransporte2 = VehiculoTransporte.builder()
                .placa("VBN765")
                .modelo("F")
                .marca("Montash")
                .color("Lila")
                .maxPasajeros(10)
                .build();

        VehiculoTransporte vehiculoTransporte3 = VehiculoTransporte.builder()
                .placa("MAS432")
                .modelo("G")
                .marca("Brumx")
                .color("Azul")
                .maxPasajeros(30)
                .build();

        VehiculoTransporte vehiculoTransporte4 = VehiculoTransporte.builder()
                .placa("DFG105")
                .modelo("H")
                .marca("KAT")
                .color("Naranja")
                .maxPasajeros(80)
                .build();

        //USUARIOS
        Usuario usuario1 = Usuario.builder()
                .nombre("John")
                .edad(45)
                .build();
        usuario1.setVehiculoTransporte(vehiculoTransporte2);

        Usuario usuario2 = Usuario.builder()
                .nombre("Luisa")
                .edad(28)
                .build();
        usuario2.setVehiculoTransporte(vehiculoTransporte4);

        Usuario usuario3 = Usuario.builder()
                .nombre("Michael")
                .edad(32)
                .build();
        usuario3.setVehiculoTransporte(vehiculoTransporte2);

        Usuario usuario4 = Usuario.builder()
                .nombre("Diana")
                .edad(24)
                .build();
        usuario4.setVehiculoTransporte(vehiculoTransporte1);

        Usuario usuario5 = Usuario.builder()
                .nombre("Ximena")
                .edad(35)
                .build();
        usuario5.setVehiculoTransporte(vehiculoTransporte3);

        //ASIGNACION DE USUARIOS A VEHICULOS TRANSPORTE
        vehiculoTransporte1.agregarUsuario(usuario4);
        vehiculoTransporte2.agregarUsuario(usuario1);
        vehiculoTransporte2.agregarUsuario(usuario3);
        vehiculoTransporte3.agregarUsuario(usuario5);
        vehiculoTransporte4.agregarUsuario(usuario2);

        //ASIGNACION DE VEHICULOS A PROPIETARIOS
        propietario1.setVehiculoAsociado(vehiculoCarga1);
        propietario1.getListaVehiculosAsociados().add(vehiculoCarga2);

        propietario2.setVehiculoAsociado(vehiculoCarga2);
        propietario2.getListaVehiculosAsociados().add(vehiculoCarga3);

        propietario3.setVehiculoAsociado(vehiculoCarga3);
        propietario3.getListaVehiculosAsociados().add(vehiculoCarga3);

        propietario4.setVehiculoAsociado(vehiculoCarga4);
        propietario4.getListaVehiculosAsociados().add(vehiculoCarga1);

        //ASIGNACION EN EmpresaTransporte
        empresaTransporte.getListaPropietarios().add(propietario1);
        empresaTransporte.getListaPropietarios().add(propietario2);
        empresaTransporte.getListaPropietarios().add(propietario3);
        empresaTransporte.getListaPropietarios().add(propietario4);

        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga3);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga4);

        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte1);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte2);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte3);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte4);

        empresaTransporte.getListaUsuarios().add(usuario1);
        empresaTransporte.getListaUsuarios().add(usuario2);
        empresaTransporte.getListaUsuarios().add(usuario3);
        empresaTransporte.getListaUsuarios().add(usuario4);
        empresaTransporte.getListaUsuarios().add(usuario5);
    }

}
