package week1;

public class AnotherTest {
    public static void main(String[] args) {
        System.out.println(2 + 3 + "a");        // 5a
        System.out.println(2 + "a" + 3);        // 2a3
        System.out.println("a" + 2 + 3);        // a23
        System.out.println("a" + (2 + 3));      // a5

        int number = 4;
        System.out.println("My favorite number is " + number + ".");
        int x = 2;
        System.out.println("x = " + x);
        System.out.println("x as a double = " + (double) x);

        // can do
        double z = 1 + 1;
        // can't do
//        int a = 1.0 + 1;
        // to fix
//        int a = (int(1.0 + 1));
    }
}
