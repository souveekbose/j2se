/**
 * Program to demonstrate String comparison
 */
public class StringComparison {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        String s3 = "Hello";
        String s4 = "Hello";

        String s5 = s1;

        // ==
        if(s1 == s2) {
            System.out.println("S1 and S2 are equal using ==");
        } else {
            System.out.println("S1 and S2 are NOT equal using ==");
        }
        // ==
        if(s1 == s3) {
            System.out.println("S1 and S3 are equal using ==");
        } else {
            System.out.println("S1 and S3 are NOT equal using ==");
        }

        // ==
        if(s3 == s4) {
            System.out.println("S3 and S4 are equal using ==");
        } else {
            System.out.println("S3 and S4 are NOT equal using ==");
        }

        if(s1 == s5) {
            System.out.println("S1 and S5 are equal using ==");
        } else {
            System.out.println("S1 and S5 are NOT equal using ==");
        }
        //equals
        if(s1.equals(s2)) {
            System.out.println("S1 and S2 are equal using equals()");
        } else {
            System.out.println("S1 and S2 are NOT equal using equals()");
        }

    }
}