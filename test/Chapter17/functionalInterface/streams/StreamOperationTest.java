package Chapter17.functionalInterface.streams;

import org.junit.jupiter.api.Test;

import java.awt.image.ImageProducer;
import java.util.List;
import java.util.Map;

import static Chapter17.functionalInterface.streams.StreamOperation.mapCodePointToCharacter;
import static org.junit.jupiter.api.Assertions.*;

class StreamOperationTest {


    @Test
    public void testGetEvenNumbers(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9, 10);
        List<Integer> result = StreamOperation.getEvenNumbers(numbers);
        assertNotNull(result);
        assertEquals(5,result.size());
    }

    @Test
    public void testMapCodePointToCharacter(){
    List<Integer> codePoints = List.of(65,97, 98, 66, 69,48, 65);
    Map<Integer, String> map = mapCodePointToCharacter(codePoints);
    Map<Integer, String> expected = Map.of(
            65,"A",
            97, "a",
            98, "b",
            66,"B",
            69, "E",
            48, "0");
        System.out.println(map);
        assertNotNull(map);
    assertEquals(expected, map);

}

   @Test
    public void testGetNumbersFormated(){
       List<Integer> numbers = List.of(1,2,2,3,4,4,5,6,7,8,9, 10);
       String result = StreamOperation.getNumbersFormatted(numbers);
       String expected = "[1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10]";
       assertNotNull(result);
       assertTrue(result.startsWith("["));
       assertTrue(result.endsWith("]"));
       assertEquals(expected,result);

   }
}