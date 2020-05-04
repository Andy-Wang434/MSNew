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

public class Page6Controller implements Initializable {
    @FXML
    private TableView TableSchedule;
    @FXML
    private TableColumn<Schedule, Integer> ColumnID;
    @FXML
    private TableColumn<Schedule, String> ColumnTime;
    private ObservableList<Schedule> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void LoadData() {
        data = FXCollections.observableArrayList();
        LoadApp app = new LoadApp();
        app.LoadSchedule(data);
        ColumnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        ColumnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        TableSchedule.setItems(null);
        TableSchedule.setItems(data);
    }
}