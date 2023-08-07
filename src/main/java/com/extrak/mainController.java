package com.extrak;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;

public class mainController {
    @FXML
    private Button buttonAddNew;
    @FXML
    private TableView<?> expensesTable;
    @FXML
    private TableView<?> incomeTable;
    @FXML
    public ChoiceBox<String> selector;
    public void changeTable(){
        if(selector.getValue().equals("Expenses")){
            expensesTable.setVisible(true);
            incomeTable.setVisible(false);
        }
        else{
            incomeTable.setVisible(true);
            expensesTable.setVisible(false);
        }
    }
    @FXML
    public void initialize(){
        buttonAddNew.setText("Add income");
    }
}
