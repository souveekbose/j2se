/**
 * Thread creation: Implements Runnable
 */
public class MultithreadingRunnableIntro {
    public static void main(String[] args) {
        System.out.println("Name of main thread: "+Thread.currentThread().getName());
        EvenNumberPrinter enp = new EvenNumberPrinter();
        OddNumberPrinter onp = new OddNumberPrinter();

        Thread t1 = new Thread(enp, "Even Printer");
        Thread t2 = new Thread(onp, "Odd Printer");

        t1.start();
        t2.start();
    }
}

/**
 * Class to print even numbers
 */
class EvenNumberPrinter implements Runnable{
    //Entrypoint of thread
    @Override
    public void run() {
        for(int i=0; i<10; i+=2) {
            System.out.println("ThreadName: "+Thread.currentThread().getName());
        }

    }
}

/**
 * Class to print odd numbers
 */
class OddNumberPrinter implements Runnable{
    //Entrypoint of thread
    @Override
    public void run() {
        for(int i=1; i<10; i+=2) {
            System.out.println("ThreadName: "+Thread.currentThread().getName());
        }

    }
}