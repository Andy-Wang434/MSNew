package sample;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestClass {
    //simple one open database and close
    @Test
    void ConnectTest1() {
        InsertApp app = new InsertApp();
        Connection con = app.connect();
        assertNotNull(con);
    }

    @Test
    void ConnectTest2() {
        LoadApp app = new LoadApp();
        Connection con = app.connect();
        assertNotNull(con);
    }

    @Test
    void DuplicatedTimeSlotsTest() {
        DuplicateHandle handler = new DuplicateHandle();
        assertEquals("Repeated Timeslot", handler.TimeSlotDuplicate("1:00-2:00"));
    }

    @Test
    void DuplicatedSchedulesTest() {
        DuplicateHandle handler = new DuplicateHandle();
        ArrayList<String> test = new ArrayList<String>();
        test = handler.ScheduleDuplicate(1, "1:00-2:00");
        assertEquals("Repeated Schedule", test.get(0));
        assertEquals("Repeated Schedule", test.get(1));
    }


    @Test
    void FxmlLoaderTest() {
        FxmlLoader loader = new FxmlLoader();
    }

    @Test
    void InsertTimeTest() {
        InsertApp app = new InsertApp();
        CheckIfExist check = new CheckIfExist();
        app.insertTime("7:30-8:00");
        assertEquals(true, check.CheckTime("7:30-8:00"));
    }

    @Test
    void InsertScheduleTest() {
        InsertApp app = new InsertApp();
        CheckIfExist check = new CheckIfExist();
        app.insertSchedule(1, "7:30-8:00");
        Schedule schedule = new Schedule(1, "7:00-8:00");
        assertEquals(true, check.CheckSchedule(schedule));
    }

}
