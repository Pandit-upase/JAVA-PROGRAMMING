package Threads;
/*A synchronized block in java allows only 1 thread at a time to execute a specific part of code
 *ensuring thread safety with better performance */
class Threadblock_whiteboard
{
    String writtenby = "";

    public void write(String name)
    {
        synchronized(this)
        {
            writtenby = name;
            System.out.println(name + " wrote on board");
        }
    }
        public static void main(String[] args)
        {
            Threadblock_whiteboard wb = new Threadblock_whiteboard();

            // Runnable 1
            Runnable t1 = new Runnable() 
            {
                public void run() 
                {
                    wb.write("Pandit");
                }
            };

            // Runnable 2
            Runnable t2 = new Runnable()
            {
                public void run() 
                {
                    wb.write("Ram");
                }
            };

            Thread th1 = new Thread(t1);
            Thread th2 = new Thread(t2);

            th1.start();
            th2.start();

            try {
                th1.join();
                th2.join();
            }
            catch (Exception e) {}

            System.out.println("Final Written By: " + wb.writtenby);
        }
    }



 