package personalTasks;

import java.util.Arrays;

public class ListCount {
    public static int[] countList(int[] numbers) {
        int highestAppearedElement = 0;

        int[] expectedDisplay = new int[2];
        int[] elementsCounter = new int[numbers.length];

        for (int count = 0; count < numbers.length; count++) {
            for (int checker : numbers) {
                if (numbers[count] == checker) {
                    elementsCounter[count] += 1;
                }

            }
        }

        for (int index = 0; index < elementsCounter.length; index++) {
            if (elementsCounter[index] > highestAppearedElement) {
                highestAppearedElement = elementsCounter[index];
                expectedDisplay[1] = numbers[index];
                expectedDisplay[0] = highestAppearedElement;
            }
        }
        return expectedDisplay;
    }




    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,2};
        System.out.println(Arrays.toString(countList(numbers)));



    }

}
