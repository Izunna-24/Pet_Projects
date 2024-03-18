package fireDrillThree;


import java.util.Arrays;

public class TaskOne {
    public static int [] returnArray(int score) {
        int[] number = new int[9];
        for (int index = 0; index < number.length; index++) {
            number[index] = score;
        }
        return number;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(TaskOne.returnArray(9)));
    }
    }



