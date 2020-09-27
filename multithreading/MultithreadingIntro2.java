/**
 * Thread creation: Implements Runnable
 */
public class MultithreadingIntro2 {
    public static void main(String[] args) {
        System.out.println("Name of main thread: "+Thread.currentThread().getName());

        NumberPrinter printer = new NumberPrinter();
        Thread printerThread1 = new Thread(printer, "T1");
        Thread printerThread2 = new Thread(printer, "T2");

        printerThread1.start();
        printerThread2.start();
    }
}

class NumberPrinter implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie) {
                System.out.println("Thread interrupted");
            }
        }
    }
}