import java.util.Map;
import java.util.stream.Collectors;

public class Charfrequency {
    public static void main(String[] args) {

        String input = "programming";

        Map<Character, Long> frequencyMap =
                input.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(
                             c -> c,
                             Collectors.counting()
                     ));

        frequencyMap.forEach((k, v) ->
                System.out.println(k + " -> " + v)
        );
    }
}
