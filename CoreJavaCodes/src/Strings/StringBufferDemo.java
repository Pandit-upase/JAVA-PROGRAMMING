/* StringBuffer is a mutable and thread-safe class  
 * used when we need frequent string modifications in 
 * a multi-threaded environment. It updates the same
 * object in heap instead of creating new ones, 
 * so it is faster and memory-efficient compared to String. */
package Strings;
public class StringBufferDemo
    {
		    public static void main(String[] args) {

	        // Creating StringBuffer (mutable + thread-safe)
	        StringBuffer sb = new StringBuffer("Java");

	        sb.append(" Programming");
	        System.out.println("After append: " + sb); 
	        // Output → After append: Java Programming

	        sb.insert(5, "Core ");
	        System.out.println("After insert: " + sb); 
	        // Output → After insert: Java Core Programming

	        sb.delete(5, 10);   // deletes "Core "
	        System.out.println("After delete: " + sb); 
	        // Output → After delete: Java Programming

	        sb.replace(5, 16, "World");
	        System.out.println("After replace: " + sb); 
	        // Output → After replace: Java World

	        sb.reverse();
	        System.out.println("After reverse: " + sb); 
	        // Output → After reverse: dlroW avaJ

	        System.out.println("Length: " + sb.length());
	        // Output → Length: 10

	        System.out.println("Capacity: " + sb.capacity());
	        // Output → Capacity: (depends on JVM, usually 20 for this case)
	    }
	}

