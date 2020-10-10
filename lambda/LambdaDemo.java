/**
 * Program to introduce lambda expressions
 */

@FunctionalInterface
interface NumericTest {
    boolean test(int num);
}

//Even if annotation is missing, this interface is a functional interface
interface Square {
    int getSquare(int num);
}

public class LambdaDemo {
    public static void main(String[] args) {

        //Test if number is even
        NumericTest isEven = (x) -> x%2 == 0;

        //Test if number is positive
        NumericTest isPositive = (x) -> x>0;


        System.out.println("is 10 even? "+ isEven.test(10));

        System.out.println("is -5 positive? "+ isPositive.test(-5));

        //a block of lambda expressions
        Square square = (x) -> {
            System.out.println("This block will calculate a square of number");
            return x * x;
        };

        System.out.println("The square of 20: "+ square.getSquare(20));



    }
}