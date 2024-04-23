package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    public void stringCanBeReversedTest() {
        String  sentence = "It is still a beautiful world";
        String  result = "world beautiful a still is It";
        assertEquals(result,ReverseString.stringReverser(sentence));
    }
}