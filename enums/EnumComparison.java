/**
 * Program to demonstrate Enumeration in Java
 */
public class EnumComparison {
    public static void main(String[] args) {

        Day today = Day.SUNDAY;

        //Compare using if
        if(today == Day.SUNDAY) {
            System.out.println("enum value matched using if");
        }
        //Compare using switch-case
        switch(today) {
            case MONDAY:
                System.out.println("Matched with case Monday"); break;
            case SUNDAY:
                System.out.println("Matched with case Sunday"); break;
            default:
                System.out.println("No match found");
        }
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