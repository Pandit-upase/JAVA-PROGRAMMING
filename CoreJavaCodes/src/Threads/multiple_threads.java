package Threads;

// First thread - prints numbers
public class multiple_threads extends Thread 
{
    public void run() 
    {
        for(int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread-1 → " + i);
        }
    }
}

// Second thread - prints letters
class multiple_threads2 extends Thread 
{
    public void run() 
    {
        for(char ch = 'A'; ch <= 'E'; ch++) 
        {
            System.out.println("Thread-2 → " + ch);
        }
    }
}

// MAIN CLASS (must be outside others)
class multiple_threads_demo 
{
    public static void main(String[] args) 
    {
        multiple_threads t1 = new multiple_threads();
        multiple_threads2 t2 = new multiple_threads2();

        t1.start();
        t2.start();
    }
}
