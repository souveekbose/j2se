/**
 * Methods need to declare exceptions with throws if not handling them. Not applicable for runtime exceptions
 * JRE handles the exception if not caught.
 * @author souveek
 */

class ExceptionThrows {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        } }
}

