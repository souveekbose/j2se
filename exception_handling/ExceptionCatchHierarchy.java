/**
 * This program contains an error and cannot be compiled.
 * Exceptions should be caught in increasing order of hierarchy i.e. smallest first
 * @author souveek
 */
public class ExceptionCatchHierarchy {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        float quotient = 0;
        try {
            //Divide the dividend with the divisor. Since the quotient could be a decimal, storing in a float
            quotient = dividend / divisor;
        }catch(Exception e) {
            System.out.println("Got an Exception!! Setting quotient to -1");
            quotient = -1;
        }catch(ArithmeticException ae) {
            System.out.println("Unreachable code");
            quotient = -1;
        }
        //Print the quotient
        System.out.println("Quotient: " + quotient);
    }
}