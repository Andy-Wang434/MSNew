package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Schedule {
    private final IntegerProperty id;
    private final StringProperty time;

    public Schedule(int id, String time) {
        this.id = new SimpleIntegerProperty(id);
        this.time = new SimpleStringProperty(time);
    }

    public int getname(){
        return id.get();
    }

    public String gettime(){
        return time.get();
    }

    public void setname(int value){
        id.set(value);
    }

    public void settime(String value){
        time.set(value);
    }

    public IntegerProperty idProperty(){
        return id;
    }

    public StringProperty timeProperty(){
        return time;
    }
}
