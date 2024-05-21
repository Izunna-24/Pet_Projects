package Chapter17.functionalInterface.streams;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamOperation {
    public static List<Integer> getEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter((number) -> number%2==0)
                .collect(Collectors.toList());
    }

    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints){
        return codePoints.stream()
                .collect(Collectors.toMap((codepoint) -> codepoint,
                        Character::toString, (a,b) ->b));
    }

    public static String getNumbersFormatted(List<Integer> numbers) {
        return numbers.stream()
                .map((number)-> number+ "")
                .collect(Collectors.joining(", ","[","]"));
    }

    public static void main(String[] args) {
        System.out.println(new Random().nextInt());
    }

}
