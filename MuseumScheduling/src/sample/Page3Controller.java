package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Page3Controller implements Initializable {
    @FXML
    private TableView TableName;
    @FXML
    private TableColumn<Volunteer, String> ColumnName;
    @FXML
    private TableColumn<Volunteer, Integer> ColumnId;
    private ObservableList<Volunteer> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void LoadData(){
        data= FXCollections.observableArrayList();
        LoadApp app=new LoadApp();
        app.LoadName(data);
        ColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableName.setItems(null);
        TableName.setItems(data);
    }
}
