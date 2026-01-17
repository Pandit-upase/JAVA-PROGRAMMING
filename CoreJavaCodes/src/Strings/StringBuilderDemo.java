/*StringBuilder is a mutable and fastest class for string modification,
 * in single-threaded programs, because it updates the same buffer in heap,
 * instead of creating new objects.
 *It is preferred for loops, concatenations, logs, and dynamic text building,
   where high performance is required*/
package Strings;
public class StringBuilderDemo 
{
	    public static void main(String[] args) {

	        // StringBuilder (mutable + fastest for single-thread)
	        StringBuilder sb = new StringBuilder("Java");

	        sb.append(" Programming");
	        System.out.println("After append: " + sb);
	        // Output → Java Programming

	        sb.insert(5, "Core ");
	        System.out.println("After insert: " + sb);
	        // Output → Java Core Programming

	        sb.delete(5, 10); // deletes "Core "
	        System.out.println("After delete: " + sb);
	        // Output → Java Programming

	        sb.replace(5, 16, "World");
	        System.out.println("After replace: " + sb);
	        // Output → Java World

	        sb.reverse();
	        System.out.println("After reverse: " + sb);
	        // Output → dlroW avaJ

	        System.out.println("Length: " + sb.length());
	        // Output → 10

	        System.out.println("Capacity: " + sb.capacity());
	        // Output → depends on JVM (usually 20+)
	    }
	}
