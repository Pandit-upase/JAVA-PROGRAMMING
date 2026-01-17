package Threads;
/*Interthread-communication is a way for multiple threads to work together by sending signals
 * to each other while working on shared object.It helps threads co-rdinate instead of 
 * fighting for CPU*/
public class interthreadcommunication_numberprinter
{
	    int number = 1;   // starting number
	    int limit = 10;   // print till 10

	    // Print odd numbers
	    public synchronized void printOdd() 
	    {

	        while (number <= limit) {

	            while (number % 2 == 0) 
	            {    // If even, wait
	                try 
	                {
	             wait();//->Tells the current thread to pause&release lock until other thread notifies
	                } 
	                catch (Exception e)
	                {}
	            }

	            System.out.println("Odd Thread: " + number);
	            number++;
	            
	            notify();  // wake even thread-->wake's up waiting thread
	        }
	    }

	    // Print even numbers
	    public synchronized void printEven() 
	    {
	        while (number <= limit)
	        {
	            while (number % 2 == 1) 
	            {    // If odd, wait
	                try 
	                {
	                	wait();
	                } 
	                catch (Exception e) {}
	            }

	            System.out.println("Even Thread: " + number);
	            number++;

	            notify();  // wake odd thread
	        }
	    }
	    public static void main(String[] args)
	    {

	   interthreadcommunication_numberprinter np = new interthreadcommunication_numberprinter();

	        // Thread 1 → prints odd numbers
	        Runnable odd = new Runnable()
	        {
	            public void run() 
	            {
	                np.printOdd();
	            }
	        };

	        // Thread 2 → prints even numbers
	        Runnable even = new Runnable()
	        {
	            public void run()
	            {
	                np.printEven();
	            }
	        };

	        new Thread(odd).start();
	        new Thread(even).start();
	    }
	}

	    