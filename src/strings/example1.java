package strings;

import java.util.Set;
import java.util.TreeSet;

public class example1 {
    public static void main(String[] args) {
        String name = "cynthia";// string literal
        String name2 = new String("cynthia");

        System.out.println(name);
        System.out.println(name2);



        Set<String> names = new TreeSet<>();// will sort elements alphabetically and won't have repetition
        names.add("Paulo");
        names.add("Queen");
        names.add("Cane");
        names.add("Dones");
        names.add("Pablo");
        names.add("Kante");
        names.add("Phantom");
        names.add("Jiggy");
        System.out.println(names);
    }
}
