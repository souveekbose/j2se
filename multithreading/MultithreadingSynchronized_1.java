/**
 * Join example
 */
public class MultithreadingSynchronized_1 {

    public static void main(String[] args) {

        Task task = new Task();
        Func1Runner fr1 = new Func1Runner(task);
        Func2Runner fr2 = new Func2Runner(task);

        //Thread t1 = new Thread(fr1, "T1");
        //Thread t2 = new Thread(fr1, "T2");
        //Thread t3 = new Thread(fr1, "T3");
        Thread t4 = new Thread(fr2, "T4");
        Thread t5 = new Thread(fr2, "T5");
        //Thread t6 = new Thread(fr2, "T6");
        //t1.start();
        //t2.start();
        //t3.start();
        t4.start();
        t5.start();
        //t6.start();

    }

}

class Func1Runner implements Runnable{
    Task task;

    Func1Runner(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.func1();
    }
}

class Func2Runner implements Runnable{
    Task task;

    Func2Runner(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.func2();
    }
}


//Shared Resource
class Task {
    void func1() {
        System.out.println("Output without synchronization : ");
        for(int i=0; i<=2; i++) {
            System.out.println(Thread.currentThread().getName() +"Unsync: "+ i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie) {
                System.out.println("Thread interrupted");
            }
        }
    }

    synchronized void func2() {
        System.out.println("Output with synchronization: ");
        for (int i = 0; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName() + "Sync: " + i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie) {
                System.out.println("Thread interrupted");
            }
        }
    }

}
