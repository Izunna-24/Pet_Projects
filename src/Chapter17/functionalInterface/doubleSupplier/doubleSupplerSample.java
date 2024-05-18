package Chapter17.functionalInterface.doubleSupplier;

import java.util.function.DoubleSupplier;

public class doubleSupplerSample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> {
            double firstScore = 10;
            double secondScore = 99;

            return firstScore + secondScore;
        };
        System.out.println("The total value as double supplier is " + doubleSupplier.getAsDouble());
    }
}
