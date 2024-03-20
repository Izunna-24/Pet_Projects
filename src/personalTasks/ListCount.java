package personalTasks;

import java.util.Arrays;

public class ListCount {
    public static int countList(int[] numbers){
        int countMostOccured = 0;
        int occuredCount = 0;

        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index] == numbers[index]){
                countMostOccured += 1;
            }
        }
            return countMostOccured;
        }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,2};
        countList(numbers);

        System.out.println(Arrays.toString(new int[]{countList(numbers)}));

    }

}
