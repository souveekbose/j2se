/**
 * Class to show an exceptional scenario using a division operation on two numbers.
 * JRE handles the exception if not caught.
 * @author souveek
 */
public class ExceptionIntro {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        //Divide the dividend with the divisor. Since the quotient could be a decimal, storing in a float
        float quotient = dividend / divisor;
        //Print the quotient
        System.out.println("Quotient: " + quotient);
    }
}