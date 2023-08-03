module com.extrak {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.extrak to javafx.fxml;
    exports com.extrak;
}