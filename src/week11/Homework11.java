package week11;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Homework11 {
//
//    public static
//
//}

    //problem 6
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(10);

        System.out.println(treeSet);

        Map<String, Integer> treeMap = new TreeMap<>();

        for (int element : treeSet)
        {
            treeMap.put(element + "", element);
        }

        System.out.println(treeMap);


    }
}










































//package week11;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class Homework11 {
//    public static void main(String[] args) {
//
//        Map<Map<String, Integer>, Integer> test = new HashMap<Map<String, Integer>, Integer>();
//        HashMap<String, Integer> test2 = new HashMap<String, Integer>();
//
//        test2.put("a", 2);
//        test.put(test2, 3);
//
//        System.out.println(test);
//
//    }
//

//    public static void main(String[] args) {
//        Map<String, Integer> test = new HashMap<String, Integer>();
//        test.put("A", 1);
//        test.put("B", 2);
//        test.put("A", 2);
//        test.put("C", 3);
//
//        System.out.println(test);
//
//        Set<String> keyset = test.keySet();
//        for (String key : keyset) {
//            System.out.println("key is " + key + " value is " + test.get(key));
//            test.get("A");
//        }
//
//    }
//}
