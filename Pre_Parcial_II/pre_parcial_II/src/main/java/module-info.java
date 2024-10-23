module co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii to javafx.fxml;
    exports co.edu.uniquindio.pre_parcial_ii.pre_parcial_ii;
}