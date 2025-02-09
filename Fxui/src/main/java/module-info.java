module com.example.fxui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxui to javafx.fxml;
    exports com.example.fxui;
}