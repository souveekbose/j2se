import java.util.concurrent.*;

/**
 * Volatile example: Whenever value is changed, all thread read and write on the latest value
 */

public class MultithreadingExecutor {

    public static void main(String[] args) {
        Task task = new Task();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new TaskRunnerA(task));
        executor.submit(new TaskRunnerB(task));
        executor.shutdown();
    }
}

class TaskRunnerA implements Runnable {

    private Task task;

    TaskRunnerA(Task task) {
        this.task = task;
    }
    public void run() {
        task.printA();
    }
}

class TaskRunnerB implements Runnable {

    private Task task;

    TaskRunnerB(Task task) {
        this.task = task;
    }
    public void run() {
        task.printB();
    }
}

class Task {
    void printA() {
        System.out.println(Thread.currentThread().getName() + ": "+"A");
    }

    void printB() {
        System.out.println(Thread.currentThread().getName() + ": "+"B");
    }
}