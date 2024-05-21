package Chapter17.functionalInterface.streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        var stats = numbers.stream()
                .flatMapToInt((element) -> IntStream.of(element*2))
                .summaryStatistics();

        System.out.println("The stats of the list is " + stats);


    }
}
