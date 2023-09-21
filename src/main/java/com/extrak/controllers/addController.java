package com.extrak.controllers;

import com.extrak.objects.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.Serializable;
import java.util.HashMap;

public class addController implements Serializable {
    com.extrak.controllers.mainController mainController;

    public void setMainController(mainController mainController) {
        this.mainController = mainController;
    }

    HashMap<Integer, Expense> expense = new HashMap<>();
    HashMap<Integer, Income> income = new HashMap<>();

    @FXML
    private Button addNewButton;

    @FXML
    private TextField amountField;

    @FXML
    private TextField descriptionField;

    private void closeStage(){
        Stage stage = (Stage) addNewButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void addNew(ActionEvent event){
        /*String description = descriptionField.getText();
        Float amount = parseFloat(amountField.getText());
        if(mainController.getSelectorValue().equals("Expenses")){

        }
        else if(mainController.getSelectorValue().equals("Income")){
            closeStage();
        }
        else{

        }
        */
    }

    @FXML
    private void initialize(){
    }
}
