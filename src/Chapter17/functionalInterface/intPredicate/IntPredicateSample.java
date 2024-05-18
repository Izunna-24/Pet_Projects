package Chapter17.functionalInterface.intPredicate;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = (int number) -> number < 0;

        boolean result = intPredicate.test(-1);
        System.out.println("is -1 less than zero? " + result);






    IntPredicate isPrime = (int number) -> {
        if (number <= 1) return false;
        for (int count = 2; count <= Math.sqrt(number); count++) {
            if(number % count == 0) return false;
        }
        return true;
    };

        System.out.println("is 8 a prime number " + isPrime.test(8));
    }
}
