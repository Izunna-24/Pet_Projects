package Chapter17.functionalInterface.toDoubleBiFunction;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionSample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer,Integer> getAverage = (score1, score2) -> (score1+score2) / 2.00;


        System.out.println(getAverage.applyAsDouble(78, 89));
        System.out.println(getAverage.applyAsDouble(99, 20));

    }
}
