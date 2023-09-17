package com.extrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.Serializable;

public class addController implements Serializable {
    mainController main = new mainController();

    String selectorValue = main.getSelectorValue();

    @FXML
    private Button addNewButton;

    @FXML
    private TextField amountField;

    @FXML
    private TextField descriptionField;

    @FXML
    void addNew(ActionEvent event) {
        if(selectorValue.equals("Expenses")){

        }else{

        }
        //String description = descriptionField.getText();
        //String amount = amountField.getText();
    }

    @FXML
    public void initialize(){
    }
}
