module com.example.javaapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javaapp to javafx.fxml;
    exports com.example.javaapp;
}