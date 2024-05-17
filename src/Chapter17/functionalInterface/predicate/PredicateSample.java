package Chapter17.functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = (man) -> {
            return man;
        };
        //predicate.test();
    }
}
