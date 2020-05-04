package sample;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Time {
    private final StringProperty time;

    public Time(String time) {
        this.time = new SimpleStringProperty(time);
    }

    public String gettime(){
        return time.get();
    }

    public void settime(String value){
        time.set(value);
    }

    public StringProperty timeProperty(){
        return time;
    }

}
