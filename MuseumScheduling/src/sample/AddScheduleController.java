package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddScheduleController implements Initializable {

    @FXML
    private TextField IdInput;
    @FXML
    private TextField TimeInput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void AddSchedule() {
        int id = Integer.parseInt(IdInput.getText());
        String timeslot = TimeInput.getText();
        Schedule checkobject = new Schedule(id, timeslot);
        DuplicateHandle handler = new DuplicateHandle();
        ArrayList<String> result = handler.ScheduleDuplicate(id, timeslot);
        IdInput.setText(result.get(0));
        TimeInput.setText(result.get(1));

    }
}
