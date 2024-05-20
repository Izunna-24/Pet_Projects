package Chapter17.functionalInterface.supplier;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> words = List.of("QWERTY","ASDFG","ABCDFFF","ABC");


        words.stream().map((word) -> word.length()).forEach(System.out::println);
    }
}
