package com.extrak.controllers;

import com.extrak.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.application.Platform;

public class mainController {
    @FXML
    private Button buttonAddMenu;
    @FXML
    private TableView<?> expensesTable;
    @FXML
    private TableView<?> incomeTable;
    @FXML
    private ChoiceBox<String> selector;

    @FXML
    public String getSelectorValue(){
        return this.selector.getValue();
    }

    @FXML
    private void changeTable(){
        if(selector.getValue().equals("Expenses")){
            expensesTable.setVisible(true);
            incomeTable.setVisible(false);
            buttonAddMenu.setText("Add expense");
        }
        else{
            incomeTable.setVisible(true);
            expensesTable.setVisible(false);
            buttonAddMenu.setText("Add income");
        }
    }
    @FXML
    private void openAddMenu() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("addView.fxml"));
            Parent parent = fxmlLoader.load();
            addController addControllerInstance = fxmlLoader.getController();
            addControllerInstance.setMainController(this);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Add menu");
            stage.setScene(new Scene(parent));
            stage.show();
            Platform.runLater(parent::requestFocus);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void initialize(){
        changeTable();
    }
}
