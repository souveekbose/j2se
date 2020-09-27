/**
 * Volatile example: Whenever value is changed, all thread read and write on the latest value
 */
public class MultithreadingVolatile implements Runnable{

    static volatile boolean flag;
    static int num = 0;

    public static void main(String[] args) {
        MultithreadingVolatile task = new MultithreadingVolatile();
        Thread t1 = new Thread(task, "T1");

        t1.start();
        try {
            Thread.sleep(1);
        }catch(InterruptedException ie) {
            System.out.println("Thread interrupted");
        }
        flag = true;
        num=12345;
    }

    public void run() {
        while(!flag) {
            System.out.println("Num is zero");
            Thread.yield();
        }
        System.out.println("Number: "+num);
    }

}