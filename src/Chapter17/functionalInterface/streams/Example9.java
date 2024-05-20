package Chapter17.functionalInterface.streams;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,1, 4, 7, 1,2,3,8,9,5,6);

        List<Integer> result =  numbers.stream()
                                       .sorted()
                                       .distinct()
                                       .toList();

        System.out.println(result);

    }
}
