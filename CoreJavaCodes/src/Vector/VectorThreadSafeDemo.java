package Vector;
import java.util.*;

public class VectorThreadSafeDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {

        Vector<Integer> vector = new Vector<>();

        // Thread 1 → adds numbers 1 to 5
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) 
            {
                vector.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

        // Thread 2 → adds numbers 6 to 10
        Thread t2 = new Thread(() -> 
        {
            for (int i = 6; i <= 10; i++) 
            {
                vector.add(i);
                System.out.println("Thread 2 added: " + i);
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Final vector
        System.out.println("Final Vector: " + vector);
    }
}

