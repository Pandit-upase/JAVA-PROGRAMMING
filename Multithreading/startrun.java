public class startrun {
    
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Threadd"));
        //t.run();   // executes in main thread
        //t.start(); // executes in new thread
    }
}
