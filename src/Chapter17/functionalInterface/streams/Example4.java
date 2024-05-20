package Chapter17.functionalInterface.streams;

import Chapter17.functionalInterface.Transaction;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Transaction> numbers = List.of(new Transaction("$2000","12345"),
                new Transaction("$1000","98765"),
                new Transaction("$100","24689"));



    numbers.stream();
    }


}
