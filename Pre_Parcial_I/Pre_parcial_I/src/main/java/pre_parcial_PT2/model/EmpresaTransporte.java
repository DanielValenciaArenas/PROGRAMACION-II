package pre_parcial_PT2.model;

import java.util.ArrayList;
import java.util.Collection;

public class EmpresaTransporte {

    private String nombre;
    private Collection<Propietario> listaPropietarios;
    private Collection<Usuario> listaUsuarios;
    private Collection<VehiculoCarga> listaVehiculosCarga;
    private Collection<VehiculoTransporte> listaVehiculosTransporte;

    public EmpresaTransporte(String nombre, Collection<Propietario> listaPropietarios, Collection<Usuario> listaUsuarios,
                             Collection<VehiculoCarga> listaVehiculosCarga, Collection<VehiculoTransporte> listaVehiculosTransporte) {
        this.nombre = nombre;
        this.listaPropietarios = listaPropietarios;
        this.listaUsuarios = listaUsuarios;
        this.listaVehiculosCarga = listaVehiculosCarga;
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(Collection<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public Collection<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(Collection<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Collection<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(Collection<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public Collection<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(Collection<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }


    //CRUD PROPIETARIO
    public boolean crearPropietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculoAsociado) {

        Propietario newPropietario = new Propietario(nombre, cedula, email, celular, vehiculoAsociado, null);

        Propietario PropietarioExistente = verificarPropietario(cedula);

        if(PropietarioExistente == null){
            newPropietario.setNombre(nombre);
            newPropietario.setCelular(cedula);
            newPropietario.setEmail(email);
            newPropietario.setCelular(celular);
            newPropietario.setVehiculoAsociado(vehiculoAsociado);
            listaPropietarios.add(newPropietario);

            return true;
        }

        return false;
    }

    private Propietario verificarPropietario(String cedula){
        Propietario propietarioExistente = null;

        for (Propietario propietario : listaPropietarios){
            if(propietario.getCedula().equals(cedula)){
                propietarioExistente = propietario;
                break;
            }
        }

        return propietarioExistente;
    }

    public boolean eliminarPropietario(String cedula) {

        for (Propietario propietario : listaPropietarios){
            if(propietario.getCedula().equals(cedula)){
                listaPropietarios.remove(propietario);
                return true;
            }
        }

        return false;
    }

    public boolean modificarPropietario(String nombre, String cedula, String email, String celular) {

        for (Propietario propietario: listaPropietarios) {
            if (propietario.getCedula().equals(cedula)) {
                propietario.setNombre(nombre);
                propietario.setEmail(email);
                propietario.setCelular(celular);
                return true;
            }
        }
        return false;
    }

    public Propietario getPropietario(String cedula) {

        for (Propietario propietario: listaPropietarios) {
            if (propietario.getCedula().equals(cedula)) {
                return propietario;
            }
        }
        return null;
    }

    public Collection<Propietario> getPropietarios() {
        return listaPropietarios;
    }


    //CRUD USUARIO
    public boolean crearUsuario(String nombre, int edad, VehiculoTransporte vehiculoTransporte) {

        Usuario newUsuario = new Usuario(nombre, edad, vehiculoTransporte);

        Usuario usuarioExistente = verificarUsuario(nombre);

        if(usuarioExistente == null){
            newUsuario.setNombre(nombre);
            newUsuario.setEdad(edad);
            listaUsuarios.add(newUsuario);

            return true;
        }

        return false;
    }

    private Usuario verificarUsuario(String nombre){
        Usuario usuarioExistente = null;

        for (Usuario usuario : listaUsuarios){
            if(usuario.getNombre().equals(nombre)){
                usuarioExistente = usuario;
                break;
            }
        }

        return usuarioExistente;
    }

    public boolean eliminarUsuario(String nombre) {

        for (Usuario usuario : listaUsuarios){
            if(usuario.getNombre().equals(nombre)){
                listaUsuarios.remove(usuario);
                return true;
            }
        }

        return false;
    }

    public boolean modificarUsuario(String nombre, int edad) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre)) {
                usuario.setEdad(edad);
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuario(String nombre) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public Collection<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    //CRUD VEHICULOCARGA

    public boolean crearVehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes){
        VehiculoCarga newVehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, null, null,
                capacidadCarga, numeroEjes);

        VehiculoCarga vehiculoCargaExistente = verificarVehiculoCarga(placa);

        if(vehiculoCargaExistente == null){
            newVehiculoCarga.setPlaca(placa);
            newVehiculoCarga.setModelo(modelo);
            newVehiculoCarga.setMarca(marca);
            newVehiculoCarga.setColor(color);
            newVehiculoCarga.setCapacidadCarga(capacidadCarga);
            newVehiculoCarga.setNumeroEjes(numeroEjes);
            listaVehiculosCarga.add(newVehiculoCarga);

            return true;
        }

        return false;
    }

    private VehiculoCarga verificarVehiculoCarga(String placa){
        VehiculoCarga vehiculoCargaExistente = null;

        for(VehiculoCarga vehiculoCarga: listaVehiculosCarga){
            if(vehiculoCarga.getPlaca().equals(placa)){
                vehiculoCargaExistente = vehiculoCarga;
                break;
            }
        }

        return vehiculoCargaExistente;
    }

