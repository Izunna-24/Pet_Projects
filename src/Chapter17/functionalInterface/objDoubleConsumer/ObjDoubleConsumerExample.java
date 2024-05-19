package Chapter17.functionalInterface.objDoubleConsumer;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerExample {
    public static void main(String[] args) {


        Human human = new Human("Izunna", 89);
        Human human2 = new Human("Korede", 12);
        Human human3 = new Human("Akin", 23);

        ObjDoubleConsumer<Human> showAccountBalance = (being,balance) ->{
            System.out.println("This customer named " + being.getName() + " of age "
                    + being.getAge() + " has a balance of " + balance);
        };

        showAccountBalance.accept(human2, 100.9);
        showAccountBalance.accept(human, 99.9);
        showAccountBalance.accept(human3, 120.94);
    }

}
