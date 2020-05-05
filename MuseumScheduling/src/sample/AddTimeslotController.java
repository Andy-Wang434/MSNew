package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class AddTimeslotController implements Initializable {

    @FXML
    private TextField UserInput;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void AddTime(){
        String timeslot=UserInput.getText();
        DuplicateHandle handler=new DuplicateHandle();
        String result=handler.TimeSlotDuplicate(timeslot);
        UserInput.setText(result);
    }
}
