package Chapter17.functionalInterface.intPredicate;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = (int number) -> number < 0;

        boolean result = intPredicate.test(-1);
        System.out.println("is -1 less than zero? " + result);

    }
}
