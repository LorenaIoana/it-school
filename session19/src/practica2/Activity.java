package practica2;

import java.util.EnumMap;
import java.util.EnumSet;

public class Activity {

    enum Day {
        MONDAY(true),
        TUESDAY(true),
        WEDNESDAY(true),
        THURSDAY(true),
        FRIDAY(true),
        SATURDAY(false),
        SUNDAY(false);

        private boolean isWeekday;

        Day(boolean isWeekday) {
            this.isWeekday = isWeekday;
        }

        public boolean isWeekday() {
            return isWeekday;
        }
    }

    public static void main(String[] args) {
        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        EnumMap<Day, String> dayActivities = new EnumMap<>(Day.class);
        dayActivities.put(Day.MONDAY, "Work");
        dayActivities.put(Day.TUESDAY, "Work");
        dayActivities.put(Day.WEDNESDAY, "Work");
        dayActivities.put(Day.THURSDAY, "Work");
        dayActivities.put(Day.FRIDAY, "Work");
        dayActivities.put(Day.SATURDAY, "Work");
        dayActivities.put(Day.SUNDAY, "Work");

        System.out.println("Weeekdays: " + weekdays);
        System.out.println("Activities: " + dayActivities);
    }
}
