package Chapter17.functionalInterface.function;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String, Integer> function = (word) -> word.length();

        System.out.println(function.apply("Gwagz"));
    }
}
