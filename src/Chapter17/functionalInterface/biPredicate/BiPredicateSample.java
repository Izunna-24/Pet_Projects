package Chapter17.functionalInterface.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (husband, age) -> husband.length() == age;
        System.out.println(biPredicate.test("Philip", 6));
    }
}
