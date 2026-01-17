package Stack;
import java.util.*;

public class Stack_iteration_ways
{
	    public static void main(String[] args) 
	    {

	        Stack<String> stack = new Stack<>();
	        
	        stack.push("Java");
	        stack.push("Python");
	        stack.push("C++");
	        stack.push("Ruby");

	        System.out.println("Stack: " + stack);
	        System.out.println("--------------------------------");

	        // 1️⃣ For Loop
	        System.out.println("1) Using For Loop:");
	        for (int i = 0; i < stack.size(); i++) 
	        {
	            System.out.println(stack.get(i));
	        }

	        System.out.println("--------------------------------");

	        // 2️⃣ Enhanced For Loop
	        System.out.println("2) Using Enhanced For Loop:");
	        for (String s : stack) 
	        {
	            System.out.println(s);
	        }

	        System.out.println("--------------------------------");

	        // 3️⃣ Iterator
	        System.out.println("3) Using Iterator:");
	        Iterator<String> itr = stack.iterator();
	        while (itr.hasNext()) 
	        {
	            System.out.println(itr.next());
	        }

	        System.out.println("--------------------------------");

	        // 4️⃣ ListIterator (Forward + Reverse)
	        
	        System.out.println("4) Using ListIterator (Forward):");
	        ListIterator<String> listItr = stack.listIterator();
	        while (listItr.hasNext()) 
	        {
	            System.out.println(listItr.next());
	        }
	        

	        System.out.println("   Using ListIterator (Backward):");
	        while (listItr.hasPrevious())
	        {
	            System.out.println(listItr.previous());
	        }
	    }
	}
