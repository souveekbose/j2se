/**
 * Program to introduce lambda expressions
 */

//The interface can have only one method
@FunctionalInterface
interface Square {
    int getSquare(int num);
}

class SquareImpl implements Square{
    @Override
    public int getSquare(int x) {
        return x * x;
    }
}

public class LambdaIntro {
    public static void main(String[] args) {

        //Traditional approach: Implement the interface and initialize the object. Then access the methods in the object.
        Square square = new SquareImpl();
        System.out.println("Result using interface implementation: "+square.getSquare(10));

        //Lambda expression: Does not require implementation of interface. Only the logic needs to be defined.
        Square result = (x) -> x * x;

        System.out.println("Result using lambda: "+result.getSquare(10));
    }
}