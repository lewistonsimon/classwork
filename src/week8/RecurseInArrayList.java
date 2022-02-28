package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecurseInArrayList {
    public static double addList(List<Double> lst) {
        if (lst.size() == 0) return 0;
        else return lst.get(0) + addList(lst.subList(1,lst.size()));
    }


    public static void main(String[] args) {
        Double[] doubleArray = {2.2,3.0,5.6};
        List<Double> d1 = new ArrayList<>(Arrays.asList(doubleArray));
        System.out.println(addList(d1));
    }
}


// 8.2 slide example  14
// public static double mystery (double x, int y) {
//      if (y == 0) return 1;
//        else if (y < 0) return 1/mystery(x, -y);
//        else return x * mystery(x, y - 1);
//        }

// mys(2,3)
//    2 * mys(2,2)
//        2 * mys(2,1)
//            2 * mys(2,0)
//                  1
    // answer is 8

// -----

// this is calculating x^y
// mys(3, -2)
//       1/ mys(3,2)
//           3 * mys(3, 1)
//               3 * mys(3, 0)
//                   1
//answer is 1/9
