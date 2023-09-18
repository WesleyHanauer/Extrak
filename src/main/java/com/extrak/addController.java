package com.extrak;

import com.extrak.objects.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.Serializable;
import java.util.HashMap;
import static java.lang.Float.parseFloat;
public class addController implements Serializable {
    mainController mainController;

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

    @FXML
    private void addNew(ActionEvent event){
        String description = descriptionField.getText();
        Float amount = parseFloat(amountField.getText());
    }

    @FXML
    private void initialize(){
    }
}
