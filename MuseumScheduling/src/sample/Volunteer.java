package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Volunteer {
    private final StringProperty name;
    private final IntegerProperty id;

    public Volunteer(String name, int id) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleIntegerProperty(id);
    }

    public String getname(){
        return name.get();
    }

    public int getid() { return id.get(); }

    public void setname(String value){
        name.set(value);
    }

    public void setid(int value) { id.set(value); }

    public StringProperty nameProperty(){
        return name;
    }

    public IntegerProperty idProperty() { return id; }


}
