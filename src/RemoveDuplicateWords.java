import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateWords {


    public String removeDuplicateWordFromString(){


//        String[] line = {"alpha", "beta", "beta", "gamma", "gamma", "gamma", "delta", "alpha", "beta", "beta", "gamma", "gamma", "gamma", "delta"};
        String line = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        return Stream.of(line.split(" "))
                .distinct().collect(Collectors.joining(" "));

    }
}
