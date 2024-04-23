package strings;

public class example2 {
    public static void main(String[] args) {


        String s1 = "Hello World";
        String s2 = "world";

        System.out.println(s1.regionMatches(6, s2, 0, 5));
    }
}