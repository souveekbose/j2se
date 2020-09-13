/**
 * Program to demonstrate Enumeration in Java
 */
public class EnumAsClass {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY + " or day-" + Day.MONDAY.getDayOrdinal() + " is scheduled to "+ Day.MONDAY.getSchedule());
        System.out.println(Day.SUNDAY + " or day-" + Day.SUNDAY.getDayOrdinal() + " is scheduled to "+ Day.SUNDAY.getSchedule());
    }
}

enum Day {
    MONDAY(1, "work"),
    TUESDAY(2, "work"),
    WEDNESDAY(3, "work"),
    THURSDAY(4, "travel"),
    FRIDAY(5, "play a sport"),
    SATURDAY(6, "teach"),
    SUNDAY(7, "netflix and chill");

    private int dayOrdinal;
    private String schedule;

    Day(int dayOrdinal, String schedule) {
        this.dayOrdinal = dayOrdinal;
        this.schedule = schedule;
    }

    int getDayOrdinal() {
        return dayOrdinal;
    }

    String getSchedule() {
        return schedule;
    }
}