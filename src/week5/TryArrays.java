package week5;
import java.util.Arrays;
public class TryArrays {

    public static void main(String[] args) {

        int [] myArray = new int[3];
        int myArray2[] = new int[2];
        int[] myArray3 = {100,200,300,400};
//        BankAccount[] accts = {new BankAccount("suzy"),
//                              new BankAccount("Timmy")};
//        System.out.println(accts[1]);
//        myArray[1] = 10;
//        System.out.println(Arrays.toString(myArray));
//
//        System.out.println(myArray[1]);
//
//        int x = myArray[1] + 100;
//        System.out.println(x);

//        System.out.println(Arrays.toString(myArray3));
//        System.out.println("The length is " + myArray3.length);
//        System.out.println("item that is last in the array is " + myArray3[myArray3.length-1]);

        int x = 4, y = 7;
        double[] a = new double[y];

        System.out.println(a[y-x]); // valid because 7 -4 = 3 which is run into double[]
        System.out.println(a[x+y/2]); // not enough space in list only 7 spots 7/2 = 3 + 4 = 7
//        int[] c;
//        System.out.println(c[0]); // c is not initalized
    }
}
