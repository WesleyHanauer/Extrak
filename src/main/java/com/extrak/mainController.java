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

public class mainController {
    @FXML
    private Button buttonAddNew;
    @FXML
    private TableView<?> expensesTable;
    @FXML
    private TableView<?> incomeTable;
    @FXML
    public ChoiceBox<String> selector;
    @FXML
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
    public void openAddMenu(){
        try {
            //Not sure why but it works this way.
            //TODO: Make this part better.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addView.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Add menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void initialize(){
        buttonAddNew.setText("Add income");
    }
}
