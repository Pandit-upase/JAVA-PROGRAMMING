class PrintNums implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
public class numsMain {
    public static void main(String[] args) {
        PrintNums task = new PrintNums();
        Thread t = new Thread(task);
        t.start();
    }
}
