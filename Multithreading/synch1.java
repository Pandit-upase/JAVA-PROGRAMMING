public class synch1 implements Runnable {

    int count = 0;

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
        synch1 task = new synch1();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(task.count);
    }
}
