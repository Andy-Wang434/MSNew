package sample;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestClass {

    //simple one open database and close
    @Test
    void testconnect(){
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:"+System.getProperty("user.dir")+"/src/sample/Museum.db";
            conn = DriverManager.getConnection(url);
            assertNotNull(conn);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
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
