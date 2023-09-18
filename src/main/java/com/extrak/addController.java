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
    public void setMainController(mainController main) {
        this.main = main;
    }
    HashMap<Integer, Expense> expense = new HashMap<>();
    HashMap<Integer, Income> income = new HashMap<>();

    @FXML
    private Button addNewButton;

    @FXML
    private TextField amountField;

    @FXML
    private TextField descriptionField;

    mainController main;

    @FXML
    void addNew(ActionEvent event) {
        System.out.println(main.getSelectorValue());
        //String description = descriptionField.getText();
        //String amount = amountField.getText();
        //Float convertedAmount = parseFloat(amount);
    }

    @FXML
    public void initialize(){
    }
}
