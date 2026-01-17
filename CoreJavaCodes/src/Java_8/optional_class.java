package Java_8;
import java.util.Optional;
/*Optional is a container object introduced in Java 8 to avoid NullPointerException.
 It may or may not contain a value.We use methods like of(), ofNullable(), orElse(), 
 orElseGet(), isPresent(), and ifPresent() to safely handle null values without crashing
 the program*/
public class optional_class 
{
	    public static void main(String[] args) 
	    {
	        // Example variable which may be null
	        String name = "heyyss";

	        // 1️⃣ Create Optional that may contain null
	        Optional<String> optionalName = Optional.ofNullable(name);

	        // 2️⃣ Print the value if present, else print default
	        System.out.println(optionalName.orElse("Default Name"));

	        // 3️⃣ Check if value is present
	        if (optionalName.isPresent())
	        {
	            System.out.println("Value: " + optionalName.get());
	        } 
	        else
	        {
	            System.out.println("Value not present");
	        }

	        // 4️⃣ Using orElseGet (runs only when value is null)
	        String value = optionalName.orElseGet(() -> "Generated Default");
	        System.out.println(value);

	        // 5️⃣ Using ifPresent (print only if value exists)
	        Optional<String> actualName = Optional.of("SONU");
	        actualName.ifPresent(n -> System.out.println("Hello " + n));
	    }
	}

