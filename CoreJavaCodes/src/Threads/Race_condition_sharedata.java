package Threads;
/*Race condition happens when two or more threads try to access or modify shared data at same time
 * and the final result depends on which thread finishes first.
 * A race condition is bug in multithreading where multiple threads access shared data without 
 * synchronization causing incorrect results.To solve this we need synchronization.*/
class Race_condition_sharedata
{
    int value = 0;

    public void changeValue() 
    {
        value = value + 1;
    }
}

class Race_condition_main   // ← removed public
{
    public static void main(String[] args)
    {
        Race_condition_sharedata data = new Race_condition_sharedata();

        Runnable task1 = new Runnable()
        {
            public void run() 
            {
                for(int i = 1; i <= 10000; i++) 
                {
                    data.changeValue();
                }
            }
        };

        Runnable task2 = new Runnable()
        {
            public void run() 
            {
                for(int i = 1; i <= 1000; i++)
                {
                    data.changeValue();
                }
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
        
      try 
       {  
           t1.join();
           t2.join();
        } catch(Exception e) {}

        System.out.println("Final Value = " + data.value);
    }
}
