/* String is immutable class(Can't modify) 
 * Two methods to create string
 * (string s='abc')-->if two variables with same,value then jvm creates single object
 * in memory and shares across variables.
 *(string s=new string("abc"))->Here jvm creates new object every time whether same or diff
 *  SCP-->A space in java memory where literals are stored*/
package Strings;
public class String_Allmethods 
{
	    public static void main(String[] args)
	    {

	        // Fixed string — no input from the user
	        String str = "Hello Java Programming";

	        // 1) length() → returns number of characters
	        System.out.println("Length: " + str.length());

	        // 2) charAt(index) → returns char at given position
	        System.out.println("Character at index 2: " + str.charAt(2));

	        // 3) equals() → case-sensitive comparison
	        System.out.println("Equals 'JAVA'? " + str.equals("JAVA"));

	        // 4) equalsIgnoreCase() → case-insensitive comparison
	        System.out.println("EqualsIgnoreCase 'hello java programming'? "
	                + str.equalsIgnoreCase("hello java programming"));

	        // 5) contains() → checks if given substring exists
	        System.out.println("Contains 'Java'? " + str.contains("Java"));

	        // 6) startsWith() → checks beginning of string
	        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello"));

	        // 7) endsWith() → checks ending of string
	        System.out.println("Ends with 'ing'? " + str.endsWith("ing"));

	        // 8) indexOf() → first index of substring, -1 if not found
	        System.out.println("First index of 'a': " + str.indexOf("a"));

	        // 9) lastIndexOf() → last index of substring
	        System.out.println("Last index of 'a': " + str.lastIndexOf("a"));

	        // 10) substring(start) → returns part from start index to end
	        System.out.println("Substring from index 6: " + str.substring(6));

	        // 11) substring(start, end) → returns part between start & end
	        System.out.println("Substring from index 6 to 10: " + str.substring(6, 10));

	        // 12) toUpperCase() → convert to CAPITAL letters
	        System.out.println("Uppercase: " + str.toUpperCase());

	        // 13) toLowerCase() → convert to small letters
	        System.out.println("Lowercase: " + str.toLowerCase());

	        // 14) trim() → removes spaces at start & end
	        String spaced = "   Hello Java   ";
	        System.out.println("Trim result: '" + spaced.trim() + "'");

	        // 15) replace(old, new) → change characters or string
	        System.out.println("Replace 'a' with '*': " + str.replace("a", "*"));

	        // 16) split(regex) → break into parts using space delimiter
	        String[] words = str.split(" ");
	        System.out.println("\nWords in sentence:");
	        for (int i = 0; i < words.length; i++) 
	        { // traditional loop (your preference)
	            System.out.println(words[i]);
	        }

	        // 17) compareTo() → lexicographic value comparison
	        System.out.println("\ncompareTo 'apple': " + str.compareTo("apple"));

	        // 18) isEmpty() → true only if string is ""
	        System.out.println("Is empty? " + str.isEmpty());

	        // 19) repeat(n) → repeats same string multiple times (Java 11+)
	        System.out.println("Repeated 2 times: " + str.repeat(2));

	        // 20) join(delimiter, items...) → join multiple strings
	        String joined = String.join("-", "Java", "Spring", "MySQL");
	        System.out.println("Joined string: " + joined);

	        // 21) toCharArray() → convert to char[]
	        char[] chArr = str.toCharArray();
	        System.out.println("\nCharacters one by one:");
	        for (int i = 0; i < chArr.length; i++)
	        {
	            System.out.print(chArr[i] + " ");
	        }
	        System.out.println();

	        // 22) valueOf() → convert primitive to String
	        int x = 100;
	        String numString = String.valueOf(x);
	        System.out.println("\nValueOf output: " + numString);
	}
}
