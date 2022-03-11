package week8;

public class AddNumbers {
    public static void printNumbers(int n) {
        if (n <= 0)
            System.out.println();
        else {
            System.out.print(n + " ");
            printNumbers(n-1);
        }
    }



    public static int addNumbers(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else return n + addNumbers(n-1);
    }

    public static void main(String[] args) {
        printNumbers(4);
        System.out.println(addNumbers(4));

    }

}

// Walk through the code
//printNumbers(4)
//    printNumber(3)
//        printNumber(2)
//            printNumber(1)
//                printNumber(0) - this is the base case so it is done
// it is greater than 0 so it prints 4

// 4 3 2 1

// all the different n variables are different variables

