package Chapter17.functionalInterface.biFunction;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {


    BiFunction<String, Integer, Boolean> biFunction = (word, number) -> word.length() == number;

    Boolean result = biFunction.apply("Pronto",19);

        System.out.println(result);
    }
}
