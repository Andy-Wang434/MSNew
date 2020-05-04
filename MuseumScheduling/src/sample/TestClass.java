package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    //simple one open database and close
    @Test
    void testconnect(){

    }
    @Test
    void testtime(){
        InsertApp app=new InsertApp();
        CheckIfExist check=new CheckIfExist();
        app.insertTime("7:30-8:00");
        assertEquals(check.CheckTime("7:30-8:00"),true);
    }

    @Test
    void testschedule(){
        InsertApp app=new InsertApp();
        CheckIfExist check=new CheckIfExist();
        app.insertSchedule(1,"7:30-8:00");
        Schedule schedule=new Schedule(1,"7:00-8:00");
        assertEquals(check.CheckSchedule(schedule),true);
    }

}
