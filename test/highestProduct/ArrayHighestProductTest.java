package highestProduct;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayHighestProductTest {

    @Test
    public void functionCanReturnHighestProductOfAnyTwoElementTest(){
            int[] given = {-2};
            int expected = 0;
            assertEquals(expected, ArrayHighestProduct.maxProductOfTwo(given));
        }


@Test
public void functionCanReturnHighestProductOfAnyTwoElementAtZeroTest(){
    int[] given = {1,-2};
    int expected = -2;
    assertEquals(expected, ArrayHighestProduct.maxProductOfTwo(given));
}


@Test
public void functionCanReturnHighestProductOfAnyTwoElementAtOneTest(){
    int[] given = {8};
    int expected = 8;
    assertEquals(expected, ArrayHighestProduct.maxProductOfTwo(given));
}
@Test
public void functionCanReturnHighestProductOfAnyTwoTest(){
    int[] given = {};
    int expected = 0;
    assertEquals(expected, ArrayHighestProduct.maxProductOfTwo(given));
}
}



