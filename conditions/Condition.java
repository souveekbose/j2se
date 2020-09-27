/**
 * Program to demonstrate for loop
 */
public class Condition {
    public static void main(String[] args) {
        String user1 = "Alex";
        String user2 = "Sam";

        // if username == ram, print "user logged in successfully"

        if(user1 == "Alex") {
            System.out.println("Alex logged in successfully");
        }
        else if(user2 == "Sam") {
            System.out.println("Sam logged in successfully");
        }
        else {
            System.out.println("Incorrect user");
        }

        switch (user1) {
            case "Alex" :
                System.out.println("Alex logged in successfully"); break;
            case "Sam":
                System.out.println("Sam logged in successfully"); break;
            default:
                System.out.println("Incorrect user");
        }
    }
}