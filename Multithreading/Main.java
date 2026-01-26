public class Main implements Runnable {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Main task = new Main();
        Thread t = new Thread(task);
        t.start();
    }
}
