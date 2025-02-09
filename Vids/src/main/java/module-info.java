module com.example.vids {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.vids to javafx.fxml;
    exports com.example.vids;
}