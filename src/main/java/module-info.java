module com.extrak {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.extrak to javafx.fxml;
    exports com.extrak;
    exports com.extrak.controllers;
    opens com.extrak.controllers to javafx.fxml;
}