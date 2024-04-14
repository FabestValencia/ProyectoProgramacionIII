module co.edu.uniquindio.progra3.proyectoprogra3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens co.edu.uniquindio.progra3.proyectoprogra3 to javafx.fxml;
    exports co.edu.uniquindio.progra3.proyectoprogra3;
}