package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Page5Controller implements Initializable {

    @FXML
    private TextField IdInput;
    @FXML
    private TextField TimeInput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void AddSchedule(){
        CheckIfExist check=new CheckIfExist();
        int id=Integer.parseInt(IdInput.getText());
        String timeslot=TimeInput.getText();
        Schedule checkobject=new Schedule(id,timeslot);
        if(check.CheckVolunteer(id)&&check.CheckTime(timeslot)){
            if(!check.CheckSchedule(checkobject)){
                InsertApp app=new InsertApp();
                app.insertSchedule(id,timeslot);
                IdInput.setText("");
                TimeInput.setText("");
            }
            else{
                IdInput.setText("Repeated Schedule");
                TimeInput.setText("Repeated Schedule");
            }
        }
        if(check.CheckVolunteer(id)==false){
            IdInput.setText("ID does not exist");
            TimeInput.setText("");
        }
        if(check.CheckTime(timeslot)==false){
            IdInput.setText("");
            TimeInput.setText("Timeslot does not exist");
        }
        if(check.CheckVolunteer(id)==false&&check.CheckTime(timeslot)==false){
            IdInput.setText("ID does not exist");
            TimeInput.setText("Timeslot does not exist");
        }
    }
}
