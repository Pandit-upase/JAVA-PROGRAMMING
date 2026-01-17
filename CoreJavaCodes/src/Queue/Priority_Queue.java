package Queue;
import java.util.*;
public class Priority_Queue
{
	    public static void main(String[] args) 
	    {

	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        pq.add(30);
	        pq.add(10);
	        pq.add(20);

	        System.out.println("PriorityQueue: " + pq);//[10,30,20]

	        System.out.println("Head element (min): " + pq.peek());//[10]

	        System.out.println("Removed: " + pq.poll());//[10]

	        System.out.println("After poll: " + pq);//[20,30]
	    }
	}

