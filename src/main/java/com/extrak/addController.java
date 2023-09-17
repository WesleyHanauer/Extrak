package com.extrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.Serializable;
import java.util.HashMap;

import static java.lang.Float.parseFloat;

public class addController implements Serializable {
    mainController main;

    HashMap<String, Float> expense = new HashMap<>();
    HashMap<String, Float> income = new HashMap<>();

    @FXML
    private Button addNewButton;

    @FXML
    private TextField amountField;

    @FXML
    private TextField descriptionField;

    @FXML
    void addNew(ActionEvent event) {
        String description = descriptionField.getText();
        String amount = amountField.getText();
        Float convertedAmount = parseFloat(amount);
        String selectorValue = main.getSelectorValue();

        if(selectorValue.equals("Expenses")){
            expense.put(description, convertedAmount);
        }else{
            income.put(description, convertedAmount);
        }
    }

    @FXML
    public void initialize(){
    }
}
