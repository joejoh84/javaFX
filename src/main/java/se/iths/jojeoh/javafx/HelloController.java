package se.iths.jojeoh.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText2;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText2.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClick2() {welcomeText.setText("Welcome to JavaFX Application!");}
}