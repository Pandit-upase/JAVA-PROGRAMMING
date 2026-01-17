package BasiCodes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Builtinsorting {

	
	public static void main(String[] args) {
		
		Integer a[]= {10,30,20,50,40};
		System.out.println("Before sorting " + Arrays.toString(a));
		
		//Arrays.parallelSort(a);
		//System.out.println("After sorting using parallel " +  Arrays.toString(a) );
		
		/*Arrays.sort(a);
		System.out.println("After sorting using sort " + Arrays.toString(a) );*/
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After reversing the sorted array " + Arrays.toString(a) );
	}
}
