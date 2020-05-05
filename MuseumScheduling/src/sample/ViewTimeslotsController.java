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

public class ViewTimeslotsController implements Initializable {
    @FXML
    private TableView TableTime;
    @FXML
    private TableColumn<Time, String> ColumnTime;
    private ObservableList<Time> data;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void LoadData() {
        data = FXCollections.observableArrayList();
        LoadApp app = new LoadApp();
        app.LoadTime(data);
        ColumnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        TableTime.setItems(null);
        TableTime.setItems(data);
    }
}

