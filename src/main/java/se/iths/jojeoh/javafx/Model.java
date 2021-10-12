package se.iths.jojeoh.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
    private  StringProperty text;

    public Model(){
        this.text = new SimpleStringProperty();
    }

    public String getText() {
        return text.getValue();
    }

    public void setText(String text) {
        this.text.set(text);
    }

    public StringProperty textProperty(){
        return this.text;
    }
}
