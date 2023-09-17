package com.extrak;

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
    public ChoiceBox<String> selector;
    public String getSelectorValue(){
        return selector.getValue();
    }
    @FXML
    public void changeTable(){
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
    public void openAddMenu(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addView.fxml"));
            Parent parent = fxmlLoader.load();
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
    public void initialize(){
        changeTable();
    }
}
