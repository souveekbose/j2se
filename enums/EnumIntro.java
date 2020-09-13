/**
 * Program to demonstrate Enumeration in Java
 */
public class EnumIntro {
    public static void main(String[] args) {
        //List all the enum constants
        Day days[] = Day.values();
        System.out.println("  Using values():");
        for(Day day : days) {
            System.out.println(day);
        }

        //Display a constant value
        System.out.println("  Using valueOf()");
        System.out.println("Today is: "+Day.valueOf("SUNDAY"));
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}