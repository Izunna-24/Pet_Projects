package jsclasswork;

import org.junit.jupiter.api.Test;
import personalTasks.ListCount;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceTest {

    @Test
    public void arrayDiffTest() {
        int [] numbers = {2,4,5,7,8};
        int [] expected = {6};
        assertArrayEquals(expected, Difference.arrayDiff(numbers));
    }
}

