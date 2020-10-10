/**
 * Program to demonstrate String character extractions
 */
public class StringExtras {
    public static void main(String[] args) {

        String s1 = "Hello ";
        String s2 = "World";

        System.out.println("Concatenating s2 after String s1: " + s1.concat(s2));
        System.out.println("after concatenations String s1: " + s1);

        StringBuffer s3 = new StringBuffer("Hey ");
        System.out.println("Concatenating s2 after StringBuffer s3: "+s3.append(s2));
        System.out.println("after concatenations StringBuffer s2: "+s3);


    }
}