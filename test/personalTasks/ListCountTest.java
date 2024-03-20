package personalTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListCountTest {

    @Test
    void countList() {
        int[] numbers = {9, 3, 4, 5,7, 8,8};
        int[] expected = {2, 8};
        assertArrayEquals(expected,ListCount.countList(numbers));
    }
}