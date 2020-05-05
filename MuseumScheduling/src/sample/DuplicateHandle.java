package sample;

import java.util.ArrayList;

public class DuplicateHandle {

    public String TimeSlotDuplicate(String timeslot) {
        CheckIfExist check = new CheckIfExist();

        if (check.CheckTime(timeslot)) {
            return "Repeated Timeslot";
        }
        InsertApp app = new InsertApp();
        app.insertTime(timeslot);
        return "";
    }

    public ArrayList<String> ScheduleDuplicate(int volunteerid, String timeslot) {
        ArrayList<String> result = new ArrayList<String>();
        CheckIfExist check = new CheckIfExist();
        Schedule checkobject = new Schedule(volunteerid, timeslot);
        if (check.CheckVolunteer(volunteerid) && check.CheckTime(timeslot)) {
            if (!check.CheckSchedule(checkobject)) {
                InsertApp app = new InsertApp();
                app.insertSchedule(volunteerid, timeslot);
                result.add("");
                result.add("");
            } else {
                result.add("Repeated Schedule");
                result.add("Repeated Schedule");
            }
        } else if (!check.CheckVolunteer(volunteerid) && check.CheckTime(timeslot)) {
            result.add("ID does not exist");
            result.add("");
        } else if (check.CheckVolunteer(volunteerid) && !check.CheckTime(timeslot)) {
            result.add("");
            result.add("Timeslot does not exist");
        } else {
            result.add("ID does not exist");
            result.add("Timeslot does not exist");
        }

        return result;
    }
}
