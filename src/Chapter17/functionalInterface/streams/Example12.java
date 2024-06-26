package Chapter17.functionalInterface.streams;


import java.util.List;
import java.util.stream.Stream;

public class Example12 {

        public static void main(String[] args) {
            List<String> list = List.of("ABCD", "HELLO", "Hey"
            );

            System.out.println(list.stream()
                    .flatMap((element) -> Stream.of(new StringBuilder(element).reverse())).toList());
        }

}
