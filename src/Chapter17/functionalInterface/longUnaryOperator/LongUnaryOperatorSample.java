package Chapter17.functionalInterface.longUnaryOperator;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = (number) -> 2 * number;
        Long result = longUnaryOperator.applyAsLong(30);
        System.out.println(result);
    }
}
