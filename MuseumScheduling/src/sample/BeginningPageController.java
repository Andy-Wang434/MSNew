package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class BeginningPageController implements Initializable {

    @FXML
    private BorderPane mainPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void GoToPage1(){
        FxmlLoader object=new FxmlLoader();
        Pane view= object.getPage("Page1");
        mainPane.setCenter(view);
    }

    @FXML
    private void GoToPage2(){
        FxmlLoader object=new FxmlLoader();
        Pane view= object.getPage("Page2");
        mainPane.setCenter(view);
    }

    @FXML
    private void GoToPage3(){
        FxmlLoader object=new FxmlLoader();
        Pane view= object.getPage("Page3");
        mainPane.setCenter(view);
    }

    @FXML
    private void GoToPage4(){
        FxmlLoader object=new FxmlLoader();
        Pane view= object.getPage("Page4");
        mainPane.setCenter(view);
    }

    @FXML
    private void GoToPage5(){
        FxmlLoader object=new FxmlLoader();
        Pane view= object.getPage("Page5");
        mainPane.setCenter(view);
    }

    @FXML
    private void GoToPage6(){
        FxmlLoader object=new FxmlLoader();
        Pane view= object.getPage("Page6");
        mainPane.setCenter(view);
    }
}
