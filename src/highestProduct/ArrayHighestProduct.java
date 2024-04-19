package highestProduct;

public class ArrayHighestProduct {
    public static int maxProductOfTwo(int[] numbers) {
        if (numbers.length == 0 || numbers[0] < 1) {
            return 0;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }
        int product = Integer.MIN_VALUE;
        int result = 0;


        for (int index = 0; index < numbers.length; index++) {
            for (int count = 0; count < numbers.length; count++) {
                if (index == count) continue;
                result = numbers[index] * numbers[count];
                if (result > product) {
                    product = result;

                }
            }

        }
        return product;
    }
    public static int dualArrayMaxProduct(int[] numbers){

    }
}



