package jsclasswork;

public class Difference {
    public static int[] arrayDiff(int[] numbers) {
        int highest = numbers[0];
        int lowest = numbers[0];
        int result = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > highest) {
                highest = numbers[index];
            }
            if (numbers[index] < lowest) {
                lowest = numbers[index];
            }

            result = highest - lowest;
        }
        return new int[]{result};
    }
}
