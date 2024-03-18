package personalTasks;

public class MethodOverload {

    public static  int square(int intValue){
        System.out.printf("%nCalled square with int arg: %d%n ", intValue);
        return intValue * intValue;
    }
    public static  double square(double doubleValue){
        System.out.printf("%nCalled square with double arg: %.2f%n ", doubleValue);
        return doubleValue * doubleValue;
    }


    public static void main(String[] args) {
        System.out.printf("Square of Integer 7 is: %d%n", square(7));
        System.out.printf("Square of double 7.5 is: %f%n", square(7.5));

    }
}
