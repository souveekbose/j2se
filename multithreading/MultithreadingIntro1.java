/**
 * Thread creation: Implements Runnable
 */
public class MultithreadingIntro1 {
    public static void main(String[] args) {
        System.out.println("Name of main thread: "+Thread.currentThread().getName());

        Waiter newWaiter = new Waiter();
        Thread newWaiterThread = new Thread(newWaiter, "First-Waiter-Thread");
        Thread newWaiterThread2 = new Thread(newWaiter);

        newWaiterThread.start();
        newWaiterThread2.start();
    }
}


class Waiter implements Runnable {

    @Override
    public void run() {
        System.out.println("Name of Waiter thread: "+Thread.currentThread().getName());
    }
}