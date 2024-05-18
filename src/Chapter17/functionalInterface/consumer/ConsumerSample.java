package Chapter17.functionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word)-> {
            System.out.println("You have entered " + word);
            System.out.println(word);;
        };
        List<String> names = List.of("John","Joe", "Johnny");
        names.forEach(consumer);

    }
}
