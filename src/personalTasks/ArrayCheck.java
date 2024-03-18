package personalTasks;

import java.util.Arrays;

public class ArrayCheck {
    public static int [] reverse(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];

            }
            return b;

    }

    public static void main(String[] args) {
        int [] chck = {12, 13, 23, 56, 13};
        System.out.println(Arrays.toString(reverse(chck)));
    }
}


   
