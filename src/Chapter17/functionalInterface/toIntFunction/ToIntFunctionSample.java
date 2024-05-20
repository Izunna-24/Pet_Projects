package Chapter17.functionalInterface.toIntFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntFunction<Double> toIntFunction = (score) -> (int) (score + 10);

        System.out.println(toIntFunction.applyAsInt(55.89));
    }
}
