package personalTasks;

import java.util.Scanner;

public class Reverse{
    public static void main(String...args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter collection of numbers: ");
        int number = input.nextInt();


        int reversedNumber = 0;
        while(number != 0 ){
            int digit = number % 10;
            reversedNumber =   reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println(reversedNumber);





    }




}