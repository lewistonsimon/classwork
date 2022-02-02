package week2;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        boolean done = false;
        double total = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        while (!done) {
            System.out.print("Please enter a number or q to quit: ");
            String txt = input.next();
            if (txt.equals("q")) {
                done = true;
            } else
            {
                total += Double.parseDouble(txt);
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Average is " + total / count);
        }
        else {
            System.out.println("Average is 0");
        }
    }
}



























//    public static void main(String[] args) {
//        String s1 = "25";
//        int number = Integer.parseInt(s1);
//        System.out.println(number + 10);
//    }
//}














//        // for loop
//        int total = 0;
////        for (int count = 5; count <= 25; count++) {
////            System.out.print(count);
////            total += count;
////            System.out.println(" The total is " + total);
////        }
//        // while loop
//            int number = 5;
//            while (number <= 25)
//            {
//                total += number;
//                System.out.println(total);
//                number++;
//            }
//        System.out.println("total = " + total);
//        }
//    }

//public class loops {
//    public static void main(String[] args) {
//        int number = 5;
//        int total = 0;
//        do {
//            total += number;
//            number++;
//
//
//        } while (number <= 25);
//        System.out.println("total = " + total);
//    }
//}















//public class loops {
//    public static void main(String[] args) { // the differnce between a do while and a while
//        // is that a do loop will run at least once
//        int x = 0;
//        do {
//            System.out.println(x);
//            x++;
//        } while(x < 10);
//    }
//}



















//package week2;
//import java.util.Scanner;
//public class loops {
//    public static void main(String[] args) {
//        int target = 20;
//        int total = 1;
//        int factor = 2;
//        int count = 0;
//        while (total < target) {
//            total *= factor;
//            count++;
//            System.out.print(total + " ");
//        }
//        System.out.println();
//        System.out.println("Count is " + count);
//    }
//}





















//    public static void main(String[] args) {
//        int x = 0;
//        while (x < 10)
//        {
//            System.out.print(x + " ");
//            x++;
//        }
//    }
//
//}

    // for loop
//    public static void main(String[] args) {
//        for (int count = 0; count <= 10; count++)
//        {
//            System.out.println("Count is " + count);
//        }
//    }
//    public static void main(String[] args) {
//        for (int count = 1; count < 30; count *= 2)
//            System.out.print(count + " ");
//        // count = 1, then 2, then 4, then 8, etc
//        System.out.println(); // new line
//        for (int count = 20; count >= 15; count--)
//            System.out.print(count  + " ");
//// count DECREASES
//        System.out.println();
//        for (double count = 1.1; count < 10; count = count + 2.7)
//            System.out.print(count + " ");
//        // count is a floating point variable
//
//    }
    // Two ways to declare variables
//    public static void main(String[] args) {
//        int index = 0;
//        for (index = 1; index < 10; index++) {
//            System.out.print(index + " ");
//        }
//        index += 100;
//        System.out.println(index);
//    }

//    public static void main(String[] args) {
//        for (int index = 1; index < 10; index++) { // only exist in loop
//            System.out.print(index + " ");
//        }
//    }
    // Example
//    public static void main(String[] args) {
//        int total = 0;
//        for (int count = 5; count <= 25; count++)
//        {
//            System.out.print(count);
//            total += count;
//            System.out.println(" The total is " + total);
//        }
//}
    // While loop

