package Java_8;

public class runnable_demo_main
{
	    public static void main(String[] args) 
	    {
	    	runnable_demo task = new runnable_demo();

	        Thread t = new Thread(task);
	        t.start();
	    }
}
