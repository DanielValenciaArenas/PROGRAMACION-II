package co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrestamoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnVer1;

    @FXML
    private Button btnVer2;

    @FXML
    private Button btnVer3;

    @FXML
    private Button btnVer4;

    @FXML
    private TextField txCodigoObjeto;

    @FXML
    void AbrirClientesConMayorPrestamos(ActionEvent event) {

    }


    @FXML
    void AbrirObjetosMasPrestados(ActionEvent event) {

    }

    @FXML
    void AbrirObjetosNoDisponibles(ActionEvent event) {

    }

    @FXML
    void BuscarObjetoPorCodigo(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'prestamo.fxml'.";
        assert btnVer1 != null : "fx:id=\"btnVer1\" was not injected: check your FXML file 'prestamo.fxml'.";
        assert btnVer2 != null : "fx:id=\"btnVer2\" was not injected: check your FXML file 'prestamo.fxml'.";
        assert btnVer3 != null : "fx:id=\"btnVer3\" was not injected: check your FXML file 'prestamo.fxml'.";
        assert btnVer4 != null : "fx:id=\"btnVer4\" was not injected: check your FXML file 'prestamo.fxml'.";
        assert txCodigoObjeto != null : "fx:id=\"txCodigoObjeto\" was not injected: check your FXML file 'prestamo.fxml'.";

    }



}
