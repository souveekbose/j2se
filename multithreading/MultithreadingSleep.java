/**
 * Thread creation: Implements Runnable
 */
public class MultithreadingSleep {
    public static void main(String[] args) {
        System.out.println("Name of main thread: "+Thread.currentThread().getName());

        Thread t1 = new Thread(new NumberPrinter(), "Task1");
        Thread t2 = new Thread(new NumberPrinter(), "Task2");
        t1.start();
        t2.start();

    }
}

class NumberPrinter implements Runnable {

    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName() + ": "+i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie) {
                System.out.println("Thread interrupted");
            }
        }
    }
}