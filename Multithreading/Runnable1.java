public class Runnable1 implements Runnable{
    
    public void run()
    {
        System.out.println("Runnable implemented");
    }
     
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable1()); 
        t.start();
    }
}
