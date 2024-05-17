package Chapter17.functionalInterface.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (number, num) -> number / num;
        System.out.println(binaryOperator.apply(2, 3));
    }
}
