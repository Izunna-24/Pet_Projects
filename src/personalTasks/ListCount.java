package personalTasks;

import java.util.Arrays;

public class ListCount {
    public static int[] countList(int[] numbers) {
        int largest = 0;

        int[] countMostOccured = new int[2];
        int[] occuredCount = new int[numbers.length];

        for (int count = 0; count < numbers.length; count++) {
            for (int numberElement : numbers) {
                if (numbers[count] == numberElement) {
                    occuredCount[count] += 1;
                }

            }
        }

        for (int index = 0; index < occuredCount.length; index++) {
            if (occuredCount[index] > largest) {
                largest = occuredCount[index];
                countMostOccured[1] = numbers[index];
                countMostOccured[0] = largest;
            }
        }
        return countMostOccured;
    }




    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,2};
        System.out.println(Arrays.toString(countList(numbers)));



    }

}
