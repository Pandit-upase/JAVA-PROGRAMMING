package Queue;
import java.util.*;

/*Deque (Double Ended Queue) allows insertion and removal from both ends.
It is an interface, and the main implementation is ArrayDeque.
Internally, ArrayDeque uses a resizable circular array.
Elements wrap around the array using head and tail pointers.
Both add/remove at front or back take O(1) time.”*/
public class Dequeue 
{
	
	    public static void main(String[] args) 
	    {

	        Deque<String> dq = new ArrayDeque<>();

	        dq.addFirst("A");  
	        System.out.println("After addFirst(A): " + dq);    // [A]

	        dq.addLast("B");
	        System.out.println("After addLast(B): " + dq);     // [A, B]

	        dq.addFirst("C");
	        System.out.println("After addFirst(C): " + dq);    // [C, A, B]

	        System.out.println("peekFirst(): " + dq.peekFirst()); // C
	        System.out.println("peekLast(): " + dq.peekLast());   // B

	        dq.removeFirst();
	        System.out.println("After removeFirst(): " + dq);  // [A, B]

	        dq.removeLast();
	        System.out.println("After removeLast(): " + dq);   // [A]
	    }
	}
