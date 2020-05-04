package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Page2Controller implements Initializable {

    @FXML
    private TextField UserInput;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void AddTime(){
        CheckIfExist check=new CheckIfExist();
        String timeslot=UserInput.getText();
        if(check.CheckTime(timeslot)==false){
            InsertApp app=new InsertApp();
            app.insertTime(timeslot);
            UserInput.setText("");
        }
        else{
            UserInput.setText("Repeated Timeslot");
        }
    }
}
