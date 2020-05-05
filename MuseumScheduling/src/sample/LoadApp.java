package sample;

import javafx.collections.ObservableList;

import java.sql.*;

public class LoadApp {

    public Connection connect() {
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


    public void LoadName(ObservableList<Volunteer> data) {
        String sql = "SELECT * FROM Volunteers";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Volunteer volunteer = new Volunteer(rs.getString(1), rs.getInt(2));
                data.add(volunteer);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void LoadTime(ObservableList<Time> data) {
        String sql = "SELECT * FROM TimeSlots";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Time time = new Time(rs.getString(1));
                data.add(time);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void LoadSchedule(ObservableList<Schedule> data) {
        String sql = "SELECT * FROM Connect";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Schedule schedule = new Schedule(rs.getInt(1), rs.getString(2));
                data.add(schedule);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
