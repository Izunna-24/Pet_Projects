package Chapter17.functionalInterface.intUnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorSample {
    public static void main(String[] args) {
        IntUnaryOperator addOne = (number) -> number + 1;

        System.out.println(addOne.applyAsInt(5));
        System.out.println(addOne.applyAsInt(10));
        System.out.println(addOne.applyAsInt(1));
    }
}
