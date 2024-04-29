package dsa;

public class AdditionOperator {
    //adding two numbers without using addition operator
    public static int addPlus(int firstNumber, int secondNumber) {
        //return -(-firstNumber) - (-secondNumber);
        return firstNumber - -secondNumber;
    }


    public static int addPlusPlus(int firstNumber, int secondNumber) {

        return Math.addExact(firstNumber, secondNumber);
    }
}
//public static int addPlusPlus3(int firstNumber, int secondNumber) {
//        int added = firstNumber;
//        if(secondNumber >= 0){
//            for (int   = 0;  < ; ++) {
//
//            }
//        }
//}
//}