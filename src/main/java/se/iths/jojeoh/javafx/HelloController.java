package se.iths.jojeoh.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {
    //Om model är tung är det bättre att hålla en instans i minnet.
    Model model;
    @FXML
    private Label welcomeText;

    @FXML
    private CheckBox checkBox1;

    @FXML
    private Label welcomeText2;

    @FXML
    private TextField textField1;

    @FXML
    private Canvas canvas;

    /**
     * Konstruktor fungerar inte i javaFX, by convention använder man istället den här metoden
     */
    public void initialize(){
        checkBox1.setSelected(true);
        model = new Model();
        /*
        model.textProperty().bindBidirectional(textField1.textProperty());
        textField1.disableProperty().bind(checkBox1.selectedProperty().not());
        */
        /*textField1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
            }
        });*/
    }
    @FXML
    protected void onHelloButtonClick() {
        model.setText("Button Pressed");
        //welcomeText2.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClick2() {welcomeText.setText("Welcome to JavaFX Application!");}

    @FXML
    protected void onCheckBoxChecked(ActionEvent actionEvent) {
        if(actionEvent.getSource() == checkBox1)
            welcomeText.setText(checkBox1.getText().concat(" is checked: " + String.valueOf(checkBox1.isSelected())));
    }

    @FXML
    protected void giveMouseCoordinates(MouseEvent e){
        /*Koordinater
        * e.getX - element coordinates
        * e.getScreenX - screen coordinates
        * e.getScenX - scen coordinates
        * */
        //welcomeText.setText(("x: " + e.getX() + ",y: " + e.getY()));
    }


    StringBuilder sb = new StringBuilder();
    @FXML
    protected void writeToLabel(KeyEvent keyEvent) {
        if(keyEvent.getCharacter().indexOf(8) != 0 ){
            sb.append(keyEvent.getCharacter());
        }else if(sb.length() > 0){
            sb.delete(sb.length()-1,sb.length());
        }
        welcomeText2.setText(sb.toString());
    }

    public void canvasClicked(MouseEvent mouseEvent) {
        welcomeText2.setText("x: " + mouseEvent.getX() + "y: " + mouseEvent.getY());

        var context = canvas.getGraphicsContext2D();
        context.fillOval(mouseEvent.getX(), mouseEvent.getY(), 10,10);
    }
}