package week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        int count;
        for (count = 20; count > 1; count /= 2)
            System.out.print(count + 5 + " ");
            System.out.println(count - 5);
        System.out.println("Done");

     }

}


































//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a letter grade: ");
//        String letterGrade = input.nextLine();
//        switch (letterGrade) {
//            case "A":
//                System.out.println("A is worth 4");
//                break;
//            case "B":
//                System.out.println("B is worth 3");
//                break;
//            case "C":
//                System.out.println("C is worth 2");
//                break;
//            case "D":
//                System.out.println("D is worth 1");
//                break;
//            case "F":
//                System.out.println("F is worth 0");
//                break;
//            default:
//                System.out.println("Invalid Choice.");
//        }
//    }
//}






























//}
//    public static void main(String[] args) {
//        DecimalFormat formatter1 = new DecimalFormat("#0.000");
//        double miles = 10.0;
//        int day = 0;
//        double total = 0;
//
//        do
//        {
//            total += miles;
//            day += 1;
//
//            System.out.print("Day " + day + " ");
//            System.out.print("distance today = " + miles + formatter1.format(miles) + " ");
//            System.out.println("total = " + total + formatter1.format(total));
//
//            miles *= .7;
//        } while (miles >= .1);
//    }
//}














//    public static void main(String[] args) {
//        int count = 1;
//        while (count < 20) {
//            System.out.println(count); count *= 2;
//        }
//    }
//}

