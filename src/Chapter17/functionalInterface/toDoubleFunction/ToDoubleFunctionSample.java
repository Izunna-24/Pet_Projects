package Chapter17.functionalInterface.toDoubleFunction;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<String> toDouble = (word) -> (double) word.length();


        System.out.println(toDouble.applyAsDouble("canes"));
        System.out.println(toDouble.applyAsDouble("flaunt"));
    }
}
