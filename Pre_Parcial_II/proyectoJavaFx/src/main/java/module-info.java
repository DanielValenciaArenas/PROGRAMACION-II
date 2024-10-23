module co.edu.uniquindio.pre_parcial_ii.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.pre_parcial_ii.proyectojavafx to javafx.fxml;
    exports co.edu.uniquindio.pre_parcial_ii.proyectojavafx;
}