package Chapter17.functionalInterface.doubleToIntFunction;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {

        DoubleToIntFunction doubleToIntFunctionSample = (decimalValue) -> Double.valueOf(decimalValue).intValue();
        System.out.println(doubleToIntFunctionSample.applyAsInt(1.2));

    }
}
