module se.iths.jojeoh.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    // requires java.base; laddas automatiskt in.

    opens se.iths.jojeoh.javafx to javafx.fxml;
    exports se.iths.jojeoh.javafx;
}