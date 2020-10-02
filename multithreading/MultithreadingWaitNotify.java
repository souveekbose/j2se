/**
 * Wait-Notify
 */
public class MultithreadingWaitNotify {

    public static void main(String[] args) {
        Task task = new Task();
        Thread t1 = new Thread(new OddPrinter(task), "T1");
        Thread t2 = new Thread(new EvenPrinter(task), "T2");

        t1.start();
        t2.start();
    }

}

class EvenPrinter implements Runnable{
    Task task;

    EvenPrinter(Task task) {
        this.task = task;
    }

    public void run() {
        task.printEven();
    }
}

class OddPrinter implements Runnable{
    Task task;

    OddPrinter(Task task) {
        this.task = task;
    }

    public void run() {
        task.printOdd();
    }
}


class Task {
    //first number to be printed is odd
    volatile boolean isOdd = true;

    synchronized void printEven() {
        int i=2;
        while(i<=5) {
            while(isOdd) {
                try{
                    wait();
                }catch(InterruptedException ie) {
                    System.out.println("Thread interrupted");
                }
            }

            System.out.println(Thread.currentThread().getName()+": "+i);
            i+=2;
            isOdd = true;
            notifyAll();
        }

    }

    synchronized void printOdd() {
        int i=1;
        while(i<=5) {
            while(!isOdd) {
                try{
                    wait();
                }catch(InterruptedException ie) {
                    System.out.println("Thread interrupted");
                }
            }

            System.out.println(Thread.currentThread().getName()+": "+i);
            i+=2;
            isOdd = false;
            notifyAll();
        }
    }
}
