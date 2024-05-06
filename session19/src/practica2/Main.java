package practica2;

public class Main {

    public enum Day {
        MONDAY(true) {
            public String getFeeling() {
                return "Motivated!";
            }
        },
        TUESDAY(true) {
            public String getFeeling() {
                return "Busy";
            }
        },
        WEDNESDAY(true) {
            public String getFeeling() {
                return "Halfway there!";
            }
        },
        THURSDAY(true) {
            public String getFeeling() {
                return "Anticipating";
            }
        },
        FRIDAY(true) {
            public String getFeeling() {
                return "Excited for the weekend";
            }
        },
        SATURDAY(false) {
            public String getFeeling() {
                return "Relaxed";
            }
        },
        SUNDAY(false) {
            public String getFeeling() {
                return "Lazy";
            }
        };

   /* public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }*/

        private boolean isWeekday;

        Day(boolean isWeekday) {
            this.isWeekday = isWeekday;
        }

        public boolean isWeekday() {
            return isWeekday;
        }

        public abstract String getFeeling();
    }

    /*public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("start of the work week");
                break;
            case TUESDAY:
                System.out.println("second day of the work week");
                break;
            case WEDNESDAY:
                System.out.println("middle of the work week");
                break;
            case THURSDAY:
                System.out.println("almost there");
                break;
            case FRIDAY:
                System.out.println("last day of the work week");
                break;
            case SATURDAY:
                System.out.println("weekend is here");
                break;
            case SUNDAY:
                System.out.println("relax is sunny");
                break;
            default:
                System.out.println("invalid day");
        }
    }*/

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " generaly feels like: " + day.getFeeling());
        }


       /* for (Day day : Day.values()) {
            System.out.println(day + " is a weekday: " + day.isWeekday);
        }*/
    }
}