    public boolean eliminarVehiculoCarga(String placa){
        for(VehiculoCarga vehiculoCarga : listaVehiculosCarga){
            if(vehiculoCarga.getPlaca().equals(placa)){
                listaVehiculosCarga.remove(vehiculoCarga);
                return true;
            }
        }

        return false;
    }

    public boolean modificarVehiculoCarga(String placa, String modelo, String marca, String color, double capacidadCarga, int numeroEjes){
        for(VehiculoCarga vehiculoCarga : listaVehiculosCarga){
            if(vehiculoCarga.getPlaca().equals(placa)){
                vehiculoCarga.setModelo(modelo);
                vehiculoCarga.setMarca(marca);
                vehiculoCarga.setColor(color);
                vehiculoCarga.setCapacidadCarga(capacidadCarga);
                vehiculoCarga.setNumeroEjes(numeroEjes);
                return true;
            }
        }

        return false;
    }

    public VehiculoCarga getVehiculoCarga(String placa){

        for(VehiculoCarga vehiculoCarga : listaVehiculosCarga){
            if(vehiculoCarga.getPlaca().equals(placa)){
                return vehiculoCarga;
            }
        }

        return null;
    }

    public Collection<VehiculoCarga> getVehiculosCarga(){
        return listaVehiculosCarga;
    }

    //CRUD VEHICULOTRANSPORTE


    public boolean crearVehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros){
        VehiculoTransporte newVehiculoTransporte = new VehiculoTransporte(placa, modelo, marca, color, null, null,
                maxPasajeros, null);

        VehiculoTransporte vehiculoTransporteExistente = verificarVehiculoTransporte(placa);

        if(vehiculoTransporteExistente == null){
            newVehiculoTransporte.setPlaca(placa);
            newVehiculoTransporte.setModelo(modelo);
            newVehiculoTransporte.setMarca(marca);
            newVehiculoTransporte.setColor(color);
            newVehiculoTransporte.setMaxPasajeros(maxPasajeros);
            listaVehiculosTransporte.add(newVehiculoTransporte);

            return true;
        }

        return false;
    }

    private VehiculoTransporte verificarVehiculoTransporte(String placa){
        VehiculoTransporte vehiculoTransporteExistente = null;

        for(VehiculoTransporte vehiculoTransporte: listaVehiculosTransporte){
            if(vehiculoTransporte.getPlaca().equals(placa)){
                vehiculoTransporteExistente = vehiculoTransporte;
                break;
            }
        }

        return vehiculoTransporteExistente;
    }

    public boolean eliminarVehiculoTransporte(String placa){
        for(VehiculoTransporte vehiculoTransporte : listaVehiculosTransporte){
            if(vehiculoTransporte.getPlaca().equals(placa)){
                listaVehiculosTransporte.remove(vehiculoTransporte);
                return true;
            }
        }

        return false;
    }

    public boolean modificarVehiculoTransporte(String placa, String modelo, String marca, String color, int maxPasajeros){
        for(VehiculoTransporte vehiculoTransporte : listaVehiculosTransporte){
            if(vehiculoTransporte.getPlaca().equals(placa)){
                vehiculoTransporte.setModelo(modelo);
                vehiculoTransporte.setMarca(marca);
                vehiculoTransporte.setColor(color);
                vehiculoTransporte.setMaxPasajeros(maxPasajeros);
                return true;
            }
        }

        return false;
    }

    public VehiculoTransporte getVehiculoTransporte(String placa){

        for(VehiculoTransporte vehiculoTransporte : listaVehiculosTransporte){
            if(vehiculoTransporte.getPlaca().equals(placa)){
                return vehiculoTransporte;
            }
        }

        return null;
    }

    public Collection<VehiculoTransporte> getVehiculosTransporte(){
        return listaVehiculosTransporte;
    }

    /*
    * Metodo que calcula y muestra el total de pasajeros transportados transportadoes en un dia
    * */
    public String calcularTotalPasajeros(){
        int totalPasajeros = 0;

                for(VehiculoTransporte vehiculo : listaVehiculosTransporte){
                        totalPasajeros += vehiculo.getListaUsuariosAsociados().size();
                }

                return "Total de pasajeros: " + totalPasajeros;
    }

    /*
    * Metodo para obtener el número de usuarios que se movilizaron en el vehículo de transporte dado la placa
    * */
    public int obtenerNumeroUsuariosTransportados(String placa){
        for(VehiculoTransporte vehiculo : listaVehiculosTransporte){
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo.getListaUsuariosAsociados().size();
            }
        }
        return 0;
    }

    /*
    * Método para obtener el numero de usuarios que son mayores de edad
    * */
    public int obtenerNumeroUsuariosMayoresDeEdad(){
        int usuariosMayoresEdad = 0;

        for(Usuario usuario : listaUsuarios){
            if(usuario.getEdad() >= 18){
                usuariosMayoresEdad = usuariosMayoresEdad + 1;
            }
        }

        return usuariosMayoresEdad;

    }

}

