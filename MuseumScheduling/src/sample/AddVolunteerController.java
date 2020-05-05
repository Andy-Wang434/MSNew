package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class AddVolunteerController implements Initializable {

    @FXML
    private TextField UserInput;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void AddVolunteer(){
        InsertApp app=new InsertApp();
        app.insertVolunteer(UserInput.getText());
        UserInput.setText("");
    }
}
