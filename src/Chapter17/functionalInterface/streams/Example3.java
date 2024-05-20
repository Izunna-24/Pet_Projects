package Chapter17.functionalInterface.streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50,33);

        numbers.stream().filter((number) -> number%2 != 0).forEach((number) -> System.out.println(number));
    }
}
