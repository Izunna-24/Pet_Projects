package Chapter17.functionalInterface.biConsumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (firstname, age) -> printFullName(firstname, age);


        biConsumer.accept("Izunna", 4);
        Map<String, Integer> map = Map.of(
                "John",10,
                "Jane",12,
                "Jack", 18
        );

        map.forEach(biConsumer);
    }

    private static void printFullName(String firstname, Integer age) {
        System.out.println(firstname+" is " + age + " old");
    }
}