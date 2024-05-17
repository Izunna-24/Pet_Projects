package Chapter17.functionalInterface.streams;


import serialization.Transaction;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20,30,40,50);
        Stream<Integer> stream = numbers.stream();
        stream.forEach((number) -> System.out.println(number));

        Stream<String> emptyStream = Stream.empty();


        Stream<Integer> integerStream = Stream.generate(() -> new SecureRandom().nextInt()).limit(10);
        integerStream.forEach(System.out::println);
        integerStream.forEach((number) -> System.out.println(number));
        //:: method reference
    }
}
