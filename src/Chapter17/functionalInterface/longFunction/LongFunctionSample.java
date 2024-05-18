package Chapter17.functionalInterface.longFunction;

import java.util.function.LongFunction;

public class LongFunctionSample {
    public static void main(String[] args) {
        LongFunction<String> longFunction = Long::toString;

        String result = longFunction.apply(1938478777834743L);
        System.out.println(" String equivalence of the L type given is " + result);

    }
}
