package sample;

import javafx.collections.ObservableList;

import java.sql.*;
import java.util.ArrayList;

public class CheckIfExist {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/src/sample/Museum.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public boolean CheckVolunteer(int id) {
        String sql = "SELECT ID FROM Volunteers";
        ArrayList<Integer> checker = new ArrayList<Integer>();
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                checker.add(rs.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        if (checker.contains(id)) {
            return true;
        }
        return false;
    }

    public boolean CheckTime(String timeslot) {
        ArrayList<String> checker = new ArrayList<String>();
        String sql = "SELECT * FROM TimeSlots";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                checker.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (checker.contains(timeslot)) {
            return true;
        }
        return false;
    }

    public boolean CheckSchedule(Schedule schedule) {
        ArrayList<Schedule> checker = new ArrayList<Schedule>();
        String sql = "SELECT * FROM Connect";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Schedule s = new Schedule(rs.getInt(1), rs.getString(2));
                checker.add(schedule);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        if (checker.contains(schedule)) {
            return true;
        }
        return false;
    }


}
