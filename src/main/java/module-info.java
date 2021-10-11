module se.iths.jojeoh.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.jojeoh.javafx to javafx.fxml;
    exports se.iths.jojeoh.javafx;
}