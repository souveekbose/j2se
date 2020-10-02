/**
 * Program to demonstrate Generics
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<>(10);
        g1.printType();

        Gen<String> g2 = new Gen<>("Hello");
        g2.printType();

        Gen<Double> g3 = new Gen<>(20.5);
        g3.printType();
    }
}

class Gen<T> {
    T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    void printType() {
        System.out.println("Type of "+obj+ " is "+obj.getClass().getName());
    }
}