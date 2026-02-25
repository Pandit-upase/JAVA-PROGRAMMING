package Java_8;
import java.util.*;
import java.util.function.Consumer;
/*Consumer<T> is a functional interface with method void accept(T t).
  It takes input and performs an action but does NOT return a value.
  Any output seen on the console is a side-effect, not a returned value.
  Consumers can be chained using andThen()*/
public class ConsumerDemo 
{

    public static void main(String[] args) 
    {
        // Consumer 1 → prints the name
        Consumer<String> c1 = name -> System.out.println("Name: " + name);

        // Consumer 2 → prints length of name
        Consumer<String> c2 = name -> System.out.println("Length: " + name.length());

        // Combine both using andThen()
        Consumer<String> combined = c1.andThen(c2);

        // Using combined consumer
        combined.accept("PANDIT");
    }
}
