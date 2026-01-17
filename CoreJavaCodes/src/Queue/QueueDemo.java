package Queue;
import java.util.*;
/* “Queue is a linear data structure that follows FIFO — First In First Out.
In Java, Queue is an interface, and the common implementation is LinkedList.
Internally, LinkedList uses a doubly linked list, so insertion happens at the tail 
and removal happens from the head in O(1) time.
Queue provides methods like offer()/add() to insert and poll()/remove() to delete.”*/
public class QueueDemo
{

	    public static void main(String[] args) 
	    {

	        Queue<String> queue = new LinkedList<>();

	        // -------- ADDING --------
	        queue.add("A");     // [A]
	        queue.add("B");     // [A, B]
	        queue.offer("C");   // [A, B, C]

	        System.out.println("After add & offer: " + queue);
	        // Output: [A, B, C]


	        // -------- VIEW HEAD --------
	        System.out.println("peek(): " + queue.peek());
	        // Output: A  (head element)

	        System.out.println("element(): " + queue.element());
	        // Output: A


	        // -------- REMOVING --------
	        System.out.println("poll(): " + queue.poll());
	        // Removes A → Output: A

	        System.out.println("After poll: " + queue);
	        // Output: [B, C]

	        System.out.println("remove(): " + queue.remove());
	        // Removes B → Output: B

	        System.out.println("After remove: " + queue);
	        // Output: [C]


	        // -------- REMOVE LAST ELEMENT --------
	        System.out.println("poll(): " + queue.poll());
	        // Output: C

	        System.out.println("poll on empty: " + queue.poll());
	        // Output: null    (because queue empty)

	        // element() or remove() will throw exception here
	    }
	}
