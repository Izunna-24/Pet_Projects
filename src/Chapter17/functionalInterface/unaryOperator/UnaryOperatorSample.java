package Chapter17.functionalInterface.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number) -> number * 2;

        System.out.println(unaryOperator.apply(4));
    }
}
